package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.domain;

public class CheckResultNumber {

	private int blackTab;
	private int whiteTab;

	public CheckResultNumber(final int blackTab, final int whiteTab) {

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
