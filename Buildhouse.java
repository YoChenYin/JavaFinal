package monopoly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Buildhouse extends MouseAdapter implements ActionListener{
	
	public static boolean build;

	public static void buildornot(){

		JFrame frame;
		JPanel background;
		JLabel button1 , button2;
		frame = new JFrame("要不要蓋房子?");
		frame.setSize(666, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		
		/******視窗背景*******/
		background = new JPanel(){
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		Image image1 = new ImageIcon("pic/buildornotbg.png").getImage();
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
			}
		};
		background.setLayout(null);
		frame.setContentPane(background);
		
		/********start button**********/
		button1 = new JLabel(new ImageIcon("pic/buildbt.png"));
		button1.setLocation(166, 260);
		button1.setSize(80, 80);
		button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				build=true;
			}
				
		});
		
		/******exit button*******/
		button2 = new JLabel(new ImageIcon("pic/notbuildbt.png"));
		button2.setLocation(420, 260);
		button2.setSize(80, 80);
		button2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				build=false;
			}
				
		});
		/********* add *************/
		frame.add(button1);
		frame.add(button2);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
