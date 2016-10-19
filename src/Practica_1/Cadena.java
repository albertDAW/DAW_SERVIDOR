package Practica_1;

import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Cadena extends RegularClase implements Regular {
    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    @Override
    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("Introduzca string");
        setCadena(escaner.next());
    }
}
