/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.User;
import Util.Connection;
import Util.Role;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

public class UserService {
    private EntityManager em;

    public UserService() {
        this.em = Connection.getEntityManager();
    }

    public UserService(EntityManager em) {
        this.em = em;
    }

   public User cadastrarUsuario(User usuario) {
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            return usuario;
        } catch (PersistenceException ex) {
            ex.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return null;
        }
    }

    public User buscarUsuario(Long id) {
        try {
            return em.find(User.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe UserService ao buscar por ID: " + ex.getMessage());
            return null;
        }
    }

    public boolean excluirUser(Long id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            User userParaExcluir = em.find(User.class, id);

            if (userParaExcluir != null) {
                em.remove(userParaExcluir);
                transaction.commit();
                return true;
            } else {
                System.out.println("Usuário com ID " + id + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção ao excluir usuário: " + ex.getMessage());
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }

    public List<User> listarUsuarios() {
        try {
            TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção ao listar usuários: " + ex.getMessage());
            return null;
        }
    }

    public User autenticarUsuario(String email, String senha) {
        try {
            TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE TRIM(LOWER(u.email)) = :email AND u.senha = :senha", User.class);
            query.setParameter("email", email.trim().toLowerCase());
            query.setParameter("senha", senha);

            List<User> resultList = query.getResultList();

            if (!resultList.isEmpty()) {
                return resultList.get(0);
            } else {
                return null;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe UserService ao autenticar usuário: " + ex.getMessage());
            return null;
        }
    }

    public User criarUsuarioNivelAcesso(String email, String senha, Role nivelAcesso) {
        User usuario = new User();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setNivelAcesso(nivelAcesso);
        return usuario;
    }
}
