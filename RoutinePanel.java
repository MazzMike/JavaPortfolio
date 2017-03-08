import java.awt.*;
import javax.swing.*;

public class RoutinePanel extends JPanel {
	//Service Prices
	public final double OIL = 26.00;
	public final double LUBE = 18.00;
	public final double RADIATOR = 30.00;
	public final double TRANSMISSION = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLER = 100.00;
	public final double TIRE = 20.00;
	
	//Check boxes for Services
	private JCheckBox oil;
	private JCheckBox lube;
	private JCheckBox radiator;
	private JCheckBox transmission;
	private JCheckBox inspection;
	private JCheckBox muffler;
	private JCheckBox tire;
	
	//Constructor
	public RoutinePanel() 
	{	//Create Layout
		setLayout(new GridLayout(7,1));
		
		//Create check boxes
		oil = new JCheckBox("Oil Change ($26.00)");
		lube = new JCheckBox("Lube Job ($18.00)");
		radiator = new JCheckBox("Radiator Flush ($30.00)");
		transmission = new JCheckBox("Transmission Flush ($80.00)");
		inspection = new JCheckBox("Inspection ($15.00)");
		muffler = new JCheckBox("Muffler Replacement ($100.00)");
		tire = new JCheckBox("Tire Rotaion ($20.00)");
		
		//Create border
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		
		//Add check boxes
		add(oil);
		add(lube);
		add(radiator);
		add(transmission);
		add(inspection);
		add(muffler);
		add(tire);
	}
	
	//Method to get service cost
	public double getRoutineServiceCost()
	{
		double serviceCost = 0.0;
		
		if(oil.isSelected())
			serviceCost += OIL;
		if(lube.isSelected())
			serviceCost += LUBE;
		if(radiator.isSelected())
			serviceCost += RADIATOR;
		if(transmission.isSelected())
			serviceCost += TRANSMISSION;
		if(inspection.isSelected())
			serviceCost += INSPECTION;
		if(muffler.isSelected())
			serviceCost += MUFFLER;
		if(tire.isSelected())
			serviceCost += TIRE;
		
		return serviceCost;
		
	}

}
