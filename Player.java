package monopoly;

import java.lang.Math;

public class Player {
	String name;			//���a�W
	int money = 10000;		//��
	int bank_money = 10000; //�Ȧ��
	int position = 0;		//��m
	
	Player(String name)
	{
		this.name = name;
	}
	
	Player(){}
	
	void go()	//�e�i
	{
		position += (int)(Math.random()*12)+1;
		if(position>=56)	//�g�L�_�I
		{
			position -= 56;	
			money += 5000;	//��+5000
		}
		return;
	}
/*	
	void pay_money(Land land)	//�I�L���O
	{
		money -= land.pass_price[land.house];
		land.landlord.money += land.pass_price[land.house];
		System.out.println(name+"�I"+land.pass_price[land.house]+"��"+land.name);
	}
*/
}
