package monopoly;


public class Land{
	String name;		//�a�W
	int land_price;		//�a��
	int house;			//�Фl��
	int []pass_price = new int[4];	//�L���O
	Player landlord = new Player();	//�a�D
	Player player = new Player();
	
	Land(String name,int price)
	{
		this.name = name;
		land_price = price;
	}
	
	void buy(Player player)
	{
		if(player.money >= land_price && landlord==null)
		{
			if(buyland.buy==1)
			{
				player.money -= land_price;
				landlord = player;
				System.out.println(player.name+"�R�F"+name);
			}
			else
				System.out.println("���R");
		}
		else if(landlord!=null)
		{
			player.money -= pass_price[house];
			landlord.money += pass_price[house];
			System.out.println(player.name+"�I"+pass_price[house]+"��"+name);
		}
		else
			System.out.println("�S�����n�ˤj��     �Y   (^_^) �Y");
	}
/*	
	void owner(Player buyer)
	{
		landlord = buyer;
	}
*/
	
}
