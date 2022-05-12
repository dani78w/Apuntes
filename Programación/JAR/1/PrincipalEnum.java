
/**
 * Write a description of class PrincipalEnum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrincipalEnum
{
    public static void main(){
        ClaseEnum diaT = ClaseEnum.TUESDAY;
        ClaseEnum diaJ = ClaseEnum.THURSDAY;
        System.out.println(diaT.name());
        System.out.println(ClaseEnum.THURSDAY);
        
        System.out.println(diaT.name());
        System.out.println(ClaseEnum.THURSDAY);
        
        ClaseEnum[] dias = ClaseEnum.values();
         System.out.println(dias[1].name());
    
        System.out.println(diaT.compareTo(diaJ));
        System.out.println(diaT.compareTo(dias[1]));
    
    }
}
