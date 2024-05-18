/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Docente;
import Model.User;
import Util.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Carla Morais
 */
public class UserService {
    
 private EntityManager em;

    public UserService() {
        this.em = Connection.getEntityManager();
    }

    public UserService(EntityManager em) {
       this.em= em;
    }

    public boolean CadastrarUsuario(User usuario) {
        try {
            this.em.getTransaction().begin();

            this.em.persist(usuario);
            this.em.getTransaction().commit();
            return true;

        } catch (PersistenceException ex) {
            ex.printStackTrace();
            this.em.getTransaction().rollback();
            return false;
        } finally {
            this.em.close();
        }
    }

    public User buscarUsuario(Long id) {
    try {
        return this.em.find(User.class, id);
    } catch (PersistenceException ex) {
        System.out.println("Erro na Classe AulaService ao buscar por ID: " + ex.getMessage());
        return null;
    } finally {
        if (this.em.isOpen()) {
            this.em.close();
        }
    }
}




    public boolean excluirUser(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            User userParaExcluir = this.em.find(User.class, id);

            if (userParaExcluir != null) {
                this.em.remove(userParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Usuário" + id + "não foi encontrado");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar docente" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public List<User> listarUsuarios() {
        try {
            TypedQuery<User> query = this.em.createQuery("SELECT u FROM Usuarios u", User.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar Usuarios" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public User autenticarUsuario(String nomeUsuario, String senha) {
    try {
        TypedQuery<User> query = this.em.createQuery("SELECT u FROM User u WHERE TRIM(LOWER(u.nomeDeUsuario)) = :nomeUsuario AND u.senha = :senha", User.class);
        query.setParameter("nomeUsuario", nomeUsuario);
        query.setParameter("senha", senha);

        List<User> resultList = query.getResultList();

        if (!resultList.isEmpty()) {
         
            return resultList.get(0);
        } else {
            return null; //
            
        }
    } catch (PersistenceException ex) {
        System.out.println("Erro na Classe UserService ao autenticar usuário: " + ex.getMessage());
        return null;
    }
}

}


