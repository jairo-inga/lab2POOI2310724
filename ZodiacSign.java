package practica02;

import java.util.Scanner;

public class ZodiacSign {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        
        if (scan.hasNextInt()) {
            int year = scan.nextInt();
            String animal = calcularZodiacoChino(year);
            System.out.println(year + " es el año del " + animal + ".");
        } else {
            System.out.println("Entrada no válida. Por favor, ingrese un año válido.");
        }
        
        scan.close();
    }

    public static String calcularZodiacoChino(int year) {
        int remainder = year % 12;
        String animal = "";

        switch (remainder) {
            case 0:
                animal = "mono";
                break;
            case 1:
                animal = "gallo";
                break;
            case 2:
                animal = "perro";
                break;
            case 3:
                animal = "cerdo";
                break;
            case 4:
                animal = "rata";
                break;
            case 5:
                animal = "buey";
                break;
            case 6:
                animal = "tigre";
                break;
            case 7:
                animal = "conejo";
                break;
            case 8:
                animal = "dragón";
                break;
            case 9:
                animal = "serpiente";
                break;
            case 10:
                animal = "caballo";
                break;
            case 11:
                animal = "cabra";
                break;
        }

        return animal;
    }
}
