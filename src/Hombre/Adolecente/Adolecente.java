package Hombre.Adolecente;
import Hombre.chico.Chico;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " HOMBRE " .
public class Adolecente extends Chico {

    private String padre ;
    private String madre ;

    public Adolecente(String nombre, int edad, String colorDePiel, String esposa, String trabajo, String padre, String madre, String familia) {
        super(nombre, edad,  colorDePiel, esposa, trabajo, padre, madre , familia);
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
