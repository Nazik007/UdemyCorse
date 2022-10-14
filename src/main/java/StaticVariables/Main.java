package StaticVariables;

public class Main {
    public static void main(String[] args) {
        Employee zack = new Employee("Zack", "Programmer");
        Employee gio = new Employee("Gio", "BA");
        Employee thomas = new Employee("Thomas", "QA");
        System.out.println(Employee.getHiredCount());
    }
}
