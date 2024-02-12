package hn.uth.junit_test_app;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        System.out.println("Seleccione una opción (1-4): ");

        int opcion = scanner.nextInt();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                resultado = areaCirculo(radioCirculo);
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();
                resultado = areaCuadrado(ladoCuadrado);
                break;
            case 3:
                System.out.println("Ingrese la base del rectángulo:");
                double baseRectangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                double alturaRectangulo = scanner.nextDouble();
                resultado = areaRectangulo(baseRectangulo, alturaRectangulo);
                break;
            case 4:
                System.out.println("Ingrese la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                resultado = areaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            default:
                System.out.println("Por favor, seleccione una opción del 1 al 4.");
        }

        System.out.println("El área es: " + resultado);

        scanner.close();
    }

    public static double areaCirculo(double radio) {
        if (radio < 0) {
            System.out.println("El radio no puede ser negativo");
            return 0.0; 
        }
        return Math.PI * Math.pow(radio, 2);
    }

    public static double areaCuadrado(double lado) {
        if (lado < 0) {
            System.out.println("El lado no puede ser negativo");
            return 0.0;
        }
        return Math.max(0, lado * lado);
    }

    public static double areaRectangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            System.out.println("La base y la altura no pueden ser negativas");
            return 0.0;
        }
        return Math.max(0, base * altura);
    }

    public static double areaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            System.out.println("La base y la altura no pueden ser negativas");
            return 0.0;
        }
        return (base * altura) / 2.0;
    }
}

