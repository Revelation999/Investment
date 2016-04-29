public class Investment
	{
		private String good;
		private double price;
		private double quality;
		private double demand;
		private double supply;
		private int owned;
		public Investment(String g, double p, double q, double d, double s, int o)
		{
			good = g;
			price = p;
			quality = q;
			demand = d;
			supply = s;
			owned = o;
		}
		public String getGood()
			{
				return good;
			}
		public void setGood(String good)
			{
				this.good = good;
			}
		public double getPrice()
			{
				return price;
			}
		public void setPrice(double price)
			{
				this.price = price;
			}
		public double getQuality()
			{
				return quality;
			}
		public void setQuality(double quality)
			{
				this.quality = quality;
			}
		public double getDemand()
			{
				return demand;
			}
		public void setDemand(double demand)
			{
				this.demand = demand;
			}
		public double getSupply()
			{
				return supply;
			}
		public void setSupply(double supply)
			{
				this.supply = supply;
			}
		public int getOwned()
			{
				return owned;
			}
		public void setOwned(int owned)
			{
				this.owned = owned;
			}
	}
