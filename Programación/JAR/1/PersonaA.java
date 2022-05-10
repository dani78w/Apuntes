import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PersonaA
{
    //ATRIBUTOS ENCAPSULADOS
         private String identificador="",nombre="",fNac="",aficiones="";
         final private char finSex='F';
         private char sexo=finSex;
         private float peso=0,altura=0;
     //CONSTRUCTORES;
            PersonaA(){}
            PersonaA(String nombre,String fNac,char sexo){
                this.nombre=nombre;
                this.fNac=fNac;
                this.sexo=sexo;
            }
            PersonaA(String nombre,String fNac,String aficiones,char sexo,float peso,float altura){
                this.nombre=nombre;
                this.fNac=fNac;
                this.aficiones=aficiones;
                this.sexo=sexo;
                this.peso=peso;
                this.altura=altura;
            }

    public String toString() {
        return "Persona{" +
                "identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fNac='" + fNac + '\'' +
                ", aficiones='" + aficiones + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    //METODOS GETTER Y SETTER

            public String getIdentificador() {
        return identificador;
    }
            public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getfNac() {
                return fNac;
            }
            public void setfNac(String fNac) {
        this.fNac = fNac;
    }

            public String getAficiones() {
                return aficiones;
            }
            public void setAficiones(String aficiones) {
                this.aficiones = aficiones;
            }
            public char getSexo() {
        return sexo;
    }
            public void setSexo(char sexo) {
        this.sexo = sexo;
    }

            public float getPeso() {
                return peso;
            }
            public void setPeso(float peso) {
                this.peso = peso;
            }

            public float getAltura() {
                return altura;
            }
            public void setAltura(float altura) {
                this.altura = altura;
            }



    //METODOS
            public int imc(float peso, float altura){
                int imc= (int) (peso/Math.pow(altura,2));
                final int infraPeso=-1; final int sobrePeso=1;  final int buenPeso=0;
                int flag=0;

                if (imc < 20) {
                    flag=infraPeso;
                } else if (imc>=20 && imc<25) {
                    flag=buenPeso;
                }else{
                    flag=sobrePeso;
                }

                return flag;
            }
            public boolean esMayor(String fNac){
                boolean flag = false;
                GregorianCalendar gc = null;
                gc = new GregorianCalendar();

                int año= Integer.parseInt(fNac.substring(0,4));
                int mes= Integer.parseInt(fNac.substring(5,7));
                int dia= Integer.parseInt(fNac.substring(8,10));
                GregorianCalendar gc2 = new GregorianCalendar(año,dia,mes);
                //la precision de este algoritmo solo cubre los años;
                int auxActual=(gc.getWeekYear()-18),auxEdad=(gc2.getWeekYear());
                System.out.println(auxEdad);
                if (auxEdad<auxActual){
                    flag=true;
                }else{flag=false;}

                return flag;
            }
            public void printEsMayor(PersonaA p,String fNac) {
                boolean flag =esMayor(fNac);
                if (flag == true) {
                    System.out.println(p.getNombre() + " Es mayor de edad");
                } else {
                    System.out.println(p.getNombre() + " Es menor de edad");
                }

            }
            public void comprobarSexo(PersonaA p){

                if (p.sexo!='M'&& p.sexo!='m'&& p.sexo!='F' && p.sexo!='f'){
                    p.sexo='M';
                    System.out.println("ahora sexo de:"+p.nombre+"es "+p.sexo);
                }
                System.out.println("El sexo introducido de "+p.nombre+" es correcto");
            }
            public void generarAleatorio(){
                this.identificador= String.valueOf((int)(100000 + Math.random() * 900000));
                System.out.println("Número aleatorio generado: "+this.identificador);
            }
}