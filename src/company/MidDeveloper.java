package company;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(42000);
        System.out.println(getName() + " mid developer begins to work.");
    }
}
