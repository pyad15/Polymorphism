package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class NewShowRoom extends ShowRoom{
		
		public Automobile getItem(int key)
		{
			if(key==4)
			{
				return new SportsBike();
			}
			else
			{
				return super.getItem(key);
			}
			
			}
			

	}

