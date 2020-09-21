package Familia;

import Hombre.Abuelo.Abuelo;
import Hombre.Adolecente.Adolecente;
import Hombre.Adulto.Adulto;
import Hombre.Tio.Tio;
import Hombre.chico.Chico;
import Mujer.Abuela.Abuela;
import Mujer.AdolecenteF.AdolecenteF;
import Mujer.Adulta.Adulta;
import Mujer.Chica.Chica;
import Mujer.Tia.Tia;

public class Familia extends AbstraccionFamilia implements  FamiliaMetodos{

    public Familia(String apellidodeFamilia , Adulto padre, Adulta madre, Chica hijaPeque, Adolecente hijoAdolecente, Tio tio, Tia tia, Abuelo abuelo, Abuela abuela) {
        setApellidoDeFamilia(apellidodeFamilia);
        setPadre(padre);
        setMadre(madre);
        setHijaPeque(hijaPeque);
        setHijoAdolecente(hijoAdolecente);
        setTio(tio);
        setTia(tia);
        setAbuelo(abuelo);
        setAbuela(abuela);
    }

    public Familia(  String apellidodeFamilia,Adulto padre, Adulta madre, AdolecenteF hijaAdolecente, Chico hijoPeque, Tio tio, Tia tia, Abuelo abuelo, Abuela abuela) {
        setApellidoDeFamilia(apellidodeFamilia);
        setPadre(padre);
        setMadre(madre);
        setHijaAdolecente(hijaAdolecente);
        setHijoPeque(hijoPeque);
        setTio(tio);
        setTia(tia);
        setAbuelo(abuelo);
        setAbuela(abuela);
    }

    @Override
    public String reunionFamiliar(String familianombre) {
        return  " La familia " + familianombre + " tendremos una gran reunion hoy.  ESTE ES EL METODO REUNIONFAMILIAR().";
    }
}
