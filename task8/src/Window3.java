import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;

public class Window3 extends JFrame {

    public Window3() {
        JFrame frame = new JFrame("Nyan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Window3();
    }

    public void paint(Graphics a){
        String[] x  = new String[] {"/home/renataqq/IdeaProjects/Java/task8/src/cvety-rastenia-makro-kapli-listva.jpg","/home/renataqq/IdeaProjects/Java/task8/src/conifer-1867371_1280.jpg"};

        while (true) {
            for (int i = 0; i < 2; i++) {
                try {
                    Image image = ImageIO.read(new File(x[i]));
                    a.drawImage(image, 0, 0, null);
                } catch (IOException ex) {
                    System.out.println("Невозможно открыть изображение");
                }

            }
        }



        }
    }
