package Practica_1;

import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Linia extends Punto {
    private int coordenadaX2;
    private int coordenadaY2;

    public int getCoordenadaX2() {
        return coordenadaX2;
    }

    public void setCoordenadaX2(int coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public int getCoordenadaY2() {
        return coordenadaY2;
    }

    public void setCoordenadaY2(int coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }

    @Override
    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("Introduzca coordenada X del final de la linia");
        setCoordenadaX2(escaner.nextInt()) ;
        System.out.println("Introduzca coordenada Y del final de la linia");
        setCoordenadaY2(escaner.nextInt());
    }
}
