import java.util.function.Predicate;
class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;

    }   
}

public class predicateexample {
    public static void main(String[] args) {

        Predicate<Employee> p1= e->(e.salary>10);
        Predicate<Employee> p2= e->(e.salary>50);
        
        Employee emp= new Employee("john", 50000);
        System.out.println(p1.and(p2).test(emp));
        
    }
    
}
