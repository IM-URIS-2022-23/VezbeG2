package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String operation;
	private JToggleButton btnOduzimanje;
	
	int brojJedan, brojDva = 0;
	String brojZaKonvertovanje = "";
	private JTextField textFieldBinary;
	private JTextField textFieldDecimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textFieldBinary = new JTextField();
		textFieldBinary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					brojZaKonvertovanje = textFieldBinary.getText();
					try {
						int konvertovanBroj = Integer.parseInt(brojZaKonvertovanje, 2);
						textFieldDecimal.setText(""+konvertovanBroj);
					} catch (NumberFormatException e2) {
						JOptionPane.showMessageDialog(null, 
								"Morate uneti binarni broj", "Los unos", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		textFieldBinary.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldBinary.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBinary.setText("BINARY");
		GridBagConstraints gbc_textFieldBinary = new GridBagConstraints();
		gbc_textFieldBinary.gridwidth = 4;
		gbc_textFieldBinary.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldBinary.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldBinary.gridx = 3;
		gbc_textFieldBinary.gridy = 1;
		contentPane.add(textFieldBinary, gbc_textFieldBinary);
		textFieldBinary.setColumns(10);
		
		textFieldDecimal = new JTextField();
		textFieldDecimal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		textFieldDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDecimal.setText("DECIMAL");
		textFieldDecimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_textFieldDecimal = new GridBagConstraints();
		gbc_textFieldDecimal.gridwidth = 4;
		gbc_textFieldDecimal.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDecimal.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDecimal.gridx = 3;
		gbc_textFieldDecimal.gridy = 2;
		contentPane.add(textFieldDecimal, gbc_textFieldDecimal);
		textFieldDecimal.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 1;
		gbc_btnFive.gridy = 6;
		contentPane.add(btnFive, gbc_btnFive);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 3;
		gbc_btnOne.gridy = 6;
		contentPane.add(btnOne, gbc_btnOne);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brojJedan = Integer.parseInt(textField.getText());
				textField.setText("");
				operation = "+";
				btnOduzimanje.setEnabled(false);
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 5;
		gbc_btnAdd.gridy = 6;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(operation.equals("+")) {
						brojDva = Integer.parseInt(textField.getText());
						textField.setText("" + (brojJedan + brojDva));
					}
					else if(operation.equals("-")){
						brojDva = Integer.parseInt(textField.getText());
						textField.setText("" + (brojJedan - brojDva));
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Morate uneti drugi broj", 
							"Greska", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		btnOduzimanje = new JToggleButton("-");
		btnOduzimanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brojJedan = Integer.parseInt(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnOduzimanje.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnOduzimanje = new GridBagConstraints();
		gbc_btnOduzimanje.insets = new Insets(0, 0, 5, 5);
		gbc_btnOduzimanje.gridx = 6;
		gbc_btnOduzimanje.gridy = 6;
		contentPane.add(btnOduzimanje, gbc_btnOduzimanje);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.insets = new Insets(0, 0, 5, 5);
		gbc_btnEqual.gridx = 8;
		gbc_btnEqual.gridy = 6;
		contentPane.add(btnEqual, gbc_btnEqual);
	}

}
