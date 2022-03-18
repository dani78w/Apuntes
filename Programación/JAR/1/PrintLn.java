
/*
 * Ejercicio1---------- 
 * @Daniel Arribas Sorando 
 * @10-marzo-2022
 */
public class PrintLn{
    
  
    public static void main  (String[] args){
        final float f = 375.28f;   
        String cad ="",ent ="",real="";            
        int i = 0;
        
        cad = String.valueOf(f);    //transformar el float f en un string
        i=cad.indexOf('.');         //   localizar el . en la cadena
        real = cad.substring(i+1);  //corta la cadena hasta el punto por la derecha
        ent = cad.substring(0,i);   //corta la cadena hasta el punto por al izquierda
        
        System.out.println("Numero inicial " +    f);
        System.out.println("Parte entera   " +  ent);
        System.out.println("Parte real     " + real);
        
        
    }
    
}
