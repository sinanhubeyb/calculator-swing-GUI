package calculation_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class calculatorApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorApp frame = new calculatorApp();
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
	public calculatorApp() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		
		textField = new JTextField();
		textField.setBounds(6, 11, 318, 34);
		textField.setColumns(25);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setToolTipText("");
		textField.setBackground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(textField);
		
	
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(6, 52, 47, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(6, 77, 47, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
		JButton btnNewButton = new JButton("<---");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        int length = currentText.length();

		        if (length > 0) {
		            // Remove the last character
		            String newText = currentText.substring(0, length - 1);
		            textField.setText(newText);
		        }
			}
		});
		btnNewButton.setBounds(64, 52, 62, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearTextField();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(136, 52, 71, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("+");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1.setBounds(217, 52, 71, 48);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("1");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("1");
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_1.setBounds(6, 111, 71, 48);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("2");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("2");
			}
		});
		btnNewButton_1_1_2.setForeground(Color.BLUE);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_2.setBounds(87, 111, 71, 48);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("3");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("3");
			}
		});
		btnNewButton_1_1_3.setForeground(Color.BLUE);
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_3.setBounds(168, 111, 71, 48);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("-");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("-");
			}
		});
		btnNewButton_1_1_4.setForeground(Color.BLUE);
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_4.setBounds(253, 111, 71, 48);
		contentPane.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_5 = new JButton("4");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("4");
			}
		});
		btnNewButton_1_1_5.setForeground(Color.BLUE);
		btnNewButton_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_5.setBounds(6, 170, 71, 48);
		contentPane.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_1_6 = new JButton("5");
		btnNewButton_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("5");
			}
		});
		btnNewButton_1_1_6.setForeground(Color.BLUE);
		btnNewButton_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_6.setBounds(87, 170, 71, 48);
		contentPane.add(btnNewButton_1_1_6);
		
		JButton btnNewButton_1_1_7 = new JButton("6");
		btnNewButton_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("6");
			}
		});
		btnNewButton_1_1_7.setForeground(Color.BLUE);
		btnNewButton_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_7.setBounds(168, 170, 71, 48);
		contentPane.add(btnNewButton_1_1_7);
		
		JButton btnNewButton_1_1_8 = new JButton("*");
		btnNewButton_1_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("*");
			}
		});
		btnNewButton_1_1_8.setForeground(Color.BLUE);
		btnNewButton_1_1_8.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_8.setBounds(253, 170, 71, 48);
		contentPane.add(btnNewButton_1_1_8);
		
		JButton btnNewButton_1_1_9 = new JButton("7");
		btnNewButton_1_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("7");
			}
		});
		btnNewButton_1_1_9.setForeground(Color.BLUE);
		btnNewButton_1_1_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_9.setBounds(6, 229, 71, 48);
		contentPane.add(btnNewButton_1_1_9);
		
		JButton btnNewButton_1_1_10 = new JButton("8");
		btnNewButton_1_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("8");
			}
		});
		btnNewButton_1_1_10.setForeground(Color.BLUE);
		btnNewButton_1_1_10.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_10.setBounds(87, 229, 71, 48);
		contentPane.add(btnNewButton_1_1_10);
		
		JButton btnNewButton_1_1_11 = new JButton("9");
		btnNewButton_1_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("9");
			}
		});
		btnNewButton_1_1_11.setForeground(Color.BLUE);
		btnNewButton_1_1_11.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_11.setBounds(168, 229, 71, 48);
		contentPane.add(btnNewButton_1_1_11);
		
		JButton btnNewButton_1_1_12 = new JButton("/");
		btnNewButton_1_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("/");
			}
		});
		btnNewButton_1_1_12.setForeground(Color.BLUE);
		btnNewButton_1_1_12.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_12.setBounds(253, 229, 71, 48);
		contentPane.add(btnNewButton_1_1_12);
		
		JButton btnNewButton_1_1_13 = new JButton("0");
		btnNewButton_1_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField("0");
			}
		});
		btnNewButton_1_1_13.setForeground(Color.BLUE);
		btnNewButton_1_1_13.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_13.setBounds(6, 288, 71, 48);
		contentPane.add(btnNewButton_1_1_13);
		
		JButton btnNewButton_1_1_14 = new JButton(".");
		btnNewButton_1_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTextField(".");
			}
		});
		btnNewButton_1_1_14.setForeground(Color.BLUE);
		btnNewButton_1_1_14.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_14.setBounds(87, 288, 71, 48);
		contentPane.add(btnNewButton_1_1_14);
		
		JButton btnNewButton_1_1_15 = new JButton("=");
		btnNewButton_1_1_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateResult();
			}
		});
		btnNewButton_1_1_15.setForeground(Color.BLUE);
		btnNewButton_1_1_15.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_15.setBounds(168, 288, 150, 48);
		contentPane.add(btnNewButton_1_1_15);
	}
	
	private void updateTextField(String text) {
	    textField.setText(textField.getText() + text);
	}
	
	private void clearTextField() {
	    textField.setText("");
	}
	
	
	 private void calculateResult() {
	        String expression = textField.getText();

	        try {
	            // Use a simple expression parser and evaluator
	            double result = evaluateExpression(expression);

	            // Display the result in the textField
	            textField.setText(String.valueOf(result));
	        } catch (Exception ex) {
	            // Handle the exception (e.g., display an error message)
	            textField.setText("Error");
	        }
	    }

	 private double evaluateExpression(String expression) {
		    try {
		        // Use a simple expression parser and evaluator
		        String[] tokens = expression.split(" ");
		        if (tokens.length == 1) {
		            // No spaces found, attempt to split the expression into operand and operator
		            char operator = findOperator(expression);
		            if (operator != '\0') {
		                tokens = splitByOperator(expression, operator);
		            } else {
		                throw new IllegalArgumentException("Invalid expression: " + expression);
		            }
		        }

		        double operand1 = Double.parseDouble(tokens[0]);
		        String operator = tokens[1];
		        double operand2 = Double.parseDouble(tokens[2]);

		        // Perform the arithmetic operation
		        switch (operator) {
		            case "+":
		                return operand1 + operand2;
		            case "-":
		                return operand1 - operand2;
		            case "*":
		                return operand1 * operand2;
		            case "/":
		                return operand1 / operand2;
		            default:
		                throw new IllegalArgumentException("Invalid operator: " + operator);
		        }
		    } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
		        throw new IllegalArgumentException("Invalid expression: " + expression);
		    }
		}

		private char findOperator(String expression) {
		    for (char operator : "+-*/".toCharArray()) {
		        if (expression.indexOf(operator) != -1) {
		            return operator;
		        }
		    }
		    return '\0'; // Indicates no operator found
		}

		private String[] splitByOperator(String expression, char operator) {
		    String[] result = new String[3];
		    int operatorIndex = expression.indexOf(operator);
		    result[0] = expression.substring(0, operatorIndex);
		    result[1] = String.valueOf(operator);
		    result[2] = expression.substring(operatorIndex + 1);
		    return result;
		}
	
}
