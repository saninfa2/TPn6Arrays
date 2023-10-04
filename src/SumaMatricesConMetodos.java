import java.util.Scanner;
public class SumaMatricesConMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de filas y columnas de las matrices
        int filas = leerEntero("Ingrese el número de filas: ");
        int columnas = leerEntero("Ingrese el número de columnas: ");

        // Crear las matrices A y B
        int[][] matrizA = crearMatriz(filas, columnas);
        int[][] matrizB = crearMatriz(filas, columnas);

        // Llenar las matrices con valores enteros
        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(matrizA);

        System.out.println("Ingrese los valores de la matriz B:");
        llenarMatriz(matrizB);

        // Calcular la matriz C (suma de A y B)
        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        // Mostrar la matriz C
        System.out.println("La matriz C (suma de A y B) es:");
        mostrarMatriz(matrizC);

        // Cerrar el scanner
        scanner.close();
    }

    public static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizC;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
