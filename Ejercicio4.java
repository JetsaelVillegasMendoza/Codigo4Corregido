/*
Este programa implementa el juego de piedra, papel o tijeras para dos jugadores.
Cada jugador introduce su elección ("piedra", "papel" o "tijeras") y el programa determina
quién gana o si hay un empate.
*/

package com.generation;

import java.util.Scanner;//<= Se importa la clase Scanner del paquete java.util

public class Codigo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //<= Se pasa System.in como argumento

        // Pedimos las opciones de ambos jugadores
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String opcionJugador1 = scanner.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String opcionJugador2 = scanner.nextLine();

        // Determinamos el ganador
        int resultado = determinarGanador(opcionJugador1, opcionJugador2);

        // Imprimimos el resultado
        if (resultado == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador " + resultado);
        }//if else

        // Cerramos el Scanner
        scanner.close();
    }//main

    // Función para determinar el ganador
    public static int determinarGanador(String opcionJugador1, String opcionJugador2) {
        if (opcionJugador1.equals(opcionJugador2)) {
            return 0; // Empate
        } else if ((opcionJugador1.equals("piedra") && opcionJugador2.equals("tijeras")) || //<= Se sustituye == por equals para comparar cadenas
                   (opcionJugador1.equals("papel") && opcionJugador2.equals("piedra")) ||
                   (opcionJugador1.equals("tijeras") && opcionJugador2.equals("papel"))) {
            return 1; // Jugador 1 gana
        } else {
            return 2; // Jugador 2 gana
        }//if else
    }//método determinarGanador
}//class Código4