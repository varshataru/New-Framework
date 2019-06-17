package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.KesariTours;
import keywords.Constants;
import keywords.keyword;

public class SignUp {
	@Test
	private void logIn() {
		keyword.openbrowser();
		Constants.driver.get("https://www.kesari.in/Bonanza?utm_source=google&utm_medium=search&utm_campaign=bonanza%20feb%2019&gclid=EAIaIQobChMI88eg9KrE4AIVTQ4rCh3lvAJnEAAYASAAEgKMZPD_BwE");
		KesariTours page=PageFactory.initElements(Constants.driver, KesariTours.class);
		page.Speciality();
//		page.LoginPage();
//		keyword.manageWait();
//		page.Enetermailid("varshataru17@gmail.com");
//		page.password("1234567");
//		page.loginButton();
	}
}
