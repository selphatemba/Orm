package web;


import bean.StudentBeanI;
import entity.Student;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by SELPHA on 20/3/2018.
 */
@WebServlet(urlPatterns = "/student")
public class CreateStud  extends HttpServlet {
    @EJB
    private StudentBeanI studentBeanI;
    Student student=new Student();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        student.setFname("sellyn");
        student.setLname("atemban");
        student.setIdNo(23);
        studentBeanI.addStudent(student);
        out.print("successfully added");

    }
}
