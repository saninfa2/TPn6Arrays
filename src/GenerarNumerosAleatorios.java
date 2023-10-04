import java.util.Random;

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {
        int desde = 1;  // Límite inferior del rango
        int hasta = 100;  // Límite superior del rango
        int tamanio = 10;  // Tamaño del array de enteros

        int[] numerosAleatorios = generarNumerosAleatorios(desde, hasta, tamanio);

        // Imprimir el array de enteros generados
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
    }

    public static int[] generarNumerosAleatorios(int desde, int hasta, int tamanio) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Crear el array de enteros con el tamaño especificado
        int[] numerosAleatorios = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            // Generar un número aleatorio dentro del rango [desde, hasta]
            int numeroAleatorio = random.nextInt(hasta - desde + 1) + desde;

            // Almacenar el número aleatorio en el array
            numerosAleatorios[i] = numeroAleatorio;
        }

        return numerosAleatorios;
    }
}
