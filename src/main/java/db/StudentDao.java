package db;

import entity.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;


/**
 * Created by SELPHA on 20/3/2018.
 */
@Stateless
public class StudentDao implements StudentDaoI {
   @PersistenceContext(unitName = "test")
   private EntityManager entityManager;

    public boolean add(Student s){
        try {
            entityManager.persist(s);
        }catch (PersistenceException p){
            p.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(Student s) {
        entityManager.merge(s);
        return true;
    }

    public boolean delete(Student s) {
        return false;
    }

    public boolean findById(Student s) {
        return false;
    }
}
