package Ejercicio1;

import com.sun.javafx.scene.control.skin.PaginationSkin;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Albert on 21/09/2016.
 */
public class Agenda {
    public List<Pagina> pagina = new ArrayList<>() ;
    public int ann;
    protected int Iterador = 0;

    public List<Pagina> getPagina() {
        return pagina;
    }

    public void setPagina(List<Pagina> pagina) {
        this.pagina = pagina;
    }

    public int getIterador() {
        return Iterador;
    }

    public void setIterador(int iterador) {
        Iterador = iterador;
    }
    public int getAnn() {
        return ann;
    }

    public void setAnn(int ann) {
        this.ann = ann;
    }
    public void pasar_pagina(boolean avanzar) {
        if (avanzar){
        Iterador +=1;
        }
        else{
        Iterador -=1;
            }
    }
    public Pagina ir_a_pagina(int Iterador) {
        return pagina.get(Iterador);
    }
}
