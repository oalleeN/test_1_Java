package ex01.app1;/*
Fazer um programa para ler os valores da largura e altura de um
retângulo. Em seguida, mostrar na tela o valor de sua área,
perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado
 */

import ex01.app1.entt1.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rectangle rect = new rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.height = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.printf("AREA =  %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();

    }
}
