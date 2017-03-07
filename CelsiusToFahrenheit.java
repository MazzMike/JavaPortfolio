import java.awt.event.*;

import javax.swing.*;

public class CelsiusToFahrenheit extends JFrame
{
	//Create fields/objects
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField tempTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 100;
	
	//Constructor
	public CelsiusToFahrenheit(){
		super("Celsius To Fahrenheit");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//method to build panel
	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a temperature in Celsius");
		tempTextField = new JTextField(10);
		
		calcButton = new JButton("Convert");
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(tempTextField);
		panel.add(calcButton);
				
	}
	
	//Action Listener Class
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			//Fields
			String input;
			double temp;
			
			input = tempTextField.getText();
			temp = Double.parseDouble(input);
			temp = (temp * 9/5) + 32;
			
			JOptionPane.showMessageDialog(null, temp + " degrees Fahrenheit");
		}
	}
	
	//main method
	public static void main(String [] args)
	{
		new CelsiusToFahrenheit();
	}
	
}
