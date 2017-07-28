package com.everis.alicante.courses.beca.java_.videogames.masterMind;

import java.util.Scanner;

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
