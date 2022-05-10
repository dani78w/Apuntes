public class Aula4 {

    public static void main(String[] args) {
        PersonaA def = new PersonaA();
        PersonaA per = new PersonaA("Paca","1991-05-03",'F');
        PersonaA per2 = new PersonaA("Pepe","2001-03-03","Comer helado",'M', 70F, (float) 1.80);
        System.out.println("    -OBJETOS NUEVOS-");
        imprimirPersona(def);
        imprimirPersona(per);
        imprimirPersona(per2);
        //Proceso de completado de los objetos
        System.out.println("    -OBJETOS TRAS SU MODIFICACIÓN-");
        //objeto def
        {
            def.setIdentificador("773328");
            def.setNombre("Alberto");
            def.setfNac("2011-05-03");
            def.setSexo('M');
            def.setAficiones("Jugar al tetris");
            def.setPeso(40);
            def.setAltura(2.00F);
            imprimirPersona(def);
        }
        //objetoPer
        {
            per.setIdentificador("4223328");
            per.setAficiones("Rodar cuesta abajo");
            per.setAltura(1.60F);
            per.setPeso(200);
            imprimirPersona(per);

        }
        //objetoPer1
            per2.setIdentificador("553228");
            imprimirPersona(per2);

        //SOBREPESO
        Estatico.imc(per);
        Estatico.imc(per2);
        Estatico.imc(def);
        //Mayor de edad
        System.out.println("[---COMPROBACIÓN DE MAYORÍA DE EDAD---]");
        def.printEsMayor(def,def.getfNac());
        per.printEsMayor(per,per.getfNac());
        per2.printEsMayor(per2,per2.getfNac());

        //metodos
        System.out.println("[---MÉTODOS EXTRA---]");
        per2.comprobarSexo(def);
        per2.comprobarSexo(per);
        per2.comprobarSexo(per2);

        per2.generarAleatorio();
    }
    public static void imprimirPersona(PersonaA p){
        System.out.println("    "+p);
    }
}
