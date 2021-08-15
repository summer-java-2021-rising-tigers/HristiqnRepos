package GameMenuUI;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private static JPanel menuPanel(){

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.yellow);
        menuPanel.setBounds(1050,1000,500,30);
        menuPanel.setOpaque(false);
        return menuPanel;

    }
    public static JPanel getMenuPanel (){
        return  menuPanel();
    }


}
