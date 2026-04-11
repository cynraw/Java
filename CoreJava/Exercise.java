package CoreJava;

class Employee{
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }  

    public void getDetails(){
        String name = this.getName();
        double salary = this.getSalary();
        
        System.out.println("Name : " + name + ", " + "Salary : " + salary);
    } 
}

// - Extends Employee
class Manager extends Employee{
    private String department;
    
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    
    @Override
    public void getDetails(){
        String name = this.getName();
        double salary = this.getSalary();
        String department = this.department;
        
        System.out.println("Name:" + name + ", " + "Salary: " + salary + ", " + "Department: " + department);
    }
}


public class Exercise {
    public static void main(String[] args) {

        Employee obj1 = new Employee("Alice", 2000);
        obj1.getDetails();
        Manager obj2 = new Manager("Ronoh", 50000, "IT");
        obj2.getDetails();

        
    }
}
