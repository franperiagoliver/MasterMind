package main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.main;

import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.MasterMindController;
import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.MasterMindControllerFactory;
import main.java.com.everis.alicante.courses.beca.java_.videogames.masterMind.controller.impl.MasterMindControllerVsUserImpl;
import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

public class MasterMindMain {

	public static void main(String[] args) {
		MasterMindController controller = new MasterMindControllerVsUserImpl();
		Menu subMenu1 = MenuBuilder.createSubMenu("MASTERMIND - PLAY ON THE MACHINE", 1)
				.addSimpleOption(1, "PLAY VS MACHINE").addSimpleOption(2, "PLAY ONLINE AS SERVER")
				.addSimpleOption(3, "PLAY ONLINE AS CLIENT").addExitOption(0, "EXIT").build();
		Menu mainMenu = MenuBuilder.createMainMenu("WELCOME TO MASTERMIND").addSubMenuOption("PLAY!", subMenu1)
				.addExitOption(0, "Exit").build();

		String menuOption;
		
		do {
			menuOption = (mainMenu.play());
			MasterMindController masterMindController = MasterMindControllerFactory.getInstance(menuOption);
			if (masterMindController != null) {
				masterMindController.play();
			}
		} while (!menuOption.equals("0"));
	}
}
