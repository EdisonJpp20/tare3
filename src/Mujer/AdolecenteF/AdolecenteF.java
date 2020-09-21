package Mujer.AdolecenteF;
import  Mujer.Mujer;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " MUJER " .
public class AdolecenteF extends Mujer {
    private String padre ;
    private String madre ;

    public AdolecenteF(String nombre, int edad, String colorDePiel, String esposo, String trabajo,String padre ,String madre, String familia) {
        super(nombre, edad, colorDePiel,  esposo, trabajo, familia);
        this.padre = padre ;
        this.madre = madre ;
        this.familia = familia ;
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
