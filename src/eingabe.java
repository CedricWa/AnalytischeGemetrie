import java.applet.*;
import java.awt.*;


import javax.swing.*;
public class eingabe extends JPanel{

	public static void main(String[] args) {
		JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("Eingabe");
        meinJFrame.setSize(300, 150);
        JPanel panel = new JPanel();
 
        JLabel labelPunkt = new JLabel("Punkt:");
        panel.add(labelPunkt);
 
        JTextField punktX = new JTextField(3);
        JTextField punktY = new JTextField(3);
        JTextField punktZ = new JTextField(3);
       

        panel.add(punktX);
        panel.add(punktY);
        panel.add(punktZ);
 
        JButton buttonLinie = new JButton("Erstelle Linien Formel!");
        panel.add(buttonLinie);
 
        meinJFrame.add(panel);
        meinJFrame.setVisible(true);
	}



}
