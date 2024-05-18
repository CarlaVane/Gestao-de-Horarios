/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Model.Aula;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import Util.Connection;
import Model.Sala_de_Aula;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author Carla Morais
 */
public class Sala_de_AulaService {

    private EntityManager em;

    public Sala_de_AulaService() {
        this.em = Connection.getEntityManager();
    }

    public boolean salvar(Sala_de_Aula SaladeAula) {
        try {
            this.em.getTransaction().begin();
            SaladeAula.setDisponivel(true);
            this.em.persist(SaladeAula);
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

    public Sala_de_Aula buscarPorId(Long id) {
        try {
            return this.em.find(Sala_de_Aula.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Aula Service ao por Buscar por ID" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public List<Sala_de_Aula> listarSalas() {
        try {
            TypedQuery<Sala_de_Aula> query = this.em.createQuery("SELECT s FROM Sala_de_Aula s", Sala_de_Aula.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar Salas Marcadas" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public boolean eliminarSala(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Sala_de_Aula aulaParaExcluir = this.em.find(Sala_de_Aula.class, id);

            if (aulaParaExcluir != null) {
                this.em.remove(aulaParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println(" Sala de Aula" + id + "não foi encontrada");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar Sla" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }
}
