package monopoly;

public class TrainStation extends Land{

	TrainStation(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	int station=0;
	int []pass_price = new int[6];
	
	void buy()
	{
		if(player.money >= land_price)
		{
			Buyland.buyornot(1);
			if(Buyland.buy==1)
			{
				player.money -= land_price;
				landlord = player;
				System.out.println(player.name+"買了"+name);
			}
			else if(Buyland.buy==0)
				System.out.println("沒錢不要裝大爺     凸   (^_^) 凸");
		}
		else
			System.out.println("沒錢好可憐ㄋ一ㄡ");
	}
	
	void pay()
	{
		player.money -= pass_price[station];
		landlord.money += pass_price[station];
		System.out.println(player.name+"付"+pass_price[station]+"給"+name);
	}

}
