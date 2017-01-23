package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
	public void MenuHome(WebDriver driver){
		WebElement home = driver.findElement(By.cssSelector("#menu-item-15>a"));
	}
	
	public void MenuProductCategory(WebDriver driver){
		WebElement product = driver.findElement(By.cssSelector("#menu-item-33>a"));
	}
	
	public void MenuNoTitle(WebDriver driver){
		WebElement notitle = driver.findElement(By.cssSelector("#menu-item-16>a"));
	}
	
	public void MenuAllProduct(WebDriver driver){
		WebElement allproduct = driver.findElement(By.cssSelector("#menu-item-72>a"));
	}
	
}