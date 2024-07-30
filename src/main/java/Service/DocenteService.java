package Service;

import Model.Aula;
import Model.Cadeira;
import Model.Docente;
import Model.User;
import Util.Connection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

public class DocenteService {

    private final EntityManager em;
    private UserService userService;

    public DocenteService() {
        this.em = Connection.getEntityManager();
        this.userService = new UserService(em);
    }

    public DocenteService(EntityManager em) {
        this.em = em;
        this.userService = new UserService(em);
    }

    public boolean cadastrarDocente(Docente docente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            Cadeira cadeira = docente.getCadeira();
            if (cadeira != null) {
                if (cadeira.getId() != 0) { // Verifica se a cadeira já tem um ID (portanto, já existe)
                    cadeira = em.merge(cadeira);  // Use merge para entidades existentes
                } else {
                    em.persist(cadeira);  // Persist apenas para novas entidades
                }
            }

            em.persist(docente);
            transaction.commit();
            return true;
        } catch (PersistenceException ex) {
            ex.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        } finally {
            // Não fechar o EntityManager se for gerenciado pelo contêiner
        }
    }

    public Docente buscarDocente(Long id) {
        try {
            return em.find(Docente.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe DocenteService ao buscar por ID: " + ex.getMessage());
            return null;
        } finally {
            // Não fechar o EntityManager se for gerenciado pelo contêiner
        }
    }

    public boolean updateDocente(Docente docente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            Docente docenteExistente = em.find(Docente.class, docente.getId());
            if (docenteExistente != null) {
                em.merge(docente);
                transaction.commit();
                return true;
            } else {
                System.out.println("O Docente com ID " + docente.getId() + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Erro na Classe DocenteService no método updateDocente: " + ex.getMessage());
            return false;
        } finally {
            // Não fechar o EntityManager se for gerenciado pelo contêiner
        }
    }

    public boolean excluirDocente(Long id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            Docente docenteParaExcluir = em.find(Docente.class, id);
            if (docenteParaExcluir != null) {
                em.remove(docenteParaExcluir);
                transaction.commit();
                return true;
            } else {
                System.out.println("Docente com ID " + id + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe DocenteService ao excluir docente: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        } finally {

        }
    }

    public boolean cadastrarDocenteComUsuario(Docente docente, User usuario) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            Cadeira cadeira = docente.getCadeira();
            if (cadeira != null) {
                if (cadeira.getId() != 0) {

                    cadeira = em.merge(cadeira);

                } else {
                    em.persist(cadeira);

                }
            }

            if (docente.getId() != 0) {
                docente = em.merge(docente);
            } else {
                em.persist(docente);
            }

            User novoUsuario = userService.cadastrarUsuario(usuario);
            docente.setUsuario(novoUsuario);

            em.merge(docente);

            transaction.commit();
            return true;
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe DocenteService ao cadastrar docente: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        } finally {

        }
    }

    public List<Docente> listarDocentes() {
        try {
            TypedQuery<Docente> query = em.createQuery("SELECT d FROM Docente d", Docente.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe DocenteService ao listar docentes: " + ex.getMessage());
            return null;
        } finally {

        }
    }

    public boolean atualizarSenhaDocente(Long docenteid, String novaSenha) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Docente docente = em.find(Docente.class, docenteid);
            if (docente == null) {
                System.out.println("Docente com ID " + docente + " não encontrado.");
                transaction.rollback();
                return false;
            }

            User usuario = docente.getUsuario();
            if (usuario == null) {
                System.out.println("Usuário associado ao docente com ID " + docenteid + " não encontrado.");
                transaction.rollback();
                return false;
            }

            usuario.setSenha(novaSenha);
            em.merge(usuario);
            transaction.commit();
            System.out.println("Senha atualizada com sucesso para o usuário com ID " + docenteid);
            return true;
        } catch (PersistenceException ex) {
            System.out.println("Erro ao atualizar a senha: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }

    }

public List<Aula> ListasHorarios(Long docenteId, Date data) {
    try {
        // Configura o intervalo de datas para o dia inteiro
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date startDate = calendar.getTime();
        
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        Date endDate = calendar.getTime();

        // Cria a consulta JPQL
        TypedQuery<Aula> query = em.createQuery(
            "SELECT a FROM Aula a WHERE a.docente.id = :docenteId AND a.horario.horaInicio <= :endDate AND a.horario.horaFim >= :startDate", Aula.class);
        query.setParameter("docenteId", docenteId);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);

        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


   
}
