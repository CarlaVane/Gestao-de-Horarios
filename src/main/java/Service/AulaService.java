/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Aula;
import Util.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Carla Morais
 */
public class AulaService {

    private EntityManager em;

    public AulaService() {
        this.em = Connection.getEntityManager();
    }

    public boolean salvar(Aula aula) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(aula);
            this.em.getTransaction().commit();
            return true;
        } catch (PersistenceException ex) {
            return false;
        }

    }

    public Aula buscarPorId(Long id) {
        try {
            return this.em.find(Aula.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Aula Service ao por Buscar por ID" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public boolean ActualizarAulaMarcada(Long id, Aula aulaActualizada) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Aula aulaExistente = this.em.find(Aula.class, id);
            if (aulaExistente != null) {
                //Actualizar os campos da aulaExiste com os dados da aula Actualizada  aulaExistente.setCampo(aulaActualizada.getCampo1());
                tx.commit();
                return true;

            } else {
                System.out.println("A aula " + id + " não foi encontrada");
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Service no método actualizar Aula" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public boolean eliminarAulaMarcada(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Aula aulaParaExcluir = this.em.find(Aula.class, id);

            if (aulaParaExcluir != null) {
                this.em.remove(aulaParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Aula" + id + "não foi encontrada");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar aula marcada" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public List<Aula> listarAulasMarcadas() {
        try {
            TypedQuery<Aula> query = this.em.createQuery("SELECT a FROM Aula a", Aula.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar Aulas Marcadas" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }
    
    
  



}
