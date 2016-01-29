package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String grtColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double grtPrice() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW-7";
	}

}
