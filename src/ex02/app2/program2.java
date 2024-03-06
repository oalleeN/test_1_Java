package ex02.app2;

import ex02.app2.entt2.employee;

import java.util.Locale;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee data = new employee();

        System.out.print("Name: ");
        data.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        data.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        data.tax = sc.nextDouble();

        System.out.println("Employee: " + data);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double perc = sc.nextDouble();
        data.increaseSalary(perc);

        System.out.println();
        System.out.printf("Updated data: " + data);

        sc.close();
    }
}
