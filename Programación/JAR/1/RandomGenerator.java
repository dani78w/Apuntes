import java.util.Random;
public class RandomGenerator
{


    public static void main  (String[] args) throws java.io.IOException{
        Random ob = new Random();
        //positivos y negativos
        System.out.println("--- POSITIVOS Y NEGATIVOS ---");
        for (int i = 0; i <= 4; i++) {
            System.out.println(i+" {"+ob.nextInt()+"}");//con next int se genera otro random
            //NEXT INT NEXT LONG NEXT FLOAT
        }

        //positivos
        System.out.println("--- SOLO POSITIVOS ---");
        int num = 0;
        for (int i = 0; i <= 4;) {
            num =ob.nextInt();
            if (num >= 0) {
                System.out.println(i+" {"+num+"}");//con next int se genera otro random
                i=i+1;
            }
        }

        //negativos
        System.out.println("--- SOLO NEGATIVOS ---");
        num = 0;
        for (int i = 0; i <= 4;) {
            num =ob.nextInt();
            if (num <= 0) {
                System.out.println(i+" {"+num+"}");//con next int se genera otro random
                i=i+1;
            }
        }




    }
}
