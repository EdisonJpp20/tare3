import Familia.Familia;
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

public class Main {
    public  static  void main(String[]  args){

//              MIEMBROS DE  FAMILIA  MARTINEZ
        Adulto wilsonMartinez = new Adulto("Wilson", 45 , "Blanco","si", "Daysi", " Taxista", "Martinez");
        Adulta daysiMartinez = new Adulta("Daysi" , 42 , "Canela", " si" , "Wilson" , " Ama de casa" , " Martinez");
        /// Chico es igual a niño.
        Chico  hijoEdisonMartinez = new Chico("Edison", 9 , "Blanco", "no", " no",wilsonMartinez.nombre,  daysiMartinez.nombre, "Martinez" );
        AdolecenteF hijaEsteysiMartinez = new AdolecenteF("Esteysi", 15 , "canela", "no" , "no",wilsonMartinez.nombre,  daysiMartinez.nombre , "Martinez");
        Tio tioJoseLuisMartinez = new Tio("Jose Luis", 35 , "Blanco", "Charina","Chofer", hijoEdisonMartinez.nombre + " y " + hijaEsteysiMartinez.nombre, "Martinez" );
        Tia tiaCharinaMartinez = new Tia("Charina", 32 , "Blanca", tioJoseLuisMartinez.nombre, "Cantante", hijoEdisonMartinez.nombre + " y " + hijaEsteysiMartinez.nombre , "Martinez" );
        Abuelo abueloJuanoMartinez = new Abuelo("Juano " , 78 , "Blanco" , "JoseFina" , " no", "Martinez",hijoEdisonMartinez.nombre + " y " + hijaEsteysiMartinez.nombre ,daysiMartinez.nombre );
        Abuela abuelaJoseFinaMartinez = new Abuela("JoseFina ", 69, "Morena", abueloJuanoMartinez.nombre, "Ama de casa" , daysiMartinez.nombre , hijoEdisonMartinez.nombre + " y " + hijaEsteysiMartinez.nombre, "Martinez");



//        MIEMBROS DE FAMILIA SANCHEZ
        Adulto germanSanchez = new Adulto(" German", 48 , " negro" , "si" , "Nicole" , "Pelotero" , "Sanchez");
        Adulta nicoleSanchez = new Adulta("Nicole" , 40 , "india", "si" , "German", "Profesora" , " Sanchez");
        Chica hijaMarleneSanchez = new Chica("Marlene", 10 , "India", " no", " no", germanSanchez.nombre ,nicoleSanchez.nombre , "Sanchez" );
        Adolecente hijoPedroSanchez = new Adolecente("Pedro " , 16 , "Moreno" , "no " , "no",germanSanchez.nombre ,nicoleSanchez.nombre, "Sanchez" );
        Tio tioRaulinSanchez = new Tio("Rauling", 39 , "indio" , "Yaneris" , "Abogado", hijoPedroSanchez.nombre + " y" + hijoPedroSanchez , "Sanchez" );
        Tia tiaYanerisSanchez = new Tia("Yeneris", 39 , "blanca",tioRaulinSanchez.nombre , "Doctora" ,hijoPedroSanchez.nombre + " y" + hijoPedroSanchez.nombre , "Sanchez");
        Abuelo abueloRamonSanchez = new Abuelo("Ramon ", 70 , " moreno", "Maria ", "no","Sanchez" ,hijoPedroSanchez.nombre + " y" + hijoPedroSanchez.nombre, germanSanchez.nombre );
        Abuela abuelaMariaSanchez = new Abuela("Maria", 69 , "blanca" ,abueloRamonSanchez.nombre , "no", germanSanchez.nombre, hijoPedroSanchez.nombre + " y" + hijoPedroSanchez.nombre, "Sanchez");

        /// este metodo es adicional de la abuela , las abuelas siempre dando dinero
        System.out.println(abuelaJoseFinaMartinez.darDineroNieto(hijaMarleneSanchez.getNombre() , abuelaJoseFinaMartinez.getNombre()) );

        //      FAMILIA MARTINEZ
        Familia familiaMartinez =new Familia(" Martinez", wilsonMartinez , daysiMartinez ,   hijaEsteysiMartinez ,hijoEdisonMartinez, tioJoseLuisMartinez, tiaCharinaMartinez, abueloJuanoMartinez , abuelaJoseFinaMartinez);
        System.out.println(familiaMartinez.reunionFamiliar(familiaMartinez.getApellidoDeFamilia()));


        //        FAMILIA SANCHEZ
        Familia familiaSanchez = new Familia( "Sanchez", germanSanchez , nicoleSanchez , hijaMarleneSanchez,  hijoPedroSanchez,tioRaulinSanchez,tiaYanerisSanchez, abueloRamonSanchez, abuelaMariaSanchez);
        System.out.println(familiaSanchez.reunionFamiliar(familiaSanchez.getApellidoDeFamilia()));

    }
}
