import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class PanelIngDatos extends JPanel{
	static JLabel texto1;
	static JTextField numValores;
	static JButton imprimir;
	
	PanelIngDatos(){
		
		setLayout(null);
		texto1 = new JLabel("Numero de datos", SwingConstants.CENTER);
		texto1.setBounds(20,22,112,25);
		add(texto1);
		numValores = new JTextField("Cantidad de valores",3);
		numValores.setBounds(140,22,120,25);
		add(numValores);
		imprimir = new JButton("IngresaDatos");
		imprimir.setBounds(265,22,120,25);
		add(imprimir);
	}
}
