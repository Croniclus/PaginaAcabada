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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaginaDeInicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassword;
	private JTextField txtEmail;
	private JTextField txtPassword_1;
	static PaginaDeInicio frameRegistro;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaDeInicio frame = new PaginaDeInicio();
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
	public PaginaDeInicio() {
		setFont(new Font("SansSerif", Font.PLAIN, 34));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 488);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PaginaDeInicio.class.getResource("/Imagenes/loading.gif")));
		lblNewLabel_2.setBounds(259, 11, 200, 200);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PaginaDeInicio.class.getResource("/Imagenes/1946429.png")));
		lblNewLabel_3.setBounds(295, 35, 128, 153);
		contentPane.add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(239, 249, 230, 35);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
                if(txtEmail.getText().equals("Email")) {
                	txtEmail.setText("");
                	txtEmail.setForeground(new Color(0,0,0));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtEmail.getText().equals("")) {
                	txtEmail.setText("Email");
                	txtEmail.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		JLabel lblNewLabel = new JLabel("Sign in to the page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(269, 210, 177, 25);
		contentPane.add(lblNewLabel);
		

		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(295, 341, 128, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("¿No tienes cuenta?");
		lblNewLabel_1.setBounds(250, 377, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Create una!!");
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setBounds(370, 377, 76, 14);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 295, 230, 35);
		passwordField.setText("Password");
		passwordField.setEchoChar((char)0);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
            public void focusGained(FocusEvent e) {
				if(passwordField .getText().equals("Password")) {
					passwordField .setText("");
					passwordField .setForeground(new Color(0,0,0));
					passwordField.setEchoChar('*');
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(passwordField .getText().equals("")) {
                	passwordField.setEchoChar((char)0);
                	passwordField .setText("Password");
                	passwordField.setForeground(new Color(71, 75, 78));
                }
            }
		});
		
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			Font font = lblNewLabel_1_1.getFont();
			@Override
			public void mouseEntered(MouseEvent e) {
				Map attributes = font.getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				lblNewLabel_1_1.setFont(font.deriveFont(attributes));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setFont(font);
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
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new PaginaDeRegistro();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    final FuncionComprobarUsuario comprobar = new FuncionComprobarUsuario();
			    if (txtEmail.getText().isEmpty() || txtEmail.getText().equals("E-mail") ||
			        passwordField.getText().equals("Password") || passwordField.getText().isEmpty() ||
			        !txtEmail.getText().matches("[a-zA-Z0-9._%-+]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
			        if (!txtEmail.getText().matches("[a-zA-Z0-9._%-+]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
			            JOptionPane.showMessageDialog(contentPane, "El formato del E-mail no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			        if (txtEmail.getText().isEmpty() || txtEmail.getText().equals("E-mail")) {
			            JOptionPane.showMessageDialog(contentPane, "Debe introducir el E-mail", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			        if (passwordField.getText().isEmpty() || passwordField.getText().equals("Password")) {
			            JOptionPane.showMessageDialog(contentPane, "Debe introducir la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			    } else if (comprobar.comprobar_usuario(txtEmail.getText(), passwordField.getText())) {
			        JOptionPane.showMessageDialog(contentPane, "Usted ha podido iniciar sesion de forma correcta", "Inicio de sesion", EXIT_ON_CLOSE);
			        JFrame frame = new MostradorDeUsuarios();
					frame.setVisible(true);
					dispose();
			    } else {
			        JOptionPane.showMessageDialog(contentPane, "El correo electrónico o la contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}
		});
		
	}
}
