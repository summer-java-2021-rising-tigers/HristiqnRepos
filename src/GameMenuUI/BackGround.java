package GameMenuUI;

import Utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class BackGround extends JPanel {


    BackGround() {

        this.setBackground(Color.pink);
        this.setBounds(0, 0, ScreenResolution.getScreenWidth() - 350, ScreenResolution.getScreenHeight());
        this.setLayout(null);


    }


    Image icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("background.jpg"))).getImage();

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        int width = this.getWidth();
        int height = this.getHeight();
        g2D.drawImage(icon, 0, 0, width, height, null);

    }
}