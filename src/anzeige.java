import java.applet.Applet;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class anzeige extends Applet{

	public void init(){   
		setLayout(null);
		//Variablen G1; Links nach Rechts
		
		JLabel l1 = new JLabel("Gerade1: ");
		l1.setBounds(0,-40, 100, 100);
		
		JTextField oVx = new JTextField("x");
		oVx.setBounds(60, 0, 60, 20);
		
		JTextField oVy = new JTextField("y");
		oVy.setBounds(60, 21, 60, 20);
		
		JTextField oVz = new JTextField("z");
		oVz.setBounds(60, 42, 60, 20);
		
		JLabel l2 = new JLabel("+ k *");
		l2.setBounds(120, 20, 35, 20);
		
		JTextField rVx = new JTextField("x");
		rVx.setBounds(155, 0, 60, 20);
		
		JTextField rVy = new JTextField("y");
		rVy.setBounds(155, 21, 60, 20);
		
		JTextField rVz = new JTextField("z");
		rVz.setBounds(155, 42, 60, 20);
		
		JButton eG1 = new JButton("Eingabe");
		eG1.setBounds(220, 20, 80, 30);
		
		
		setSize(750, 750);
		setBackground(Color.WHITE);
		add(l1);
		add(oVx);
		add(oVy);
		add(oVz);
		add(l2);
		add(rVx);
		add(rVy);
		add(rVz);
		add(eG1);
		
	}

}
