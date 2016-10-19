package Practica_1;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Cuadrado extends StandardClase implements Pintar {
    @Override
    public void pintar(Graphics g) {
        g.drawRect(getCoordenadaX(), getCoordenadaY(), getAncho(), getAncho());
    }
    @Override
    public void cambiarColor(Graphics g){
        g.setColor(null);
        g.fillRect(getCoordenadaX(),getCoordenadaY(),getAncho(),getAncho());
    }

}
