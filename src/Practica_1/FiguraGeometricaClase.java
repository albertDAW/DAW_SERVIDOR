package Practica_1;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public abstract class FiguraGeometricaClase implements FiguraGeometrica{
    String tipo;
    Boolean esRellenable;
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo + "|" + this.hashCode();
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setEsRellenable(Boolean esRellenable) {
        this.esRellenable = esRellenable;
    }

    @Override
    public Boolean getRellenable() {
        return esRellenable;
    }

    @Override
    public void pintar(Graphics g){
    }

    @Override
    public void obtenerDatos(Scanner escaner) {
        System.out.println("Introduzca tipo de objeto");
        setTipo(escaner.next());
    }
}
