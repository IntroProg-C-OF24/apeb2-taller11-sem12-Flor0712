package función_metodo;

public class Función_Metodo {

    public static void main(String[] args) {
       int limF = 3;
        int limC = 3;
        
        int[][] matrizA = new int[limF][limC];
        int[][] matrizB = new int[limF][limC];
        int[][] matrizC = new int[limF][limC];
        
        llenarMatriz(matrizA, limF, limC);
        
        System.out.println("Matriz Principal:");
        presentarMatriz(matrizA, limF, limC);
        
        llenarPares(matrizA, matrizB, limF, limC);
        
        System.out.println("Numeros Pares:");
        presentarMatriz(matrizB, limF, limC);
        
        llenarImpares(matrizA, matrizC, limF, limC);
        
        System.out.println("Numeros impares:");
        presentarMatriz(matrizC, limF, limC);
        
        presentarPromedio(matrizA, limF, limC);
    }

    static void llenarMatriz(int[][] matriz, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*((matriz.length)*9-1+1)+1);
            }
        }
    }

    static void presentarMatriz(int[][] matriz, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                System.out.print(matriz[i][j] + "  |  ");
            }
            System.out.println();
        }
    }

    static void llenarPares(int[][] matrizA, int[][] matrizB, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = matrizA[i][j];
                } else {
                    matrizB[i][j] = 0;
                }
            }
        }
    }

    static void llenarImpares(int[][] matrizA, int[][] matrizC, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (matrizA[i][j] % 2 != 0) {
                    matrizC[i][j] = matrizA[i][j];
                } else {
                    matrizC[i][j] = 0;
                }
            }
        }
    }

    static void presentarPromedio(int[][] matriz, int limF, int limC) {
        int suma = 0;

        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                suma += matriz[i][j];
            }
        }

        double promedio = (double) suma / (limF * limC);
        System.out.println("El promedio es: " + promedio);
    }
}


