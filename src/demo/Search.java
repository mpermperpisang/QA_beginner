package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	public void KolomSearch(WebDriver driver){
		WebElement pencarian = driver.findElement(By.cssSelector(".search"));
	}
}
