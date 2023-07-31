package company;

public class SeniorDeveloper extends Employee {


    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(52000);
        System.out.println(getName() + " senior developer begins to work.");
    }
}
