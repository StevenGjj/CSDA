import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    static ArrayList<Employee> employees = new ArrayList<>();

    private int age;

    private String name;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void printInfo() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).name + " " + employees.get(i).age);
        }
    }

}
