
/**
 * Write a description of class Frigorifico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frigorifico extends Electrodomestico{
    //Atributos--------------------------
        float gradosC = 0;

    //Constructores----------------------
        public Frigorifico(String modelo, float consumo, float gradosC) {
            super(modelo, consumo);
            this.gradosC = gradosC;
        }
     //metodos Getter y Setter
        public float getGradosC() {return gradosC;}
        public void setGradosC(float gradosC) {this.gradosC = gradosC;}
    //metodo toString
        public String toString() {
            return
                    super.toString()+
                    "Frigorifico{" +
                    "gradosC=" + gradosC +
                    '}';
        }
    //metodo pasoFarenheit
        public float pasoFarenheit(Frigorifico f){
            float output=(f.gradosC*9/5)+32;
            System.out.println("------IMPRESIÓN DE CONVERSION------");
            return output;
        }
}
