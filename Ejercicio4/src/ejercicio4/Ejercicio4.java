package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        String usuario, cedula, seguir;
        int elegir;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        usuario = teclado.nextLine();
        System.out.print("Ingresa tu número de cédula: ");
        cedula = teclado.nextLine();

        do {
            System.out.println("¿Qué trámite deseas realizar?");
            System.out.println("[1] - Consulte su planilla de luz");
            System.out.println("[2] - Consulte el predio del inmueble");
            elegir = teclado.nextInt();

            switch (elegir) {
                case 1:
                    planillaLuz(usuario, cedula);
                    break;
                case 2:
                    valorPredio(usuario, cedula);
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

            System.out.print("¿Deseas seguir con el programa? (si/no): ");
            seguir = teclado.next();

        } while (seguir.equalsIgnoreCase("si"));
    }

    static void planillaLuz(String nombre, String cedula) {
        double valorKw, kwConsumidos, finalValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del kilowatio: ");
        valorKw = scanner.nextDouble();
        System.out.print("Ingresa la cantidad de kilowatios consumidos: ");
        kwConsumidos = scanner.nextDouble();

        finalValue = valorKw * kwConsumidos;

        System.out.println("Cliente: " + nombre + " con cédula: " + cedula + " debe cancelar el valor de: $" + finalValue);
    }

    static void valorPredio(String nombre, String cedula) {
        double valorInmueble, finalValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio del inmueble: ");
        valorInmueble = scanner.nextDouble();

        finalValue = valorInmueble * 0.02;

        System.out.println("Cliente: " + nombre + " con cédula: " + cedula + " tiene un bien inmueble valorado en: $" + valorInmueble + " y tiene que pagar de predio: $" + finalValue);
    }
}
