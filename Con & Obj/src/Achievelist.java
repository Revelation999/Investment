import java.util.ArrayList;
public class Achievelist
	{
		public static ArrayList <Achievement> achList()
		{
			ArrayList <Achievement> achList = new ArrayList <Achievement>();
			achList.add(new Achievement ("First Bucket of Gold", "Make $50 ", false));
			achList.add(new Achievement ("Double the money", "Reach $2000", false));
			achList.add(new Achievement ("Corn Farmer", "Own 20 corn", false));
			achList.add(new Achievement ("Constructor", "Own 5 steel", false));
			achList.add(new Achievement ("Standard Oil", "Own 5 oil", false));
			achList.add(new Achievement ("Getting Richer", "Own 10 gold", false));
			achList.add(new Achievement ("Great Success", "Win the game", false));
			return achList;
		}
		public static void achieveCheck(ArrayList <Achievement> achList, ArrayList <Investment> goods, double money)
		{
			first(achList, money);
			second(achList, money);
			third(goods, achList);
			forth(goods, achList);
			fifth(goods, achList);
			sixth(goods, achList);
			seventh(achList, money);
			
		}
		public static void first(ArrayList <Achievement> achList, double money)
		{
			if (money >= 1050.00 && !achList.get(0).isGet())
				{
					achList.get(0).setGet(true);
					System.out.println("Achievement get: "+achList.get(0).getName());
				}
		}
		public static void second(ArrayList <Achievement> achList, double money)
			{
				if (money >= 2000.00 && !achList.get(1).isGet())
					{
						achList.get(1).setGet(true);
						System.out.println("Achievement get: "+achList.get(1).getName());
					}
			}
		public static void third(ArrayList <Investment> goods, ArrayList <Achievement> achList)
		{
			if (goods.get(0).getOwned() >= 20 && !achList.get(2).isGet())
				{
					achList.get(2).setGet(true);
					System.out.println("Achievement get: "+achList.get(2).getName());
				}
		}
		public static void forth(ArrayList <Investment> goods, ArrayList <Achievement> achList)
		{
			if (goods.get(4).getOwned() >= 5 && !achList.get(3).isGet())
				{
					achList.get(3).setGet(true);
					System.out.println("Achievement get: "+achList.get(3).getName());
				}
		}
		public static void fifth(ArrayList <Investment> goods, ArrayList <Achievement> achList)
		{
			if (goods.get(6).getOwned() >= 5 && !achList.get(4).isGet())
				{
					achList.get(4).setGet(true);
					System.out.println("Achievement get: "+achList.get(4).getName());
				}
		}
		public static void sixth(ArrayList <Investment> goods, ArrayList <Achievement> achList)
		{
			if (goods.get(5).getOwned() >= 10  && !achList.get(5).isGet())
				{
					achList.get(5).setGet(true);
					System.out.println("Achievement get: "+achList.get(5).getName());
				}
		}
		public static void seventh(ArrayList <Achievement> achList, double money)
			{
				if (money >= 10000.00 && !achList.get(6).isGet())
					{
						achList.get(6).setGet(true);
						System.out.println("Achievement get: "+achList.get(6).getName());
					}
			}
	}
