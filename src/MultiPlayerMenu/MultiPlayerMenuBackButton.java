package MultiPlayerMenu;

import MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MultiPlayerMenuBackButton extends JLabel implements MouseListener {

    //Взимане височината и дебелината на екрана
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) screenSize.getWidth();
    int height = (int) screenSize.getHeight();

    //Смятам началната позиция на бутона
    int buttonXPos = width / 2 - 100;
    int buttonYPos = height / 2 + 184;

    MultiPlayerMenuBackButton(){

        this.setForeground(new Color(111,0,0));
        this.setText("Back");
        this.setFont(new Font("Immortal",Font.BOLD,30));
        this.setBackground(Color.BLACK);
        this.setOpaque(false);
        this.setBounds(buttonXPos,buttonYPos,200,40);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        MainFrame.closeMultiPlayerMenu();
        MainFrame.openMainMenu();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setFont(new Font("Immortal",Font.BOLD,31));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setFont(new Font("Immortal",Font.BOLD,30));
    }
}
