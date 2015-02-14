import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Window implements ActionListener{

	JFrame mainWindow;
	JButton submit;
	JButton exit;
	JLabel out;
	JTextField boxName;
	
	public void makeFrame(){
		mainWindow = new JFrame("Quiz4");
		mainWindow.setSize(400, 200);
		mainWindow.add(makeBorder());
		mainWindow.setVisible(true);
		
		
	}
	
	private JPanel makeBorder(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(makeText(), BorderLayout.WEST);
		panel.add(makeButtons(), BorderLayout.SOUTH);
		return panel;
		
		
	}
	
	private JPanel makeText(){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2,5,5));
		JLabel name = new JLabel("Enter name");
		panel.add(name);
		boxName = new JTextField();
		panel.add(boxName);
		out = new JLabel();
		panel.add(out);
		return panel;
	}
	
	private JPanel makeButtons(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		submit = new JButton("Submit");
		submit.addActionListener(this);
		panel.add(submit);
		exit = new JButton("Exit");
		exit.addActionListener(this);
		panel.add(exit);
		return panel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == submit){
			out.setText("Welcome," + boxName.getText());
		}
		if(source == exit){
			System.exit(0);
		}
		
	}

	


	
	
}
