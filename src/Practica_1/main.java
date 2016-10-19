package Practica_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Albert on 19/10/2016.
 */
public class main {
    public static void main(String args[]) {

        try {
            List<FiguraGeometrica> figurasPintadas = new ArrayList();
            Scanner escaner = new Scanner(System.in);
            Boolean apagarPrograma = false;
            /**menu**/
            System.out.println("A: Cadena");
            System.out.println("B: Circulo");
            System.out.println("C: Cuadrado");
            System.out.println("D: Linia");
            System.out.println("E: Poligono");
            System.out.println("F: Punto");
            System.out.println("G: Rectangulo");
            System.out.println("H: Imprimir Historial");
            System.out.println("I: Salir");

            while(apagarPrograma == false) {
                System.out.println("Seleccione una opcion");
                switch (escaner.next()) {
                    case "A":
                        FiguraGeometrica figuraA = new Cadena();
                        figuraA.obtenerDatos(escaner);
                        System.out.println(figuraA.toString());
                        figurasPintadas.add(figuraA);
                        break;
                    case "B":
                        FiguraGeometrica figuraB = new Circulo();
                        figuraB.obtenerDatos(escaner);
                        System.out.println(figuraB.toString());
                        figurasPintadas.add(figuraB);
                        break;
                    case "C":
                        FiguraGeometrica figuraC = new Cuadrado();
                        figuraC.obtenerDatos(escaner);
                        System.out.println(figuraC.toString());
                        figurasPintadas.add(figuraC);
                        break;
                    case "D":
                        FiguraGeometrica figuraD = new Linia();
                        figuraD.obtenerDatos(escaner);
                        System.out.println(figuraD.toString());
                        figurasPintadas.add(figuraD);
                        break;
                    case "E":
                        FiguraGeometrica figuraE = new Poligono();
                        figuraE.obtenerDatos(escaner);
                        System.out.println(figuraE.toString());
                        figurasPintadas.add(figuraE);
                        break;
                    case "F":
                        FiguraGeometrica figuraF = new Punto();
                        figuraF.obtenerDatos(escaner);
                        System.out.println(figuraF.toString());
                        figurasPintadas.add(figuraF);
                        break;
                    case "G":
                        FiguraGeometrica figuraG = new Rectangulo();
                        figuraG.obtenerDatos(escaner);
                        System.out.println(figuraG.toString()) ;
                        figurasPintadas.add(figuraG);
                        break;
                    case "H":
                        for (FiguraGeometrica figura : figurasPintadas
                                ) {
                            System.out.println(figura.toString());
                        }
                        break;
                    case "I":
                        System.out.println("Cerrando Programa");
                        apagarPrograma = true;
                        break;
                }
            }
        }
        catch(Exception e){

        }
    }
}
