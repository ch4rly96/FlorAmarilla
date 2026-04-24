import javax.swing.*;
import java.awt.*;

public class Flor extends JPanel {
@Override

    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);
    g.fillOval(100, 50, 100, 100); // petalo superior
    g.fillOval(50, 100, 100, 100); // petalo izquierdo
    g.fillOval(150, 100, 100, 100); // petalo derecho
    g.fillOval(100, 150, 100, 100); // petalo inferior
    g.setColor(Color.ORANGE);
    g.fillOval(110, 110, 80, 80); // centro
    }
    public static void main(String[] args) {
    JFrame frame = new JFrame("Flor Amarilla 🌼");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 350);
    frame.add(new Flor());
    frame.setVisible(true);
    }
    
}