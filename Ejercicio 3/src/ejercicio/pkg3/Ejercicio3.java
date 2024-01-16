package ejercicio.pkg3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double a, b, c, d, promedio, promedioTotal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese sus notas");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        d = teclado.nextDouble();

        promedio = promedioTotal(a, b, c, d);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El promedio cualitativo es: " + promedioCuali(promedio));
    }

    static double promedioTotal(double a, double b, double c, double d) {
        double limNota =4;
        return (a + b + c + d) /limNota;
    }

    static String promedioCuali(double promedio) {
        if (promedio >= 0 && promedio<= 5) {
            return "Regular";
        } else if (promedio> 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy bueno";
        } else {
            return "Sobresaliente";
        }
    }
    
}
