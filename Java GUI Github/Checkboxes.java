//Checkboxes demonstration 
//Alanna Tran - ICS 3U1 - January 21, 2021

import java.awt.*;
import javax.swing.*;

public class Checkboxes {

	public static void main(String[] args) {
		 try {
		     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme (unesscecary when learning; just makes buttons look more moder)
		 }
		     catch (Exception e) {
		    	 
		     } 
		new Checkboxes();
	}

	public Checkboxes() {

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
		
		JLabel label = new JLabel ("Select all fruits that you like:");
		JCheckBox checkbox1 = new JCheckBox ("apple");
		JCheckBox checkbox2 = new JCheckBox ("orange");
		JCheckBox checkbox3 = new JCheckBox ("grapes");
		checkbox1.setFont (new Font("Century Gothic", Font.BOLD, 40));
		checkbox2.setFont (new Font("Century Gothic", Font.BOLD, 40));
		checkbox3.setFont (new Font("Century Gothic", Font.BOLD, 40));
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		
		
		
		
		JFrame frame = new JFrame ();		
		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("CheckBoxes");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo (null);
		frame.setVisible(true);		
	}

}
