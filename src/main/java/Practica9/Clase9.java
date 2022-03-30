/*
    Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:

a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.

b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.

c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.

d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.

Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda

Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido

Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas

*/

package Practica9;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class Clase9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a la Maquina TragaMonedas: ");
        System.out.println("==================================================================");
        System.out.println("Si consigue dos Figuras iguales le devolveremos su moneda!!");
        System.out.println("==================================================================");
        System.out.println("Si consigue tres Figuras iguales Gana su Premio. ¡¡BUENA SUERTE!!");
        System.out.println("==================================================================");

        int figuras;
        int figura1 = 0, figura2 = 0, figura3 = 0;
        int seguir = 0;
        do {
            for (int i = 1; i <= 3; i++) {
                figuras = (int) (Math.random() * 5 + 1);

                if (i == 1) {
                    figura1 = figuras;

                } else if (i == 2) {
                    figura2 = figuras;

                } else if (i == 3) {
                    figura3 = figuras;
                }

                switch (figuras) {

                    case 1:
                        System.out.println("CORAZON ");
                        break;

                    case 2:
                        System.out.println("DIAMANTE ");
                        break;
                    case 3:
                        System.out.println("HERRADURA ");
                        break;
                    case 4:
                        System.out.println("CAMPANA");
                        break;
                    case 5:
                        System.out.println("Limon");
                        break;
                    default:
                        System.out.println("¡¡¡¡ NADA !!!!");
                }
            }

            System.out.println("===============================================================================");

            if ((figura1 == figura2) && (figura2 == figura3) && (figura1 == figura3)) {
                System.out.println("!!FELICIDADES¡¡ Ha ganado 10 Monedas ");
            } else if ((figura1 == figura2) || (figura1 == 3) || (figura2 == figura3)) {
                System.out.println("Buena jugada, Ha recuperado su Moneda ");
            } else {
                System.out.println("LO SIENTO, HA PERDIDO; En el siguiente juego tendra mas suerte!!!");
            }
            System.out.println("Seguir Jugando: si=1, no = otro digito");
            seguir = sc.nextInt();
        } while (seguir == 1);

    }

}
