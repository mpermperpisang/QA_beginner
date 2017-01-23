package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Icon {
	public void Logo(WebDriver driver){
		boolean logo = driver.findElement(By.cssSelector("img[src='http://store.demoqa.com/wp-content/uploads/2014/08/Tools-QA-2.png']")).isEnabled();
	}
	
	public void IconCart(WebDriver driver){
		WebElement cart = driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/checkout/']/span[@class='icon']"));
	}
	
	public void IconPeople(WebDriver driver){
		WebElement people = driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/your-account/']/span[@class='icon']"));
	}	
	
}