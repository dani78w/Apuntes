
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
    
    Privado(String nomb){
        num++;
        this.nomb = nomb;
    }
    public String toString(){
        return num+" "+nomb;
    }
    //variables primitivas actuan como parametro por valor, pero el resto suelen ser por referencia.SE MODIFICAN!
    /*
        public void mArray (int [] anunm)
            sout(anum);
            anum [0]++
            sout(anum[0]);
           //para clonar arrays por ejemplo existe el metodo array.Clone() le estás pasando el clone
            se hacen las modificaciones ahí y el array aparece inmutable;



     */
}
