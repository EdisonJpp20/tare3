package Hombre.chico;
import Hombre.Hombre;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " HOMBRE " .
public class Chico extends  Hombre {
   private String padre ;
   private String madre ;

    public Chico(String nombre, int edad, String colorDePiel, String esposa, String trabajo , String padre, String madre, String familia) {
        super(nombre, edad, colorDePiel, esposa, trabajo , familia);
        this.padre = padre ;
        this.madre = madre ;
    }

//    GETTER Y SETTER DE  MADRE
    public  void setMadre(String madre){
        this.madre = madre ;
    }
    public String getMadre(){
        return this.madre ;
    }


//    GETTER Y SETTER DE PADRE
    public void setPadre(String padre ){
        this.padre = padre ;
    }
    public String getPadre(){
        return  this.padre;
    }


}
