import javax.swing.*;
import java.awt.event.*;

public class MilesPerGallon extends JFrame{
	//Create Objects
	private JPanel panel;
	private JLabel gallonsLabel, milesLabel;
	private JTextField gallonsField, milesField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 310;
	
	//Constructor
	public MilesPerGallon()
	{
		super("Miles Per Gallon Calculator");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//Method to build panel
	private void buildPanel()
	{
		gallonsLabel = new JLabel("Gallons: ");
		gallonsField = new JTextField(5);
		
		milesLabel = new JLabel("Miles: ");
		milesField = new JTextField(5);
		
		calcButton = new JButton("Calculate MPG");
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		panel.add(gallonsLabel);
		panel.add(gallonsField);
		panel.add(milesLabel);
		panel.add(milesField);
		panel.add(calcButton);
	}
	
	//Action Listener Class
	private class CalcButtonListener implements ActionListener
	{
		//Method to calculate miles per gallon
		public void actionPerformed(ActionEvent e)
		{	//Fields
			String gallonsInput, milesInput;
			double gallons, miles;
			double mpg;
			
			gallonsInput = gallonsField.getText();
			milesInput = milesField.getText();
			
			gallons = Double.parseDouble(gallonsInput);
			miles = Double.parseDouble(milesInput);
			
			mpg = miles/gallons;
			
			JOptionPane.showMessageDialog(null, mpg + " miles per gallon");
			
			
			
		}
	}
	//Main method
	public static void main(String[] args) {
		new MilesPerGallon();

	}

}
