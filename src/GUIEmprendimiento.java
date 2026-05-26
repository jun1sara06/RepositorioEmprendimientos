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
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class GUIEmprendimiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panelRegistro;
	private JPanel panelConsulta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		panelConsulta = new JPanel();
		panelConsulta.setBackground(new Color(255, 255, 255));
		panelConsulta.setLayout(null);
		panelConsulta.setBounds(0, 0, 900, 600);
		panelConsulta.setVisible(false);
		
		panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(255, 255, 255));
		panelRegistro.setLayout(null);
		panelRegistro.setBounds(0, 0, 900, 600);
		panelRegistro.setVisible(false);
		contentPane.add(panelRegistro);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(110, 170, 340, 20);
		panelRegistro.add(textField);
		
		JLabel lblNombreEmprendimiento = new JLabel("Nombre:");
		lblNombreEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombreEmprendimiento.setBounds(20, 170, 80, 20);
		panelRegistro.add(lblNombreEmprendimiento);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(110, 200, 340, 20);
		panelRegistro.add(textField_1);
		
		JLabel lblTituloRegistro = new JLabel("Registrar entrada");
		lblTituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistro.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTituloRegistro.setBounds(90, 30, 690, 60);
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
		btnRegistroMenu.setBounds(40, 500, 120, 30);
		panelRegistro.add(btnRegistroMenu);
		
		JLabel lblRedSocial = new JLabel("Red social:");
		lblRedSocial.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblRedSocial.setBounds(20, 200, 80, 20);
		panelRegistro.add(lblRedSocial);
		
		JLabel lblMatricula = new JLabel("Categoría:");
		lblMatricula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblMatricula.setBounds(20, 230, 80, 20);
		panelRegistro.add(lblMatricula);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 230, 340, 20);
		panelRegistro.add(comboBox);
		
		JLabel lblIDEmprendimiento = new JLabel("ID emprendimiento:");
		lblIDEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblIDEmprendimiento.setBounds(20, 140, 120, 20);
		panelRegistro.add(lblIDEmprendimiento);
		
		JLabel lblIDEmprendimientoIdentificado = new JLabel("");
		lblIDEmprendimientoIdentificado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblIDEmprendimientoIdentificado.setBounds(140, 140, 60, 20);
		panelRegistro.add(lblIDEmprendimientoIdentificado);
		
		JLabel lblTituloRegistroEmprendimiento = new JLabel("Registrar emprendimiento");
		lblTituloRegistroEmprendimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistroEmprendimiento.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblTituloRegistroEmprendimiento.setBounds(40, 100, 400, 30);
		panelRegistro.add(lblTituloRegistroEmprendimiento);
		
		JLabel lblTituloRegistroEmprendedor = new JLabel("Registrar emprendedor");
		lblTituloRegistroEmprendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistroEmprendedor.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblTituloRegistroEmprendedor.setBounds(460, 100, 400, 30);
		panelRegistro.add(lblTituloRegistroEmprendedor);
		
		JLabel lblIDEmprendedor = new JLabel("ID emprendedor:");
		lblIDEmprendedor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblIDEmprendedor.setBounds(460, 140, 120, 20);
		panelRegistro.add(lblIDEmprendedor);
		
		JLabel lblIDEmprendimientoIdentificado_1 = new JLabel("");
		lblIDEmprendimientoIdentificado_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblIDEmprendimientoIdentificado_1.setBounds(580, 140, 60, 20);
		panelRegistro.add(lblIDEmprendimientoIdentificado_1);
		
		JLabel lblNombreEmprendedor = new JLabel("Nombre:");
		lblNombreEmprendedor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombreEmprendedor.setBounds(460, 170, 80, 20);
		panelRegistro.add(lblNombreEmprendedor);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(530, 170, 330, 20);
		panelRegistro.add(textField_2);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblApellido.setBounds(460, 200, 80, 20);
		panelRegistro.add(lblApellido);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(530, 200, 330, 20);
		panelRegistro.add(textField_6);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblSemestre.setBounds(460, 260, 80, 20);
		panelRegistro.add(lblSemestre);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(530, 260, 40, 20);
		panelRegistro.add(comboBox_1);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblMatrcula.setBounds(460, 230, 80, 20);
		panelRegistro.add(lblMatrcula);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(530, 230, 330, 20);
		panelRegistro.add(textField_7);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(660, 260, 200, 20);
		panelRegistro.add(comboBox_1_1);
		
		JLabel lblCarrera = new JLabel("Carrera:");
		lblCarrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblCarrera.setBounds(590, 260, 80, 20);
		panelRegistro.add(lblCarrera);
		
		JButton btnRegistrarEmprendimiento_1 = new JButton("Registrar");
		btnRegistrarEmprendimiento_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistrarEmprendimiento_1.setBackground(Color.WHITE);
		btnRegistrarEmprendimiento_1.setBounds(600, 300, 120, 30);
		panelRegistro.add(btnRegistrarEmprendimiento_1);
		
		JButton btnRegistrarEmprendimiento_1_1 = new JButton("Registrar");
		btnRegistrarEmprendimiento_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistrarEmprendimiento_1_1.setBackground(Color.WHITE);
		btnRegistrarEmprendimiento_1_1.setBounds(200, 300, 120, 30);
		panelRegistro.add(btnRegistrarEmprendimiento_1_1);
		
		JLabel lblEmprendedorDueño = new JLabel("Emprendedor:");
		lblEmprendedorDueño.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblEmprendedorDueño.setBounds(20, 261, 120, 20);
		panelRegistro.add(lblEmprendedorDueño);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(110, 261, 340, 20);
		panelRegistro.add(comboBox_2);
		contentPane.add(panelConsulta);
		
		JLabel lblTituloConsulta = new JLabel("Consultar entrada");
		lblTituloConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloConsulta.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTituloConsulta.setBounds(90, 30, 690, 60);
		panelConsulta.add(lblTituloConsulta);
		
		JLabel lblTipo = new JLabel("Tipo de consulta:");
		lblTipo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblTipo.setBounds(50, 120, 150, 25);
		panelConsulta.add(lblTipo);

		JComboBox comboTipoConsulta = new JComboBox();
		comboTipoConsulta.setBounds(200, 120, 250, 25);
		panelConsulta.add(comboTipoConsulta);

		JLabel lblFiltro = new JLabel("Filtrar por:");
		lblFiltro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblFiltro.setBounds(500, 120, 100, 25);
		panelConsulta.add(lblFiltro);

		JComboBox comboFiltroConsulta = new JComboBox();
		comboFiltroConsulta.setBounds(600, 120, 250, 25);
		panelConsulta.add(comboFiltroConsulta);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(350, 170, 200, 35);
		panelConsulta.add(btnConsultar);

		String[] columnasEmp = {"ID", "Nombre", "Categoría", "Red social"};
		javax.swing.table.DefaultTableModel modeloEmp =
		    new javax.swing.table.DefaultTableModel(columnasEmp, 0);

		javax.swing.JTable tablaEmp = new javax.swing.JTable(modeloEmp);
		javax.swing.JScrollPane scrollEmp = new javax.swing.JScrollPane(tablaEmp);
		scrollEmp.setBounds(50, 230, 800, 280);
		panelConsulta.add(scrollEmp);
		
		String[] columnasEmprendedor = {"ID", "Nombre", "Apellido", "Carrera", "Semestre"};
		javax.swing.table.DefaultTableModel modeloEmprendedor =
		    new javax.swing.table.DefaultTableModel(columnasEmprendedor, 0);

		javax.swing.JTable tablaEmprendedor = new javax.swing.JTable(modeloEmprendedor);
		javax.swing.JScrollPane scrollEmprendedor = new javax.swing.JScrollPane(tablaEmprendedor);
		scrollEmprendedor.setBounds(50, 230, 800, 280);
		panelConsulta.add(scrollEmprendedor);

		// Oculta esta por defecto
		scrollEmprendedor.setVisible(false);


		JButton btnVolverMenu = new JButton("Menú");
		btnVolverMenu.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnVolverMenu.setBackground(Color.WHITE);
		btnVolverMenu.setBounds(50, 520, 120, 30);
		panelConsulta.add(btnVolverMenu);
		
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 255, 255));
		panelMenu.setLayout(null);
		panelMenu.setBounds(0, 0, 900, 600);
		contentPane.add(panelMenu);
		
		JLabel lblTituloMenu = new JLabel("Menú principal");
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTituloMenu.setBounds(90, 30, 690, 60);
		panelMenu.add(lblTituloMenu);
		
		JButton btnMenuRegistro = new JButton("Registrar entrada");
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
		
		JButton btnMenuConsulta = new JButton("Consultar entrada");
		btnMenuConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelConsulta.setVisible(true);
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
		
		
		
	}
}
