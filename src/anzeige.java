import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class anzeige extends Applet implements ActionListener{
	List punkte = new List();
	List geraden = new List();
	List vektoren = new List();


	JComboBox eingabeSC;
	JLabel lPE = new JLabel();
	JLabel lve = new JLabel();
	JLabel lge = new JLabel();
	JButton pBE = new JButton();
	JButton vBE = new JButton();
	JButton gBE = new JButton();

	//Punkt Text Felder
	JTextField pName = new JTextField("P1");
	JTextField pX = new JTextField("x");
	JTextField pY = new JTextField("y");
	JTextField pZ = new JTextField("z");


	//Vektor Text Felder
	JTextField vName = new JTextField("V1");
	JTextField vX = new JTextField("x");
	JTextField vY = new JTextField("y");
	JTextField vZ = new JTextField("z");

	//Geraden Text Felder
	JTextField gName = new JTextField("G1");
	JTextField oVx = new JTextField("x");
	JTextField oVy = new JTextField("y");
	JTextField oVz = new JTextField("z");
	JTextField rVx = new JTextField("x");
	JTextField rVy = new JTextField("y");
	JTextField rVz = new JTextField("z");

	JLabel lListe;
	
	public void init(){
		setLayout(null);
		setSize(750, 750);
		setBackground(Color.WHITE);		

		JLabel lSC = new JLabel("Eingabe von: ");
		lSC.setBounds(10, 0, 90, 30);

		//-----------Auswahl Menü---------------
		String[] auswahl = {"Gerade", "Vektor", "Punkt"};
		eingabeSC = new JComboBox(auswahl);
		eingabeSC.setBounds(100, 0, 130, 30);
		eingabeSC.addActionListener(this);
		eingabeSC.setSelectedIndex(0);
		add(lSC);
		add(eingabeSC);
		//---------------------------------------




		//---------Punkt Anzeige---------------------
		lPE.setBounds(50, 35, 350, 80);
		pName.setBounds(0, 5, 50, 20);
		JLabel l1 = new JLabel(":");
		l1.setBounds(48, 5, 4, 20);
		pX.setBounds(50, 5, 60, 20);
		pY.setBounds(111, 5, 60, 20);
		pZ.setBounds(172, 5, 60, 20);
		pBE = new JButton("Eingabe");
		pBE.setBounds(232, 0, 80, 30);
		pBE.addActionListener(this);
		lPE.add(pName);
		lPE.add(pX);
		lPE.add(pY);
		lPE.add(pZ);
		lPE.add(pBE);
		lPE.add(l1);

		//----------Vektor Anzeige----------------------
		lve.setBounds(50, 35, 350, 100);	
		vName.setBounds(0, 5, 50, 20);
		JLabel l2 = new JLabel(":");
		l2.setBounds(48, 5, 4, 20);
		vX.setBounds(50, 0, 60, 20);
		vY.setBounds(50, 21, 60, 20);
		vZ.setBounds(50, 42, 60, 20);
		vBE = new JButton("Eingabe");
		vBE.setBounds(232, 0, 80, 30);
		vBE.addActionListener(this);
		lve.add(vName);
		lve.add(l2);
		lve.add(vX);
		lve.add(vY);
		lve.add(vZ);
		lve.add(vBE);


		//---------Gerade Eingabe-----------------------

		lge.setBounds(50, 35, 350, 80);

		gName.setBounds(0, 5, 50, 20);
		JLabel l3 = new JLabel(":");
		l3.setBounds(48, 5, 4, 20);

		oVx.setBounds(60, 0, 60, 20);
		oVy.setBounds(60, 21, 60, 20);

		oVz.setBounds(60, 42, 60, 20);

		JLabel l4 = new JLabel("+ k *");
		l4.setBounds(120, 20, 35, 20);

		rVx.setBounds(155, 0, 60, 20);

		rVy.setBounds(155, 21, 60, 20);

		rVz.setBounds(155, 42, 60, 20);
		gBE = new JButton("Eingabe");
		gBE.setBounds(232, 0, 80, 30);
		gBE.addActionListener(this);
		lge.add(l3);
		lge.add(oVx);
		lge.add(oVy);
		lge.add(oVz);
		lge.add(l4);
		lge.add(rVx);
		lge.add(rVy);
		lge.add(rVz);
		lge.add(gBE);
		lge.add(gName);
		lge.add(l3);
		
		lListe = new JLabel();
		lListe.setBounds(500, 10, 350, 500);
		JLabel lListTitel = new JLabel("Vorhandene Objekte:");
		lListTitel.setBounds(0, 0, 150, 20);
		lListe.add(lListTitel);
		add(lListe);
	}

	public void zeigeListe(){
		
	
		//Darstellung Punkte
		punkte = new List();
		punkte.toFirst();
		int höhe= 20;
System.out.println(punkte.hasAccess());
		while(punkte.hasAccess()){
			System.out.println("test");
			punkt p = (punkt)punkte.getObject();
			JLabel lx = new JLabel(String.valueOf(p.getxKoord()));
			JLabel ly = new JLabel(String.valueOf(p.getyKoord()));
			JLabel lz = new JLabel(String.valueOf(p.getzKoord()));
			JLabel name = new JLabel(p.getName() + ":");
			JLabel strich = new JLabel("/");
			JLabel alles = new JLabel();
			name.setBounds(0,0,30, 10);
			alles.add(name);
			lx.setBounds(40, 0, 20, 10);
			alles.add(lx);
			strich.setBounds(60, 0, 5, 10);
			alles.add(strich);
			ly.setBounds(65, 0, 20, 10);
			strich.setBounds(85, 0, 5, 10);
			lz.setBounds(90, 0, 20, 10);

			alles.setBounds(0, höhe, 350, 80);
			lListe.add(alles);
			höhe = höhe+80;
			punkte.next();
		}
		

		add(lListe);
	}

	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == pBE){

			double x,y,z;
			String name = pName.getText();
			x = Double.parseDouble(pX.getText());
			y = Double.parseDouble(pY.getText());
			z = Double.parseDouble(pZ.getText());

			punkt p1 = new punkt(x,y,z,name);
			punkte.append(p1);
			zeigeListe();
		}

		if(evt.getSource() == eingabeSC){
			String wahl = (String) eingabeSC.getSelectedItem();
			if(wahl.equals("Punkt")){	
				lge.setVisible(false);
				lve.setVisible(false);
				lPE.setVisible(true);
				add(lPE);
			}else if(wahl.equals("Vektor")){
				lPE.setVisible(false);
				lge.setVisible(false);
				lve.setVisible(true);
				add(lve);
			}else if(wahl.equals("Gerade")){
				lPE.setVisible(false);
				lve.setVisible(false);
				lge.setVisible(true);
				add(lge);
			}
		}


	}


}
