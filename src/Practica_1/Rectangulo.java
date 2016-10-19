package Practica_1;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Rectangulo extends Cuadrado{
    public int grueso;

    public int getGrueso() {
        return grueso;
    }

    public void setGrueso(int grueso) {
        this.grueso = grueso;
    }

    @Override
    public void pintar(Graphics g){
        g.drawRect(getCoordenadaX(),getCoordenadaY(),getAncho(),getGrueso());
    }

    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("Introduzca grueso");
        setGrueso(escaner.nextInt());
    }

}
