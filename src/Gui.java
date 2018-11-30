

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Gui implements ActionListener {

	JFrame jf;
	Draw draw;
	JButton btnReset;
	JLabel tx;
	int counter = 0;
	ArrayList<String> Kette = new ArrayList<>();

	static JButton btn[] = new JButton[25];
	static int state[] = new int[25];
	static double Ergebnis = 0;


	public Gui() {

		JFrame jf = new JFrame();
		jf.setSize(278, 453);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setTitle("Taschenrechner");
		jf.getContentPane().setBackground(Color.LIGHT_GRAY);


		ImageIcon img = new ImageIcon("C:\\Users\\domes\\OneDrive - leverage innovative users\\Schule\\Development\\Intelij Workspace\\Taschenrechner\\res\\Calculator-icon.ico");
		jf.setIconImage(img.getImage());


		for ( int i = 0; i < btn.length; i++) {
	btn[i] = new JButton();
	btn[i].addActionListener(new ActionHandler());
	btn[i].setFocusPainted(true);
	btn[i].setContentAreaFilled(true);
	btn[i].setVisible(true);
	btn[i].setBackground(Color.DARK_GRAY);
	btn[i].setForeground(Color.ORANGE);
	btn[i].addActionListener(this);

	jf.add(btn[i]);

}
		btn[0].setSize(121, 50);
		btn[0].setLocation(10, 355);
		btn[0].setFont(new Font("Commic Sans", 0, 30));
		btn[0].setText("0");

		btn[1].setLocation(10, 304);
		btn[1].setSize(60, 50);
		btn[1].setFont(new Font("Commic Sans", 0, 30));
		btn[1].setText("1");

		btn[2].setLocation(71, 304);
		btn[2].setSize(60, 50);
		btn[2].setFont(new Font("Commic Sans", 0, 30));
		btn[2].setText("2");

		btn[3].setLocation(132, 304);
		btn[3].setSize(60, 50);
		btn[3].setFont(new Font("Commic Sans", 0, 30));
		btn[3].setText("3");

		btn[4].setSize(60, 50);
		btn[4].setLocation(10, 253);
		btn[4].setFont(new Font("Commic Sans", 0, 30));
		btn[4].setText("4");

		btn[5].setSize(60, 50);
		btn[5].setLocation(71, 253);
		btn[5].setFont(new Font("Commic Sans", 0, 30));
		btn[5].setText("5");

		btn[6].setSize(60, 50);
		btn[6].setLocation(132, 253);
		btn[6].setFont(new Font("Commic Sans", 0, 30));
		btn[6].setText("6");

		btn[7].setSize(60, 50);
		btn[7].setLocation(10, 202);
		btn[7].setFont(new Font("Commic Sans", 0, 30));
		btn[7].setText("7");

		btn[8].setSize(60, 50);
		btn[8].setLocation(71, 202);
		btn[8].setFont(new Font("Commic Sans", 0, 30));
		btn[8].setText("8");

		btn[9].setSize(60, 50);
		btn[9].setLocation(132, 202);
		btn[9].setFont(new Font("Commic Sans", 0, 30));
		btn[9].setText("9");

		btn[10].setLocation(132, 355);
		btn[10].setSize(60, 50);
		btn[10].setFont(new Font("Commic Sans", 0, 30));
		btn[10].setText(",");

		btn[11].setBackground(Color.ORANGE);
		btn[11].setForeground(Color.WHITE);
		btn[11].setLocation(193, 355);
		btn[11].setSize(60, 50);
		btn[11].setFont(new Font("Commic Sans", 0, 30));
		btn[11].setText("=");

		btn[12].setBackground(Color.ORANGE);
		btn[12].setForeground(Color.WHITE);
		btn[12].setSize(60, 50);
		btn[12].setLocation(193, 304);
		btn[12].setFont(new Font("Commic Sans", 0, 30));
		btn[12].setText("+");

		btn[13].setBackground(Color.ORANGE);
		btn[13].setForeground(Color.WHITE);
		btn[13].setSize(60, 50);
		btn[13].setLocation(193, 253);
		btn[13].setFont(new Font("Commic Sans", 0, 30));
		btn[13].setText("-");

		btn[16].setBackground(Color.ORANGE);
		btn[16].setForeground(Color.WHITE);
		btn[16].setSize(60, 50);
		btn[16].setLocation(193, 202);
		btn[16].setFont(new Font("Commic Sans", 0, 30));
		btn[16].setText("x");

		btn[17].setBackground(Color.ORANGE);
		btn[17].setForeground(Color.WHITE);
		btn[17].setSize(60, 50);
		btn[17].setLocation(193, 151);
		btn[17].setFont(new Font("Commic Sans", 0, 30));
		btn[17].setText("÷");

		btn[18].setBackground(Color.GRAY);
		btn[18].setForeground(Color.BLACK);
		btn[18].setSize(60, 50);
		btn[18].setLocation(10, 151);
		btn[18].setFont(new Font("Comic Sans", 0, 18));
		btn[18].setText("AC");

		btn[19].setBackground(Color.GRAY);
		btn[19].setForeground(Color.BLACK);
		btn[19].setSize(60, 50);
		btn[19].setLocation(71, 151);
		btn[19].setFont(new Font("Comic Sans", 0, 18));
		btn[19].setText("+/-");

		btn[20].setBackground(Color.GRAY);
		btn[20].setForeground(Color.BLACK);
		btn[20].setSize(60, 50);
		btn[20].setLocation(132, 151);
		btn[20].setFont(new Font("Commic Sans", 0, 22));
		btn[20].setText("%");


		tx =new JLabel();
		tx.setSize(242, 50);
		tx.setLocation(10, 47);
		tx.setFont(new Font("Commic Sans", 0, 30));
		tx.setVisible(true);
		tx.setText("");
		jf.add(tx);


	btnReset = new JButton("Reset");
	btnReset.setVisible(true);
	btnReset.setFocusPainted(true);
	btnReset.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed (ActionEvent e) {

//		Funktion.reset();



	}

	});


	draw = new Draw();
	draw.setBounds(0, 0, 270, 700);
	draw.setVisible(true);
	jf.add(draw);

	jf.setVisible(true);



}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (JButton jButton : btn) {




		if(e.getSource()==jButton)
			{Kette.add(jButton.getText());
			for (String string : Kette) {
				tx.setText(string);
			}
			}






	}
	}
}


