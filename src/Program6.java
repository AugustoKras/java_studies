//This program ask how many employees will be registered and ask to input the id, name and salary of each employee. Ask you to enter the employ id that will have salary increase.
package src;

import src.entities.Employee;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
public class Program6 {

    public static void  main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);


        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("Employees list: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }
// This part looks for the id in the list if it exists it returns the index
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        //return -1; // to indicate that the id was not found
        return null;
    }



}
