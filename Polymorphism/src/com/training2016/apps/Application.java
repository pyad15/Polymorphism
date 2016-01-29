package com.training2016.apps;

import com.training2016.domains.NewShowRoom;
import com.training2016.domains.ShowRoom;
import com.training2016.ifaces.Automobile;
public class Application {
	
	public static void main(String[] args) {
		
		NewShowRoom showRoom=new NewShowRoom();
		Automobile polyAuto=null;
		int key=1;
		polyAuto=showRoom.getItem(key);
		
		if(polyAuto!=null)
		{
			showRoom.printQuote(polyAuto);
			
		}
		else
		{
			System.out.println("Invalid option");
		}
		showRoom.printQuote(polyAuto);
	}
	
	
		
		
	}
		



