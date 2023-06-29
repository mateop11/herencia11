import java.util.Scanner;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menú ===");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Esfera");
            System.out.println("5. Pirámide");
            System.out.println("6. Cubo");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            Figura figura;
            switch (opcion) {
                case 1:
                    figura = crearCirculo(scanner);
                    break;
                case 2:
                    figura = crearTriangulo(scanner);
                    break;
                case 3:
                    figura = crearCuadrado(scanner);
                    break;
                case 4:
                    figura = crearEsfera(scanner);
                    break;
                case 5:
                    figura = crearPiramide(scanner);
                    break;
                case 6:
                    figura = crearCubo(scanner);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
                    continue;
            }

            figura.calcularArea();
            figura.calcularPerimetro();
            figura.calcularVolumen();

            System.out.println(figura.toString());
        }
    }

    private static Circulo crearCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del centro del círculo:\n");
        Punto punto = crearPunto(scanner);
        return new Circulo(radio, punto);
    }

    private static Triangulo crearTriangulo(Scanner scanner) {
        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del punto del triángulo:\n");
        Punto punto = crearPunto(scanner);
        return new Triangulo(lado1, lado2, lado3, punto);
    }

    private static Cuadrado crearCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del punto del cuadrado:\n");
        Punto punto = crearPunto(scanner);
        return new Cuadrado(lado, punto);
    }

    private static Esfera crearEsfera(Scanner scanner) {
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del centro de la esfera:\n");
        Punto punto = crearPunto(scanner);
        return new Esfera(radio, punto);
    }

    private static Piramide crearPiramide(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del punto de la pirámide:\n");
        Punto punto = crearPunto(scanner);
        return new Piramide(base, altura, punto);
    }

    private static Cubo crearCubo(Scanner scanner) {
        System.out.print("Ingrese el lado del cubo: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingrese las coordenadas (x, y, z) del punto del cubo:\n");
        Punto punto = crearPunto(scanner);
        return new Cubo(lado, punto);
    }

    private static Punto crearPunto(Scanner scanner) {
        System.out.print("Ingrese la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double y = scanner.nextDouble();
        System.out.print("Ingrese la coordenada z: ");
        double z = scanner.nextDouble();
        return new Punto(x, y, z);
    }
}