import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class MEventosMedidasTC implements ActionListener {
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == PanelIngDatos.imprimir) {
			try {
				int cantidadNumeros = Integer.parseInt(PanelIngDatos.numValores.getText());
				FramePrincipal.intArray = null;
				FramePrincipal.intArray = new int[cantidadNumeros];
				FramePrincipal.datos = null;
				FramePrincipal.datos = new String[cantidadNumeros][2];
				
				for(int fila=0;fila<FramePrincipal.datos.length;fila++) {
					FramePrincipal.datos[fila][0] = String.valueOf(fila);
					int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato " + fila));	
					FramePrincipal.intArray[fila] = dato;
					FramePrincipal.datos[fila][1] = String.valueOf(dato);
				}
	
				FramePrincipal.panelTable.updateUI();
				FramePrincipal.panelTable.repaint();
				//FramePrincipal.tabla = null;
				//DefaultTableModel dtm = (DefaultTableModel) FramePrincipal.tabla.getModel();
				//dtm.setRowCount(0);
				FramePrincipal.tabla = new JTable(FramePrincipal.datos, FramePrincipal.columnNames);
			
				JScrollPane tableContainer = new JScrollPane(FramePrincipal.tabla);
				FramePrincipal.panelTable.add(tableContainer);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e, "Exception", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if (evento.getSource() == PanelCalculaMedia.buttonCalculaPormedio) {
			try {
				int cantidadNumeros = FramePrincipal.intArray.length;
				int soma = 0;
				for(int i = 0;i<cantidadNumeros;i++) {
					soma += FramePrincipal.intArray[i];
					System.out.println(FramePrincipal.intArray[i]);
				}
				double porMedio = soma/cantidadNumeros;
				PanelCalculaMedia.labelSalida.setText("El valor de la media es: " + porMedio); 
				System.out.println(porMedio);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e, "Exception", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
