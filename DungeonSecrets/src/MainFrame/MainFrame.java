package MainFrame;

import CharactersMenu.CharactersMenuPanel;
import MainMenu.MainMenuPanel;
import MultiPlayerMenu.MultiPlayerMenuPanel;
import OptionsMenu.OptionsMenuPanel;
import SinglePlayerMenu.SinglePlayerMenuPanel;
import frontEnd.GameLayout;

import javax.swing.*;

public class MainFrame {

    private static JFrame mainFrame = new JFrame();
    private static MainMenuPanel mainMenuPanel = new MainMenuPanel();
    private static SinglePlayerMenuPanel singlePlayerMenu = new SinglePlayerMenuPanel();
    private static MultiPlayerMenuPanel multiPlayerMenu = new MultiPlayerMenuPanel();
    private static CharactersMenuPanel charactersMenu = new CharactersMenuPanel();
    private static OptionsMenuPanel optionsMenu = new OptionsMenuPanel();
    private static GameLayout mainLayout = new GameLayout();


    public MainFrame(){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setUndecorated(true);
        mainFrame.setLayout(null);

        mainFrame.add(mainLayout);
        mainFrame.add(mainMenuPanel);
        mainFrame.add(singlePlayerMenu);
        mainFrame.add(multiPlayerMenu);
        mainFrame.add(charactersMenu);
        mainFrame.add(optionsMenu);

        mainLayout.setVisible(false);
        singlePlayerMenu.setVisible(false);
        multiPlayerMenu.setVisible(false);
        charactersMenu.setVisible(false);
        optionsMenu.setVisible(false);

        mainFrame.setVisible(true);

    }

    public static void openMainLayout(){

        mainLayout.setVisible(true);

    }

    public static void openMainMenu(){

        mainMenuPanel.setVisible(true);

    }

    public static void openSinglePlayerMenu(){

        singlePlayerMenu.setVisible(true);

    }

    public static void openMultiPlayerMenu(){

        multiPlayerMenu.setVisible(true);

    }

    public static void openCharactersMenu(){

        charactersMenu.setVisible(true);

    }

    public static void openOptionsMenu(){

        optionsMenu.setVisible(true);

    }


    public static void closeMainLayout(){

        mainLayout.setVisible(false);

    }

    public static void closeMainMenu(){

        mainMenuPanel.setVisible(false);

    }

    public static void closeSinglePlayerMenu(){

        singlePlayerMenu.setVisible(false);

    }

    public static void closeMultiPlayerMenu(){

        multiPlayerMenu.setVisible(false);

    }

    public static void closeCharactersMenu(){

        charactersMenu.setVisible(false);

    }

    public static void closeOptionsMenu(){

        optionsMenu.setVisible(false);

    }
}
