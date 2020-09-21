package Hombre.Tio;

import Hombre.Hombre;
// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " HOMBRE " .
public class Tio extends Hombre{
    private  String sobrino;
    public Tio(String nombre, int edad, String colorDePiel, String esposa, String trabajo , String sobrino ,String familia) {
        super(nombre, edad, colorDePiel, esposa, trabajo, familia);
    this.sobrino = sobrino ;
    }

    //    getter y setter de sobrino
    public void setSobrino( String sobrino){
        this.sobrino = sobrino ;
    }
    public String getsobrino() {
        return this.sobrino;
    }
}
