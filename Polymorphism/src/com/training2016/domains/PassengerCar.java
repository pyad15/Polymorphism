package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String grtColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double grtPrice() {
		// TODO Auto-generated method stub
		return 900000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

}
