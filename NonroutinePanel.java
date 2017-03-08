import java.awt.*;
import javax.swing.*;

public class NonroutinePanel extends JPanel {
	//Create Text boxes and Labels
	private JLabel partsLabel, laborLabel;
	private JTextField partsTextField, laborTextField;
	
	//Constructor
	public NonroutinePanel() 
	{
		//Set Layout
		setLayout(new GridLayout(2,2));
		
		//Create border
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		
		//Text boxes and fields
		partsLabel = new JLabel("Parts Charges: ");
		laborLabel = new JLabel("Hours of Labor: ");
		partsTextField  = new JTextField(10);
		laborTextField = new JTextField(10);
		
		//Add to panel
		add(partsLabel);
		add(partsTextField);
		add(laborLabel);
		add(laborTextField);
		
	}
	
	//Method to get nonroutine service cost
	public double getNonroutineServiceCost()
	{
		double serviceCost = 0.0;
		String input;
		
		input = partsTextField.getText();
		serviceCost += Double.parseDouble(input);
		
		input = laborTextField.getText();
		serviceCost += (Double.parseDouble(input) * 20);
		
		return serviceCost;
		
		
	}

}
