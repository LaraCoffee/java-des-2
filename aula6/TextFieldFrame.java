package aula6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;


    //construtor texfield add field ao frame
    public TextFieldFrame(){
        super("testando ");
        setLayout(new FlowLayout());

        //constroi texF com 10 colunas
        textField1 = new JTextField(10);
        add(textField1);//add ao jframe

        textField2 = new JTextField("entre com o texto aqui");
        add(textField2);

        //constroi txt padrao com 21 colunas
        textField3 = new JTextField("campo nao editavel ",21);
        textField3.setEditable(false);//nao permite editar
        add(textField3);

        //constroi um campo de senha 
        passwordField = new JPasswordField("texto escodindo");
        add(passwordField);//add ao jframe

        //handlers de evento registradores
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);


    }

    private class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "";

            if (event.getSource() == textField1) {
                string = String.format("textField1: %s",event.getActionCommand());
            }
            else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());
            }
            else if (event.getSource() == textField3) {
                string = String.format("textField3: %s", event.getActionCommand());
            }
            else if (event.getSource() == passwordField) {
                string = String.format(" passwordField: %s", event.getActionCommand());
        }
        JOptionPane.showMessageDialog(null,string);

    }
        
    }
}
