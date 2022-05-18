import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/*
            ClaseEnum diaT = ClaseEnum.TUESDAY;
            ClaseEnum diaJ = ClaseEnum.THURSDAY;
            System.out.println(diaT.name());
            System.out.println(ClaseEnum.THURSDAY);

            System.out.println(diaT.name());
            System.out.println(ClaseEnum.THURSDAY);

            System.out.println(diaT.ordinal()); //posicion de la constante

            ClaseEnum[] dias = ClaseEnum.values();
             System.out.println(dias[1].name()); //nombre de la constante

            System.out.println(diaT.compareTo(diaJ));
            System.out.println(diaT.compareTo(dias[1]));
            System.out.println(diaT.equals(diaJ)); //comparan por posiciones
         */
           
public class PrincipalEnum
{
    public static void main(){
 
        System.out.println("-----EJERCICIO-----");
            //pedir un dia de la semana por pantalla y controlar que ese dia de la semana
            //sea correcto mediante una clase enumerada
            ClaseEnum[] dias = ClaseEnum.values();
            ejercicio1(dias);
            
    }
    public static void ejercicio1(ClaseEnum[] dias){
            Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
            String dia= sc.nextLine();
            String aux= " ";
            int tam=0;

            try {
                do {
                    aux= String.valueOf(dias[tam]);
                    tam = tam + 1;
                }while(tam>0);
            }catch (java.lang.ArrayIndexOutOfBoundsException e){
                System.out.println("El tamaño del enum es: "+tam);
            }
            int x=0;
            boolean flag = false;
            for (int i = 0; i < tam; i++) {
                if (dia.equalsIgnoreCase(String.valueOf(dias[i]))){
                    flag=true;
                    x=i;
                    
                }
            }
            System.out.println("la posicion del dia dentro del enum es : "+x);
            if (flag){
                System.out.println(dia+" existe en el enum");
            }else {
                System.out.println(dia+" no existe en el enum");
            }
    }

}
