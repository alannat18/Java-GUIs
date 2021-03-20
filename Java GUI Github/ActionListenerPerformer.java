//Actions. The count will increase when the button is clicked
//Alanna Tran - ICS 3U1 - January 21, 2021

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerPerformer implements ActionListener {
	private int clicks = 0;
	private JLabel label = new JLabel("Number of clicks:  0     ");
	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		new ActionListenerPerformer();
	}

	public ActionListenerPerformer() {

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(60, 20, 60, 20));
			
		JButton button = new JButton("Button");
		button.addActionListener(this);
		button.setFont (new Font("Century Gothic", Font.BOLD, 60));
		panel.add(button);
		
		label.setFont (new Font("Century Gothic", Font.BOLD, 60));
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Button Click Counter");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo (null);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		clicks++;
		label.setText("Number of clicks:  " + clicks);
	}
}
