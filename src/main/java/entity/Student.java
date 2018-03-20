package entity;

import javax.persistence.*;

/**
 * Created by SELPHA on 19/3/2018.
 */
@Entity
@Table
public class Student {
    private String fname;
    private  String lname;
    @Id
    private  int idNo;


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
}
