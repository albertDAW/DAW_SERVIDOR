package Practica_1;

import java.awt.*;

/**
 * Created by Albert on 19/10/2016.
 */
public class Punto extends RegularClase implements Regular {
    @Override
    public void pintar(Graphics g){
        g.drawLine(getCoordenadaX(),getCoordenadaY(),getCoordenadaX(),getCoordenadaY());
    }
}
