package com.example.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBackground(Color.GREEN);
		textField1.setBounds(43, 26, 172, 33);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnDiv = new JButton("Div");
		btnDiv.setBackground(Color.MAGENTA);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try{
				a=Double.parseDouble(textField1.getText());
				b=Double.parseDouble(textField2.getText());
				c=a/b;
				textField3.setText(Double.toString(c));
				}catch(Exception e2){
					JOptionPane.showMessageDialog(frame, "Enter a valid Number.");
				}
			}
			
		});
		btnDiv.setBounds(43, 157, 172, 41);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("MUL");
		btnMul.setBackground(Color.MAGENTA);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try{
				a=Double.parseDouble(textField1.getText());
				b=Double.parseDouble(textField2.getText());
				c=a*b;
				textField3.setText(Double.toString(c));
				}catch(Exception e2){
					JOptionPane.showMessageDialog(frame, "Enter a valid Number.");
				}
			
			}
		});
		btnMul.setBounds(284, 157, 172, 41);
		frame.getContentPane().add(btnMul);
		
		textField2 = new JTextField();
		textField2.setBackground(Color.GREEN);
		textField2.setColumns(10);
		textField2.setBounds(284, 26, 172, 33);
		frame.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setBackground(Color.CYAN);
		textField3.setBounds(107, 234, 297, 50);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnswer.setBounds(22, 241, 73, 33);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnReset = new JButton("reset");
		btnReset.setBackground(Color.ORANGE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(null);
				textField2.setText(null);
				textField3.setText(null);
			}
		});
		btnReset.setBounds(414, 234, 89, 96);
		frame.getContentPane().add(btnReset);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(Color.MAGENTA);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try{
				a=Double.parseDouble(textField1.getText());
				b=Double.parseDouble(textField2.getText());
				c=a+b;
				textField3.setText(Double.toString(c));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(frame, "Enter a valid Number.");
				}
			}
		});
		btnAdd.setBounds(43, 88, 172, 41);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("MInus\r\n");
		btnMinus.setBackground(Color.MAGENTA);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try{
				a=Double.parseDouble(textField1.getText());
				b=Double.parseDouble(textField2.getText());
				c=a-b;
				textField3.setText(Double.toString(c));
				}catch(Exception e2){
					JOptionPane.showMessageDialog(frame, "Enter a valid Number.");
				}
			}
			
		});
		btnMinus.setBounds(284, 88, 172, 41);
		frame.getContentPane().add(btnMinus);
		
		JButton btnNewButton = new JButton("Exit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(107, 294, 297, 36);
		frame.getContentPane().add(btnNewButton);
	}
}
