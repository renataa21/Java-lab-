import java.awt.*;
import javax.swing.JFrame;


public class Window extends JFrame {

    public Window() {
        Container c = getContentPane(); // клиентская область окна
        setTitle("Example window"); // заголовок окна
        setPreferredSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размер
        setVisible(true); // отображаем окно
    }
    // запуск оконного приложения
    public static void main(String args[]) {
        new Window();
    }

    public void paint(Graphics a){
        Polygon pol;
        for (int i = 0; i < 20; i ++) {

            pol = new Polygon();
            int[] x = pol.x_points.stream().mapToInt(j -> j).toArray();
            int[] y = pol.y_points.stream().mapToInt(j -> j).toArray();
            a.setColor(new Color(pol.r, pol.g, pol.b));
            a.fillPolygon(x, y, pol.angle_val);
        }
    }
}