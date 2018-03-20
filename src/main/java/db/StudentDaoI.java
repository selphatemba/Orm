package db;

import entity.Student;

import javax.ejb.Local;

/**
 * Created by SELPHA on 20/3/2018.
 */
@Local
public interface StudentDaoI {
    boolean add(Student s);
    boolean update(Student s);
    boolean delete(Student s);
    boolean findById(Student s);
}
