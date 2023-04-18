package ProgramaInicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Terminos_de_uso extends JFrame {

	private JPanel contentPane;
	static Terminos_de_uso frameRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Terminos_de_uso frame = new Terminos_de_uso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Terminos_de_uso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setEditable(false);
		txtpnLoremIpsumDolor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit risus egestas per, placerat laoreet bibendum auctor varius metus lobortis rutrum dignissim, facilisi nisl quisque nec ullamcorper tortor torquent ridiculus magnis. Facilisis diam nibh tortor tempor elementum nisi eu parturient tincidunt, interdum massa vulputate mus libero magnis integer nisl aliquam, ac feugiat proin ullamcorper risus suscipit phasellus commodo. Tellus euismod pretium nulla eget nascetur vulputate pellentesque mi dignissim, congue class vestibulum donec platea dui per.");
		txtpnLoremIpsumDolor.setBounds(10, 11, 414, 236);
		contentPane.add(txtpnLoremIpsumDolor);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(137, 258, 158, 40);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JFrame frame = new PaginaDeRegistro();
					frame.setVisible(true);
					dispose();
			}
		});
	}
}
