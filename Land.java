package monopoly;


public class Land{
	String name;					//�a�W
	boolean buy = false;			//�O�_�R
	int land_price;					//�a��
	int house_price;				//�л�
	int house;						//�Фl��
	int []pass_price = new int[4];	//�L���O
	Player landlord = new Player();	//�a�D
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
				System.out.println(player.name+"�R�F"+name);
			}
			else if(Buyland.buy==0)
				System.out.println("���R�ԭ�");
			else
				System.out.println("Debug��");
		}
/*		else if(landlord!=null)
		{
			player.money -= pass_price[house];
			landlord.money += pass_price[house];
			System.out.println(player.name+"�I"+pass_price[house]+"��"+name);
		}*/
		else
			System.out.println("�S���n�i���z�@��");
	}
	
	void pay(Player player)
	{
		player.money -= pass_price[house];
		landlord.money += pass_price[house];
		System.out.println(player.name+"�I"+pass_price[house]+"��"+name);
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
				System.out.println(player.name+"�b"+name+"�\�F�@�ɩФl");
			}
			else
				System.out.println("�S�����n�ˤj��     �Y   (^_^) �Y");
		}
		else
			System.out.println("�S���n�i���z�@��");
	}
/*	
	void owner(Player buyer)
	{
		landlord = buyer;
	}
*/
	
}
