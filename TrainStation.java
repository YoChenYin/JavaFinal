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
				System.out.println(player.name+"�R�F"+name);
			}
			else if(Buyland.buy==0)
				System.out.println("�S�����n�ˤj��     �Y   (^_^) �Y");
		}
		else
			System.out.println("�S���n�i���z�@��");
	}
	
	void pay()
	{
		player.money -= pass_price[station];
		landlord.money += pass_price[station];
		System.out.println(player.name+"�I"+pass_price[station]+"��"+name);
	}

}
