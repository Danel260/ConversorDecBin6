package vista;

import java.awt.BorderLayout;
import modelo.Numero;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textfieldDecimal;

	/**
	 * Create the frame.
	 */
	public ventana() {
		setTitle("Conversor Decimal a Binario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel tituloDecimal = new JLabel("Numero Decimal");
		tituloDecimal.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_tituloDecimal = new GridBagConstraints();
		gbc_tituloDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_tituloDecimal.gridx = 3;
		gbc_tituloDecimal.gridy = 1;
		contentPane.add(tituloDecimal, gbc_tituloDecimal);
		
		textfieldDecimal = new JTextField();
		GridBagConstraints gbc_textfieldDecimal = new GridBagConstraints();
		gbc_textfieldDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_textfieldDecimal.gridx = 3;
		gbc_textfieldDecimal.gridy = 2;
		contentPane.add(textfieldDecimal, gbc_textfieldDecimal);
		textfieldDecimal.setColumns(10);
		
		JLabel tituloBinario = new JLabel("Numero Binario:");
		GridBagConstraints gbc_tituloBinario = new GridBagConstraints();
		gbc_tituloBinario.insets = new Insets(0, 0, 5, 5);
		gbc_tituloBinario.gridx = 3;
		gbc_tituloBinario.gridy = 4;
		contentPane.add(tituloBinario, gbc_tituloBinario);
		
		JLabel labelResultado = new JLabel("");
		GridBagConstraints gbc_labelResultado = new GridBagConstraints();
		gbc_labelResultado.insets = new Insets(0, 0, 5, 5);
		gbc_labelResultado.gridx = 3;
		gbc_labelResultado.gridy = 5;
		contentPane.add(labelResultado, gbc_labelResultado);
		
		JButton botonCalcular = new JButton("Convertir");
		botonCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Numero num = new Numero(Integer.parseInt(textfieldDecimal.getText()));
				num.convertirBinario();
				labelResultado.setText(num.getNumBinario());
			}
		});
		GridBagConstraints gbc_botonCalcular = new GridBagConstraints();
		gbc_botonCalcular.insets = new Insets(0, 0, 5, 5);
		gbc_botonCalcular.gridx = 3;
		gbc_botonCalcular.gridy = 7;
		contentPane.add(botonCalcular, gbc_botonCalcular);
	}

}
