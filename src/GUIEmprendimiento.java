import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import manejos.Manejo_Emprendedor;
import manejos.Manejo_Emprendimiento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.sql.ResultSet;

public class GUIEmprendimiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panelRegistro;
	private JPanel panelConsulta;
	private JTextField textFieldNombre;
	private JTextField textFieldRed;
	private JTextField textFieldNomEmp;
	private JTextField textFieldApellido;
	private JTextField textFieldMatr;
	private JTextField textFieldTel;
	Manejo_Emprendedor ultimoID = new Manejo_Emprendedor();
	Manejo_Emprendimiento ultimoIDEmprendimiento = new Manejo_Emprendimiento();
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
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(110, 170, 340, 20);
		panelRegistro.add(textFieldNombre);
		
		JLabel lblNombreEmprendimiento = new JLabel("Nombre:");
		lblNombreEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombreEmprendimiento.setBounds(20, 170, 80, 20);
		panelRegistro.add(lblNombreEmprendimiento);
		
		textFieldRed = new JTextField();
		textFieldRed.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldRed.setColumns(10);
		textFieldRed.setBounds(110, 200, 340, 20);
		panelRegistro.add(textFieldRed);
		
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
		
		JComboBox <String> comboBoxCat = new JComboBox <String> ();
		comboBoxCat.setBounds(110, 230, 340, 20);
		comboBoxCat.addItem("Comida");
		comboBoxCat.addItem("Ropa");
		comboBoxCat.addItem("Tecnología");
		comboBoxCat.addItem("Joyería");
		comboBoxCat.addItem("Arte");
		comboBoxCat.addItem("Jardinería");
		comboBoxCat.addItem("Maquillaje");
		comboBoxCat.addItem("Velas");
		panelRegistro.add(comboBoxCat);
		
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
		
		JLabel lblNombreEmprendedor = new JLabel("Nombre:");
		lblNombreEmprendedor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombreEmprendedor.setBounds(460, 170, 80, 20);
		panelRegistro.add(lblNombreEmprendedor);
		
		textFieldNomEmp = new JTextField();
		textFieldNomEmp.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldNomEmp.setColumns(10);
		textFieldNomEmp.setBounds(530, 170, 330, 20);
		panelRegistro.add(textFieldNomEmp);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblApellido.setBounds(460, 200, 80, 20);
		panelRegistro.add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(530, 200, 330, 20);
		panelRegistro.add(textFieldApellido);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblSemestre.setBounds(460, 290, 80, 20);
		panelRegistro.add(lblSemestre);
		
		JComboBox<Integer> comboBoxSem = new JComboBox<>();
		comboBoxSem.setBounds(530, 290, 40, 20);
		for (int i = 1; i <= 9; i++) {
		    comboBoxSem.addItem(i);
		}
		panelRegistro.add(comboBoxSem);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblMatrcula.setBounds(460, 230, 80, 20);
		panelRegistro.add(lblMatrcula);
		
		textFieldMatr = new JTextField();
		textFieldMatr.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldMatr.setColumns(10);
		textFieldMatr.setBounds(530, 230, 330, 20);
		panelRegistro.add(textFieldMatr);
		
		JComboBox<String> comboBoxCar = new JComboBox<>();
		comboBoxCar.setBounds(660, 290, 200, 20);
		comboBoxCar.addItem("LATI");
		comboBoxCar.addItem("Administración");
		comboBoxCar.addItem("Mercadotecnia");
		comboBoxCar.addItem("Contador");
		panelRegistro.add(comboBoxCar);
		
		JLabel lblCarrera = new JLabel("Carrera:");
		lblCarrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblCarrera.setBounds(590, 290, 80, 20);
		panelRegistro.add(lblCarrera);
		
		JComboBox <String> comboBoxEmp = new JComboBox <String>();
		comboBoxEmp.setBounds(110, 260, 340, 20);
		Manejo_Emprendedor combo = new Manejo_Emprendedor();
		combo.cargarEmprendedores(comboBoxEmp);
		panelRegistro.add(comboBoxEmp);
		
		JButton btnRegistrarEmprendedor = new JButton("Registrar");
		btnRegistrarEmprendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manejo_Emprendedor obj1 = new Manejo_Emprendedor();
				obj1.insertar(

				textFieldNomEmp.getText(),
            textFieldApellido.getText(),
            textFieldMatr.getText(),
            textFieldTel.getText(),
            Integer.parseInt(comboBoxSem.getSelectedItem().toString()),
            comboBoxCar.getSelectedItem().toString()
        );
			Manejo_Emprendedor combo = new Manejo_Emprendedor();
			combo.cargarEmprendedores(comboBoxEmp);
			JOptionPane.showMessageDialog(null, "Haz registrado a un nuevo emprendedor con éxito.");
			}
		});
		btnRegistrarEmprendedor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistrarEmprendedor.setBackground(Color.WHITE);
		btnRegistrarEmprendedor.setBounds(600, 320, 120, 30);
		panelRegistro.add(btnRegistrarEmprendedor);
		
		JButton btnRegistrarEmprendimiento = new JButton("Registrar");
		btnRegistrarEmprendimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Manejo_Emprendimiento entrada = new Manejo_Emprendimiento();
					String seleccionado = comboBoxEmp.getSelectedItem().toString();
					int idEmp = Integer.parseInt(seleccionado.split(" - ")[0]);
					entrada.insertar(
				                textFieldNombre.getText(),
				                textFieldRed.getText(),
				                comboBoxCat.getSelectedItem().toString(),
				                idEmp
					);

				            JOptionPane.showMessageDialog(null, "Emprendimiento registrado con éxito.");
				            textFieldNombre.setText("");
				            textFieldRed.setText("");
				        } catch (Exception ex) {
				            ex.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Error al registrar emprendimiento");
				        }
				    }
		});
		btnRegistrarEmprendimiento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnRegistrarEmprendimiento.setBackground(Color.WHITE);
		btnRegistrarEmprendimiento.setBounds(200, 300, 120, 30);
		panelRegistro.add(btnRegistrarEmprendimiento);
		
		JLabel lblEmprendedorDueño = new JLabel("Emprendedor:");
		lblEmprendedorDueño.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblEmprendedorDueño.setBounds(20, 260, 120, 20);
		panelRegistro.add(lblEmprendedorDueño);
		
		JLabel lblTel = new JLabel("Teléfono:");
		lblTel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblTel.setBounds(460, 260, 80, 20);
		panelRegistro.add(lblTel);
		
		textFieldTel = new JTextField();
		textFieldTel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		textFieldTel.setColumns(10);
		textFieldTel.setBounds(530, 260, 330, 20);
		panelRegistro.add(textFieldTel);
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

		JLabel lblFiltro = new JLabel("Filtrar por categoría:");
		lblFiltro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblFiltro.setBounds(450, 120, 150, 25);
		panelConsulta.add(lblFiltro);
		
		String[] columnasEmp = {"ID", "Nombre", "Categoría", "Red social", "Emprendedor"};
		javax.swing.table.DefaultTableModel modeloEmp =
		    new javax.swing.table.DefaultTableModel(columnasEmp, 0);

		javax.swing.JTable tablaEmp = new javax.swing.JTable(modeloEmp);
		javax.swing.JScrollPane scrollEmp = new javax.swing.JScrollPane(tablaEmp);
		scrollEmp.setBounds(50, 230, 800, 280);
		panelConsulta.add(scrollEmp);
		
		JComboBox<String> comboFiltroConsulta = new JComboBox <String> ();
		comboFiltroConsulta.setBounds(600, 120, 250, 25);
		comboFiltroConsulta.addItem("Comida");
		comboFiltroConsulta.addItem("Ropa");
		comboFiltroConsulta.addItem("Tecnología");
		comboFiltroConsulta.addItem("Joyería");
		comboFiltroConsulta.addItem("Arte");
		comboFiltroConsulta.addItem("Jardinería");
		comboFiltroConsulta.addItem("Maquillaje");
		comboFiltroConsulta.addItem("Velas");
		panelConsulta.add(comboFiltroConsulta);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Manejo_Emprendimiento consulta = new Manejo_Emprendimiento();
					String categoria = comboFiltroConsulta.getSelectedItem().toString();
					ResultSet rs = consulta.consultarPorCategoria(categoria);

				            modeloEmp.setRowCount(0);

				            while (rs.next()) {

				                Object[] fila = {
				                    rs.getInt("ID_Emprendimiento"),
				                    rs.getString("Nombre"),
				                    rs.getString("Categoria"),
				                    rs.getString("Red_Social"),
				                    rs.getString("Emprendedor")
				                };

				                modeloEmp.addRow(fila);
				            }

				        } catch (Exception ex) {
				            ex.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Error en consulta");
				        }
				
			}
		});
		btnConsultar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(350, 170, 200, 35);
		panelConsulta.add(btnConsultar);

		JButton btnVolverMenu = new JButton("Menú");
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConsulta.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
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
