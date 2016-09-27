package Ejercicio1;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Albert on 21/09/2016.
 */
public class main {

    public static void main(String args[]) {
        try {
        Agenda agenda =new Agenda() ;
        Cita cita = new Cita();
        List<Pagina> listaPaginas = new ArrayList<>();
        List<Cita> listaCitas = new ArrayList<>();
        int numero = agenda.getIterador();
        if(numero == 0){
            numero = 1;
        }

        agenda.setIterador(numero);
        for(int i = 1; i < 52 ; i++){
            Pagina pagina = new Pagina();
            for(int e =1 ; e < 7 ; e++){
                listaCitas.add(new Cita());
            }
            pagina.setLlistaCita(listaCitas);
            listaPaginas.add((pagina));
        }
        agenda.setPagina(listaPaginas);
        agenda.getPagina().get(2).getLlistaCita().get(2).setMotiu("HOLA MUNDO");
    }
        catch(Exception  e){

        }
    }
}


