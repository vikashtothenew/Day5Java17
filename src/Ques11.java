
import java.util.Objects;

record Employee(String name, Integer id, Integer age){
    static int counter =0;
    static void incrementCounter(){
        counter++;
    }

    Employee{
        Objects.requireNonNull(name);
        incrementCounter();
    }

}

public class Ques11 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vikash",1,22);
        Employee employee2 = new Employee("Prakash",2,24);
        System.out.println(employee1);
        System.out.println(employee1.age());
        System.out.println(employee1.id());
        System.out.println(employee1.name());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee1.equals(employee2));
        System.out.println(Employee.counter);


    }
}
