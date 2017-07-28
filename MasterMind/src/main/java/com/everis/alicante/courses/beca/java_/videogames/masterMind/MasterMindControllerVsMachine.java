package com.everis.alicante.courses.beca.java_.videogames.masterMind;

public class MasterMindControllerVsMachine extends MasterMindController {

	@Override
	public Integer getUserNumber() {
		return Integer.valueOf((int) Math.random());
	}

	@Override
	public Integer getInitialNumber() {
		return (int) (Math.random() * 99999);
	}

}
