import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class AutoMaintenanceGUI extends JFrame {
	//Create Panels and objects
	private RoutinePanel routine;
	private NonroutinePanel nonroutine;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	//Constructor
	public AutoMaintenanceGUI() 
	{
		super("Ranken's Automotive Maintenance");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		routine = new RoutinePanel();
		nonroutine = new NonroutinePanel();
		
		buildButtonPanel();
		
		add(routine, BorderLayout.NORTH);
		add(nonroutine, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	//Method to build buttonPanel
	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		
		calcButton = new JButton("Calculate Charges");
		exitButton = new JButton("Exit");
		
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
		
	}
	
	//Event listener for calcButton
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double subTotal, routineTotal, nonroutineTotal;
			
			routineTotal = routine.getRoutineServiceCost();
			nonroutineTotal = nonroutine.getNonroutineServiceCost();
			
			subTotal = routineTotal + nonroutineTotal;
			
			DecimalFormat dollar = new DecimalFormat("0.00");
			
			JOptionPane.showMessageDialog(null, "Total Charges: $" + dollar.format(subTotal));
		}
	}
	//Event Listener for exitButton
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		new AutoMaintenanceGUI();

	}

}
