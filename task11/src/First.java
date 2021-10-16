import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class First extends JFrame {

    private JButton guess = new JButton("Угадать");
    private JLabel attemptsLeft;
    private JLabel result;
    private JTextField text;
    private int a = (int)(Math.random() * 20 + 1);
    private int attempts = 3;
    private int txt = 0;

    public First() {
        Container c = getContentPane();
        c.setLayout(null);
        setTitle("Example window");
        setLocation(0,0);
        setSize(654, 513);

        guess.setBounds(0,320,320, 160);
        guess.setFont(new Font("TimesRoman", Font.BOLD, 22));
        add(guess);

        attemptsLeft = new JLabel(String.format("Попытки: %d", attempts), SwingConstants.CENTER);
        attemptsLeft.setBounds(0,160, 640,160);
        attemptsLeft.setFont(new Font("TimesRoman", Font.BOLD, 22));
        add(attemptsLeft);

        result = new JLabel(String.format("Результат: "), SwingConstants.CENTER);
        result.setBounds(0,0, 640,160);
        result.setFont(new Font("TimesRoman", Font.BOLD, 22));
        add(result);

        text = new JTextField();
        text.setToolTipText("Ваше число");
        text.setFont(new Font("TimesRoman", Font.BOLD, 22));
        text.setBounds(320, 320, 320, 160);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String val = text.getText();
                int len = val.length();
                text.setEditable((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == '\b');
            }
        });
        add(text);

        guess.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent aa){}
            public void mouseClicked(MouseEvent aa){
                int txt = Integer.valueOf(text.getText());
                text.setText((""));
                if (txt != a) {
                    if (txt < a) result.setText("Число должно быть больше");
                    else result.setText("Число должно быть меньше");
                }
                else {
                    attemptsLeft.setText(String.format("Попытки: %d", --attempts));
                    result.setText("УРА ПОБЕДА!!!!");
                    return;
                }
                attemptsLeft.setText(String.format("Попытки: %d", --attempts));
                if (attempts == 0){
                    result.setText("О нет, проигрыш((!");
                    JOptionPane.showMessageDialog(null, "Попытки закончились \n" + "Вы проиграли(");
                    System.exit(0);
                }
            }
            public void mouseEntered(MouseEvent aa) {}
            public void mouseReleased(MouseEvent aa) {}
            public void mousePressed(MouseEvent aa) {}
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]) {
        new First();
    }
}

