package keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.KesariTours;
import io.github.bonigarcia.wdm.WebDriverManager;


public class keyword {
	//To Open a Broweser
	public static void openbrowser() {
		WebDriverManager.chromedriver().setup();
		Constants.driver=new ChromeDriver();
	}
	
	//Set implicit wait
	public static void manageWait() {
	Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

}
