
public class Main {
    public static void main(String[] args) {

    Employee employee1 = new Employee("Edward", 20, 1000);
    Employee employee2 = new Employee("Kirilka", 9999, 99999999);

    Manager manager1 = new Manager("Grigoriii", 6666, 775555, 500000);

    Developer developer = new Developer("Andreyka", 5234,6385247, "++C++ java edition pro home version");

    manager1.increaseSalary(1);

    manager1.displayInfo();
        System.out.println("---------");
    developer.displayInfo();
        System.out.println("---------");
    employee1.displayInfo();
    employee2.displayInfo();


   }
}