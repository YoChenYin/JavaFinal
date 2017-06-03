package monopoly;

public class Main {
	public static void main(String[] args, String[] p ){
		String []landname = {};
		Player []player = new Player[4] ;
		
		
		Land land[] = new Land[50];
		for(int i = 0;i < land.length;i++)
		{
			
		}
	
		for(int i =0 ;i< player.length;i++)
		{
			player[i] = new Player();
		}
		player[0].name = p[0];
		player[1].name = p[1];
		player[2].name = p[2];
		player[3].name = p[3];
	}
}
