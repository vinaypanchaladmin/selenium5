package prcatice.Maven5;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Menytest extends Base {

	public WebDriver driver ;
	
	@Test
	public void mytest() throws InterruptedException, IOException {
		launch();
		this.driver = Base.driver;
		driver.get("https://jqueryui.com/");
		Menu m = new Menu();
		m.mstart();
				
		
		
	}
	

	public void droptest() throws InterruptedException {
		launch();
		this.driver = Base.driver;
		driver.get("https://jqueryui.com/");
		Menu m =new Menu();
		m.drop();
		
	}
	
}
