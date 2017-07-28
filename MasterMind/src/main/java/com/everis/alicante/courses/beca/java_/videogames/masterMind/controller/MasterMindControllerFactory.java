package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller;

import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.impl.MasterMindControllerVsMachineImpl;
import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.impl.MasterMindControllerVsUserImpl;

public class MasterMindControllerFactory {

	public static MasterMindController getInstance(final String menuOption) {
		switch (menuOption) {
		case "1.1":
			return new MasterMindControllerVsMachineImpl();
		case "1.2":
			return new MasterMindControllerVsUserImpl();
		default:
			return null;
		}
	}

}
