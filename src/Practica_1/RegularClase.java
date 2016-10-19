package Practica_1;

import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class RegularClase extends FiguraGeometricaClase implements Regular{

    int coordenadaX;
    int coordenadaY;

    @Override
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    @Override
    public int getCoordenadaX() {
        return coordenadaX;
    }

    @Override
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public int getCoordenadaY() {
        return coordenadaY;
    }

    @Override
    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("Introduzca coordenada X");
        escaner.next();
        System.out.println("Introduzca coordenada Y");
        escaner.next();
    }
}
