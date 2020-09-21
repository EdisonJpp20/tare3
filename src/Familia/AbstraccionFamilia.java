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

abstract class AbstraccionFamilia {
    private String apellidoDeFamilia ;
    private Adulto padre ;
    private Adulta madre ;
    private Adolecente hijoAdolecente  ;
    private AdolecenteF hijaAdolecente  ;
    private Chico hijoPeque ;
    private Chica hijaPeque ;
    private  Tio tio ;
    private  Tia tia ;
    private  Abuelo abuelo ;
    private  Abuela abuela ;

//    getter y setter de padre
    public void setPadre(Adulto padre){ this.padre = padre; }
    public  Adulto getPadre(){return this.padre ;}

//    getter y setter de madre
    public  void setMadre(Adulta madre ){ this.madre = madre; }
    public Adulta getMadre(){return  this.madre;}

//    getter y setter tio
    public  void setTio(Tio tio ){this.tio = tio; }
    public Tio getTio(){return  this.tio;}

//    getter y setter tia
    public void setTia(Tia tia){ this.tia = tia ;}
    public Tia getTia(){return  this.tia ; }

//    setter y getter abuelo
    public void setAbuelo(Abuelo abuelo ){ this.abuelo = abuelo ; }
    public Abuelo getAbuelo(){ return this.abuelo ;}

//    getter y setter de abuela
    public void setAbuela(Abuela abuela ){ this.abuela = abuela ;}
    public  Abuela getAbuela(){ return this.abuela;}

//    gtter y setter de hijaPeque
    public void setHijoPeque(Chico hijoPeque ){ this.hijoPeque = hijoPeque ;}
    public  Chico getHijoPeque(){ return this.hijoPeque;}

//    getter y setter de hijaPeque
    public void setHijaPeque(Chica chica){ this.hijaPeque = chica; }
    public Chica getHijaPeque(){return this.hijaPeque;}

    // getter y setter de hijoAdolecente
    public void setHijoAdolecente(Adolecente adolecente ) { this.hijoAdolecente = adolecente;}
    public Adolecente getHijoAdolecente(){return this.hijoAdolecente;}

//    gettter y setter hija adolecente
    public void  setHijaAdolecente(AdolecenteF adolecente){ this.hijaAdolecente = adolecente;}
    public AdolecenteF getHijaAdolecente(){ return this.hijaAdolecente;}

//    getter y setter de apellido de la familia ;

    public void setApellidoDeFamilia( String apellidoDeFamilia ){ this.apellidoDeFamilia = apellidoDeFamilia; }
    public String getApellidoDeFamilia(){ return this.apellidoDeFamilia;}
}
