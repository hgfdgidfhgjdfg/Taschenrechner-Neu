import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Draw extends JLabel {
	
	private static final long serialVersionVID = 1L;
	
	protected void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//draw///
		
		//Vertikal
		
		g.setColor(Color.BLACK);
		g.drawLine(9, 405, 9, 150);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 405, 70, 150);
		
		g.setColor(Color.BLACK);
		g.drawLine(131, 405, 131, 150);
		
		g.setColor(Color.BLACK);
		g.drawLine(192, 405, 192, 150);
		
		g.setColor(Color.BLACK);
		g.drawLine(253, 405, 253, 150);
		
		
		
		//Horizontal
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 405, 252, 405);
			
		g.setColor(Color.BLACK);
		g.drawLine(10, 354, 252, 354);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 303, 252, 303);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 252, 252, 252);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 201, 252, 201);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 150, 252, 150);
		
		
		
		//Fenster
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 125, 252, 125);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 15, 252, 15);


		
		
		
		
		
		
		
	}

}
