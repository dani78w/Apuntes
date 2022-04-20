
/**
 * Write a description of class Privado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Privado
{
    private static int num=0;
    private String nomb="";    
    final public static double pi=3,2314;
    
    Privado(String nomb){
        num++;
        this.nomb = nomb;
    }
    public String toString(){
        return num+" "+nomb;
    }
    
}
