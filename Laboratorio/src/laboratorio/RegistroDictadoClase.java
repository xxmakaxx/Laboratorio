package laboratorio;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;

public class RegistroDictadoClase extends JInternalFrame {
	private JTextField txtNombre;
	private JTextField txtUrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroDictadoClase frame = new RegistroDictadoClase();
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
	public RegistroDictadoClase() {
		setResizable(true);
		setClosable(true);
		setTitle("Registro Dictado de Clase");
		setBounds(100, 100, 450, 384);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseLosSiguientes = new JLabel("Ingrese los siguientes datos:");
		lblIngreseLosSiguientes.setBounds(118, 12, 221, 15);
		lblIngreseLosSiguientes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIngreseLosSiguientes);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(97, 310, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(240, 310, 117, 25);
		getContentPane().add(btnCancelar);
		
		JLabel lblInstitucin = new JLabel("Institución:");
		lblInstitucin.setBounds(30, 46, 92, 15);
		getContentPane().add(lblInstitucin);
		
		JComboBox cbInstituto = new JComboBox();
		cbInstituto.setModel(new DefaultComboBoxModel(new String[] {"Instituto1", "Instituto2", "Instituto3"}));
		cbInstituto.setBounds(179, 39, 231, 24);
		getContentPane().add(cbInstituto);
		
		JComboBox cbActividadDeportiva = new JComboBox();
		cbActividadDeportiva.setBounds(179, 75, 231, 24);
		getContentPane().add(cbActividadDeportiva);
		
		JSpinner spDia = new JSpinner();
		spDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spDia.setBounds(179, 134, 52, 20);
		getContentPane().add(spDia);
		
		JSpinner spMes = new JSpinner();
		spMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spMes.setBounds(251, 134, 52, 20);
		getContentPane().add(spMes);
		
		JSpinner spAnio = new JSpinner();
		spAnio.setModel(new SpinnerNumberModel(new Integer(2022), new Integer(1900), null, new Integer(1)));
		spAnio.setBounds(315, 134, 71, 20);
		getContentPane().add(spAnio);
		
		JLabel lblActividadDeportiva = new JLabel("Actividad Deportiva:");
		lblActividadDeportiva.setBounds(30, 80, 149, 15);
		getContentPane().add(lblActividadDeportiva);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 107, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(30, 134, 92, 15);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setBounds(30, 195, 70, 15);
		getContentPane().add(lblProfesor);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(179, 111, 231, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio:");
		lblHoraInicio.setBounds(30, 168, 92, 15);
		getContentPane().add(lblHoraInicio);
		
		JLabel lblSociosMinimos = new JLabel("Socios minimos:");
		lblSociosMinimos.setBounds(30, 243, 117, 15);
		getContentPane().add(lblSociosMinimos);
		
		JLabel lblSociosMaximos = new JLabel("Socios maximos:");
		lblSociosMaximos.setBounds(240, 243, 117, 15);
		getContentPane().add(lblSociosMaximos);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(30, 281, 70, 15);
		getContentPane().add(lblUrl);
		
		JSpinner spHora = new JSpinner();
		spHora.setModel(new SpinnerNumberModel(0, 0, 24, 1));
		spHora.setBounds(179, 166, 52, 20);
		getContentPane().add(spHora);
		
		JSpinner SpMinuto = new JSpinner();
		SpMinuto.setModel(new SpinnerNumberModel(0, 0, 60, 1));
		SpMinuto.setBounds(251, 166, 52, 20);
		getContentPane().add(SpMinuto);
		
		JComboBox cbProfesor = new JComboBox();
		cbProfesor.setBounds(179, 195, 231, 24);
		getContentPane().add(cbProfesor);
		
		JSpinner spSocioMinimo = new JSpinner();
		spSocioMinimo.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spSocioMinimo.setBounds(179, 241, 52, 20);
		getContentPane().add(spSocioMinimo);
		
		JSpinner spSocioMaximo = new JSpinner();
		spSocioMaximo.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spSocioMaximo.setBounds(358, 241, 52, 20);
		getContentPane().add(spSocioMaximo);
		
		txtUrl = new JTextField();
		txtUrl.setText("URL");
		txtUrl.setBounds(179, 279, 231, 19);
		getContentPane().add(txtUrl);
		txtUrl.setColumns(10);

	}
}
