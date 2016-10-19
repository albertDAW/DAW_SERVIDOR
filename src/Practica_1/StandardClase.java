package Practica_1;

import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class StandardClase extends RegularClase implements Standard {

    int ancho;
    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int getAncho() {
        return ancho;
    }

    @Override
    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("Introduzca ancho");
        setAncho(escaner.nextInt());
    }
}
