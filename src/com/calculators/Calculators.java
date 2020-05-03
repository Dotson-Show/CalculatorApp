package com.calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculators {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operators;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculators window = new Calculators();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 285, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 250, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ------- Row 1 ----------------
//		JButton btnBackSpace = new JButton("\uF0E7");
//		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
//		btnBackSpace.setBounds(10, 74, 60, 60);
//		frame.getContentPane().add(btnBackSpace);
//		
//		JButton btnClear = new JButton("C");
//		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnClear.setBounds(74, 74, 60, 60);
//		frame.getContentPane().add(btnClear);
//		
//		JButton btnPercent = new JButton("%");
//		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnPercent.setBounds(138, 74, 60, 60);
//		frame.getContentPane().add(btnPercent);
//		
//		JButton btnDivision = new JButton("/");
//		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnDivision.setBounds(202, 73, 60, 60);
//		frame.getContentPane().add(btnDivision);
		
		// ------- Row 2 ----------------
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackSpace.setBounds(10, 74, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(74, 74, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(138, 74, 60, 60);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "/";
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivision.setBounds(202, 73, 60, 60);
		frame.getContentPane().add(btnDivision);
		
		// ------- Row 3 ----------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 138, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(74, 138, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(138, 138, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(202, 138, 60, 60);
		frame.getContentPane().add(btnMult);
		
		
		// ------- Row 4 ----------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 202, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(74, 202, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(138, 202, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(202, 202, 60, 60);
		frame.getContentPane().add(btnSub);
		
		// ------- Row 5 ----------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 266, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(74, 266, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(138, 266, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(202, 266, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		//-------- Row 6 -----------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 330, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btnDot.getText();
				textField.setText(enterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(74, 330, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlusMinus.setBounds(138, 330, 60, 60);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				
				if (operators == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operators == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operators == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operators == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operators == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(202, 330, 60, 60);
		frame.getContentPane().add(btnEquals);

	}

}
