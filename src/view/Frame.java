package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Frame extends JFrame {

	private JPanel contentPane;
	private String input;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 660);
		setTitle("My Calculator");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(87, 10, 455, 46);
		contentPane.add(textPane);
		textPane.setFocusable(false);
		this.input = new String("");
		textPane.setText(input);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "1";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn1.setBounds(87, 106, 85, 54);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "2";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn2.setBounds(202, 106, 85, 54);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "3";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn3.setBounds(316, 106, 85, 54);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "4";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn4.setBounds(87, 184, 85, 54);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "5";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn5.setBounds(202, 184, 85, 54);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "6";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn6.setBounds(316, 184, 85, 54);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "7";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn7.setBounds(87, 265, 85, 54);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "8";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn8.setBounds(202, 265, 85, 54);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "9";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn9.setBounds(316, 265, 85, 54);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "0";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btn0.setBounds(202, 351, 85, 54);
		contentPane.add(btn0);
		
		JButton btnDOT = new JButton(".");
		btnDOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ".";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnDOT.setBounds(87, 351, 85, 54);
		contentPane.add(btnDOT);
		
		JButton btnDEL = new JButton("DEL");
		btnDEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int endindex = input.length()-1;
				if (endindex >= 0) {
					input = input.substring(0, endindex);
					textPane.setText(input);
					if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
				}
			}
		});
		btnDEL.setBounds(316, 351, 85, 54);
		contentPane.add(btnDEL);
		
		JButton btnADD = new JButton("+");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "+";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnADD.setBounds(457, 106, 85, 54);
		contentPane.add(btnADD);
		
		JButton btnSUB = new JButton("-");
		btnSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "-";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnSUB.setBounds(457, 183, 85, 54);
		contentPane.add(btnSUB);
		
		JButton btnMUL = new JButton("x");
		btnMUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "x";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnMUL.setBounds(457, 265, 85, 54);
		contentPane.add(btnMUL);
		
		JButton btnDIV = new JButton(":");
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ":";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnDIV.setBounds(457, 351, 85, 54);
		contentPane.add(btnDIV);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = "";
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
				textPane.setText(input);
			}
		});
		btnAC.setBounds(87, 511, 123, 73);
		contentPane.add(btnAC);
		
		JButton btnOPEN = new JButton("(");
		btnOPEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += "(";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnOPEN.setBounds(457, 438, 85, 54);
		contentPane.add(btnOPEN);
		
		JButton btnCLOSE = new JButton(")");
		btnCLOSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input += ")";
				textPane.setText(input);
				if (textPane.getForeground() != Color.black) textPane.setForeground(Color.black);
			}
		});
		btnCLOSE.setBounds(457, 530, 85, 54);
		contentPane.add(btnCLOSE);
		
		JButton btnEQ = new JButton("=");
		btnEQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mathexpr = input.replace('x', '*').replace(':', '/');
				try {
					Expression expr = new ExpressionBuilder(mathexpr).build();
					double result = expr.evaluate();
					if((int) result == result) {
						int intRes = (int) result;
						input = String.valueOf(intRes);
					} else {						
						input = String.valueOf(result);
					}
					textPane.setText(input);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					input = "";
					String errMsg = "Things went down, maybe Syntax Error?";
					textPane.setForeground(Color.red);
					textPane.setText(errMsg);
					e1.printStackTrace();
				}				
			}
		});
		btnEQ.setBounds(254, 511, 123, 73);
		contentPane.add(btnEQ);
	}
}
