package monopoly;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Chance_Fate {
	
	static int flag = 0;
	static int getCard;
/*	public Chance_Fate() {
		// TODO Auto-generated constructor stub
	}
*/
	public static void ShowCard() {
		// TODO Auto-generated method stub
		JFrame frame;
		JPanel background;
		JLabel ok;
		JLabel []card = new JLabel[3];
		JLabel []back = new JLabel[3];
		frame = new JFrame("Chance & Fate");
		frame.setSize(750,450);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		
		background = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Image image1 = new ImageIcon("pic/bg_nothing.png").getImage();
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
			}	
		};
		background.setLayout(null);
		frame.setContentPane(background);
		//Random
		Random rand = new Random(); 
		int n = rand.nextInt(2);
		/********card button**********/
		card[0] = new JLabel(new ImageIcon("pic/chance.png"));
		card[1] = new JLabel(new ImageIcon("pic/fate.png"));
		card[2] = new JLabel(new ImageIcon("pic/chance.png"));
		back[0] = new JLabel(new ImageIcon("pic/card0.png"));
		back[1] = new JLabel(new ImageIcon("pic/card1.png"));	
		back[2] = new JLabel(new ImageIcon("pic/card2.png"));	
		if(n!=0){
			card[n].setLocation(40, -10);
			card[3-n].setLocation(270, -10);
			card[0].setLocation(500, -10);
			back[n].setLocation(40, -10);
			back[3-1].setLocation(270, -10);
			back[0].setLocation(500, -10);
		}else{
			card[n+2].setLocation(40, -10);
			card[n].setLocation(270, -10);
			card[n+1].setLocation(500, -10);
			back[n+2].setLocation(40, -10);
			back[n].setLocation(270, -10);
			back[n+1].setLocation(500, -10);
		}
		card[0].setSize(200, 360);
		card[1].setSize(200, 360);
		card[2].setSize(200, 360);
		back[0].setSize(200, 360);
		back[1].setSize(200, 360);
		back[2].setSize(200, 360);
		
		ok = new JLabel(new ImageIcon("pic/ok.png"));
		ok.setLocation(330, 330);
		ok.setSize(80, 80);
		
		frame.add(card[0]);
		frame.add(card[1]);
		frame.add(card[2]);
		frame.add(ok);
		ok.setVisible(false);
		ok.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				frame.setVisible(false);
			}
				
		});
		
		card[0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(flag == 0){
				flag = 1;
				card[0].setVisible(false);
				frame.add(back[0]);	
				ok.setVisible(true);
				getCard = 0;
				}
			}
		});
		
		card[1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(flag == 0){
				flag = 1;
				card[1].setVisible(false);
				frame.add(back[1]);
				ok.setVisible(true);
				getCard = 1;
				}
			}
		});
		
		
		card[2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(flag == 0){
				flag = 1;
				card[2].setVisible(false);
				frame.add(back[2]);
				ok.setVisible(true);
				getCard = 2;
				}
			}
		});
		frame.setVisible(true);
	}
	}
