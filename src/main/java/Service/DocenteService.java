package Service;

import Model.Cadeira;
import Model.Docente;
import Model.User;
import Util.Connection;
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
            // Não fechar o EntityManager se for gerenciado pelo contêiner
        }
    }

    public boolean cadastrarDocenteComUsuario(Docente docente, User usuario) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            // Primeiramente, persistir ou mesclar a entidade Docente e suas associações
            Cadeira cadeira = docente.getCadeira();
            if (cadeira != null) {
                if (cadeira.getId() != 0) { // Verifica se a cadeira já tem um ID (portanto, já existe)
                    cadeira = em.merge(cadeira);  // Use merge para entidades existentes
                } else {
                    em.persist(cadeira);  // Persist apenas para novas entidades
                }
            }

            if (docente.getId() != 0) { // Verifica se o docente já tem um ID (portanto, já existe)
                docente = em.merge(docente);
            } else {
                em.persist(docente);
            }

            // Em seguida, criar e associar o novo usuário ao Docente
            User novoUsuario = userService.cadastrarUsuario(usuario);
            docente.setUsuario(novoUsuario);

            // Atualizar o Docente para refletir a nova associação
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
            // Não fechar o EntityManager se for gerenciado pelo contêiner
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
            // Não fechar o EntityManager se for gerenciado pelo contêiner
        }
    }
}
