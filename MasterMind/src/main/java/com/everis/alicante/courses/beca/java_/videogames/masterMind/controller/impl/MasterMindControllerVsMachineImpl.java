package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.impl;

import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.MasterMindController;

public class MasterMindControllerVsMachineImpl extends MasterMindController {

	@Override
	public Integer getUserNumber() {
		return Integer.valueOf((int) Math.random());
	}

	@Override
	public Integer getInitialNumber() {
		return (int) (Math.random() * 99999);
	}

}
