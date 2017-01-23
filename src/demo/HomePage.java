package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Header {
	public void DetailProduct(WebDriver driver){
		WebElement title = driver.findElement(By.cssSelector(".product_description>h2"));
		WebElement content = driver.findElement(By.cssSelector(".product_description>p"));
		WebElement moreinfo = driver.findElement(By.cssSelector(".product_description>p>a"));
	}
	
	public void IconProduct(WebDriver driver){
		WebElement icon = driver.findElement(By.cssSelector(".featured_image>a>img"));
	}
	
	public void PriceProduct(WebDriver driver){
		WebElement price = driver.findElement(By.cssSelector(".price>p"));
	}
	
	public void BuyNow(WebDriver driver){
		WebElement button = driver.findElement(By.cssSelector(".buynow>span"));
	}
	
	public void Slider(WebDriver driver){
		for(int i=1;i<=3;i++){
			driver.findElement(By.xpath(".//*[@id='slide_menu']/a["+i+"]"));
		}
	}
	
}