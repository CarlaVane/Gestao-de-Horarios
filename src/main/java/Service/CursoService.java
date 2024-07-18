/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Cadeira;
import Model.Curso;
import Util.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Morais
 */
public class CursoService {
     private EntityManager em;

    public CursoService() {
        this.em = Connection.getEntityManager();
    }

    public boolean CadastrarCurso(Curso curso) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(curso);
            this.em.getTransaction().commit();
            return true;
        } catch (PersistenceException ex) {
            return false;
        }

    }

    public Curso buscarCurso(Long id) {
    try {
        this.em.getTransaction().begin();
        Curso curso = this.em.find(Curso.class, id);
        this.em.getTransaction().commit();
        return curso;
    } catch (PersistenceException ex) {
        System.out.println("Erro na Classe Aula Service ao buscar por ID: " + ex.getMessage());
        if (this.em.getTransaction().isActive()) {
            this.em.getTransaction().rollback();
        }
        return null;
    } finally {
        if (this.em.isOpen()) {
            this.em.close();
        }
    }
}


    public boolean UpdateCurso(Long id, Curso horarioActualizado) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Curso cursoExistente = this.em.find(Curso.class, id);
            if (cursoExistente != null) {
                //Actualizar os campos da aulaExiste com os dados da aula Actualizada  aulaExistente.setCampo(aulaActualizada.getCampo1());
                tx.commit();
                return true;

            } else {
                System.out.println(" Curso " + id + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Service no método actualizar Curso" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public boolean excluirCurso(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

           Curso cursoParaExcluir = this.em.find(Curso.class, id);

            if (cursoParaExcluir != null) {
                this.em.remove(cursoParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Curso" + id + "não foi encontrado");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar curso" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public List<Curso> listarCursos() {
        try {
            TypedQuery<Curso> query = this.em.createQuery("SELECT c FROM  Curso c", Curso.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar os Cursos" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    
}
