package monopoly;


public class Land{
	String name;		//地名
	int land_price;		//地價
	int house;			//房子數
	int []pass_price = new int[4];	//過路費
	Player landlord = new Player();	//地主
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
				System.out.println(player.name+"買了"+name);
			}
			else
				System.out.println("不買");
		}
		else if(landlord!=null)
		{
			player.money -= pass_price[house];
			landlord.money += pass_price[house];
			System.out.println(player.name+"付"+pass_price[house]+"給"+name);
		}
		else
			System.out.println("沒錢不要裝大爺     凸   (^_^) 凸");
	}
/*	
	void owner(Player buyer)
	{
		landlord = buyer;
	}
*/
	
}
