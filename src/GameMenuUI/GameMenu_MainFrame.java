package GameMenuUI;

import Chapter1.GameBoard;

import javax.swing.*;

public class GameMenu_MainFrame{


    public static void GameMenuMainFrame() {
    //make the main frame


        JFrame GameMenuFrame = new JFrame();

        GameMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameMenuFrame.setTitle("Chapter one");
        GameMenuFrame.setSize(1920, 1080);
        GameMenuFrame.setLayout(null);
        GameMenuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       // GameMenuFrame.setUndecorated(true);
        GameMenuFrame.setVisible(true);

    //layering panels
        GameMenuFrame.add(MenuPanel.getMenuPanel());


        GameBoard tile = new GameBoard();
        GameMenuFrame.add(tile);
       // GameMenuFrame.add(MainPanel.getBackgroundLabel());
       // GameMenuFrame.add(MainPanel.getMainPanel());
        MainPanel mainPanel = new MainPanel();
        GameMenuFrame.add(mainPanel);




    //hero health overlaps side panel. I dont know how to do this better
        GameMenuFrame.add(SidePanel.getHeroLabel());
        GameMenuFrame.add(SidePanel.getHeroHealth());
        GameMenuFrame.add(SidePanel.getHeroResources());

        GameMenuFrame.add(SidePanel.getEnemyLabel());
        GameMenuFrame.add(SidePanel.getEnemyHealth());
        GameMenuFrame.add(SidePanel.getEnemyResources());

        GameMenuFrame.add(SidePanel.getEmptyLabel());

    //adding side panel to the main frame .. bars should be added in the side panel class
        GameMenuFrame.add(SidePanel.getSidePanel());


    //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
        SwingUtilities.updateComponentTreeUI(GameMenuFrame);

    }


}
