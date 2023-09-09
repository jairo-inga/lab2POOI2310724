package practica02;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        double currentSalary;
        double rating;
        double raise;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el salario actual: ");
        currentSalary = scan.nextDouble();

        System.out.print("Ingrese la calificación del desempeño (1=excelente, 2=bueno, 3=malo): ");
        rating = scan.nextInt();

        if (rating == 1) {
            raise = currentSalary * 0.06;
        } else if (rating == 2) {
            raise = currentSalary * 0.04;
        } else if (rating == 3) {
            raise = currentSalary * 0.015;
        } else {
            System.out.println("Calificación no válida. Por favor, ingrese 1, 2 o 3.");
            return;
        }
       
        double newSalary = currentSalary + raise;

        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + newSalary);
    }
}
