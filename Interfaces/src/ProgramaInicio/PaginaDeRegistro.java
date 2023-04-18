package ProgramaInicio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaginaDeRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmain;
	private JTextField txtReenterPassword;
	private JTextField txtPassword;
	static PaginaDeRegistro frameRegistro;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameRegistro = new PaginaDeRegistro();
					frameRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaginaDeRegistro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 488);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(109, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create yout FC&R Universal ID");
		lblNewLabel_1.setBounds(282, 48, 234, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("We just need some basic personal information and a password for your FC&R Universal ID.");
		lblNewLabel_2.setBounds(131, 73, 547, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Already have a FC&R Universal ID?");
		lblNewLabel_3.setBounds(219, 98, 197, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sing in with your account");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			Font font = lblNewLabel_4.getFont();
			@Override
			public void mouseEntered(MouseEvent e) {
				Map attributes = font.getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				lblNewLabel_4.setFont(font.deriveFont(attributes));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_4.setFont(font);
				/*Font subrayado = new Font("Arial", Font.PLAIN, 12);
				lblNewLabel_4.setFont(subrayado);*/
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new PaginaDeInicio();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_4.setBounds(417, 98, 157, 14);
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel_4);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(150, 134, 197, 20);
		txtFirstName.setText("First Name");
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
                if(txtFirstName.getText().equals("First Name")) {
                	txtFirstName.setText("");
                	txtFirstName.setForeground(new Color(0,0,0));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtFirstName.getText().equals("")) {
                	txtFirstName.setText("First Name");
                	txtFirstName.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		txtLastName = new JTextField();
		txtLastName.setBounds(150, 170, 197, 20);
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		contentPane.add(txtLastName);
		
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
                if(txtLastName.getText().equals("Last Name")) {
                	txtLastName.setText("");
                	txtLastName.setForeground(new Color(0,0,0));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtLastName.getText().equals("")) {
                	txtLastName.setText("Last Name");
                	txtLastName.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 201, 197, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su pais", "España", "Inglaterra", "Italia", "Alemania", "EEUU", "Japon"}));
		contentPane.add(comboBox);
		
		txtEmain = new JTextField();
		txtEmain.setBounds(150, 232, 197, 20);
		txtEmain.setText("E-mail");
		contentPane.add(txtEmain);
		txtEmain.setColumns(10);
		
		txtEmain.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
                if(txtEmain.getText().equals("E-mail")) {
                	txtEmain.setText("");
                	txtEmain.setForeground(new Color(0,0,0));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtEmain.getText().equals("")) {
                	txtEmain.setText("E-mail");
                	txtEmain.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		JPasswordField txtReenterPassword = new JPasswordField();
		txtReenterPassword.setBounds(150, 294, 197, 20);
		txtReenterPassword.setText("Re-enter Password");
		txtReenterPassword.setEchoChar((char)0);
		txtReenterPassword.setColumns(10);
		contentPane.add(txtReenterPassword);
		
		txtReenterPassword.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
				if(txtReenterPassword .getText().equals("Re-enter Password")) {
					txtReenterPassword .setText("");
					txtReenterPassword .setForeground(new Color(0,0,0));
					txtReenterPassword.setEchoChar('*');
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtReenterPassword .getText().equals("")) {
                	txtReenterPassword.setEchoChar((char)0);
                	txtReenterPassword .setText("Re-enter Password");
                	txtReenterPassword.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I acknowledge that I have read the ");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(150, 321, 223, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("Terms of Use.");
		lblNewLabel_5.setBounds(379, 325, 104, 14);
		lblNewLabel_5.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new Terminos_de_uso();
				frame.setVisible(true);
				dispose();
			}
		});
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			Font font = lblNewLabel_4.getFont();
			@Override
			public void mouseEntered(MouseEvent e) {
				Map attributes = font.getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				lblNewLabel_5.setFont(font.deriveFont(attributes));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_5.setFont(font);
				/*Font subrayado = new Font("Arial", Font.PLAIN, 12);
				lblNewLabel_4.setFont(subrayado);*/
				
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("The e-mail address will be used as your new login");
		lblNewLabel_6.setBounds(357, 235, 283, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FC&R will use any of the data provided hereunder in accordance with the");
		lblNewLabel_7.setBounds(150, 351, 424, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Sumbit");
		btnNewButton.setBounds(150, 376, 152, 38);
		
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.setBackground(SystemColor.textHighlight);
		contentPane.add(btnNewButton);
		
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.setBounds(150, 263, 197, 20);
		txtPassword.setText("Password");
		txtPassword.setEchoChar((char)0);
		txtPassword.setColumns(10);
		contentPane.add(txtPassword);
		
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
				if(txtPassword .getText().equals("Password")) {
					txtPassword .setText("");
					txtPassword .setForeground(new Color(0,0,0));
					txtPassword.setEchoChar('*');
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtPassword .getText().equals("")) {
                	txtPassword.setEchoChar((char)0);
                	txtPassword .setText("Password");
                	txtPassword.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(-52, 160, 371, 185);
		lblNewLabel_9.setIcon(new ImageIcon(PaginaDeRegistro.class.getResource("/Imagenes/inicio_de_sesion.jpg")));
		contentPane.add(lblNewLabel_9);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final FuncionComprobarUsuario comprobar = new FuncionComprobarUsuario();
				if(txtFirstName.getText().isEmpty() || txtFirstName.getText().equals("First Name") ||txtLastName.getText().isEmpty() ||  txtLastName.getText().equals("Last Name") || txtEmain.getText().isEmpty() ||  txtEmain.getText().equals("E-mail") || txtReenterPassword.getText().isEmpty() || txtPassword.getText().equals("Password") ||txtPassword.getText().isEmpty() || txtReenterPassword.getText().equals("Re-enter Password") ||chckbxNewCheckBox.isSelected()==false || !txtEmain.getText().matches("[a-zA-Z0-9._%-+]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") || !txtPassword.getText().equals(txtReenterPassword.getText()) || comboBox.getSelectedItem().toString().equals("Seleccione su pais")) {
					if(txtFirstName.getText().isEmpty() || txtFirstName.getText().equals("First Name")) {		
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio rellenar el primer nombre", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (!txtEmain.getText().matches("[a-zA-Z0-9._%-+]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
						JOptionPane.showMessageDialog(contentPane, "El formato del E-mail no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(txtLastName.getText().isEmpty()  || txtLastName.getText().equals("Last Name")) {
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio rellenar el ultimo nombre", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(txtEmain.getText().isEmpty()  || txtEmain.getText().equals("E-mail")) {
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio rellenar el E-Mail", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(txtPassword.getText().isEmpty() || txtPassword.getText().equals("Password")) {
						
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio rellenar la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(txtReenterPassword.getText().isEmpty() || txtReenterPassword.getText().equals("Re-enter Password")) {
						
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio repetir la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(!txtPassword.getText().equals(txtReenterPassword.getText())) {
						JOptionPane.showMessageDialog(contentPane, "Las contraseñas deben ser iguales", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(chckbxNewCheckBox.isSelected()==false) {
						
						JOptionPane.showMessageDialog(contentPane, "Es obligatorio aceptar los terminos de uso", "Error", JOptionPane.ERROR_MESSAGE);
					}	
					if(comboBox.getSelectedItem().toString().equals("Seleccione su pais")) {
						
						JOptionPane.showMessageDialog(contentPane, "Debe elejir un pais", "Error", JOptionPane.ERROR_MESSAGE);
					}	
				}else if (comprobar.comprobar_usuario(txtEmain.getText(),txtPassword.getText())) {
					JOptionPane.showMessageDialog(contentPane, "Los datos que ha introducido ya los tiene otro usuario", "Fallo al registrarse", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(contentPane, "Usted ha podido registrarse correctamente", "Registro aceptado", EXIT_ON_CLOSE);
					final FuncionRegistroBDD Registro = new FuncionRegistroBDD();
					Registro.Registrar(txtFirstName.getText(),txtLastName.getText(),comboBox.getSelectedItem().toString(),txtEmain.getText(),txtPassword.getText());
				}
			}
		});
	}
}
