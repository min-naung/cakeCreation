import javax.swing.*;
import java.awt.*;

class myPanel_05 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(100,220,400,60);
        g.setColor(Color.yellow);
        g.fillRect(210,150,180,100);
        g.setColor(Color.white);
        int [] xPoints = {210,360,390};
        int [] yPoints = {150,110,150};
        g.fillPolygon(xPoints,yPoints,3);
        g.setColor(Color.red);
        g.fillArc(316,120,40,40,0,180);
    }
}
public class Gui_05 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Gui_05");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);
        Container contentPane = f.getContentPane();
        myPanel_05 p = new myPanel_05();
        contentPane.add(p);

        f.setVisible(true);
    }
}