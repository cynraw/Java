package CoreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCustomObject {
    public static void main(String[] args){
        List<Employee12> employees = new ArrayList<>();

        employees.add(new Employee12(5,"Kish",290000));
        employees.add(new Employee12(2,"Saul",90000));
        employees.add(new Employee12(1,"Jonathan",670000));
        employees.add(new Employee12(4,"David",900000000));
        employees.add(new Employee12(2,"Abimelech",280000));

        //COMPARING BY SALARY
        //By explicitly creating a class that implements comparator
        Collections.sort(employees, new MySort());

        //Using anonymous function
        Collections.sort(employees, new Comparator<Employee12> (){
            public int compare(Employee12 e1, Employee12 e2){
                return (e1.getSalary() - e2.getSalary());
            }
        });

        //Using lamda expressions
        Collections.sort(employees, (e1, e2) -> (e1.getSalary() - e2.getSalary()));

        //COMPARING BY NAMES
        Collections.sort(employees, (e1, e2) -> (e1.getName().compareTo(e2.getName())));
        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee12>{
    public int compare(Employee12 e1, Employee12 e2){
        return (e1.getSalary() - e2.getSalary());
    }
}
