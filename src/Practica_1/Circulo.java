package Practica_1;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Circulo extends StandardClase {

    @Override
    public void pintar(Graphics g){
        g.drawOval(getCoordenadaX(),getCoordenadaY(),getAncho(),getAncho());
    }

}
