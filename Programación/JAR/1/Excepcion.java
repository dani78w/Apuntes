public class Excepcion extends Throwable {
    
    public static void demoproc() throws IllegalAccessException {
        System.out.println("Capturada la excepción en demoproc" );
        throw new IllegalAccessException("demo");
    }
    public static void main(){
     try{
         demoproc();
     }catch(IllegalAccessException e){
         System.out.println("capturaa de nuevo: " +e);
     }
        
    }
}
