package Mujer;
import Humano.Main;

public class Mujer extends  Main{

        private  String esposo ;
        private  String trabajo ;

        public Mujer(String nombre , int edad  , String colorDePiel  , String esposo, String trabajo, String familia ) {
            this.nombre = nombre ;
            this.edad = edad ;
            this.sexo = "Femenina" ;
            this.colorDePiel = colorDePiel ;
            this.esposo = esposo ;
            this.trabajo = trabajo ;
            this.familia = familia ;
        }

        //    GETTER Y SETTER DE NOMBRE
        public  void setNombre ( String nombre){
            this.nombre = nombre ;
        }
        public String getNombre(){
            return this.nombre ;
        }

        //    getter y setter de SEXO
        public  void  setSexo( String sexo){
            this.sexo = sexo ;
        }
        public  String getSexo(){
            return sexo ;
        }

        //    getter y setter de colorDePiel
        public void  setColorDePiel(String colorDePiel ){
            this.colorDePiel = colorDePiel ;
        }
        public  String getColorDePiel(){
            return this.colorDePiel ;
        }

        //  getter y setter de edad
        public  void setEdad(int edad){
            this.edad = edad ;
        }
        public  int getEdad(){
            return  this.edad ;
        }

        //    getter y setter de esposa
        public void setEsposa( String esposo){
            this.esposo = esposo ;
        }

        public String getEsposa() {
            return esposo;
        }

        //    setter y getter de trabajo
        public  void setTrabajo(String trabajo){
            this.trabajo = trabajo  ;
        }
        public  String getTrabajo(){
            return  trabajo ;
        }

//        getter y setter de familia
    public  void setFamilia(String familia){ this.familia = familia ; }
    public String getFamilia(){return this.familia; }

}

