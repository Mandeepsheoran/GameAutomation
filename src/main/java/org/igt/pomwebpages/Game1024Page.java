package org.igt.pomwebpages;

import org.igt.enums.WaitMethods;
import org.igt.pageactionutil.SeleniumPageActions;
import org.openqa.selenium.By;

public class Game1024Page {
	
	private static final By GAME_CONTAINER = By.className("game-container");
	private static final By BEST_CONTAINER = By.className("best-container");
	private static final By SCORE_CONTAINER = By.className("score-container");
	
	public  Game1024Page clickGameContainer(String fieldname) {
		SeleniumPageActions.actionClassClick(GAME_CONTAINER,WaitMethods.PRESENCE, fieldname);
		return this;
	}

}
