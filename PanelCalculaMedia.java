import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class PanelCalculaMedia extends JPanel{
	static JLabel labelSalida;
	static JButton buttonCalculaPormedio;
	PanelCalculaMedia(){
		
		setLayout(null);
		labelSalida = new JLabel("El valor de la media es:", SwingConstants.CENTER);
		labelSalida.setBounds(265,22,200,25);
		add(labelSalida);
		buttonCalculaPormedio = new JButton("Calc");
		buttonCalculaPormedio.setBounds(150,22,90,25);
		add(buttonCalculaPormedio);
		
	}
}
