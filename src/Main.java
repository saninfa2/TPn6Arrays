// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.management.PersistentMBean;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //-----------------------------------EJERCICIO 1--------------------------------------------

        /*System.out.println("Media de números");

       //Declaración e inicialización de variables
        int [] arrayNumbers = new int[10];
        */
        int counterNegative = 0, counterPositive = 0;
        /*
        int mediaNegative = 0, mediaPositive = 0;

        //Primero pedimos el ingreso de los 10 números
        for(int i = 0; i <= 9; i++){
            System.out.println("Ingrese 10 números enteros positivos y/o negativos: ");
            int number = scan.nextInt();
            arrayNumbers[i] = number;
        }

        //Recorremos el array y separamos los números positivos y los negativos
        for(int i = 0; i <= 9; i++){
            if(arrayNumbers[i] > 0){
                counterPositive+=1;
                mediaPositive += arrayNumbers[i];
            } else if(arrayNumbers[i] < 0){
                counterNegative+=1;
                mediaNegative += arrayNumbers[i];
            }
        }

        //Calculamos medias
        mediaPositive /= counterPositive;
        mediaNegative /= counterNegative;

        //Mostramos los resultados
        System.out.println("Media de números positivos: " + mediaPositive);
        System.out.println("Media de números negativos: " + mediaNegative);*/

        //-----------------------------------EJERCICIO 2--------------------------------------------
       /* System.out.println("Media de números en posición par");

        //Declaración e inicialización de variables
        double mediaPair = 0, counterPair= 0;

        //Primero pedimos el ingreso de los 10 números
        for(int i = 0; i <= 9; i++){
            System.out.println("Ingrese 10 números enteros positivos y/o negativos: ");
            int number = scan.nextInt();
            arrayNumbers[i] = number;
        }*/
/*
        //Recorremos el array y separamos los números que se almacenen en lugares pares
        for(int i = 0; i <= 9; i++){
            if(i%2==0){
                counterPair+=1;
                mediaPair += arrayNumbers[i];
            }
        }

        //Calculamos media
        mediaPair /= counterPair;*/

        /*//Mostramos los resultados
        System.out.println("Media de números almacenados en posiciones pares: " + mediaPair);*/
        //-----------------------------------EJERCICIO 3--------------------------------------------
        /* Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. 
        También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
        Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
        El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el
        número de alumnos y a continuación se creará el array.
        Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas
        por teclado, el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con
        notas superiores a la media.*/

       /* System.out.println("Notas de alumnos");

        //Pedimos la cantidad de alumnos
        System.out.println("Ingrese la cantidad de alumnos a procesar: ");
        int numberStudent = scan.nextInt();

        //Definimos e inicializamos variables
        double total = 0, average = 0;
        double [] student_note = new double[numberStudent];
        int i;

        //Pedimos el ingreso de las notas
        for(i = 0; i <= numberStudent-1; i++){
            System.out.println("Ingrese la nota del alumno " + (i+1));
            student_note[i] = scan.nextDouble();
            total += student_note[i];
        }

        //Calculamos el promedio de las notas
        average = total/numberStudent;

        //Mostramos resultados por pantalla
        System.out.println("Media: " + average);

        //Segundo for: si algún alumno supera el promedio, se muestra su nota
        for(i = 0; i <= numberStudent-1; i++){
            if(student_note[i] > average){
                System.out.println("Nota mayor al promedio: " + student_note[i]);
            }
        }

       */

        //Programa que crea un array de 20 elementos llamado Pares y guarde los 20 primeros
        //números pares. Mostrar por pantalla el contenido del array creado.
/*
        System.out.println("Primeros 20 numeros pares");

        //Defición e inicialización de variables
        int [] Pares = new int[20];
        int i, j = 0;

        //Primer for: llenado del array
        for(i=0; i<=19; i++){
            if (j%2==0){
                Pares[i] = j;
            }
            j += 2;
        }

        //Segundo for: mostramos el array pares
        for(i =0; i<=19; i++){
            if(i == 19){
                System.out.print(Pares[i]);
            } else {
                System.out.print(Pares[i] + ", ");
            }

        } */
/*
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        //A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y
        //cuántos ceros.

        System.out.println("¿Positivo, negativo o cero?");

        //Definición e inicialización de variables
        int [] intNumber = new int[10];
        int i=0;
        int counterZero = 0;
        counterPositive = 0;
        counterNegative = 0;

        //Primer for: para leer los números por teclado
        for(i = 0; i<=9; i++){
            System.out.println("Ingrese un número entero: ");
            intNumber[i] = scan.nextInt();
        }

        //Segundo for: recorremos el array para clasificar positivos, negativos o ceros
        for(i=0; i<=9; i++){
            if(intNumber[i] > 0){
                counterPositive += 1;
            } else if (intNumber[i] < 0){
                counterNegative += 1;
            } else {
                counterZero += 1;
            }
        }

        //Mostramos los resultados por pantalla
        System.out.println("Números positivos: " + counterPositive);
        System.out.println("Números negativos: " + counterNegative);
        System.out.println("Cantidad de 0: " + counterZero);
        */

        //Programa Java que llene un array con 10 números enteros que se leen por teclado.
  /*      //A continuación calcula y muestra la media de los valores positivos y la de los
        //valores negativos del array.
        System.out.println("Media de números positivos y negativos");

        //Definición e inicialización de variables
        int [] intNumbers = new int[10];
       */ int i=0, mediaPositive = 0, mediaNegative = 0; /*
        counterPositive = 0;
        counterNegative = 0;

        //Primer for: para leer los números por teclado
        for(i = 0; i<=9; i++){
            System.out.println("Ingrese un número entero: ");
            intNumbers[i] = scan.nextInt();
        }

        //Segundo for: recorremos el array para clasificar positivos o negativos
        for(i=0; i<=9; i++) {
            if (intNumbers[i] > 0) {
                counterPositive += 1;
                mediaPositive += intNumbers[i];
            } else if (intNumbers[i] < 0) {
                counterNegative += 1;
                mediaNegative += intNumbers[i];
            }
        }

        //Mostramos las medias de acuerdo al caso
        if (counterNegative != 0 && counterPositive != 0){
            System.out.println("Media de números positivos: " + (mediaPositive/counterPositive) );
            System.out.println("Media de números negativos: " + (mediaNegative/counterNegative) );
        } else if(counterPositive == 0 && counterNegative != 0){
            System.out.println("No se ingresaron números positivos para promediar" );
            System.out.println("Media de números negativos: " + (mediaNegative/counterNegative) );
        } else if(counterPositive != 0 && counterNegative == 0){
            System.out.println("Media de números positivos: " + (mediaPositive/counterPositive) );
            System.out.println("No se ingresaron números negativos para promediar" );
        } else {
            System.out.println("No se ingresaron números para promediar");
        }
        */

        //Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        //una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por
        //teclado y debe ser entero positivo.
      /*  System.out.println("Alturas, medias y otras cosas");
        System.out.println("Ingrese la cantidad de personas a procesar:");
        int N;
        do{
             N = scan.nextInt();
        } while (N < 0);


        double totalWidthN = 0, averageWidthN = 0, width;
        double [] widthN = new double[N];

        //Primer for: rellenamos un array con las alturas
        for(i=0; i <= N-1; i++){
            System.out.println("Ingrese la altura de la persona: ");
            widthN[i] = scan.nextDouble();
            totalWidthN += widthN[i];
        }

        //Sacamos el promedio
        if(totalWidthN != 0){
            averageWidthN = totalWidthN/N;
            System.out.println("Altura media: " + averageWidthN);
        }

        //Segundo for: recorremos para destacar la altura que supere la media
        for(i=0; i<=N-1; i++){
            if(widthN[i] > averageWidthN){
                System.out.println("Altura que supera a la media: " + widthN[i]);
            }
        }

       */

        //Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del
        //empleado que más gana.
        //Para hacerlo utilizaremos dos arrays:
        //Un array de String para los nombres de los empleados
        //Un array de tipo double para los sueldos de cada empleado.
        //
        //Al mismo tiempo que leemos los datos de los empleados iremos comprobando cuál es el que tiene el mayor sueldo.
        //Para ello tomamos el sueldo del primer empleado que se lee como mayor sueldo y después vamos comprobando el
        //resto de sueldos. Cuando encontramos alguno mayor que el mayor actual este sueldo se convierte en el nuevo mayor.
        //
        //En general para calcular el mayor de una serie de números tomamos el primero como mayor y después comparamos
        //el resto de números.
        System.out.println("Mayor sueldo");

       /* // Definir arrays para nombres y sueldos
        String[] names = new String[20];
        double[] salaries = new double[20];
        i = 0;

        // Inicializar el mayor sueldo con un valor inicial muy bajo
        double higherSalary = Double.MIN_VALUE;
        String employedHigherSalary = "";

        // Leer nombres y sueldos de los empleados y encontrar el mayor sueldo
        for (i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            names[i] = scan.nextLine();

            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            salaries[i] = scan.nextDouble();
            scan.nextLine(); // Consumir la nueva línea
            
            // Comprobar si este sueldo es mayor que el mayor actual
            if (salaries[i] > higherSalary) {
                higherSalary = salaries[i];
                employedHigherSalary = names[i];
            }
        }

        // Mostrar el empleado con el mayor sueldo
        System.out.println("El empleado con el mayor sueldo es: " + employedHigherSalary);
        System.out.println("Su sueldo es: " + higherSalary);
*/


    }
}