
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Aula2
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in,"UTF-8");
        
        //importe inicial
        System.out.println("Importe incial: ");
        int importeInicial=0;
        importeInicial= Integer.parseInt(sc.nextLine());
        //plazo de inversión
        System.out.println("Plazo de inversion: ");
        int plazo=0;
        plazo= Integer.parseInt(sc.nextLine());
        //tipos de interés
        System.out.println("Tipos de interés: ");
        List<Integer> arrayPorcentajes = new ArrayList<>();
        int salida=0;
        int decision=1;
            while(decision==1) {
                System.out.println("Quieres añadir un tipo de interés?  1-Si 2-No");
                decision = sc.nextInt();
                if (decision==1) {
                    System.out.println("    Introduzca un tipo nuevo :");
                    int numero=sc.nextInt();
                    arrayPorcentajes.add(numero);
                } else {
                    decision=0;
                }
            }
            
        //prints
            System.out.println("-------------RESULTADOS-------------");
            System.out.println(arrayPorcentajes);
            List<Integer> resultados = new ArrayList<>();
             for(int j=0;j<arrayPorcentajes.size();j++){
                    resultados.add((arrayPorcentajes.get(j)*importeInicial)/100);
                    
                }

            List<Integer> terminal = new ArrayList<>();
            boolean flag=false;
            
            for(int i=0;i<plazo;i++){
                
                   if(flag==false){
                       for(int j=0;j<arrayPorcentajes.size();j++){
                           
                                terminal.add(arrayPorcentajes.get(j)+importeInicial);
                                System.out.printf("%d ",terminal.get(j));
                                flag=true;
                            }
                    }
                    else{
                        for(int j=0;j<arrayPorcentajes.size();j++){
                            terminal.set(j,null);
    
                            terminal.set(j,arrayPorcentajes.get(j)*(i+1)+importeInicial);
                            System.out.printf("%d ",terminal.get(j));
                            if(i==(plazo-1)){
                                System.out.printf("--Monto Final ");
                            }
                        }
                    
                    }
                
               System.out.printf("\n");
            }
       
    
    
    }
}
