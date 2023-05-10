package aula06;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturaEventoBotao implements ActionListener {
	private JButton botao;
	public void janela(){
		JFrame frame = new JFrame();
		botao = new JButton("botao", null);
		//botao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botao.setSize(100,30);
		botao.setVisible(true);

		//registra o evento
		botao.addActionListener(this);


		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

	@Override /*substituiçao do metodo*/
	public void actionPerformed(ActionEvent evento){
		botao.setText("fela da pouta");

		//altera a font
		botao.setFont(new Font("SansSerif", Font.BOLD, 20));
	}

	public static void main(String[] args) {
		CapturaEventoBotao captura = new CapturaEventoBotao();
		captura.janela();
	}


}
