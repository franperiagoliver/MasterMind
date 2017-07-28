package com.everis.alicante.courses.beca.java_.videogames.masterMind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MasterMindManager {

	private int remainingsAttemps = 10;
	private List<Integer> attemptedNumbers = new ArrayList<Integer>();
	private Integer initialNumber;

	MasterMindManager(Integer number) {

		this.initialNumber = number;
	}

	public CheckResultNumber checkNumber(final Integer number) {

		if (this.isValidNumber(number)) {
			this.attemptedNumbers.add(number);
			this.remainingsAttemps--;
			int whiteTab = 0;
			int blackTab = 0;

			String numberToStringJ1 = String.valueOf(initialNumber);
			String[] StringSplitJ1 = numberToStringJ1.split("");
			String numberToStringJ2 = String.valueOf(number);
			String[] StringSplitJ2 = numberToStringJ2.split("");

			for (int i = 0; i < StringSplitJ1.length; i++) {
				for (int j = 0; j < StringSplitJ2.length; j++) {
					if (StringSplitJ1[i].equals(StringSplitJ2[j])) {
						if (i == j) {
							blackTab++;
						} else {
							whiteTab++;
						}
					}
				}
			}
			return new CheckResultNumber(blackTab, whiteTab);
		}
		return null;

	}

	public Boolean isFinished(final CheckResultNumber resultNumber) {
		return this.remainingsAttemps == 0 || this.isWinner(resultNumber);
	}

	public Boolean isWinner(final CheckResultNumber resultNumber) {
		return resultNumber.getBlackTab() == 5;
	}

	private Boolean isValidNumber(final Integer number) {
		MasterMindController controller = new MasterMindControllerVsUserImpl();
			
		while (!(number >= 0 && number <= 99999)) {
				System.out.println("NOT VALID NUMBER! IT MUST HAVE 5 DIGITS.");
				controller.play();
			}
		return true;
	}

}
