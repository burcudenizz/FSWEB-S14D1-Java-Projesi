package company;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
       setSalary(22000);
        System.out.println(getName() + " junior developer begins to work.");
    }




}
