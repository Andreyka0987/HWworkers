public class Developer extends Employee{
    String programmingLanguage;


    public Developer(String name, int age, int salary, String programmingLanguage){
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(programmingLanguage);
    }
}
