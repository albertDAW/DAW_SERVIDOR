package Practica_1;

import java.awt.*;

/**
 * Created by Albert on 19/10/2016.
 */
public interface FiguraGeometrica {
    void setTipo(String tipo);
    String getTipo();
    void setEsRellenable(Boolean esRellenable);
    Boolean getRellenable();
    void pintar(Graphics g);
}
