package monopoly;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Labar {
	
	static int flag = 0;
	public Labar() {
		// TODO Auto-generated constructor stub
	}

	public static void labar() {
		// TODO Auto-generated method stub
		JFrame frame;
		JPanel background;
		frame = new JFrame("LaBar");
		frame.setSize(360,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		background = new JPanel(){
			Image image1 = new ImageIcon("pic/Labar/slots.gif").getImage();
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
			}	
		};
		background.setLayout(null);
		frame.setContentPane(background);
		
		//stop
		JLabel tin = new JLabel();
		tin = new JLabel(new ImageIcon("pic/Labar/tin.png"));
		tin.setLocation(116,285);
		tin.setSize(100,100);
		frame.add(tin);
		
		//step
		JLabel []step = new JLabel[13];
		step[0] = new JLabel(new ImageIcon("pic/Labar/la0.png"));
		step[1] = new JLabel(new ImageIcon("pic/Labar/la1.png"));
		step[2] = new JLabel(new ImageIcon("pic/Labar/la2.png"));
		step[3] = new JLabel(new ImageIcon("pic/Labar/la3.png"));
		step[4] = new JLabel(new ImageIcon("pic/Labar/la4.png"));
		step[5] = new JLabel(new ImageIcon("pic/Labar/la5.png"));
		step[6] = new JLabel(new ImageIcon("pic/Labar/la6.png"));
		step[7] = new JLabel(new ImageIcon("pic/Labar/la7.png"));
		step[8] = new JLabel(new ImageIcon("pic/Labar/la8.png"));
		step[9] = new JLabel(new ImageIcon("pic/Labar/la9.png"));
		step[10] = new JLabel(new ImageIcon("pic/Labar/la10.png"));
		step[11] = new JLabel(new ImageIcon("pic/Labar/la11.png"));
		step[12] = new JLabel(new ImageIcon("pic/Labar/la12.png"));
		for(int i=0;i<13;i++)
		{
			step[i].setLocation(73, 112);
			step[i].setSize(194, 170);
			frame.add(step[i]);
			step[i].setVisible(false);
		}
		//Random
		Random rand = new Random(); 
		int n = rand.nextInt(12);
		tin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {		
				step[n].setVisible(true);
			}
				
		});		
	
		frame.setVisible(true);
	}
}