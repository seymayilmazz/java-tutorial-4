/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Employee employee1;
        employee1 = new Employee();
        employee1.name = "şeyma";
        employee1.age = 18;
        employee1.tcNo = "123456";
        employee1.salary = 3500;

        System.out.println("employee 1 :");
        System.out.println("name : " + employee1.name);
        System.out.println("age : " + employee1.age);
        System.out.println("tcNo : " + employee1.tcNo);
        System.out.println("salary : " + employee1.salary);
        System.out.println();

        Employee employee2 = new Employee();
        employee2.name = "burak";
        employee2.age = 22;
        employee2.tcNo = "123456";
        employee2.salary = 3500;

        System.out.println("employee 1 :");
        System.out.println("name : " + employee2.name);
        System.out.println("age : " + employee2.age);
        System.out.println("tcNo : " + employee2.tcNo);
        System.out.println("salary : " + employee2.salary);
        System.out.println();

    }
}
