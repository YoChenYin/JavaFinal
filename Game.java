package monopoly;

public class Game {
	public static int[] game(int position,int turns){
		Player []player = new Player[4] ;
		int []landstate = new int[50];	//0���X��  1��1�����a �H������
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
		
		land[0] = new Land("�_�I",0);
		land[1] = new Land("���ިt�]",2000);
		land[2] = new Land("�|�p�t�]",2000);
		land[3] = new Land("���j�֧Q��",2000);
		land[4] = new Land("��ިt�]",2000);
		land[5] = new Land("�u��t�]",2000);
		land[6] = new Land("�έp�t�]",2000);
		land[7] = new Land("�l��",2000);
		land[8] = new Land("�x��t�]",2000);
		land[9] = new Land("����t�]",2000);
		land[10] = new Land("���\��",2000);
		land[11] = new Land("�~��t�]",2000);
		land[12] = new Land("�Ƥu�t�]",2000);
		land[13] = new Land("�g��t�]",2000);
		land[14] = new Land("����t�]",2000);
		land[15] = new Land("���|",0);
		land[16] = new Land("�ľǨt�]",2000);
		land[17] = new Land("��Ǩt�]",2000);
		land[18] = new Land("�@�z�t�]",2000);
		land[19] = new Land("���j��|",2000);
		land[20] = new Land("�g�٨t�]",2000);
		land[21] = new Land("�R�B",0);
		land[22] = new Land("�߲z�t",2000);
		land[23] = new Land("�k�ߨt�]",2000);
		land[24] = new Land("�F�v�t�]",2000);
		land[25] = new Land("�l��",2000);
		land[26] = new Land("�q���t�]",2000);
		land[27] = new Land("��T�t�]",2000);
		land[28] = new Land("�_��",2000);
		land[29] = new Land("�ؿv�t�]",2000);
		land[30] = new Land("���p�t�]",2000);
		land[31] = new Land("���]�t�]",2000);
		land[32] = new Land("���\�U",2000);
		land[33] = new Land("��Өt�]",2000);
		land[34] = new Land("���|",2000);
		land[35] = new Land("�n�a�s��",2000);
		land[36] = new Land("���q�t�]",2000);
		land[37] = new Land("�t�Ψt�]",2000);
		land[38] = new Land("�ͭp�t�]",2000);
		land[39] = new Land("�ͬ�t�]",2000);
		land[40] = new Land("�Ӥl�J��",2000);
		land[41] = new Land("�G�@��",2000);
		land[42] = new Land("�t�]",2000);
		land[43] = new Land("�t�]",2000);
		land[44] = new Land("�t�]",2000);
		land[45] = new Land("�t�]",2000);
		land[46] = new Land("�t�]",2000);
		land[47] = new Land("�t�]",2000);
		land[48] = new Land("�t�]",2000);
		land[49] = new Land("�t�]",2000);
		

		if(yunpin>=10000)
			System.out.println("�����j�ӫس]���\");
		
		
		if(position==3)//�֧Q��
		{
			System.out.println("�w����{");
		}
		
		else if(position==7)//�l��
		{
			System.out.println("�o�o�Ѥץѳ��]");
		}
		
		else if(position==10||position==40)//���\�� �Ӥl
		{
			player[turns].money -= 2000;
			System.out.println("�P�±z������");
		}
		
		else if(position==15||position==21||position==34||position==43)//���|�R�B
		{
			Chance_Fate.ShowCard();
			if(Chance_Fate.getCard==0)	//�j�a����2000
			{
				player[turns].money += 6000;
				player[(turns+1)%4].money -= 2000;
				player[(turns+2)%4].money -= 2000;
				player[(turns+3)%4].money -= 2000;
			}
			else if(Chance_Fate.getCard==1)	//�ڵ��j�a1000
			{
				player[turns].money -= 3000;
				player[(turns+1)%4].money += 1000;
				player[(turns+2)%4].money += 1000;
				player[(turns+3)%4].money += 1000;
			}
			else if(Chance_Fate.getCard==2)	//���I
			{
				int avg=0,sum=0;
				for(int i = 0; i < 4; i++)
					sum += player[i].money;
				avg = sum / 4;
				for(int i = 0; i < 4; i++)
					player[i].money = avg;
			}
		}
		
		else if(position==19||position==28||position==32||position==35||position==45)//����
		{
			if(landstate[position]==0)	//�Ŧa
			{
				land[position].buy(player[turns]);
				if(land[position].buy)
					landstate[position]=turns+1;	//�ܧ�a�D
			}
			
			else //�I�L�I�O
			{
				land[position].pay(player[turns]);
			}
		}
		
		else if(position==41)//21��
		{
			System.out.println("�A�c�L�J����!");
		}
		
		else{	//��L�x
			if(position==4||position==5||position==6)
			{
				player[turns].money -= 2000;
				System.out.println("�P�±z�X��س]�����j��");
			}
			
			if(landstate[position] == 0)	//�Ŧa
			{
				System.out.println("321");
				land[position].buy(player[turns]);
				System.out.println("1234567");
				if(land[position].buy)
					landstate[position] = turns+1;	//�ܧ�a�D
			}
			else if(landstate[position] == turns+1)	//�a�D �ݭn���n�\��
			{
				land[position].build(player[turns]);
			}
			else //�I�L�I�O
			{
				land[position].pay(player[turns]);
			}
		}
		
		for(int i=0;i<4;i++)
			result[i]=player[i].money;
		
		return result;
	}
}
