package aula06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame2 extends JFrame {
    private JButton botaoPrata;
    private JButton botaoOuro;

    //buttonframe adiciona botoes ao frame
    public ButtonFrame2(){
        super("testando  botoes ");
        setLayout(new FlowLayout());//configura o  layout do frame

        botaoPrata = new JButton("prata");
        add(botaoPrata);

        botaoOuro = new JButton("ouro");
        add(botaoOuro);

        //cria novo botao handler para tratamento de evento botao
        ButtonHandler handler = new ButtonHandler();
        botaoPrata.addActionListener(handler);
        botaoOuro.addActionListener(handler);

    } 

    public class ButtonHandler implements ActionListener{
        //trata evento do botao 
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("voce pressionou %s",event.getActionCommand()));
        }

    }

}
