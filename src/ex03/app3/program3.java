package ex03.app3;

import ex03.app3.entt3.Student;

import java.util.Locale;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student note = new Student();

        System.out.print("NAME: ");
        note.name = sc.nextLine();
        note.n1 = sc.nextDouble();
        note.n2 = sc.nextDouble();
        note.n3 = sc.nextDouble();

        System.out.println(note);
        sc.close();
    }
}
