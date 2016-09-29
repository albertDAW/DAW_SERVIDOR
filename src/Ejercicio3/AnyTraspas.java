package Ejercicio3;

/**
 * Created by Albert on 29/09/2016.
 */
public class AnyTraspas extends Data{
    private Boolean esBisiesto ;
    private Integer anio = this.getAny();
    public boolean bisiesto(Integer anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            esBisiesto = true;
        else
            esBisiesto = false;
        return esBisiesto;
    }
}
