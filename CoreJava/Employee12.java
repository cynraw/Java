package CoreJava;

public class Employee12 {
    private int id;
    private String name;
    private int salary;

    public Employee12(int id, String name, int salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Employee{id =" + id + ", name =" + name + ", salary =" + salary + "}";
    }
}
