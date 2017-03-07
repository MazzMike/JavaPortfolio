import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LatinTranslator extends JFrame
{		//Fields
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 200;
	private JLabel translation = new JLabel();
	

	//Constructor
	public LatinTranslator() {
		super("Latin Translator");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JButton button1 = new JButton("Sinister");
		button1.addActionListener(new Button1Listener());
		
		JButton button2 = new JButton("Dexter");
		button2.addActionListener(new Button2Listener());
		
		JButton button3 = new JButton("Medium");
		button3.addActionListener(new Button3Listener());
		
		add(button1);
		add(button2);
		add(button3);
		add(translation);
		translation.setVisible(false);
		
		setVisible(true);
	}
	
	//event for button1
	private class Button1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//translation = new JLabel("Left");
			translation.setText("Left");
			translation.setVisible(true);
		}
	}
	//event for button2
	private class Button2Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			translation.setText("Right");
			translation.setVisible(true);
		}
	}
	//event for button3
	private class Button3Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{translation.setText("Center");
		translation.setVisible(true);
		}
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		new LatinTranslator();

	}

}
