package company;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void work() {
        setSalary(62000);
        System.out.println(getName() + " HR Manager begins to work.");
    }



    //overloading
    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniors[index] == null) {
                juniors[index] = developer;
            } else{
                System.out.println("index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("index not found." + ex.getMessage());
        }
    }
    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (mids[index] == null) {
                mids[index] = developer;
            } else{
                System.out.println("index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("index not found." + ex.getMessage());
        }
    }
    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniors[index] == null) {
                seniors[index] = developer;
            } else{
                System.out.println("index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("index not found." + ex.getMessage());
        }
    }


    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }
    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }
}
