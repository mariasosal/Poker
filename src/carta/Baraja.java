/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Baraja {

    String palo[] = {"Pica", "Diamante", "Trébol", "Corazón"};
    String número[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jack", "Queen", "King"};
    Carta[] misCartas = new Carta[52];

    void crearMazo() {

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < número.length; j++) {
                misCartas[j + (i*13)] = new Carta(número[j], palo[i], (i + 1) * j);
            }

        }
    }

    void barajar() {
        Random miRandom = new Random();

        int pasadas = miRandom.nextInt(1000);
        Carta miCarta;
        for (int i = 0; i < pasadas; i++) {

            int posiciónInicial = miRandom.nextInt(51);
            int posiciónFinal = miRandom.nextInt(51);

            miCarta = misCartas[posiciónInicial];
            misCartas[posiciónInicial] = misCartas[posiciónFinal];
            misCartas[posiciónFinal] = miCarta;
        }
    }

}
