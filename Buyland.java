package monopoly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buyland extends MouseAdapter implements ActionListener{
	
	public static int buy;

	public static void main(String[] args){

		JFrame frame;
		JPanel background;
		JLabel button1 , button2;
		frame = new JFrame("�n���n�R�a?");
		frame.setSize(750, 450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		
		/******�����I��*******/
		background = new JPanel(){
		Image image1 = new ImageIcon("buyornotbg.png").getImage();
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
			}
		};
		background.setLayout(null);
		frame.setContentPane(background);
		
		/********start button**********/
		button1 = new JLabel(new ImageIcon("buybt.png"));
		button1.setLocation(320, 310);
		button1.setSize(200, 200);
		button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				buy=1;
			}
				
		});
		
		/******exit button*******/
		button2 = new JLabel(new ImageIcon("notbuybt.png"));
		button2.setLocation(500, 390);
		button2.setSize(200, 200);
		button2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				buy=0;
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
