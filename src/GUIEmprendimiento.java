import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class GUIEmprendimiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panelRegistro;
	private JPanel panelConsulta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIEmprendimiento frame = new GUIEmprendimiento();
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
	public GUIEmprendimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(255, 255, 255));
		panelRegistro.setLayout(null);
		panelRegistro.setBounds(0, 0, 900, 600);
		panelRegistro.setVisible(false);
		contentPane.add(panelRegistro);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(270, 160, 400, 20);
		panelRegistro.add(textField);
		
		JLabel lblNomEmprendimiento = new JLabel("Nombre del emprendimiento");
		lblNomEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNomEmprendimiento.setBounds(50, 160, 210, 20);
		panelRegistro.add(lblNomEmprendimiento);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 190, 400, 20);
		panelRegistro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(270, 220, 400, 20);
		panelRegistro.add(textField_2);
		
		JButton btnRegistrarEmprendimiento = new JButton("Registrar");
		btnRegistrarEmprendimiento.setBackground(new Color(255, 255, 255));
		btnRegistrarEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistrarEmprendimiento.setBounds(710, 470, 120, 50);
		panelRegistro.add(btnRegistrarEmprendimiento);
		
		JLabel lblTituloRegistro = new JLabel("Registrar emprendimiento");
		lblTituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistro.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTituloRegistro.setBounds(90, 40, 690, 100);
		panelRegistro.add(lblTituloRegistro);
		
		JButton btnRegistroMenu = new JButton("Menú");
		btnRegistroMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRegistro.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnRegistroMenu.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistroMenu.setBackground(Color.WHITE);
		btnRegistroMenu.setBounds(50, 470, 120, 50);
		panelRegistro.add(btnRegistroMenu);
		
		JLabel lblNombreEmprendedor = new JLabel("Nombre del emprendimiento");
		lblNombreEmprendedor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombreEmprendedor.setBounds(50, 191, 210, 20);
		panelRegistro.add(lblNombreEmprendedor);
		
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 255, 255));
		panelMenu.setLayout(null);
		panelMenu.setBounds(0, 0, 900, 600);
		contentPane.add(panelMenu);
		
		panelConsulta = new JPanel();
		panelConsulta.setLayout(null);
		panelConsulta.setBounds(0, 0, 900, 600);
		panelConsulta.setVisible(false);
		contentPane.add(panelConsulta);
		
		JLabel lblTituloMenu = new JLabel("Menú principal");
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTituloMenu.setBounds(90, 40, 690, 100);
		panelMenu.add(lblTituloMenu);
		
		JButton btnMenuRegistro = new JButton("Registrar emprendimiento");
		btnMenuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelRegistro.setVisible(true);
			}
		});
		btnMenuRegistro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnMenuRegistro.setBackground(new Color(255, 255, 255));
		btnMenuRegistro.setBounds(300, 200, 250, 40);
		panelMenu.add(btnMenuRegistro);
		
		JLabel IconFca = new JLabel(new ImageIcon("src/logofca.png"));
		IconFca.setBounds(50, 60, 180, 180);
		panelMenu.add(IconFca);
		
		JLabel IconUADY = new JLabel(new ImageIcon("src/logouady.png"));
		IconUADY.setBounds(660, 60, 150, 84);
		panelMenu.add(IconUADY);
		
		JButton btnMenuConsulta = new JButton("Buscar emprendimiento");
		btnMenuConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenuConsulta.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnMenuConsulta.setBackground(Color.WHITE);
		btnMenuConsulta.setBounds(300, 290, 250, 40);
		panelMenu.add(btnMenuConsulta);
		
		JButton btnMenuExportarInformacin = new JButton("Exportar información");
		btnMenuExportarInformacin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnMenuExportarInformacin.setBackground(Color.WHITE);
		btnMenuExportarInformacin.setBounds(300, 380, 250, 40);
		panelMenu.add(btnMenuExportarInformacin);
		
		JLabel lblTituloConsulta = new JLabel("Busca un emprendedor o un emprendimiento");
		lblTituloConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloConsulta.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		lblTituloConsulta.setBounds(100, 40, 690, 100);
		panelConsulta.add(lblTituloConsulta);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(322, 160, 400, 20);
		panelConsulta.add(textField_3);
		
		JLabel lblBusca = new JLabel("Nombre del emprendedor o emprendimiento");
		lblBusca.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		lblBusca.setBounds(50, 160, 262, 20);
		panelConsulta.add(lblBusca);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(210, 190, 400, 20);
		panelConsulta.add(textField_4);
		
		JLabel lblMatrícula_2 = new JLabel("Matrícula de alumno UADY");
		lblMatrícula_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		lblMatrícula_2.setBounds(50, 190, 160, 20);
		panelConsulta.add(lblMatrícula_2);
		
		JLabel lblSemestre_2 = new JLabel("No. de semestre cursando");
		lblSemestre_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		lblSemestre_2.setBounds(50, 220, 160, 20);
		panelConsulta.add(lblSemestre_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(210, 220, 400, 20);
		panelConsulta.add(textField_5);
		
		JButton btnRegistrarEmprendedor_1 = new JButton("Registrar");
		btnRegistrarEmprendedor_1.setBounds(50, 470, 120, 50);
		panelConsulta.add(btnRegistrarEmprendedor_1);
		
		
		
	}
}
