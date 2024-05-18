/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Cadeira;
import Model.Docente;
import Util.Connection;
import static Util.Connection.getEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Carla Morais
 */
public class DocenteService {

    private final EntityManager em;

    public DocenteService() {
        this.em = Connection.getEntityManager();
    }

    public DocenteService(EntityManager em) {
       this.em= em;
    }

    public boolean CadastrarDocente(Docente docente) {
        try {
            this.em.getTransaction().begin();

            Cadeira cadeira = docente.getCadeira();

            if (this.em.contains(cadeira)) {
                this.em.persist(cadeira);
            }

            // Persiste o docente
            this.em.persist(docente);

            this.em.getTransaction().commit();
            return true;
        } catch (PersistenceException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public Docente buscarDocente(Long id) {
    try {
        return this.em.find(Docente.class, id);
    } catch (PersistenceException ex) {
        System.out.println("Erro na Classe AulaService ao buscar por ID: " + ex.getMessage());
        return null;
    } finally {
        if (this.em.isOpen()) {
            this.em.close();
        }
    }
}

public boolean UpdateDocente(Long id) {
    EntityManager em = getEntityManager();
    EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Docente docenteExistente = em.find(Docente.class, id);
            if (docenteExistente != null) {

                tx.commit();
                return true;
            } else {
                System.out.println("O Docente " + id + " não foi encontrado");
                return false;
            }
        } catch (PersistenceException ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            System.out.println("Erro na Classe Service no método atualizar Docente: " + ex.getMessage());
            return false;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }


    public boolean excluirDocente(Long id) {
        try {
            EntityTransaction tx = this.em.getTransaction();
            tx.begin();

            Docente docenteParaExcluir = this.em.find(Docente.class, id);

            if (docenteParaExcluir != null) {
                this.em.remove(docenteParaExcluir);
                tx.commit();
                return true;
            } else {
                System.out.println("Docente" + id + "não foi encontrada");
                return false;
            }

        } catch (PersistenceException ex) {
            System.out.println("Ocorreu erro na exceção  eliminar docente" + ex.getMessage());
            return false;
        } finally {
            this.em.close();
        }
    }

    public List<Docente> listarDocentes() {
        try {
            TypedQuery<Docente> query = this.em.createQuery("SELECT d FROM Docente d", Docente.class);
            return query.getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Ocorreu um erro na exceção Listar Aulas Marcadas" + ex.getMessage());
            return null;
        } finally {
            this.em.close();
        }
    }

}
