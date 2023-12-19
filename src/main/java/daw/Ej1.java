/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.fill;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ej1 {

    public static void main(String[] args) {
        //EJERCICIO 1

        //Creamos Array de Double de tamaño 15
        double[] arrayDecimales = new double[15];

        //Usamos fill para rellenarlo con un misma valor
        fill(arrayDecimales, 7.5);
        //Lo mostramos usando arrays.toString
        System.out.println("Array de decimales : ");
        System.out.println(Arrays.toString(arrayDecimales));

        //Realizamos una copia 
        double[] arrayCopia = copyOf(arrayDecimales, arrayDecimales.length);
        //Lo mostramos para asegurar que funciona
        System.out.println("Mostramos la copia");
        System.out.println(Arrays.toString(arrayCopia));

        //Comparar con equals ambos
        boolean igual = Arrays.equals(arrayDecimales, arrayCopia);
        System.out.println("Son ambas arrays iguales? : " + igual);

        //Rellenar la array de forma aleatoria con el valor 6.3
        //Creamos el objeto random
        Random r = new Random();
        int aleatorio = r.nextInt(0, arrayDecimales.length);
        //En la posicion aleatoria introducir el valor 6.3
        arrayDecimales[aleatorio] = 6.3;

        System.out.println("Mostramos ambos arrays");
        System.out.println(Arrays.toString(arrayDecimales));
        System.out.println(Arrays.toString(arrayCopia));
        igual = Arrays.equals(arrayDecimales, arrayCopia);
        System.out.println("Son iguales ahora? " + igual);

        //EJERCICIO 2
        //Creamos un array de int
        int[] arrayDeAleatorio = new int[10];
        rellenarArrayInt(arrayDeAleatorio);

        Arrays.sort(arrayDeAleatorio);
        System.out.println(Arrays.toString(arrayDeAleatorio));

        Scanner teclado = new Scanner(System.in);
        //En este caso vamos a pedir
        System.out.println("¿Qué número quieres buscar?");
        int numero = teclado.nextInt(); //Guardo el numero del usuario
        int posicion = Arrays.binarySearch(arrayDeAleatorio, 10);
        System.out.println("El numero " + numero
                + " se encuentra en la posicion " + posicion);

        //Probamos Método burbuja
        int[] desordenados = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Tenemos esta array : " + Arrays.toString(desordenados));
        burbuja(desordenados);
        System.out.println("Probamos a ordenarlos con nuestro metodo burbuja : "
                + Arrays.toString(desordenados));

        //Probamos Método binario
        int elemento = binario(desordenados, 5);
        System.out.println("La posicion es " + elemento);

        //Probamos el metodo equals a mano
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean sonIgual = sonIguales(array1, array2);
        System.out.println("Son iguales? " + sonIgual);

    }

    //Método para recibir un array y rellenarlos con aleatorios entre 10 y 100
    public static int[] rellenarArrayInt(int[] array) {
        Random r = new Random();
        int aleatorio = 0;
        for (int i = 0; i < array.length; i++) {
            aleatorio = r.nextInt(10, 101);
            array[i] = aleatorio;
        }

        return array;
    }

    //Método Burbuja(array)
    public static void burbuja(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }

    //Método binario(array,elemento)
    public static int binario(int[] array, int elemento) {
        int mitad = -1;
        int izquierda = 0;
        int derecha = array.length - 1;
        boolean encontrado = false;
        while ((izquierda <= derecha) && (!encontrado)) {
            mitad = (izquierda + derecha) / 2;
            if (array[mitad] == elemento) {
                encontrado = true;
            } else if (array[mitad] > elemento) {
                derecha = mitad - 1; //buscar en el trozo izquierdo
            } else {
                izquierda = mitad + 1; // buscar en el trozo derecho
            }
        }
        if (encontrado) {
            return mitad;
        } else {
            return -1;
        }

    }

    //Método implementado de equals
    public static boolean sonIguales(int[] array, int[] array2) {
        //Comparamos el tamaño de cada array
        if (array.length != array2.length) {
            return false;
        }
        //Bucle para recorrer cada posicion y comparar si son diferentes
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
               return false;}

    }
        return true;
    }

}
