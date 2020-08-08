package cashRegister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CashRegister extends JFrame {

	private JPanel contentPane;
	private JScrollPane jsp ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashRegister frame = new CashRegister();
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
	public CashRegister() {
		setTitle("Cash register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea txtBill = new JTextArea();
		txtBill.setBounds(20, 20, 460, 80);
		contentPane.add(txtBill);
		
		jsp = new JScrollPane(txtBill);
		jsp.setBounds(20, 20, 460, 80);
		contentPane.add(jsp);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(20, 138, 207, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblJuicePrice = new JLabel("Price: 0.80 lv");
		lblJuicePrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJuicePrice.setBounds(21, 46, 90, 14);
		panel.add(lblJuicePrice);
		
		
		
		JLabel lblJuice = new JLabel("Juice");
		lblJuice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJuice.setBounds(21, 21, 67, 14);
		panel.add(lblJuice);
		
		JLabel lblJuiceCounter = new JLabel("0");
		lblJuiceCounter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJuiceCounter.setBounds(147, 21, 36, 14);
		panel.add(lblJuiceCounter);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(CashRegister.class.getResource("/images/sokche.png")));
		lblNewLabel_2.setBounds(21, 66, 115, 120);
		panel.add(lblNewLabel_2);
		
		JLabel lblTotal = new JLabel("0.00");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(643, 30, 71, 23);
		contentPane.add(lblTotal);
		
		JButton btnJuice = new JButton("+");
		btnJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double juicePrice = 0.8 ;
				int juiceCount = Integer.parseInt(lblJuiceCounter.getText()) ;
				juiceCount++;
				lblJuiceCounter.setText(String.format("%d", juiceCount));
				txtBill.append(String.format("\n%s                                                                                                                                   %.2flv", lblJuice.getText(), juicePrice ));
				
				double total = Double.parseDouble(lblTotal.getText().replace(',', '.'));
				total = total + juicePrice;
				lblTotal.setText(String.format("%.2f",total).replace(',','.'));

						}
		});
		btnJuice.setBounds(137, 112, 46, 23);
		panel.add(btnJuice);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBounds(276, 138, 207, 197);
		contentPane.add(panel_1);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTea.setBounds(21, 21, 46, 14);
		panel_1.add(lblTea);
		
		JLabel lblTeaCounter = new JLabel("0");
		lblTeaCounter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeaCounter.setBounds(150, 21, 36, 14);
		panel_1.add(lblTeaCounter);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(CashRegister.class.getResource("/images/chaec.jpg")));
		label_2.setBounds(21, 65, 114, 121);
		panel_1.add(label_2);
		
		JButton btnTea = new JButton("+");
		btnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double teaPrice = 0.4 ;
				int teaCount = Integer.parseInt(lblTeaCounter.getText()) ;
				teaCount++;
				lblTeaCounter.setText(String.format("%d", teaCount));
				txtBill.append(String.format("\n%s                                                                                                                                      %.2flv", lblTea.getText(), teaPrice ));
				
				double total = Double.parseDouble(lblTotal.getText().replace(',', '.'));
				total = total + teaPrice;
				lblTotal.setText(String.format("%.2f",total).replace(',','.'));
			
			}
		});
		btnTea.setBounds(140, 111, 46, 23);
		panel_1.add(btnTea);
		
		JLabel lblPriceLv = new JLabel("Price: 0.40 lv");
		lblPriceLv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPriceLv.setBounds(21, 40, 93, 14);
		panel_1.add(lblPriceLv);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBounds(531, 135, 207, 197);
		contentPane.add(panel_2);
		
		JLabel lblCoffee = new JLabel("Coffee");
		lblCoffee.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCoffee.setBounds(21, 21, 46, 14);
		panel_2.add(lblCoffee);
		
		JLabel lblCoffeeCounter = new JLabel("0");
		lblCoffeeCounter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCoffeeCounter.setBounds(154, 21, 36, 14);
		panel_2.add(lblCoffeeCounter);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(CashRegister.class.getResource("/images/kafence.png")));
		label_5.setBounds(21, 68, 111, 103);
		panel_2.add(label_5);
		
		JButton btnCoffee = new JButton("+");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double coffeePrice = 1.2 ;
				int coffeeCount = Integer.parseInt(lblCoffeeCounter.getText()) ;
				coffeeCount++;
				lblCoffeeCounter.setText(String.format("%d", coffeeCount));
				txtBill.append(String.format("\n%s                                                                                                                                 %.2flv", lblCoffee.getText(), coffeePrice ));
				
				double total = Double.parseDouble(lblTotal.getText().replace(',', '.'));
				total = total + coffeePrice;
				lblTotal.setText(String.format("%.2f",total).replace(',','.'));

			}
		});
		btnCoffee.setBounds(144, 106, 46, 23);
		panel_2.add(btnCoffee);
		
		JLabel lblCoffeePrice = new JLabel("Price: 1.20 lv");
		lblCoffeePrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCoffeePrice.setBounds(21, 43, 95, 14);
		panel_2.add(lblCoffeePrice);
		
		JLabel lblTotalPrice = new JLabel("Total price:");
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalPrice.setBounds(552, 32, 94, 19);
		contentPane.add(lblTotalPrice);
		
			
		JButton btnReset = new JButton("New bill");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTotal.setText("0.00");
				txtBill.setText("");
				lblCoffeeCounter.setText("0");
				lblJuiceCounter.setText("0");
				lblTeaCounter.setText("0");
				txtBill.setText("-------------------------------------------------Cash receipt-----------------------------------------------") ;
			}
		});
		btnReset.setBounds(552, 69, 162, 31);
		contentPane.add(btnReset);
		
		
	}
}
