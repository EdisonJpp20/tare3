package Mujer.Adulta;
import Mujer.Mujer;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " MUJER " .
public class Adulta extends Mujer {

    private  String hijos ;
    private  String esposo ;
    private  String trabajo ;

    public Adulta(String nombre, int edad, String colorDePiel,String hijos,  String esposo, String trabajo,  String familia) {
        super(nombre, edad, colorDePiel, esposo, trabajo , familia);
        this.hijos = hijos ;
        this.esposo = esposo ;
        this.trabajo = trabajo ;
        this.familia = familia ;
    }

    //    getter y setter de esposa
    public void setEsposo( String esposo){
        this.esposo = esposo ;
    }
    public String getEsposo() {
        return esposo;
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

    //    getter y setter de familia
    public  void setFamilia(String familia){ this.familia = familia ;}
    public  String getFamilia(){ return this.familia;}


}
