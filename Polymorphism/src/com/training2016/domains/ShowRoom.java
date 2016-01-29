package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class ShowRoom {
	
	public Automobile getItem(int key)
	{
		switch (key) {
		case 1:
		
			return new PassengerCar();
		case 2:
			return new LuxuryCar();
		case 3:
			 return new SportsCar();		
		default:
			return null;
		}
		
	}
	/**
	 * 
	 * @param polyAuto takes the object of automobile
	 * 
	 * Methods prints the quotation of product selected
	 */
		public void printQuote(Automobile polyAuto)
		{
			System.out.println("====Qoutation======");
			System.out.println("Model :="+polyAuto.getModel());
			System.out.println("Color :="+polyAuto.grtColor());
			System.out.println("Price :="+polyAuto.grtPrice());
		}
	

}
