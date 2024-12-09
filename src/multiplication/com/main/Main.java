package multiplication.com.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("nultiplication");
		
		MainPanel mp = new MainPanel();
		mp.setSize(new Dimension(200,200));
		
		f.setContentPane(mp);
		
		f.setLocationRelativeTo(null);
		f.setSize(200,200);
		f.setVisible(true);

	}

}
