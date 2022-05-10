
public class Estatico {
    public static void imc(PersonaA p){
        System.out.println("        ----CALCULADORA DE IMC-----");
        System.out.println("    El peso de "+ p.getNombre()+" "+p.getPeso()+"kg");
        int i=p.imc(p.getPeso(), p.getAltura());
        if (i == 1) {
            System.out.println("    la persona "+p.getNombre()+" tiene sobrepeso");
        } else if (i == 0) {
            System.out.println("    la persona "+p.getNombre()+" está en su peso");
        }else if(i < 0){
            System.out.println("    la persona "+p.getNombre()+" pesa demasiado poco");
        }
        System.out.println("        ---------------------------");
    }

}
