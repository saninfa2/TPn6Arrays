import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de filas y columnas de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz A
        int[][] matrizA = new int[filas][columnas];

        // Llenar la matriz A con valores enteros
        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(scanner, matrizA);

        // Calcular la matriz transpuesta de A
        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matrizA);

        // Mostrar la matriz transpuesta
        System.out.println("La matriz transpuesta de A es:");
        mostrarMatriz(matrizTranspuesta);

        // Cerrar el scanner
        scanner.close();
    }
    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
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
