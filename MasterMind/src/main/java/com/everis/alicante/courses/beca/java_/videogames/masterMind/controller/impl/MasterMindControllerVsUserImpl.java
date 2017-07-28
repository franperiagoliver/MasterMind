package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.impl;

import java.util.Scanner;

import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.MasterMindController;

public class MasterMindControllerVsUserImpl extends MasterMindController {

	@Override
	public Integer getUserNumber() {
		return this.getNumberFromConsole("INTRODUCE A COMBINATION NUMBER");
	}

	@Override
	public Integer getInitialNumber() {
		return this.getNumberFromConsole("INTRODUCE EL NUMERO INICIAL");
	}

	private Integer getNumberFromConsole(final String message) {
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

}
