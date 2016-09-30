package Ejercicio5;
import java.awt.Color;

public abstract class FiguraGeometrica {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;

   public FiguraGeometrica (int ncodi, String nnom, Color ncolor) {
      if (ncodi>0) codi = ncodi;
      nom = nnom;
      color = ncolor;
   }
   public abstract double area();

   public FiguraGeometrica(FiguraGeometrica f)  {
      this (f.codi, f.nom, f.color);
   }

   public FiguraGeometrica () {}

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }   

   public int getCodi () {
      return codi;
   }

   public String getNom () {
      return nom;
   }
   
   public Color getColor () {
      return color;
   }

   public String toString(){
      String respuesta = "Codi..........:" + codi + "\n" + "Nom...........:" + nom + "\n" + "\"Color.........:\" + color";
      return respuesta;
   }

   public void visualitzar () {
      System.out.print(toString());
   }
   @Override
   public boolean equals(Object f){
       if (this.codi == ((FiguraGeometrica)f).getCodi()) return true;
       else return false;
   }
}