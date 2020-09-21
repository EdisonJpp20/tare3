package Humano;

import Hombre.Adulto.Adulto;

interface HumanoMeotodo{
    public String saludar(String nombre , String familia);
}

public class Main extends  Humano implements HumanoMeotodo{
    @Override
    public String saludar(String nombre , String familia) {
        return "Hola mi nombre es " + nombre + " y soy de la familia " + familia  + ". Este es mi metodo SALUDO()";
    }

}
