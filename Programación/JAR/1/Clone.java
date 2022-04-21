
/**
 * Write a description of class Ejer5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clone
{
    // instance variables - replace the example below with your own
    public static void main() {
            
        Pelicula p1 = new Pelicula();
        
        
        
        p1.setTitle("Titulo");
        System.out.println("Objeto real; "+p1.getTitle());
        
        System.out.println("Objeto copia"+p1.clone().toString());
        
        System.out.println("Objeto real; "+p1.toString());

    }
}
