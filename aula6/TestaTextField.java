package aula6;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestaTextField {
	public static void main(String[] args) {
        TextFieldFrame TextFieldFrame = new TextFieldFrame();

        TextFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextFieldFrame.setSize(350,200);
        TextFieldFrame.setVisible(true);
    }
}
