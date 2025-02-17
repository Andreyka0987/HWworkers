public class Manager extends Employee {
    int bonus;


    public Manager(String name, int age, int salary, int bonus){
        super(name,age,salary);
        this.bonus = bonus;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(bonus);
    }
}
