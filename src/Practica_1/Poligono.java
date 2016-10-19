package Practica_1;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class Poligono extends FiguraGeometricaClase implements FiguraGeometrica,Pintar {

    int[] coordenadasX;
    int[] coordenadasY;
    int numeroPuntos;

    public int getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

    public int[] getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int[] coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public int[] getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(int[] coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    @Override
    public void pintar(Graphics g){
        g.drawPolygon(coordenadasX,coordenadasY,numeroPuntos);
    }


    @Override
    public void cambiarColor(Graphics g) {
        g.setColor(null);
        g.fillPolygon(coordenadasX,coordenadasY,numeroPuntos);

    }

    @Override
    public void obtenerDatos(Scanner escaner){
        super.obtenerDatos(escaner);
        System.out.println("NumeroPuntosPoligono");
        setNumeroPuntos(escaner.nextInt());
        coordenadasX = new int[numeroPuntos];
        for(int i = 0 ; i < numeroPuntos ; i++) {
            System.out.println("Introduzca coordenada X del punto" + (i+1));
            coordenadasX[i]=escaner.nextInt();
        }
        setCoordenadasX(coordenadasX);
        coordenadasY = new int[numeroPuntos];
        for(int i = 0 ;i < numeroPuntos ; i++) {
            System.out.println("Introduzca coordenada Y del punto" + (i+1));
            coordenadasY[i]=escaner.nextInt();
        }
        setCoordenadasY(coordenadasY);
    }
}
