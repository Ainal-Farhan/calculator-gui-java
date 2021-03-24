package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainGUI {

	private JFrame frame;
	private JTextField textField;
	
	private double first = .0;
	private double second = .0;
	private double result = .0;
	private char op = ' ';
	private String answer = "";

	/**
	 * Launch the application.
	 */
	public void viewMainGUI() {
		this.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(175, 238, 238));
		frame.setResizable(false);
		frame.setBounds(100, 100, 277, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 11, 240, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 20));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(number.length() == 1 && !number.equals("")) number = "";
				else if(number.length() > 1) {
					number = number.substring(0, number.length() - 1);
					if(number.charAt(number.length() - 1) == '.') number = number.substring(0, number.length() - 1);
				}
				
				textField.setText(number);
			}
		});
		btnBackspace.setBounds(10, 80, 60, 45);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				first = second = result = .0;
				answer = "";
				op = ' ';
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(70, 80, 60, 45);
		frame.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				if(number == null || number.length() == 0) return;
				
				number += btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBounds(130, 80, 60, 45);
		frame.getContentPane().add(btn00);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn7.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 125, 60, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn8.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 125, 60, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn9.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 125, 60, 45);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn4.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 170, 60, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn5.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 170, 60, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn6.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(130, 170, 60, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn3.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(130, 215, 60, 45);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn2.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 215, 60, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				number = currNum(number, btn1.getText().charAt(0));
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 215, 60, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				if(number == null) return;
				if(number.length() > 0 && number.charAt(0) == '0') return;
				
				number += btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 260, 60, 45);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				if(number == null || number.length() == 0) number = "0";
				else if(number.contains(btnDot.getText())) return;

				number += btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(70, 260, 60, 45);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				second = Double.parseDouble(number);
				result = calc(first, second, op);
				answer = String.format("%.2f", result);
				op = ' ';
				
				textField.setText(answer);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(130, 260, 60, 45);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(first == .0) first = Double.parseDouble(number);
				else {
					first = calc(first, Double.parseDouble(number), op);
				}
				
				op = '%';
				textField.setText("");
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercentage.setBounds(190, 260, 60, 45);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(first == .0) first = Double.parseDouble(number);
				else {
					first = calc(first, Double.parseDouble(number), op);
				}
				
				op = '/';
				textField.setText("");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(190, 215, 60, 45);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(first == .0) first = Double.parseDouble(number);
				else {
					first = calc(first, Double.parseDouble(number), op);
				}
				
				op = 'x';
				textField.setText("");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(190, 170, 60, 45);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(first == .0) first = Double.parseDouble(number);
				else {
					first = calc(first, Double.parseDouble(number), op);
				}
				
				op = '-';
				textField.setText("");
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(190, 125, 60, 45);
		frame.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
				
				if(number == null || number.length() == 0) return;
				
				if(first == .0) first = Double.parseDouble(number);
				else {
					first = calc(first, Double.parseDouble(number), op);
				}
				
				op = '+';
				textField.setText("");
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(190, 80, 60, 45);
		frame.getContentPane().add(btnPlus);
	}
	
	private double calc(double first, double second, char operation) {
		switch(operation) {
		case '+':
			return first + second;
		case '/':
			return first / second;
		case 'x':
			return first * second;
		case '-': 
			return first - second;
		case '%': 
			return first % second;
		default:
			return .0;
		}
	}
	
	private String currNum(String number, char num) {
		
		if(number.length() == 1 && number.charAt(0) == '0') number = "";
		
		number += num;
		
		return number;
	}
}
