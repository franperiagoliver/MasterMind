package com.everis.alicante.courses.beca.java_.videogames.masterMind;

public class MasterMindControllerFactory {

	public static MasterMindController getInstance(final String menuOption) {
		switch (menuOption) {
		case "1.1":
			return new MasterMindControllerVsMachine();
		case "1.2":
			return new MasterMindControllerVsUserImpl();
		default:
			return null;
		}
	}

}
