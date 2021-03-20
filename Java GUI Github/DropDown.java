//Combobox aka drop down menu demonstration
//Alanna Tran - ICS 3U1 - January 21, 2021

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DropDown implements ActionListener {
	
	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		 try {
		     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme (unesscecary when learning; just makes buttons look more moder)
		 }
		     catch (Exception e) {	    	 
		     } 
		new DropDown();
	}

	public DropDown() {
		
		String [] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
		JComboBox combobox = new JComboBox (options);
		combobox.setFont(new Font("Century Gothic", Font.BOLD, 40));
		combobox.addActionListener(this);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
		panel.add(combobox);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("DropDown");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo (null);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}