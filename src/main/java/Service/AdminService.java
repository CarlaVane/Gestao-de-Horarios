/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;



import Model.Admin;
import Model.User;
import Util.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Classe de serviço para a entidade Admin
 */
public class AdminService {

    private final EntityManager em;
    private final UserService userService;

    public AdminService() {
        this.em = Connection.getEntityManager();
        this.userService = new UserService(em);
    }

    public AdminService(EntityManager em) {
        this.em = Connection.getEntityManager();
        this.userService = new UserService(em);
    }

    public boolean salvarAdmin(Admin admin) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(admin);
            transaction.commit();
            return true;
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao salvar o Admin: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }

    public Admin buscarPorID(Long id) {
        if (id == null) {
            System.out.println("ID fornecido é nulo.");
            return null;
        }

        try {
            Admin admin = em.find(Admin.class, id);
            if (admin == null) {
                System.out.println("Administrador com ID " + id + " não encontrado.");
            } else {
                System.out.println("Administrador encontrado: " + admin.getNome());
            }
            return admin;
        } catch (PersistenceException ex) {
            System.out.println("Erro ao buscar administrador por ID: " + ex.getMessage());
            ex.printStackTrace(); // Fornece mais detalhes sobre o erro
            return null;
        }
    }

    public boolean atualizarDados(Long id, Admin dadosAtualizados) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Admin adminExistente = em.find(Admin.class, id);
            if (adminExistente != null) {
                adminExistente.setNome(dadosAtualizados.getNome());
                adminExistente.setEmail(dadosAtualizados.getEmail());
                adminExistente.setUsuario(dadosAtualizados.getUsuario());
                em.merge(adminExistente);
                transaction.commit();
                return true;
            } else {
                System.out.println("Administrador " + id + " não foi encontrado");
                transaction.rollback();
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao atualizar dados: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }

    public boolean eliminarAdmin(Long id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Admin adminParaExcluir = em.find(Admin.class, id);
            if (adminParaExcluir != null) {
                em.remove(adminParaExcluir);
                transaction.commit();
                return true;
            } else {
                System.out.println("Administrador " + id + " não foi encontrado");
                transaction.rollback();
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao eliminar administrador: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }

    public boolean cadastrarAdminComUsuario(Admin admin, User usuario) {
        EntityTransaction transaction = em.getTransaction();
        try {
           
            if (admin.getId() != 0) {
                em.merge(admin);
            } else {
                em.persist(admin);
            }
             transaction.begin();
            User novoUsuario = userService.cadastrarUsuario(usuario);
            admin.setUsuario(novoUsuario);
            em.merge(admin);
            transaction.commit();
            return true;
        }catch(PersistenceException ex){
            System.out.println("Erro na classe AdminService ao cadastrar Admin com usuároo"+ex);
             
            return false;
        }finally{
            if(em!=null && em.isOpen())
              em.close();
        }
        
    }
    
    

    public List<Admin> listarAdmin() {
        try {
            TypedQuery<Admin> query = em.createQuery("SELECT a FROM Admin a", Admin.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao listar administradores: " + ex.getMessage());
            return null;
        }
    }

    public int getDocentesCount() {
        try {
            Query query = em.createQuery("SELECT COUNT(d) FROM Docente d");
            return ((Long) query.getSingleResult()).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getCadeiraCount() {
        try {
            Query query = em.createQuery("SELECT COUNT(c) FROM Cadeira c");
            return ((Long) query.getSingleResult()).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getCursoCount() {
        try {
            Query query = em.createQuery("SELECT COUNT(c) FROM Curso c");
            return ((Long) query.getSingleResult()).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getSalaCount() {
        try {
            Query query = em.createQuery("SELECT COUNT(s) FROM Sala_de_Aula s");
            return ((Long) query.getSingleResult()).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getAulaCount() {
        try {
            Query query = em.createQuery("SELECT COUNT(a) FROM Aula a");
            return ((Long) query.getSingleResult()).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

public boolean atualizarSenhaAdmin(Long adminId, String novaSenha) {
    EntityTransaction transaction = em.getTransaction();
    try {
        transaction.begin();
        Admin admin = em.find(Admin.class, adminId);
        if (admin == null) {
            System.out.println("Administrador com ID " + adminId + " não encontrado.");
            transaction.rollback();
            return false;
        }

        User usuario = admin.getUsuario();
        if (usuario == null) {
            System.out.println("Usuário associado ao administrador com ID " + adminId + " não encontrado.");
            transaction.rollback();
            return false;
        }

        usuario.setSenha(novaSenha);
        em.merge(usuario);
        transaction.commit();
        System.out.println("Senha atualizada com sucesso para o usuário com ID " + adminId);
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

}
    
