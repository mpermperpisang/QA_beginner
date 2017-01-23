package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		HomePage home = new HomePage();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		home.DetailProduct(driver);
		home.BuyNow(driver);
		home.IconProduct(driver);
		home.PriceProduct(driver);
		home.UnitHeader(driver);
		home.Slider(driver);
		driver.close();
	}

}