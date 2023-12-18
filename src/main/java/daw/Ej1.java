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

}
