import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame {

    private JButton Milan = new JButton("Milan");
    private JButton Madrid = new JButton("Madrid");
    private JLabel Score;
    private JLabel Winner;
    private JLabel LastScorer;
    private int a = 0, b = 0;

    public Window() {
        Container c = getContentPane();
        c.setLayout(null);
        setTitle("Example window");
        setLocation(0,0);
        setSize(654, 513);

        Milan.setBounds(0,160,120, 160);
        Milan.setBorderPainted(false);
        Milan.setFocusPainted(false);
        Madrid.setBounds(520,160,120, 160);
        Madrid.setBorderPainted(false);
        Madrid.setFocusPainted(false);
        add(Milan);
        add(Madrid);

        Score = new JLabel(String.format("Result: %d X %d", a, b), SwingConstants.CENTER);
        Score.setBounds(120,160, 400,160);
        Score.setFont(new Font("TimesRoman", Font.BOLD, 22));
        Score.setOpaque(true);
        add(Score);

        Winner = new JLabel(String.format("Winner: %s", "NONE"), SwingConstants.CENTER);
        Winner.setBounds(0,0, 640,160);
        Winner.setFont(new Font("TimesRoman", Font.BOLD, 22));
        Winner.setOpaque(true);
        add(Winner);

        LastScorer = new JLabel(String.format("LastScorer: %s", "NONE"), SwingConstants.CENTER);
        LastScorer.setBounds(0, 320, 640,160);
        LastScorer.setFont(new Font("TimesRoman", Font.BOLD, 22));
        LastScorer.setOpaque(true);
        add(LastScorer);

        Milan.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent aa){}
            public void mouseClicked(MouseEvent aa){
                Score.setText(String.format("Result: %d X %d", ++a, b));
                LastScorer.setText(String.format("Last scorer: %s", "Milan"));
                if (a > b) Winner.setText(String.format("Winner: %s", "Milan"));
                if (a == b) Winner.setText(String.format("Winner: %s", "NONE"));
            }
            public void mouseEntered(MouseEvent aa) {}
            public void mouseReleased(MouseEvent aa) {}
            public void mousePressed(MouseEvent aa) {}
        });

        Madrid.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent aa){}
            public void mouseClicked(MouseEvent aa){
                Score.setText(String.format("Result: %d X %d", a, ++b));
                LastScorer.setText(String.format("Last scorer: %s", "Madrid"));
                if (b > a) Winner.setText(String.format("Winner: %s", "Madrid"));
                if (a == b) Winner.setText(String.format("Winner: %s", "NONE"));
            }
            public void mouseEntered(MouseEvent aa) {}
            public void mouseReleased(MouseEvent aa) {}
            public void mousePressed(MouseEvent aa) {}
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]) {
        new Window();
    }
}