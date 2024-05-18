/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Horario;
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
public class HorarioService {

    private EntityManager em;

    public HorarioService() {
        this.em = Connection.getEntityManager();
    }

    public boolean CadastrarHorario(Horario horario) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(horario);
            this.em.getTransaction().commit();
            return true;
        } catch (PersistenceException ex) {
            return false;
        }

    }

    public Horario buscarHorario(Long id) {
        try {
            return this.em.find(Horario.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Aula Service ao por Buscar por ID" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public boolean UpdateHorario(Long id, Horario horarioActualizado) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Horario horarioExistente = this.em.find(Horario.class, id);
            if (horarioExistente != null) {
                //Actualizar os campos da aulaExiste com os dados da aula Actualizada  aulaExistente.setCampo(aulaActualizada.getCampo1());
                tx.commit();
                return true;

            } else {
                System.out.println(" Horário " + id + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Service no método actualizar Horário" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public boolean excluirHorario(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Horario horarioParaExcluir = this.em.find(Horario.class, id);

            if (horarioParaExcluir != null) {
                this.em.remove(horarioParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Horário" + id + "não foi encontrada");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar o horário" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public List<Horario> listarHorarios() {
        try {
            TypedQuery<Horario> query = this.em.createQuery("SELECT h FROM Horario h", Horario.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar Aulas Marcadas" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

}
