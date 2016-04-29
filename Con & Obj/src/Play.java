import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
public class Play
	{
		static ArrayList <Boolean> raise = new ArrayList <Boolean>();
		static double money = 1000.00;
		static Scanner userInput = new Scanner (System.in);
		static boolean play = true;
		static boolean win = false;
		static ArrayList <Investment> goods = Goods.createGoods();
		static ArrayList <Achievement> achList = Achievelist.achList();
		static int debt = 0;
		public static void main(String[] args)
			{
				DecimalFormat df = new DecimalFormat("#####.##");
				for (int i = 0; i < goods.size(); i++)
					{
						raise.add(true);
					}
				while (play)
					{
						System.out.println("Money = "+df.format(money));
						System.out.printf("%-10s", "Item");
						System.out.printf("%-10s", "Price");
						System.out.printf("%-10s", "Demand");
						System.out.printf("%-10s", "Supply");
						System.out.printf("%-10s", "Quality");
						System.out.printf("%-10s", "Owned");
						System.out.println();
						    for (Investment i : goods)
						    	{
								    System.out.printf("%-10s", i.getGood());
								    System.out.printf("$%,-10.2f", i.getPrice());
								    System.out.printf("%-10.2f", i.getDemand());
								    System.out.printf("%-10.2f", i.getSupply());
								    System.out.printf("%-10.1f", i.getQuality());
								    System.out.printf("%-10d", i.getOwned());
								    System.out.println();
						    	}
						    System.out.println("What do you want to do? Buy or Sell?");
						    Scanner userInput2 = new Scanner (System.in);
						    String dothing = userInput2.nextLine();
						    switch (dothing)
						    {
						    	case "buy":
						    	{
						    		buyIn();
						    		break;
						    	}
						    	case "sell":
						    			{
						    				sellOut();
						    				break;
						    			}
						    	case "quit":
						    			{
						    				play = false;
						    				System.out.println("Thanks for playing.");
						    				break;
						    			}
						    	default:
						    			{
						    				System.out.println("Nothing to be done? You had some debt now.");
						    				debt = debt+1;
						    				break;
						    			}
						    }
							raise = Goods.priceChange(goods, raise);
							Goods.qualChange(goods);
							Events.ecoBoom(goods);
							Events.pollution(goods);
							Events.recession(goods);
							Events.technique(goods);
							Achievelist.achieveCheck(achList, goods, money);
							if (debt > 0)
								{
									debt++;
									System.out.println("You are in debt! Do something!" + (5-debt) + " turns until bankrupt.");
								}
							else
								{                                                                                                                                                                                                                                                               
									debt = Math.min(debt, 0);
								}
							if (debt == 5)
								{
									System.out.println("Bankrupt!!!!");
									play = false;
								}
							if (money == 10000)
								{
									System.out.println("You won!");
									play = false;
								}
					}
				System.out.println("Achievements: ");
				for (Achievement a : achList)
					{
						System.out.println(a.getName()+"     "+a.getDescription()+"      "+a.isGet());
					}
			}
		public static void buyIn()
		{
			System.out.println("What do you want to buy?");
			Scanner userInput3 = new Scanner (System.in);
			String buy = userInput3.nextLine();
			int select = 10;
			for (int i = 0; i < goods.size(); i++)
				{
					if (buy.equalsIgnoreCase(goods.get(i).getGood()))
						{
							select = i;
						}
				}
			if (select == 10)
				{
					System.out.println("Goods not available.");
				}
			else
				{
			System.out.println("Type an integer for numbers to buy.");
			int num = userInput.nextInt();
			if (num*goods.get(select).getPrice() > money)
				{
					System.out.println("Can't afford.");
				}
			else
				{
					goods.get(select).setOwned(goods.get(select).getOwned()+num);
					money = money - num*goods.get(select).getPrice();
				}
				}
		}
		public static double twoDecimal(double number)
		{
			double num = Math.round(number*100)/100;
			return num;
		}
		public static void sellOut()
		{
			System.out.println("What do you want to sell?");
			Scanner userInput4 = new Scanner (System.in);
			String sell = userInput4.nextLine();
			int select = 10;
			for (int i = 0; i < goods.size(); i++)
				{
					if (sell.equalsIgnoreCase(goods.get(i).getGood()))
						{
							select = i;
						}
				}
			if (select == 10)
				{
					System.out.println("Goods not available.");
				}
			else
				{
					System.out.println("Type an integer for numbers to sell.");
					int num = userInput.nextInt();
					if (num > goods.get(select).getOwned())
						{
							System.out.println("Not enough stuff to sell.");
						}
					else
						{
							goods.get(select).setOwned(goods.get(select).getOwned()-num);
							money = money+num*goods.get(select).getPrice();
						}
				}
		}

	}
