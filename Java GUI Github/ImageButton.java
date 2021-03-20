//Image button demonstration. The image will not show. Download any image on your computer and find the image path using the instructions on the presentation.
//You will have to change the button size to accommodate your own image. (Line 21)

//Alanna Tran - ICS 3U1 - January 21, 2021

import java.awt.*;								//Imports all classes in the abstract window toolkit package
import java.awt.event.*;						//Imports all classes in the abstract window toolkit event package
import javax.swing.*;							//Imports all of the classes in the swing package

public class ImageButton implements ActionListener {
	
	int count = 0;
	JLabel label;
	 
	public ImageButton () {
		
		JFrame frame = new JFrame();			//Creates a new window to display the graphics
		
		Icon icon = new ImageIcon ("C:\\Users\\alann\\Downloads\\GoogleButton.JPG");
		JButton button = new JButton(icon);
		button.setPreferredSize(new Dimension(200, 192));
		button.addActionListener(this);
		
		label = new JLabel ("Number of clicks: 0", JLabel.CENTER);
		label.setFont (new Font("Century Gothic", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 400, 300, 400));		//The parameters are the dimensions of the window
		panel.setLayout(new GridLayout (1,1));
		panel.add(Box.createVerticalGlue());
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ImageButton");												//Name of the window
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) { 
		 try {
		     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme (unesscecary when learning; just makes buttons look more moder)
		 }
		     catch (Exception e) {
		     }
		new ImageButton();									//Opens the new window 
	}
@Override
	public void actionPerformed(ActionEvent e) {
	count++;
	label.setText("Number of clicks: " + count);
}

}