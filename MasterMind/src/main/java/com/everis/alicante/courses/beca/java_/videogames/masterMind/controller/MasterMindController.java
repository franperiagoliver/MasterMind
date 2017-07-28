package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller;

import java.util.Scanner;

import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.domain.CheckResultNumber;
import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.main.manager.MasterMindManager;

public abstract class MasterMindController {

	public abstract Integer getUserNumber();

	public abstract Integer getInitialNumber();

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void play() {
		MasterMindManager manager = new MasterMindManager(this.getUserNumber());
		CheckResultNumber resultNumber;

		do {
			int combination = this.getUserNumber();
			System.out.println("YOUR COMBINATION NUMBER IS " + combination);
			resultNumber = manager.checkNumber(combination);
			this.printMessage(resultNumber.toString());
		} while (!manager.isFinished(resultNumber));

		if (manager.isWinner(resultNumber)) {
			this.printMessage("YOU WIN! :D");
		} else {
			this.printMessage("YOU LOSE! :(");
		}

	}

}
