import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizador
{
       public static void main  (String[] args) throws java.io.IOException{

           /* trocea la frase en tokens en base a la separación por blancos
              "Hola cara cola" -> Hola + cara + cola
              la clase tiene 3 metodos
              st.countTokens() numero de tokens de la cadena --> 3 tokens
              st.hasMoreTokens() Tiene mas tokens por obtener = true/false
              st.nextToken() el siguiente token
            */


            /* PEDIR UNA CADENA POR TECLADO Y OBTENER EL NUMERO DE CONJUNCIONES COPULATIVAS "Y,E,NI,QUE" */
           int i = 0;
           System.out.println("INTRODUCE UNA FRASE: ");

           Scanner sc = new Scanner(System.in,"UTF-8");
           StringTokenizer st = new StringTokenizer(sc.nextLine());
           String aux=" ";



           while(st.hasMoreTokens() == true){
               aux = st.nextToken();
               if (aux.equalsIgnoreCase("y")) i=i+1;
               if (aux.equalsIgnoreCase("e")) i=i+1;
               if (aux.equalsIgnoreCase("ni")) i=i+1;
               if (aux.equalsIgnoreCase("que")) i=i+1;
           }


           System.out.println("hay "+i+" conjunciones copulativas");




        }

}
