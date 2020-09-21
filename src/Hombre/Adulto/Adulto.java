package Hombre.Adulto;

import Hombre.Hombre;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " HOMBRE " .
public class Adulto extends Hombre {

    private  String hijos ;
    private  String esposa ;
    private  String trabajo ;

    public Adulto(String nombre, int edad, String colorDePiel, String hijos, String esposa, String trabajo , String familia) {
        super(nombre, edad, colorDePiel, esposa, trabajo, familia);
        this.hijos = hijos ;
        this.esposa = esposa ;
        this.trabajo = trabajo ;
    }

    //    getter y setter de esposa
    public void setEsposa( String esposa){
        this.esposa = esposa ;
    }
    public String getEsposa() {
        return esposa;
    }

    //    getter y setter hijos
    public void setHijos(String hijos ){
        this.hijos = hijos ;
    }
    public String getHijos(){
        return  hijos ;
    }

    //    setter y getter de trabajo
    public  void setTrabajo(String trabajo){
        this.trabajo = trabajo  ;
    }
    public  String getTrabajo(){
        return  trabajo ;
    }

}
