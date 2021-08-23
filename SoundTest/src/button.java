import javax.swing.*;

public class button {

    public static JButton button(){
        JButton button = new JButton("click me");
        button.setBounds(100,100,100,30);
        button.addActionListener(e -> new sound());
        return button;
    }


}
