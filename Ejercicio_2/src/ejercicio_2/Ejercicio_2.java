package ejercicio_2;
import java.util.Scanner;
public class Ejercicio_2 {

    public static void main(String[] args) {
        double b, h, area;
        int elegir;
        Scanner teclado = new Scanner(System.in);

            System.out.println("Elija el area que desee resolver:");
            System.out.println("[1] - Área de un cuadrado");
            System.out.println("[2] - Área de un triángulo");
            System.out.println("[3] - Área de un rectángulo");
            elegir = teclado.nextInt();

            switch (elegir) {
                case 1:
                    System.out.println("Ingresa un lado del cuadrado:");
                    b = teclado.nextDouble();
                    area = areaCuadrado(b);
                    System.out.println("El area del cuadrado es: " + area);
                    break;
                case 2:
                    System.out.println("Ingresa la base del triángulo:");
                    b = teclado.nextDouble();
                    System.out.println("Ingresa la altura del triángulo:");
                    h = teclado.nextDouble();
                    area = areaTriangulo(b, h);
                    System.out.println("El area del triangulo es: " + area);
                    break;
                case 3:
                    System.out.println("Ingresa la base del rectángulo:");
                    b = teclado.nextDouble();
                    System.out.println("Ingresa la altura del rectángulo:");
                    h = teclado.nextDouble();
                    area = areaRectangulo(b, h);
                    System.out.println("El area del rectangulo es: " + area);
                    break;
                default:
                    System.out.println("No existe");
            }
    }

    static double areaCuadrado(double b) {
        return b * b;
    }

    static double areaTriangulo(double b, double h) {
        return (b * h) / 2;
    }

    static double areaRectangulo(double b, double h) {
        return b * h;
    }
}
