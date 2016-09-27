package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Albert on 21/09/2016.
 */
public class Pagina {
    private String mes;
    private Integer dia;
    private boolean esFestiu;

    public List<Cita> getLlistaCita() {
        return llistaCita;
    }

    public void setLlistaCita(List<Cita> llistaCita) {
        this.llistaCita = llistaCita;
    }

    private List<Cita> llistaCita = new ArrayList<>();

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public boolean isEsFestiu() {
        return esFestiu;
    }

    public void setEsFestiu(boolean esFestiu) {
        this.esFestiu = esFestiu;
    }

    public void borrarCita(int Integer){

    }

}
