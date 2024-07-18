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
        this.userService = new UserService(em); // Inicializando userService
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
        try {
            return em.find(Admin.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao buscar por ID: " + ex.getMessage());
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
            transaction.begin();
            User novoUsuario = userService.cadastrarUsuario(usuario);
            admin.setUsuario(novoUsuario);
            if (admin.getId() != 0) {
                em.merge(admin);
            } else {
                em.persist(admin);
            }
            transaction.commit();
            return true;
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe AdminService ao cadastrar administrador: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
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
       
}
