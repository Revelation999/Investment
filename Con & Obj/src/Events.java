import java.util.ArrayList;
import java.util.Scanner;
public class Events
	{
		public static void recession(ArrayList <Investment> goods)
		{
			int chance = (int)(Math.random()*100)+1;
			if (chance == 25)
				{
					System.out.println("There has been a recession in the market.");
					for (int i = 0; i < goods.size(); i++)
						{
							goods.get(i).setDemand(goods.get(i).getDemand()*0.5);
							goods.get(i).setPrice(goods.get(i).getPrice()*0.5);
						}
				}
		}
		public static void pollution(ArrayList <Investment> goods)
		{
			int chance = (int)(Math.random()*30)+1;
			if (chance == 15)
				{
					System.out.println("Pollution in farming areas.");
					for (int i = 0; i < 4; i++)
						{
							goods.get(i).setQuality(goods.get(i).getQuality()-2);
							goods.get(i).setQuality(Math.max(0, goods.get(i).getQuality()));
							goods.get(i).setSupply(goods.get(i).getSupply()*0.8);
							goods.get(i).setPrice(goods.get(i).getPrice()*0.8);
						}
				}
		}
		public static void ecoBoom(ArrayList <Investment> goods)
		{
			int chance = (int)(Math.random()*40)+1;
			if (chance == 20)
				{
					System.out.println("Economic Boom!");
					for (int i = 0; i < goods.size(); i++)
						{
							goods.get(i).setDemand(goods.get(i).getDemand()*1.2);
							goods.get(i).setPrice(goods.get(i).getPrice()*1.2);
						}
				}
		}
		public static void technique(ArrayList <Investment> goods)
		{
			int chance = (int)(Math.random()*20)+1;
			if (chance == 10)
				{
					System.out.println("We have developed a new mining technique.");
					for (int i = 4; i < goods.size(); i++)
						{
							goods.get(i).setQuality(goods.get(i).getQuality()+2);
							goods.get(i).setQuality(Math.min(10, goods.get(i).getQuality()));
							goods.get(i).setPrice(goods.get(i).getPrice()*1.2);
							goods.get(i).setSupply(goods.get(i).getSupply()*1.2);
						}
				}
		}
	}
