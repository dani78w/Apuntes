
public class Electrodomestico
{
    //Atributos--------------------------
    private String modelo=" ";
    private float consumo=0;
    //Constructores----------------------
        Electrodomestico(){};
        Electrodomestico(String modelo, float consumo) {
            this.modelo = modelo;
            this.consumo = consumo;
        }
    //metodos getter y setter

        public String getModelo() {return modelo;}
        public void setModelo(String modelo) {this.modelo = modelo;}

        public float getConsumo() {return consumo;}
        public void setConsumo(float consumo) {this.consumo = consumo;}
    //metodo toString

    public String toString() {
        return "Electrodomestico{" +
                "modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                '}';
    }
}
