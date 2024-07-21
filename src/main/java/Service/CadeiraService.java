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

/**
 *
 * @author Carla Morais
 */
public class CadeiraService {

    private final EntityManager em;

    public CadeiraService() {
        this.em = Connection.getEntityManager();
    }

    public boolean CadastraCadeira(Cadeira cadeira) {
        try {
            this.em.getTransaction().begin();
            Curso curso = cadeira.getCurso();
            if (this.em.contains(curso)) {
                this.em.persist(curso);
            }
            this.em.persist(cadeira);
            this.em.getTransaction().commit();
            return true;
        } catch (PersistenceException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public Cadeira buscarCadeira(Long id) {
        try {
            return this.em.find(Cadeira.class, id);
        } catch (PersistenceException ex) {
            System.out.println("Erro na Classe Cadeira Service ao por Buscar por ID" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    public boolean UpdateCadeira(Long id, Cadeira horarioActualizado) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Cadeira cadeiraExistente = this.em.find(Cadeira.class, horarioActualizado.getId());
            if (cadeiraExistente != null) {
                
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

    public boolean excluirCadeira(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Cadeira cadeiraParaExcluir = this.em.find(Cadeira.class, id);

            if (cadeiraParaExcluir != null) {
                this.em.remove(cadeiraParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Cadeira" + id + "não foi encontrada");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar a cadeira" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }
    
    
    

    public List<Cadeira> listarCadeiras() {
        try {
            TypedQuery<Cadeira> query = this.em.createQuery("SELECT c FROM Cadeira c", Cadeira.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar as Cadeiras" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

    
      public List<Cadeira> buscarCadeirasPorCurso(Curso curso) {
        try {
            TypedQuery<Cadeira> query = em.createQuery("SELECT c FROM Cadeira c WHERE c.curso = :curso", Cadeira.class);
            query.setParameter("curso", curso);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erro ao buscar cadeiras por curso: " + ex.getMessage());
            return null;
        }
    }

}
