package ProgramaInicio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MostradorDeUsuarios extends JFrame {

	private JPanel contentPane;
	static MostradorDeUsuarios frameInicio;
	private JTable tabla;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameInicio = new MostradorDeUsuarios();
					frameInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MostradorDeUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 366);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 568, 40);
		panel_1.setBackground(SystemColor.textHighlight);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane DatosBase = new JTextPane();
		DatosBase.setEditable(false);
		DatosBase.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		DatosBase.setBackground(SystemColor.textHighlight);
		DatosBase.setText("Usuarios del sistema");
		DatosBase.setForeground(new Color(255, 255, 255));
		DatosBase.setBounds(156, 4, 256, 29);
		panel_1.add(DatosBase);
		
		JTable tabla = new JTable();
		tabla.setForeground(new Color(0,0,0));
		tabla.setBackground(new Color(5, 5, 5, 5));
		tabla.setBounds(5,5,5,5);
		tabla.setRowHeight(30);
		tabla.setEnabled(false);
		tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tabla.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {"PrimerNombre", "SegundoNombre", "Pais", "Gmail", "Password"}));
		tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
		tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(4).setPreferredWidth(120);
		
		// Centrar texto
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		tabla.setDefaultRenderer(Object.class, centerRenderer);
		

		// Poner JScrollPane para poder hacer scroll 
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setForeground(new Color(0, 0, 0));
		scrollPane.getViewport().setBackground(new Color(5,5,5,5));
		//scrollPane.setBorder(BorderFactory.createLineBorder(new Color(255, 128, 0)));
		scrollPane.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		scrollPane.setBounds(10, 51, 552, 197);
		contentPane.add(scrollPane);

		// Obtenemos los usuarios de la base de datos y los a単adimos a la tabla
		MostrarUsuarios most = new MostrarUsuarios();
		most.Muestra();
		TablaConUsuarios TablaCon_ = new TablaConUsuarios(tabla);
		
		JLabel lblNewLabel = new JLabel("Introducir el Gmail del usuario que quiera borrar:");
		lblNewLabel.setBounds(150, 255, 268, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 275, 194, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final FuncionComprobarUsuario comprobar = new FuncionComprobarUsuario();
				if(comprobar.comprobar_usuario2(textField_1.getText())) {
					final Borrar borrarUsu = new Borrar();
					borrarUsu.borrarTabla(textField_1.getText());
					JFrame frame = new MostradorDeUsuarios();
					frame.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(contentPane, "Es usuario que quiere borrar no existe", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(225, 300, 89, 23);
		contentPane.add(btnNewButton);
		TablaCon_.MostrarUsuarios();
	}
}