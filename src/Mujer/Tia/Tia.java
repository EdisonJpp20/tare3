package Mujer.Tia;

import Mujer.Mujer;

// AQUI EN ESTA CLASS EXTIENDO EL POLIMORFISMO CON LA CLASS  " MUJER " .
public class Tia extends Mujer {
    private String sobrino ;
    public Tia(String nombre, int edad, String colorDePiel, String esposo, String trabajo,String sobrino, String familia) {
        super(nombre, edad, colorDePiel, esposo, trabajo , familia);
        this.sobrino = sobrino ;
        this.familia = familia ;
    }

    //    getter y setter de sobrino
    public  void  setSobrino(String sobrino){ this.sobrino = sobrino;}

    public String getSobrino(){ return this.sobrino ; }

}
