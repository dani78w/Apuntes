import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal
{
    public static void main  (String[] args) throws java.io.IOException{
        //scaner
        Scanner sc = new Scanner(System.in,"UTF-8");
    
        
        Persona pers = null;//declaramos la variable objeto pers de la clase persona
        //primer objeto
        System.out.println("--- PRIMER OBJETO ---");
        
        pers = new Persona();//crea un objeto rellenando el valor por defecto que tenia la clase
        System.out.println("    "+pers.nif +pers.nombre + pers.edad);
        
        pers = new Persona("1111","Juan",(short)10);
        System.out.println("    "+pers.nif +pers.nombre + pers.edad);
        
        //nuevo objeto
        System.out.println("--- SEGUNDO OBJETO ---");
        Persona pers2 = null;
        pers2=new Persona("2222","Dani");
        System.out.println("    "+pers2.nif +pers2.nombre + pers2.edad);
        //NIF
        System.out.println("Nif: "+pers.getNif());
        System.out.println("    Nuevo nif:");
        pers.setNif(sc.nextLine());
  
        //Nombre
        System.out.println("Nombre: "+pers.getNombre());
        System.out.println("    Nuevo nombre:");
        pers.setNombre(sc.nextLine());

        //edad
        System.out.println("Edad: "+pers.getEdad());
        System.out.println("    Nuevo nombre:");
        pers.setEdad(Integer.parseInt(sc.nextLine()));
        
        //total
        System.out.printf("%s %s %d",pers.getNif(),pers.getNombre(),pers.getEdad());
    }
    
    
    
    
    
}

   