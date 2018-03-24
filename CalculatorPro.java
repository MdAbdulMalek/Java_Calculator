package com.example.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorPro {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorPro window = new CalculatorPro();
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
	public CalculatorPro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 267, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.CYAN);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(6, 3, 235, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(6, 119, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(62, 119, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(122, 119, 59, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(Color.MAGENTA);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = " + ";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(191, 59, 50, 50);
		frame.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(66, 180, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(122, 180, 59, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(Color.MAGENTA);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = " - ";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnminus.setBounds(191, 120, 50, 50);
		frame.getContentPane().add(btnminus);
		
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= textField.getText() + btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn1.setBounds(10, 241, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= textField.getText() + btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn2.setBounds(66, 241, 50, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= textField.getText() + btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn3.setBounds(122, 241, 59, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnmul = new JButton("*");
				btnmul.setBackground(Color.MAGENTA);
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum =Double.parseDouble(textField.getText());
						textField.setText("");
						operations = " * ";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 22));
				btnmul.setBounds(191, 181, 50, 50);
				frame.getContentPane().add(btnmul);
				
				JButton btnzero = new JButton("0");
				btnzero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= textField.getText() + btnzero.getText();
						textField.setText(EnterNumber);
					}
				});
				btnzero.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnzero.setBounds(10, 302, 50, 50);
				frame.getContentPane().add(btnzero);
				
				JButton btndot = new JButton(".");
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= textField.getText() + btndot.getText();
						textField.setText(EnterNumber);
					}
				});
				btndot.setFont(new Font("Tahoma", Font.BOLD, 25));
				btndot.setBounds(66, 302, 50, 50);
				frame.getContentPane().add(btndot);
				
				JButton btnequal = new JButton("=");
				btnequal.setBackground(Color.GREEN);
				btnequal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//String answer;
						secondnum =Double.parseDouble(textField.getText());
						if(operations == " + ") {
							result =firstnum + secondnum;
							answer= String.format("%.2f", result);
							textField.setText(answer);
						}
						
						
						else if(operations == " - ") {
							result =firstnum - secondnum;
							answer= String.format("%.2f", result);
							textField.setText(answer);
						}
						
						else if(operations == " * ") {
							result =firstnum * secondnum;
							answer= String.format("%.2f", result);
							textField.setText(answer);
						}
						
						else if(operations == " / ") {
							result =firstnum / secondnum;
							answer= String.format("%.2f", result);
							textField.setText(answer);
						}
						
						else if(operations == " % ") {
							result =firstnum % secondnum;
							answer= String.format("%.2f", result);
							textField.setText(answer);
						}
					}
				});
				btnequal.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnequal.setBounds(123, 302, 118, 50);
				frame.getContentPane().add(btnequal);
				
				JButton btndiv = new JButton("/");
				btndiv.setBackground(Color.MAGENTA);
				btndiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum =Double.parseDouble(textField.getText());
						textField.setText("");
						operations = " / ";
					}
				});
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 25));
				btndiv.setBounds(191, 241, 50, 50);
				frame.getContentPane().add(btndiv);
				
				JButton btnback = new JButton("<-");
				btnback.setBackground(Color.MAGENTA);
				btnback.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (textField.getText().length()>0){
					        StringBuffer sb = new StringBuffer(textField.getText());
					        sb = sb.deleteCharAt(textField.getText().length()-1);
					        textField.setText(sb.toString());
					    }
					}
				});
				btnback.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnback.setBounds(6, 58, 50, 50);
				frame.getContentPane().add(btnback);
				
				JButton btnper= new JButton("%");
				btnper.setBackground(Color.MAGENTA);
				btnper.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum =Double.parseDouble(textField.getText());
						textField.setText("");
						operations = " % ";
					}
				});
				btnper.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnper.setBounds(62, 59, 56, 50);
				frame.getContentPane().add(btnper);
				
				JButton btncan= new JButton("C");
				btncan.setBackground(Color.MAGENTA);
				btncan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						textField.setText(null);
					}
				});
				btncan.setFont(new Font("Tahoma", Font.BOLD, 25));
				btncan.setBounds(125, 59, 56, 50);
				frame.getContentPane().add(btncan);
				
}
	
}
