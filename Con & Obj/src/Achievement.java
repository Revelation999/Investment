public class Achievement
	{
		private String name;
		private String description;
		private boolean get;
		public Achievement(String n, String d, boolean g)
		{
			name = n;
			description = d;
			get = g;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getDescription()
			{
				return description;
			}
		public void setDescription(String description)
			{
				this.description = description;
			}
		public boolean isGet()
			{
				return get;
			}
		public void setGet(boolean get)
			{
				this.get = get;
			}
	}
