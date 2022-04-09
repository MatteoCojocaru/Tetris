import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameForm extends JFrame{
	
	public GameForm()
	{
		new JFrame();
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		//initComponents();
		this.add(new GameArea());
	}
	
	public static void main(String args[]) {
		
		//Create and display de form
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GameForm().setVisible(true);
			}
		});
	}
}
