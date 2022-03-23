/*  Teoría de clases*/
public class Principal
{
    public static void main  (String[] args) throws java.io.IOException{
        
        //primer objeto
        System.out.println("--- PRIMER OBJETO ---");
        Persona pers = null;//declaramos la variable objeto pers de la clase persona
        pers = new Persona();//crea un objeto rellenando el valor por defecto que tenia la clase
        System.out.println("    "+pers.nif +pers.nombre + pers.edad);
        
        pers = new Persona("1111","Juan",(short)10);
        System.out.println("    "+pers.nif +pers.nombre + pers.edad);
        
        //nuevo objeto
        System.out.println("--- SEGUNDO OBJETO ---");
        Persona pers2 = null;
        pers2=new Persona("2222","Dani");
        System.out.println("    "+pers2.nif +pers2.nombre + pers2.edad);
    }
}
