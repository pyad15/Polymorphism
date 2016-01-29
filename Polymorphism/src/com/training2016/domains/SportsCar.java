package com.training2016.domains;

import com.training2016.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String grtColor() {
		// TODO Auto-generated method stub
		return "Green";
	}

	@Override
	public double grtPrice() {
		// TODO Auto-generated method stub
		return 300000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "HondaCity";
	}

}
