package ProgramaInicio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaginaRegistroRespaldoViernes extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField textField;
	private JTextField txtEmain;
	private JTextField txtReenterPassword;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaRegistroRespaldoViernes frame = new PaginaRegistroRespaldoViernes();
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
	public PaginaRegistroRespaldoViernes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(109, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create yout FC&R Universal ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(282, 48, 234, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("We just need some basic personal information and a password for your FC&R Universal ID.");
		lblNewLabel_2.setBounds(131, 73, 547, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Already have a FC&R Universal ID?");
		lblNewLabel_3.setBounds(219, 98, 197, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sing in with your account");
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setBounds(417, 98, 157, 14);
		contentPane.add(lblNewLabel_4);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(150, 134, 197, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(150, 170, 197, 20);
		contentPane.add(txtLastName);
		
		textField = new JTextField();
		textField.setText("First Name");
		textField.setColumns(10);
		textField.setBounds(150, 201, 197, 20);
		contentPane.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su pais", "España", "Inglaterra", "Italia", "Alemania", "EEUU", "Japon"}));
		comboBox.setBounds(150, 232, 197, 20);
		contentPane.add(comboBox);
		
		txtEmain = new JTextField();
		txtEmain.setText("E-mail");
		txtEmain.setBounds(150, 263, 197, 20);
		contentPane.add(txtEmain);
		txtEmain.setColumns(10);
		
		txtReenterPassword = new JTextField();
		txtReenterPassword.setText("Re-enter Password");
		txtReenterPassword.setColumns(10);
		txtReenterPassword.setBounds(150, 325, 197, 20);
		contentPane.add(txtReenterPassword);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I acknowledge that I have read the ");
		chckbxNewCheckBox.setBounds(150, 352, 223, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("Terms of Use.");
		lblNewLabel_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_5.setBounds(374, 356, 104, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("The e-mail address will be used as your new login");
		lblNewLabel_6.setBounds(357, 266, 283, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FC&R will use any of the data provided hereunder in accordance with the");
		lblNewLabel_7.setBounds(150, 382, 424, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Privacy Statement.");
		lblNewLabel_8.setForeground(SystemColor.textHighlight);
		lblNewLabel_8.setBounds(563, 382, 115, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Sumbit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(150, 407, 152, 38);
		contentPane.add(btnNewButton);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(150, 294, 197, 20);
		contentPane.add(txtPassword);
	}
}