package monopoly;


public class Land{
	String name;					//地名
	boolean buy = false;			//是否買
	int land_price;					//地價
	int house_price;				//房價
	int house;						//房子數
	int []pass_price = new int[4];	//過路費
	Player landlord = new Player();	//地主
	Player player = new Player();

	
	Land(String name,int price)
	{
		this.name = name;
		land_price = price;
	}
	
	public void buy(Player player)
	{
		System.out.println("123");
		if(player.money >= land_price)
		{
			Buyland.buyornot();
			if(Buyland.buy==1)
			{
				player.money -= land_price;
				landlord = player;
				buy=true;
				System.out.println(player.name+"買了"+name);
			}
			else if(Buyland.buy==0)
				System.out.println("不買拉倒");
			else
				System.out.println("Debug啦");
		}
/*		else if(landlord!=null)
		{
			player.money -= pass_price[house];
			landlord.money += pass_price[house];
			System.out.println(player.name+"付"+pass_price[house]+"給"+name);
		}*/
		else
			System.out.println("沒錢好可憐ㄋ一ㄡ");
	}
	
	void pay(Player player)
	{
		player.money -= pass_price[house];
		landlord.money += pass_price[house];
		System.out.println(player.name+"付"+pass_price[house]+"給"+name);
	}
	
	void build(Player player)
	{
		if(player.money >= house_price)
		{
			Buildhouse.buildornot();
			if(Buildhouse.build)
			{
				player.money -= house_price;
				house++;
				System.out.println(player.name+"在"+name+"蓋了一棟房子");
			}
			else
				System.out.println("沒錢不要裝大爺     凸   (^_^) 凸");
		}
		else
			System.out.println("沒錢好可憐ㄋ一ㄡ");
	}
/*	
	void owner(Player buyer)
	{
		landlord = buyer;
	}
*/
	
}
