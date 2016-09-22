package Ejercicio1;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Albert on 21/09/2016.
 */
public class main {
    public static void main (String args[]) {
        try {
        Agenda agenda =new Agenda() ;
        Cita cita = new Cita();
        List<String> listaPaginas = new ArrayList<>();


        int numero = agenda.getIterador();
        if(numero == 0){
            numero = 1;
        }
        agenda.setIterador(numero);
        for(int i = 0; i < 52 ; i++){
            listaPaginas.add( ("pagina"+"i"));
        }
    }
        catch(Exception  e){

        }
    }
}


