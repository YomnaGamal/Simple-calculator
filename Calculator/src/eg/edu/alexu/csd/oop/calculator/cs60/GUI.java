package eg.edu.alexu.csd.oop.calculator.cs60;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String s = "";
	public static Calc c = new Calc();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setResizable(false);
		setTitle("Calculator");
		setBackground(new Color(240, 248, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '1';
				textField.setText(s);
			}
		});
		button.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button.setBounds(10, 74, 39, 35);
		contentPane.add(button);

		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s += '2';
				textField.setText(s);
			}
		});
		button_1.setBounds(59, 74, 39, 35);
		contentPane.add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '3';
				textField.setText(s);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_2.setBounds(108, 74, 39, 35);
		contentPane.add(button_2);

		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '4';
				textField.setText(s);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_3.setBounds(10, 120, 39, 35);
		contentPane.add(button_3);

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '5';
				textField.setText(s);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_4.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_4.setBounds(59, 120, 39, 35);
		contentPane.add(button_4);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '6';
				textField.setText(s);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_5.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_5.setBounds(108, 120, 39, 35);
		contentPane.add(button_5);

		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '7';
				textField.setText(s);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_6.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_6.setBounds(10, 166, 39, 35);
		contentPane.add(button_6);

		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '8';
				textField.setText(s);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_7.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_7.setBounds(59, 166, 39, 35);
		contentPane.add(button_7);

		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '9';
				textField.setText(s);
			}
		});
		button_8.setBounds(108, 166, 39, 35);
		contentPane.add(button_8);

		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '+';
				textField.setText(s);
			}
		});
		button_9.setBackground(new Color(255, 218, 185));
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_9.setBounds(157, 74, 39, 35);
		contentPane.add(button_9);

		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '-';
				textField.setText(s);
			}
		});
		button_10.setBackground(new Color(255, 218, 185));
		button_10.setBounds(157, 120, 39, 35);
		contentPane.add(button_10);

		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '*';
				textField.setText(s);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBackground(new Color(255, 218, 185));
		btnX.setBounds(157, 166, 39, 35);
		contentPane.add(btnX);

		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '/';
				textField.setText(s);
			}
		});
		button_12.setBackground(new Color(255, 218, 185));
		button_12.setBounds(157, 212, 39, 35);
		contentPane.add(button_12);

		JButton btnPrev = new JButton("Prev");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = c.prev();
				if (x != null) {
					textField.setText(x);
					textField_1.setText(c.getResult());
				}
			}
		});
		btnPrev.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrev.setBackground(new Color(216, 191, 216));
		btnPrev.setBounds(10, 212, 55, 35);
		contentPane.add(btnPrev);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = c.next();
				if (x != null) {
					textField.setText(x);
					textField_1.setText(c.getResult());
				}
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNext.setBackground(new Color(216, 191, 216));
		btnNext.setBounds(92, 212, 55, 35);
		contentPane.add(btnNext);

		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = textField.getText();
				c.input(s);
				textField_1.setText(c.getResult());
			}
		});
		button_15.setBackground(new Color(255, 255, 240));
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_15.setBounds(206, 259, 41, 35);
		contentPane.add(button_15);

		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.load();
				textField.setText(c.current());
				textField_1.setText(c.getResult());
			}
		});
		btnL.setBackground(new Color(250, 235, 215));
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnL.setBounds(206, 74, 41, 35);
		contentPane.add(btnL);

		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.save();
			}
		});
		btnS.setBackground(new Color(250, 235, 215));
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnS.setBounds(206, 212, 41, 35);
		contentPane.add(btnS);

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(10, 18, 158, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 250, 240));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 258, 186, 35);
		contentPane.add(textField_1);

		JButton btnNewButton = new JButton(".");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += '.';
				textField.setText(s);
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(206, 120, 41, 35);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Clean");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				s = "";
				textField_1.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setBounds(178, 18, 69, 35);
		contentPane.add(btnNewButton_1);

		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+="0";
				textField.setText(s);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_11.setBackground(new Color(255, 250, 205));
		button_11.setBounds(206, 166, 41, 35);
		contentPane.add(button_11);
	}
}
