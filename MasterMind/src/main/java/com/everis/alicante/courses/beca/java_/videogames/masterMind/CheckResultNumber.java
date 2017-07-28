package com.everis.alicante.courses.beca.java_.videogames.masterMind;

public class CheckResultNumber {

	private int blackTab, whiteTab;

	public CheckResultNumber(int blackTab, int whiteTab) {

		this.blackTab = blackTab;
		this.whiteTab = whiteTab;

	}

	public int getBlackTab() {
		return blackTab;
	}

	public int getWhiteTab() {
		return whiteTab;
	}

	@Override
	public String toString() {

		return "YOUR RESULT: BLACK TABS=" + blackTab + ", WHITE TABS=" + whiteTab + "]";
	}

}
