package Ejercicio1;

/**
 * Created by Albert on 21/09/2016.
 */
public class Pagina {
    private String mes;
    private Integer dia;
    private boolean esFestiu;
    private Cita cita;

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

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

}
