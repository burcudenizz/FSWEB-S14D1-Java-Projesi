package main;

import company.JuniorDeveloper;
import company.Employee;
import company.SeniorDeveloper;
import company.MidDeveloper;
import company.HRManager;

import java.util.Arrays;

public class CompanyMain {

    public static void main(String[] args) {

        Employee employee = new Employee(5, "Ali", 1500);
        employee.work();


        //developer classes
        System.out.println("****junior developers****");
        JuniorDeveloper juniorDev1 = new JuniorDeveloper(1, "Burcu", 1500);
        juniorDev1.work();
        JuniorDeveloper juniorDev2 = new JuniorDeveloper(2, "Koray", 2300);
        juniorDev2.work();
        JuniorDeveloper juniorDev3 = new JuniorDeveloper(4, "Onur", 3300);
        juniorDev3.work();

        System.out.println("****mid developers****");
        MidDeveloper midDev1 = new MidDeveloper(1, "Ahmet", 2800);
        midDev1.work();
        MidDeveloper midDev2 = new MidDeveloper(2, "Elif", 3300);
        midDev2.work();

        System.out.println("****senior developers****");

        SeniorDeveloper seniorDev1 = new SeniorDeveloper(2, "Uras", 3300);
        seniorDev1.work();

        System.out.println("****hr manager****");
        HRManager hrManager = new HRManager(5, "Ilay", 5800, new JuniorDeveloper[5], new MidDeveloper[10], new SeniorDeveloper[4]);
        hrManager.work();

        System.out.println("****addEmployee****");
        hrManager.addEmployee(1, juniorDev1);
        hrManager.addEmployee(2, juniorDev2);

        System.out.println("juniors:" + Arrays.toString(hrManager.getJuniors()));
        hrManager.addEmployee(0, midDev1);
        hrManager.addEmployee(1, midDev2);

        System.out.println("mids:" + Arrays.toString(hrManager.getMids()));
        hrManager.addEmployee(0, seniorDev1);
        System.out.println("seniors:" + Arrays.toString(hrManager.getSeniors()));
    }
}
