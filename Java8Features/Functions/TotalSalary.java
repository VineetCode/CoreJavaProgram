import java.util.function.Function;
import java.util.function.*;
import java.util.*;

class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Name :"+name+ "Salary :"+salary;
    }
}
