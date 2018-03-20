package bean;

import db.StudentDaoI;
import entity.Student;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by SELPHA on 20/3/2018.
 */
@Stateless
public class StudentBean implements StudentBeanI{
    @EJB
    private StudentDaoI studentDaoI;

    public boolean addStudent(Student s) {
        return studentDaoI.add(s);
    }
}
