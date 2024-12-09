package multiplication.com.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	// GAME RULES
	private final int MAX_VALUE = 10;
	
	// GRAPHICAL USER INTERFACE COMPONENTS
	private JButton confirm;
	private JLabel numOutput;
	private JTextField input;
	private JLabel programOutput;
	
	// PROGRAM VARIABLES
	private int ans;
	private int num1, num2;
	
	public MainPanel () {
		initComp();
		setLSD();
		listen();
		addComp();
		
		nextNum();
		
	}
	
	public void nextNum () {
		num1 = (int)(Math.random()*MAX_VALUE+1);
		num2 = (int)(Math.random()*MAX_VALUE+1);
		numOutput.setText(num1+" * "+num2+"?");
	}
	
	private void listen () {
		confirm.addActionListener(this);
	}
	
	@Override
	public void actionPerformed (ActionEvent ae) {
		// IMPLEMENTS ALSO NEXT() METHOD
		
		// get user answer
		try {
			ans = Integer.parseInt(input.getText());
		} catch (NumberFormatException e) {
			System.out.println(e);
			return;
		}
		
		String out;
		if (num1*num2==ans) {
			// correct
			out = "correct";
			input.setText("");
			
			nextNum();
		} else {
			// incorrect
			
			out = "incorrect";
		}
		programOutput.setText(out);
	}
	
	private void setLSD () {
		super.setLayout(new FlowLayout());
	}
	
	private void addComp () {
		super.add(confirm);
		super.add(numOutput);
		super.add(input);
		super.add(programOutput);
	}
	
	private void initComp () {
		confirm = new JButton("confirm");
		numOutput = new JLabel();
		input = new JTextField(5);
		programOutput = new JLabel();
		
	}

}
