package monopoly;

public class Game {
	public static int[] game(int position,int turns){
		Player []player = new Player[4] ;
		int []landstate = new int[50];	//0未出售  1為1號玩家 以此類推
		int []result = new int[4];
		int yunpin = 0;
		
		Land []land = new Land[50];
		
		for(int i = 0;i < land.length;i++)
		{
			landstate[i] = 0;
		}
/*	
		for(int i =0 ;i< player.length;i++)
		{
			player[i] = new Player();
		}
*/
		player[0] = new Player("P1");
		player[1] = new Player("P2");
		player[2] = new Player("P3");
		player[3] = new Player("P4");
		
		land[0] = new Land("起點",0);
		land[1] = new Land("企管系館",2000);
		land[2] = new Land("會計系館",2000);
		land[3] = new Land("成大福利社",2000);
		land[4] = new Land("交管系館",2000);
		land[5] = new Land("工資系館",2000);
		land[6] = new Land("統計系館",2000);
		land[7] = new Land("郵局",2000);
		land[8] = new Land("台文系館",2000);
		land[9] = new Land("中文系館",2000);
		land[10] = new Land("成功湖",2000);
		land[11] = new Land("外文系館",2000);
		land[12] = new Land("化工系館",2000);
		land[13] = new Land("土木系館",2000);
		land[14] = new Land("機械系館",2000);
		land[15] = new Land("機會",0);
		land[16] = new Land("藥學系館",2000);
		land[17] = new Land("醫學系館",2000);
		land[18] = new Land("護理系館",2000);
		land[19] = new Land("成大醫院",2000);
		land[20] = new Land("經濟系館",2000);
		land[21] = new Land("命運",0);
		land[22] = new Land("心理系",2000);
		land[23] = new Land("法律系館",2000);
		land[24] = new Land("政治系館",2000);
		land[25] = new Land("郵局",2000);
		land[26] = new Land("電機系館",2000);
		land[27] = new Land("資訊系館",2000);
		land[28] = new Land("榕園",2000);
		land[29] = new Land("建築系館",2000);
		land[30] = new Land("都計系館",2000);
		land[31] = new Land("公設系館",2000);
		land[32] = new Land("成功廳",2000);
		land[33] = new Land("航太系館",2000);
		land[34] = new Land("機會",2000);
		land[35] = new Land("南榮廣場",2000);
		land[36] = new Land("測量系館",2000);
		land[37] = new Land("系統系館",2000);
		land[38] = new Land("生計系館",2000);
		land[39] = new Land("生科系館",2000);
		land[40] = new Land("太子宿舍",2000);
		land[41] = new Land("二一門",2000);
		land[42] = new Land("系館",2000);
		land[43] = new Land("系館",2000);
		land[44] = new Land("系館",2000);
		land[45] = new Land("系館",2000);
		land[46] = new Land("系館",2000);
		land[47] = new Land("系館",2000);
		land[48] = new Land("系館",2000);
		land[49] = new Land("系館",2000);
		

		if(yunpin>=10000)
			System.out.println("雲平大樓建設成功");
		
		
		if(position==3)//福利社
		{
			System.out.println("歡迎光臨");
		}
		
		else if(position==7)//郵局
		{
			System.out.println("油油由尤由陳因");
		}
		
		else if(position==10||position==40)//成功湖 太子
		{
			player[turns].money -= 2000;
			System.out.println("感謝您的捐款");
		}
		
		else if(position==15||position==21||position==34||position==43)//機會命運
		{
			Chance_Fate.ShowCard();
			if(Chance_Fate.getCard==0)	//大家給我2000
			{
				player[turns].money += 6000;
				player[(turns+1)%4].money -= 2000;
				player[(turns+2)%4].money -= 2000;
				player[(turns+3)%4].money -= 2000;
			}
			else if(Chance_Fate.getCard==1)	//我給大家1000
			{
				player[turns].money -= 3000;
				player[(turns+1)%4].money += 1000;
				player[(turns+2)%4].money += 1000;
				player[(turns+3)%4].money += 1000;
			}
			else if(Chance_Fate.getCard==2)	//均富
			{
				int avg=0,sum=0;
				for(int i = 0; i < 4; i++)
					sum += player[i].money;
				avg = sum / 4;
				for(int i = 0; i < 4; i++)
					player[i].money = avg;
			}
		}
		
		else if(position==19||position==28||position==32||position==35||position==45)//車站
		{
			if(landstate[position]==0)	//空地
			{
				land[position].buy(player[turns]);
				if(land[position].buy)
					landstate[position]=turns+1;	//變更地主
			}
			
			else //付過付費
			{
				land[position].pay(player[turns]);
			}
		}
		
		else if(position==41)//21門
		{
			System.out.println("你鋃鐺入獄啦!");
		}
		
		else{	//其他ㄉ
			if(position==4||position==5||position==6)
			{
				player[turns].money -= 2000;
				System.out.println("感謝您出資建設雲平大樓");
			}
			
			if(landstate[position] == 0)	//空地
			{
				System.out.println("321");
				land[position].buy(player[turns]);
				System.out.println("1234567");
				if(land[position].buy)
					landstate[position] = turns+1;	//變更地主
			}
			else if(landstate[position] == turns+1)	//地主 問要不要蓋房
			{
				land[position].build(player[turns]);
			}
			else //付過付費
			{
				land[position].pay(player[turns]);
			}
		}
		
		for(int i=0;i<4;i++)
			result[i]=player[i].money;
		
		return result;
	}
}
