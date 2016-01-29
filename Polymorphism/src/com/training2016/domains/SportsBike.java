package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String grtColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double grtPrice() {
		// TODO Auto-generated method stub
		return 4000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Baleno";
	}

}
