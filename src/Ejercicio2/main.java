package Ejercicio2;

/**
 * Created by Albert on 23/09/2016.
 */
public class main {

    public static void main(String args[]){
        try {
            Borrar objeto = new Borrar();
            objeto = null;
            System.gc();
        }
        catch (Exception e){

        }
    }
}