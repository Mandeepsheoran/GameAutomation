package org.igt.gametesting;

import org.igt.annotations.FrameworkAnnotations;
import org.igt.basetest.WebBase;
import org.igt.driver.DriverManager;
import org.igt.enums.CategoryType;
import org.igt.enums.TestType;
import org.igt.pomwebpages.Game1024Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GameAutomation extends WebBase {

	@Test(description = "Play 1024 web game")
	@FrameworkAnnotations(author = "Ayush", category = CategoryType.REGRESSION, baseType = TestType.WEB)
	public void gameAuto() {
		WebElement gamecontainer = DriverManager.getDriver().findElement(By.className("game-container"));
		Actions actions = new Actions(DriverManager.getDriver());
		while (!DriverManager.getDriver().getPageSource().contains("Game over!")) {
			actions.moveToElement(gamecontainer).keyDown(Keys.ARROW_UP).click().build().perform();
			actions.moveToElement(gamecontainer).keyDown(Keys.ARROW_DOWN).click().build().perform();
			actions.moveToElement(gamecontainer).keyDown(Keys.ARROW_RIGHT).click().build().perform();
			actions.moveToElement(gamecontainer).keyDown(Keys.ARROW_LEFT).click().build().perform();
		}
		System.out.println("Game over!");
		WebElement bs = DriverManager.getDriver().findElement(By.className("best-container"));
		WebElement s = DriverManager.getDriver().findElement(By.className("score-container"));
		System.out.println("Best Score: " + bs.getText());
		System.out.println("Your Score: " + s.getText());
	}
}
