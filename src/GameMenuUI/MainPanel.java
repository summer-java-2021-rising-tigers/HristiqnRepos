package GameMenuUI;

import Utility.Utility;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainPanel extends JPanel{



    MainPanel(){

        this.setBackground(Color.pink);
        this.setBounds(0,0, Utility.getScreenWidth()-350,Utility.getScreenHeight());
        this.setLayout(null);


    }


    Image icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("background.jpg"))).getImage();

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        int width = this.getWidth();
        int height = this.getHeight();
        g2D.drawImage(icon,0,0,width,height,null);

    }



//    public static JPanel mainPanel(){
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setBackground(Color.pink);
//        mainPanel.setBounds(0,0,1570,1080);
//        mainPanel.setLayout(null);
//
//        return mainPanel;
//    }
//    public static JPanel getMainPanel (){
//        return  mainPanel();
//    }


//    private static JLabel backgroundLabel(){
//
//        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("background.jpg")));
//        JLabel heroLabel = new JLabel();
//
//        heroLabel.setBounds(0,0,1570,1080);
//        heroLabel.setIcon(icon);
//
//        return heroLabel;
//    }
//    public static JLabel getBackgroundLabel() {
//        return backgroundLabel();
//    }




}
