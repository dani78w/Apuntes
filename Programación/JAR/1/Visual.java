import javax.swing.*;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Visual {
    public static void main(String args[]) throws InterruptedException, IOException {
           /*
            JFrame frame = new JFrame("GIT");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(120, 120);
            frame.setResizable(false);
            JButton JButton = new JButton("Pulsar");

            frame.getContentPane().add(JButton); // Agrega el botón al panel de contenido del marco
            frame.setVisible(true);
        int i = 0;

        while(i<100){
            TimeUnit.MICROSECONDS.sleep(200);
            JButton.setText(String.valueOf(i));
            if(i==99){i=0;}
            i++;

            }
           */
        try {
            File f = new File("C:\\Users\\AlumnoM\\Documents\\Apuntes\\Programación\\JAR\\Fichero.txt");

            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}