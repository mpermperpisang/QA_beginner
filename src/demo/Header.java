package demo;

import org.openqa.selenium.WebDriver;

public class Header {
	public void UnitHeader(WebDriver driver){
		Icon elemen_icon = new Icon();
		Menu elemen_menu = new Menu();
		Search elemen_search = new Search();
		
		elemen_icon.Logo(driver);
		elemen_icon.IconCart(driver);
		elemen_icon.IconPeople(driver);
		elemen_menu.MenuHome(driver);
		elemen_menu.MenuAllProduct(driver);
		elemen_menu.MenuNoTitle(driver);
		elemen_menu.MenuProductCategory(driver);
		elemen_search.KolomSearch(driver);
	}
}