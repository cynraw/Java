package Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sId;
    private String sName;
    private int sMarks;

    public void setsId(int sId){
        this.sId = sId;
    }
    public int getsId(){
        return sId;
    }
    public void setsName(String sName){
        this.sName = sName;
    }
    public String getsName(){
        return sName;
    }
    public void setsMarks(int sMarks){
        this.sMarks = sMarks;
    }
    public int getsMarks(){
        return sMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sMarks=" + sMarks +
                '}';
    }
}
