package com.study.test.services.test2Service.impl

import com.study.test.services.test2Service.Country;

public class Australia implements Country{
	String capital
	long population
	@Override
	public long getPopulation() {
		return population;
	}

	@Override
	public String getCapital() {
		return capital;
	}
	
	String toString() {
		return "Australia[Capital=" + capital + ", Population=" + population + "]"
	}

}
