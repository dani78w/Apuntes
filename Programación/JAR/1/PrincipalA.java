
/**
 * Write a description of class PrincipalA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrincipalA implements A,B,C
{
    public void imprMensajeA(String mensaje){
        System.out.println(mensaje);
    }
    public void imprMensajeB(String mensaje){
        System.out.println(mensaje);
    }
    public void imprMensajeC(String mensaje){
        System.out.println(mensaje);
    }
    
    public static void main(){
        //LOS METODOS NO ESTATICOS SE LLAMAN CREANDO UN OBJETO DE LA MISMA CLASE QUE EL MAIN!
        PrincipalA principal= new PrincipalA();
        principal.imprMensajeA(C.mensajeC);
        principal.imprMensajeC(B.mensajeB);
        principal.imprMensajeB(A.mensajeA);
        
    }
}
