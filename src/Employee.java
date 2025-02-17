public class Employee {
     String name;
     int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void displayInfo(){
        System.out.println(name+" "+age+" "+salary);
    }

    public void increaseSalary(double amount){
        setSalary(salary+=amount);
        
    }


}
