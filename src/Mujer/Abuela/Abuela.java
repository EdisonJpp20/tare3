package Mujer.Abuela;

import Mujer.Mujer;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " MUJER " .
public class Abuela  extends  Mujer implements  AbuelaMetodo {
    private String nieto ;
    private  String hijo  ;
    public Abuela(String nombre, int edad, String colorDePiel, String esposo, String trabajo ,String hijo ,String nieto , String familia) {
        super(nombre, edad, colorDePiel, esposo, trabajo , familia);
        this.nieto =  nieto;
        this.hijo = hijo ;
        this.familia = familia ;
    }

//    getter y setter de nieto
    public  void  setNieto(String nieto){ this.nieto = nieto; }
    public  String getNieto(){ return this.nieto;}

//    getter y setter de hijos
    public void setHijo(String hijo ){ this.hijo = hijo ; }
    public  String getHijo(){ return this.hijo; }

    @Override
    public String darDineroNieto(String nietoNombre, String abuelaNombre) {
        return  "Hola " + nietoNombre + ",  soy " +  abuelaNombre + " tu abuela. Toma 25 pesos.";
    }
}
