import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameArea extends JPanel
{
	private int GridRows;
	private int gridColums;
	private int gridCellSize;
	
	
	public GameArea() {
		this.setBounds(100, 50, 300, 600);
		this.setBackground(Color.red);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillRect(0, 0, 50, 50);
		
	}
}
