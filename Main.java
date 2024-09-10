public class Main {
    public static void main(String[] args) {
        Employee employees = new Employee();
        Employee B = new Employee("B", 21);
        Employee C = new Employee("C", 24);
        Employee A = new Employee("A", 20);
        Employee D = new Employee("D", 22);
        employees.addEmployee(A);
        employees.addEmployee(B);
        employees.addEmployee(C);
        employees.addEmployee(D);
        employees.deleteEmployee(B);
        employees.printInfo();
    }
}
