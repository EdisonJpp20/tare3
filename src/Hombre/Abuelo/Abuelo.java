package Hombre.Abuelo;
import Hombre.Hombre;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " HOMBRE " .
public class Abuelo extends Hombre {
    private  String nieto ;
    private String hijo ;
    public Abuelo(String nombre, int edad, String colorDePiel, String esposa, String trabajo , String familia ,String nietos , String hijos) {
        super(nombre, edad, colorDePiel, esposa, trabajo , familia);
        this.nieto =  nietos;
        this.hijo = hijos ;
    }

    //    getter y setter de nieto
    public  void  setNieto(String nieto){ this.nieto = nieto; }
    public  String getNieto(){ return this.nieto;}

    //    getter y setter de hijos
    public void setHijo(String hijo ){ this.hijo = hijo ; }
    public  String getHijo(){ return this.hijo; }

}
