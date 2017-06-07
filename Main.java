package monopoly;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Main extends MouseAdapter implements ActionListener {
	JPanel background1,background2,background3;
	
	JFrame frame;
	JLabel button1, button2;
	
	JFrame frame2;
	JMenu Game, Set, Help;
	JMenuBar bar;
	JMenuItem item1, item2, item3, item4, item5, item6;
	JLabel[] pic = new JLabel[6];
	JLabel[] character = new JLabel[6];
	JLabel start_btn;
	JLabel player1_btn,player2_btn,player3_btn,player4_btn;
	JLabel[] player_text= new JLabel[4];
	JLabel[] player1 = new JLabel[6];
	JLabel[] player2 = new JLabel[6];
	JLabel[] player3 = new JLabel[6];
	JLabel[] player4 = new JLabel[6];
	int selected=0;
	int j,picnum = 0;
	int p1_char=0,p2_char=0,p3_char=0,p4_char=0;
	
	JFrame frame3; 
	JLabel[] tmp = new JLabel[4]; 
	JLabel[] char_pic = new JLabel[4];
	int num;
	JLabel toss;
	Random ran ;
	int toss_num;
	int[] position = new int[4] ;
	int turns;
	int[] jail = new int[4] ;
	int[] money = new int[4];
	public static void main(String[] args) {
		new Main();
		
	}

	public Main() {
		
		/*****開始的視窗**************************************************************************/
		frame = new JFrame("成為大富翁");
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		/******視窗背景*******/
		background1 = new JPanel(){
			Image image1 = new ImageIcon("pic/start.png").getImage();

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
			}
		};
		background1.setLayout(null);
		frame.setContentPane(background1);
		
		/********start button**********/
		button1 = new JLabel(new ImageIcon("pic/startbtn.png"));
		button1.setLocation(300, 380);
		button1.setSize(170, 120);
		button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				frame2.setVisible(true);
			}
				
		});
		
		/******exit button*******/
		button2 = new JLabel(new ImageIcon("pic/exitbtn.png"));
		button2.setLocation(560, 400);
		button2.setSize(130, 95);
		button2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
				
		});
		/********* add *************/
		frame.add(button1);
		frame.add(button2);
		
		/**********選角畫面*******************************************************************************************/
		
		frame2 = new JFrame("角色選取");
		frame2.setSize(1500, 850);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLayout(null);
		frame2.getContentPane().setBackground(new Color(255, 204, 0));
		
		start_btn = new JLabel(new ImageIcon("pic/startbtn_1.png"));
		start_btn.setLocation(780, 80);
		start_btn.setSize(480, 300);
		start_btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ImageIcon pic1 = new ImageIcon("pic/char1_b.png");
				ImageIcon pic2 = new ImageIcon("pic/char2_b.png");
				ImageIcon pic3 = new ImageIcon("pic/char3_b.png");
				ImageIcon pic4 = new ImageIcon("pic/char4_b.png");
				ImageIcon pic5 = new ImageIcon("pic/char5_b.png");
				ImageIcon pic6 = new ImageIcon("pic/char6_b.png");
				
				ImageIcon state1 = new ImageIcon("pic/player1.png");
				ImageIcon state2 = new ImageIcon("pic/player3.png");
				ImageIcon state3 = new ImageIcon("pic/player5.png");
				ImageIcon state4 = new ImageIcon("pic/player2.png");
				ImageIcon state5 = new ImageIcon("pic/player4.png");
				ImageIcon state6 = new ImageIcon("pic/player6.png");
				switch(p1_char) { 
		           case 1: 
		        	   char_pic[0].setIcon(pic1);
		        	   tmp[0].setIcon(state1);
			           break;
		           case 2: 
		        	   char_pic[0].setIcon(pic2);
		        	   tmp[0].setIcon(state2);
		               break; 
		           case 3: 
		        	   char_pic[0].setIcon(pic3);
		        	   tmp[0].setIcon(state3);
		               break; 
		           case 4: 
		        	   char_pic[0].setIcon(pic4);
		        	   tmp[0].setIcon(state4);
		               break; 
		           case 5: 
		        	   char_pic[0].setIcon(pic5);
		        	   tmp[0].setIcon(state5);
		               break; 
		           case 6: 
		        	   char_pic[0].setIcon(pic6);
		        	   tmp[0].setIcon(state6);
		               break;  
		        
				}
				switch(p2_char) { 
		           case 1: 
		        	   char_pic[1].setIcon(pic1);
		        	   tmp[1].setIcon(state1);
			           break;
		           case 2: 
		        	   char_pic[1].setIcon(pic2);
		        	   tmp[1].setIcon(state2);
		               break; 
		           case 3: 
		        	   char_pic[1].setIcon(pic3);
		        	   tmp[1].setIcon(state3); 
		               break; 
		           case 4: 
		        	   char_pic[1].setIcon(pic4);
		        	   tmp[1].setIcon(state4);
		               break; 
		           case 5: 
		        	   char_pic[1].setIcon(pic5);
		        	   tmp[1].setIcon(state5);
		               break; 
		           case 6: 
		        	   char_pic[1].setIcon(pic6);
		        	   tmp[1].setIcon(state6);
		               break;  
		        
				}
				switch(p3_char) { 
		           case 1: 
		        	   char_pic[2].setIcon(pic1);
		        	   tmp[2].setIcon(state1);
			           break;
		           case 2: 
		        	   char_pic[2].setIcon(pic2);
		        	   tmp[2].setIcon(state2);
		               break; 
		           case 3: 
		        	   char_pic[2].setIcon(pic3);
		        	   tmp[2].setIcon(state3);
		               break; 
		           case 4: 
		        	   char_pic[2].setIcon(pic4);
		        	   tmp[2].setIcon(state4);
		               break; 
		           case 5: 
		        	   char_pic[2].setIcon(pic5);
		        	   tmp[2].setIcon(state5);
		               break; 
		           case 6: 
		        	   char_pic[2].setIcon(pic6);
		        	   tmp[2].setIcon(state6);
		               break;  
		        
				}
				switch(p4_char) { 
		           case 1:
		        	   char_pic[3].setIcon(pic1);
		        	   tmp[3].setIcon(state1);
			           break;
		           case 2: 
		        	   char_pic[3].setIcon(pic2);
		        	   tmp[3].setIcon(state2);
		               break; 
		           case 3: 
		        	   char_pic[3].setIcon(pic3);
		        	   tmp[3].setIcon(state3);
		               break; 
		           case 4: 
		        	   char_pic[3].setIcon(pic4);
		        	   tmp[3].setIcon(state4);
		               break; 
		           case 5: 
		        	   char_pic[3].setIcon(pic5);
		        	   tmp[3].setIcon(state5);
		               break; 
		           case 6: 
		        	   char_pic[3].setIcon(pic6);
		        	   tmp[3].setIcon(state6);
		               break;  
		        
				}
				
				frame2.setVisible(false);
				frame3.setVisible(true);
			}
				
		});
		start_btn.setVisible(false);

		Game = new JMenu("Game");
		item1 = new JMenuItem("return");
		item2 = new JMenuItem("exit");
		item1.setActionCommand("i1");
		item1.addActionListener(this);
		item2.setActionCommand("i2");
		item2.addActionListener(this);
		Set = new JMenu("Set");
		item3 = new JMenuItem("new game");
		item4 = new JMenuItem("restart");
		item3.setActionCommand("i3");
		item3.addActionListener(this);
		item4.setActionCommand("i4");
		item4.addActionListener(this);
		Help = new JMenu("Help");
		item5 = new JMenuItem("Welcome");
		item6 = new JMenuItem("About us");
		item5.setActionCommand("i5");
		item5.addActionListener(this);
		item6.setActionCommand("i6");
		item6.addActionListener(this);
		Set.add(item3);
		Set.add(item4);
		Help.add(item5);
		Help.add(item6);
		Game.add(item1);
		Game.add(item2);
		bar = new JMenuBar();
		bar.setBackground(Color.WHITE);
		bar.add(Game);
		bar.add(Set);
		bar.add(Help);

		
		pic[0] = new JLabel(new ImageIcon("pic/char1n.png"));
		pic[1] = new JLabel(new ImageIcon("pic/char2n.png"));
		pic[2] = new JLabel(new ImageIcon("pic/char3n.png"));
		pic[3] = new JLabel(new ImageIcon("pic/char4n.png"));
		pic[4] = new JLabel(new ImageIcon("pic/char5n.png"));
		pic[5] = new JLabel(new ImageIcon("pic/char6n.png"));
		
		for (int i = 0; i < 3; i++) {
			pic[i].setLayout(null);
			pic[i].setLocation(20, 15+i*215);
			pic[i].setSize(255, 200);
			if(i==1){
				pic[i].setLocation(55, 15+i*215);
				pic[i].setSize(215, 260);
			}		
			if(i==2){
				pic[i].setLocation(55, 15+i*240);
				pic[i].setSize(215, 260);
			}
			pic[i].setVisible(true);
		}
		for (int i = 3; i < 6; i++) {
			pic[i].setLayout(null);
			pic[i].setLocation(300, 15+(i-3)*215);
			pic[i].setSize(255, 200);
			if(i==4){
				pic[i].setLocation(295, 15+(i-3)*215);
				pic[i].setSize(215, 260);
			}
			if(i==5){
				pic[i].setLocation(280, 15+(i-3)*240);
				pic[i].setSize(290, 260);
			}
			pic[i].setVisible(true);
		}
		
		character[0] = new JLabel(new ImageIcon("pic/detail1.png"));
		character[1] = new JLabel(new ImageIcon("pic/detail2.png"));
		character[2] = new JLabel(new ImageIcon("pic/detail3.png"));
		character[3] = new JLabel(new ImageIcon("pic/detail4.png"));
		character[4] = new JLabel(new ImageIcon("pic/detail5.png"));
		character[5] = new JLabel(new ImageIcon("pic/detail6.png"));
		for (int i = 0; i < 6; i++) {
			character[i].setLayout(null);
			character[i].setLocation(650,20);
			character[i].setSize(750, 400);
			//character[i].setBorder(BorderFactory.createLineBorder(Color.red));
			character[i].setVisible(false);
		}
		character[0].setVisible(true);
		
		
		pic[0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=0;
				character[0].setVisible(true);
			}
		});
		pic[1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=1;
				character[1].setVisible(true);
			}
		});
		pic[2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=2;
				character[2].setVisible(true);
			}
		});
		pic[3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=3;
				character[3].setVisible(true);
			}
		});
		pic[4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=4;
				character[4].setVisible(true);
			}
		});
		pic[5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				character[picnum].setVisible(false);
				picnum=5;
				character[5].setVisible(true);
			}
		});
		
		player1_btn=new JLabel(new ImageIcon("pic/player1_btn.png"));
		player2_btn=new JLabel(new ImageIcon("pic/player2_btn.png"));
		player3_btn=new JLabel(new ImageIcon("pic/player3_btn.png"));
		player4_btn=new JLabel(new ImageIcon("pic/player4_btn.png"));
		
		player1_btn.setSize(170,80);
		player1_btn.setLocation(650, 445);
		player1_btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				player1[picnum].setVisible(true);
				player1_btn.setVisible(false);
				player_text[0].setVisible(true);
				p1_char=picnum+1;
				selected++;
				if(selected==4){
					for (int i = 0; i < 6; i++) {
						character[i].setVisible(false);
					}
					start_btn.setVisible(true);
				}
			}
		});
		
		player2_btn.setSize(150,60);
		player2_btn.setLocation(850, 455);
		player2_btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				player2[picnum].setVisible(true);
				player2_btn.setVisible(false);
				player_text[1].setVisible(true);
				p2_char=picnum+1;
				selected++;
				if(selected==4){
					for (int i = 0; i < 6; i++) {
						character[i].setVisible(false);
					}
					start_btn.setVisible(true);
				}
			}
		});
		
		player3_btn.setSize(150,60);
		player3_btn.setLocation(1050, 455);
		player3_btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				player3[picnum].setVisible(true);
				player3_btn.setVisible(false);
				player_text[2].setVisible(true);
				p3_char=picnum+1;
				selected++;
				if(selected==4){
					for (int i = 0; i < 6; i++) {
						character[i].setVisible(false);
					}
					start_btn.setVisible(true);
				}
			}
		});
		
		player4_btn.setSize(150,60);
		player4_btn.setLocation(1250, 455);
		player4_btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				player4[picnum].setVisible(true);
				player4_btn.setVisible(false);
				player_text[3].setVisible(true);
				p4_char=picnum+1;
				selected++;
				if(selected==4){
					for (int i = 0; i < 6; i++) {
						character[i].setVisible(false);
					}
					start_btn.setVisible(true);
				}
			}
		});
		
		player_text[0]= new JLabel(new ImageIcon("pic/ready.png"));
		player_text[1]= new JLabel(new ImageIcon("pic/ready.png"));
		player_text[2]= new JLabel(new ImageIcon("pic/ready.png"));
		player_text[3]= new JLabel(new ImageIcon("pic/ready.png"));
		for (int i = 0; i < 4; i++) {
			//player_text[i].setFont(new Font("Dialog",1,26));
			player_text[i].setLayout(null);
			player_text[i].setLocation(650+200*i, 450);
			player_text[i].setSize(150,60);
			//player_text[i].setBorder(BorderFactory.createLineBorder(Color.red));
			player_text[i].setVisible(false);
		}
		
		player1[0] = new JLabel(new ImageIcon("pic/char1_s.png"));
		player1[1] = new JLabel(new ImageIcon("pic/char2_s.png"));
		player1[2] = new JLabel(new ImageIcon("pic/char3_s.png"));
		player1[3] = new JLabel(new ImageIcon("pic/char4_s.png"));
		player1[4] = new JLabel(new ImageIcon("pic/char5_s.png"));
		player1[5] = new JLabel(new ImageIcon("pic/char6_s.png"));
		
		player2[0] = new JLabel(new ImageIcon("pic/char1_s.png"));
		player2[1] = new JLabel(new ImageIcon("pic/char2_s.png"));
		player2[2] = new JLabel(new ImageIcon("pic/char3_s.png"));
		player2[3] = new JLabel(new ImageIcon("pic/char4_s.png"));
		player2[4] = new JLabel(new ImageIcon("pic/char5_s.png"));
		player2[5] = new JLabel(new ImageIcon("pic/char6_s.png"));
		
		player3[0] = new JLabel(new ImageIcon("pic/char1_s.png"));
		player3[1] = new JLabel(new ImageIcon("pic/char2_s.png"));
		player3[2] = new JLabel(new ImageIcon("pic/char3_s.png"));
		player3[3] = new JLabel(new ImageIcon("pic/char4_s.png"));
		player3[4] = new JLabel(new ImageIcon("pic/char5_s.png"));
		player3[5] = new JLabel(new ImageIcon("pic/char6_s.png"));
		
		player4[0] = new JLabel(new ImageIcon("pic/char1_s.png"));
		player4[1] = new JLabel(new ImageIcon("pic/char2_s.png"));
		player4[2] = new JLabel(new ImageIcon("pic/char3_s.png"));
		player4[3] = new JLabel(new ImageIcon("pic/char4_s.png"));
		player4[4] = new JLabel(new ImageIcon("pic/char5_s.png"));
		player4[5] = new JLabel(new ImageIcon("pic/char6_s.png"));
		
		for (int i = 0; i < 6; i++) {
			player1[i].setLayout(null);
			player1[i].setLocation(650,520);
			player1[i].setSize(160, 180);
			player1[i].setVisible(false);
		}
		for (int i = 0; i < 6; i++) {
			player2[i].setLayout(null);
			player2[i].setLocation(850,520);
			player2[i].setSize(160, 180);
			player2[i].setVisible(false);
		}
		for (int i = 0; i < 6; i++) {
			player3[i].setLayout(null);
			player3[i].setLocation(1050,520);
			player3[i].setSize(160, 180);
			player3[i].setVisible(false);
		}
		for (int i = 0; i < 6; i++) {
			player4[i].setLayout(null);
			player4[i].setLocation(1250,520);
			player4[i].setSize(160, 180);
			player4[i].setVisible(false);
		}
		
		/****** add *****************/
		frame2.add(start_btn);
		frame2.setJMenuBar(bar);
		frame2.add(pic[0]);
		frame2.add(pic[1]);
		frame2.add(pic[2]);
		frame2.add(pic[3]);
		frame2.add(pic[4]);
		frame2.add(pic[5]);
		frame2.add(character[0]);
		frame2.add(character[1]);
		frame2.add(character[2]);
		frame2.add(character[3]);
		frame2.add(character[4]);
		frame2.add(character[5]);
		frame2.add(player1_btn);
		frame2.add(player2_btn);
		frame2.add(player3_btn);
		frame2.add(player4_btn);
		frame2.add(player1[0]);
		frame2.add(player1[1]);
		frame2.add(player1[2]);
		frame2.add(player1[3]);
		frame2.add(player1[4]);
		frame2.add(player1[5]);
		frame2.add(player2[0]);
		frame2.add(player2[1]);
		frame2.add(player2[2]);
		frame2.add(player2[3]);
		frame2.add(player2[4]);
		frame2.add(player2[5]);
		frame2.add(player3[0]);
		frame2.add(player3[1]);
		frame2.add(player3[2]);
		frame2.add(player3[3]);
		frame2.add(player3[4]);
		frame2.add(player3[5]);
		frame2.add(player4[0]);
		frame2.add(player4[1]);
		frame2.add(player4[2]);
		frame2.add(player4[3]);
		frame2.add(player4[4]);
		frame2.add(player4[5]);
		frame2.add(player_text[0]);
		frame2.add(player_text[1]);
		frame2.add(player_text[2]);
		frame2.add(player_text[3]);

		/************遊戲畫面*****************************************************************************************/
		frame3 = new JFrame("遊戲中");
		frame3.setSize(1700, 900);
		frame3.setLocationRelativeTo(null);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setLayout(null);

		background3 = new JPanel() {
			Image image3 = new ImageIcon("pic/game.png").getImage();

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image3, 0, 0, getWidth(), getHeight(), this);
			}
		};
		background3.setLayout(null);
		frame3.setContentPane(background3);
		
		turns=1;
		for (int i = 0; i < 4; i++) {
			position[i]=0;
			jail[i]=0;
		}
		
		for (int i = 0; i < 4; i++) {
			tmp[i]= new JLabel();
			tmp[i].setLayout(null);
			tmp[i].setLocation(10+310*i,10);
			tmp[i].setSize(300, 150);
			//tmp[i].setBorder(BorderFactory.createLineBorder(Color.red));
			frame3.add(tmp[i]);
		}
		
		for (int i = 0; i < 4; i++) {
			char_pic[i]=new JLabel();
			char_pic[i].setLayout(null);
			char_pic[i].setLocation(480+10*i, 200);
			char_pic[i].setSize(90,100);
			//char_pic[i].setBorder(BorderFactory.createLineBorder(Color.red));
			char_pic[i].setVisible(true);
			frame3.add(char_pic[i]);
		}
//		Game play = new Game();
		for (int i = 0; i < 4; i++) {
			money[i]=10000;
		}
		ran = new Random();
		toss = new JLabel(new ImageIcon("pic/toss.png"));
		toss.setLocation(300, 380);
		toss.setSize(170, 120);
		toss.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println(turns);
				toss_num=ran.nextInt(11)+2;
				if(jail[turns-1]==0){
					position[turns-1]=position[turns-1]+toss_num;
					if(position[turns-1]>50){
						position[turns-1]=position[turns-1]-50;
					}
				}
				else{
					jail[turns-1]--;
				}
				if(position[turns-1]==41){
					jail[turns-1]=2;
				}
				
				System.out.println(turns +" : "+ position[turns-1]+"  ");
				money = monopoly.Game.game(position[turns-1],turns-1);
				System.out.println("1:"+money[0]+" 2:"+money[1]+" 3:"+money[2]+" 4:"+money[3]);
				turns++;
				if(turns>4) turns=1;
				
			}
				
		});
		frame3.add(toss);
		frame.setVisible(true);
		frame2.setVisible(false);
		frame3.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		/*if (cmd == "p1") {
			player1[picnum].setVisible(true);
			player1_btn.setVisible(false);
			player_text[0].setVisible(true);
			p1_char=picnum+1;
			selected++;
			if(selected==4){
				for (int i = 0; i < 6; i++) {
					character[i].setVisible(false);
				}
				start_btn.setVisible(true);
			}
			
		}
		if (cmd == "p2") {
			player2[picnum].setVisible(true);
			player2_btn.setVisible(false);
			player_text[1].setVisible(true);
			p2_char=picnum+1;
			selected++;
			if(selected==4){
				for (int i = 0; i < 6; i++) {
					character[i].setVisible(false);
				}
				start_btn.setVisible(true);
			}
		}
		if (cmd == "p3") {
			player3[picnum].setVisible(true);
			player3_btn.setVisible(false);
			player_text[2].setVisible(true);
			p3_char=picnum+1;
			selected++;
			if(selected==4){
				for (int i = 0; i < 6; i++) {
					character[i].setVisible(false);
				}
				start_btn.setVisible(true);
			}
		}
		if (cmd == "p4") {
			player4[picnum].setVisible(true);
			player4_btn.setVisible(false);
			player_text[3].setVisible(true);
			p4_char=picnum+1;
			selected++;
			if(selected==4){
				for (int i = 0; i < 6; i++) {
					character[i].setVisible(false);
				}
				start_btn.setVisible(true);
			}
		}*/
	}

}

class AdapterDemo extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
