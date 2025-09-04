package Playground;
import javax.swing.*;
import java.awt.*;

public class TridiObjek extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast ke Graphics2D
        Graphics2D g2d = (Graphics2D) g;

        // Koordinat kubus (2 kotak digabung)
        int x = 100, y = 100, size = 100;
        g2d.drawRect(x, y, size, size); // kotak depan
        g2d.drawRect(x+30, y+30, size, size); // kotak belakang

        // Hubungkan kotak depan & belakang
        g2d.drawLine(x, y, x+30, y+30);
        g2d.drawLine(x+size, y, x+size+30, y+30);
        g2d.drawLine(x, y+size, x+30, y+size+30);
        g2d.drawLine(x+size, y+size, x+size+30, y+size+30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Cube Illusion");
        TridiObjek panel = new TridiObjek();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

