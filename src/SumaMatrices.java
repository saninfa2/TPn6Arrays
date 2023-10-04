import java.util.Scanner;
public class SumaMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las dimensiones de las matrices
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear las matrices A y B
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        // Pedir al usuario los valores de las matrices A y B
        System.out.println("Ingrese los valores de la matriz A:");
        ingresarValoresMatriz(scanner, matrizA);

        System.out.println("Ingrese los valores de la matriz B:");
        ingresarValoresMatriz(scanner, matrizB);

        // Calcular la matriz C (suma de A y B)
        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        // Mostrar la matriz C
        System.out.println("La matriz C (suma de A y B) es:");
        mostrarMatriz(matrizC);

        // Cerrar el scanner
        scanner.close();
        }

        public static void ingresarValoresMatriz(Scanner scanner, int[][] matriz) {
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

