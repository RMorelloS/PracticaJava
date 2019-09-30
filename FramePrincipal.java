import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class FramePrincipal extends JFrame {
	static String datos[][];
	static JTable tabla;
	static String[] columnNames = {"Dato","Valor"};
	static JPanel panelTable;
	static int[] intArray;
	/**
	 * 
	 */
	FramePrincipal(){
		super("Medidas de tendencia");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		
		setLayout(new GridLayout(3,1));
		PanelIngDatos ingD = new PanelIngDatos();
		this.add(ingD);
		
		panelTable = new JPanel();
		panelTable.setLayout(new BorderLayout());
		this.add(panelTable);
		
		PanelCalculaMedia calc = new PanelCalculaMedia();
		this.add(calc);
		MEventosMedidasTC manejador = new MEventosMedidasTC();
		PanelIngDatos.imprimir.addActionListener(manejador);
		PanelCalculaMedia.buttonCalculaPormedio.addActionListener(manejador);
	}
}
