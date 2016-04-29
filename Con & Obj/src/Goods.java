import java.util.ArrayList;

public class Goods
	{
		static ArrayList <Investment> goods = new ArrayList <Investment>();
		public static ArrayList createGoods()
		{
			goods.add(new Investment("Corn", 137.79, 7.5, 292.97, 351.27, 5));
			goods.add(new Investment("Rice", 341.96, 9.0, 46.8, 64.32, 0));
			goods.add(new Investment("Soybean", 330.68, 7.0, 386.2, 405.2, 0));
			goods.add(new Investment("Milk", 382.27, 8.0, 313.5, 501.5, 0));
			goods.add(new Investment("Steel", 621.18, 8.0, 521.6, 764.3, 0));
			goods.add(new Investment("Gold", 1523.71, 9.0, 35.6, 52.1, 0));
			goods.add(new Investment("Oil", 531.32, 8.0, 823.2, 1002.8, 0));
			return goods;
		}
		public static ArrayList <Boolean> priceChange(ArrayList <Investment> goods, ArrayList <Boolean> raise)
		{
			ArrayList <Boolean> change = new ArrayList <Boolean>();
			for (int i = 0; i < goods.size(); i++)
				{
					change.add(true);
				}
			for (int i = 0; i < goods.size(); i++)
				{
					if (raise.get(i))
						{
							int chance = (int)(Math.random()*3)+1;
							if (chance != 3)
								{
									goods.get(i).setPrice(goods.get(i).getPrice()*1.05);
									goods.get(i).setDemand(goods.get(i).getDemand()*1.05);
									change.set(i, true);
								}
							else
								{
									goods.get(i).setPrice(goods.get(i).getPrice()*0.95);
									goods.get(i).setDemand(goods.get(i).getDemand()*0.95);
									change.set(i, false);
								}
						}
					else if (!raise.get(i))
						{
							int chance = (int)(Math.random()*3)+1;
							if (chance == 3)
								{
									goods.get(i).setPrice(goods.get(i).getPrice()*1.05);
									goods.get(i).setDemand(goods.get(i).getDemand()*1.05);
									change.set(i, true);
								}
							else
								{
									goods.get(i).setPrice(goods.get(i).getPrice()*0.95);
									goods.get(i).setDemand(goods.get(i).getDemand()*0.95);
									change.set(i, false);
								}
						}
				}
			return change;
		}
		public static void qualChange(ArrayList <Investment> goods)
		{
			for (int i = 0; i < goods.size(); i++)
				{
					int chance = (int)(Math.random()*20)+1;
					if (chance == 5)
						{
							goods.get(i).setQuality(goods.get(i).getQuality()+0.5);
							goods.get(i).setQuality(Math.min(10, goods.get(i).getQuality()));
							goods.get(i).setPrice(goods.get(i).getPrice()*1.05);
						}
					else if (chance == 15)
						{
							goods.get(i).setQuality(goods.get(i).getQuality()-0.5);
							goods.get(i).setQuality(Math.max(0, goods.get(i).getQuality()));
							goods.get(i).setPrice(goods.get(i).getPrice()*0.95);
						}
				}
		}
	}
