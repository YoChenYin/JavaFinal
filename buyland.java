package monopoly;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class buyland {
	
	public static int buy;

	public static void main(){

		JFrame frame;
		frame = new JFrame("要不要買地?");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		JButton Yes = new JButton("Yes");
		JButton No = new JButton("No");
		
		
		frame.setVisible(true);
	}
}
