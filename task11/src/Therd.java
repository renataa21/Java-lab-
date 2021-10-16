import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Therd extends JFrame {
    private JTextArea text;

    public Therd() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JMenuBar menu = new JMenuBar();
        JPanel pnl = new JPanel();
        add(pnl);
        text = new JTextArea("Напишите ваш текст");
        text.setFont(new Font("TimesRoman",Font.PLAIN,20));
        text.setOpaque(true);
        pnl.add(text);

        menu.add(Colour());
        menu.add(Font());
        setJMenuBar(menu);
        setSize(500,500);
        setVisible(true);
    }

    private JMenu Colour() {
        JMenu colour = new JMenu("Цвета");
        JMenuItem colour_1 = new JMenuItem("Фиолетовый");
        JMenuItem colour_2 = new JMenuItem("Розовый");
        JMenuItem colour_3 = new JMenuItem("Черный");
        colour.add(colour_1);
        colour.addSeparator();
        colour.add(colour_2);
        colour.addSeparator();
        colour.add(colour_3);

        colour_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(140, 41, 207));
            }
        });

        colour_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(207, 41, 121));
            }
        });

        colour_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(10,10,10));
            }
        });

        return colour;
    }

    private JMenu Font() {
        JMenu font = new JMenu("Шрифты");
        JMenuItem font_1 = new JMenuItem("TimesRoman");
        JMenuItem font_2 = new JMenuItem("Algerian");
        JMenuItem font_3 = new JMenuItem("Arial");
        font.add(font_1);
        font.addSeparator();
        font.add(font_2);
        font.addSeparator();
        font.add(font_3);

        font_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("TimesRoman", Font.PLAIN,20));
            }
        });

        font_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Algerian", Font.PLAIN,20));
            }
        });

        font_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Arial",Font.PLAIN, 20));
            }
        });

        return font;
    }

    public static void main(String[] args) {
        new Therd();
    }
}