import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;


public class Window2 extends JFrame {

    public Window2() {
        Container c = getContentPane(); // клиентская область окна
        setTitle("Example window"); // заголовок окна
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размер
        setVisible(true); // отображаем окно
    }
    // запуск оконного приложения
    public static void main(String args[]) {
        new Window2();
    }

    public void paint(Graphics a){
        String file = "/home/renataqq/IdeaProjects/Java/task8/src/cvety-rastenia-makro-kapli-listva.jpg";
        try {
            Image image = ImageIO.read(new File(file));
            a.drawImage(image, 0, 0, null);
        }
        catch (IOException ex){
            System.out.println("Невозможно открыть изображение");
        }
    }
}