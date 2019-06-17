package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import keywords.Constants;
import keywords.keyword;

public class KesariTours {
	@FindBy(how=How.XPATH,using="//a[contains(text(),\"Login\")]")
	public static WebElement LoginPage;
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	public static WebElement Enetermailid;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	public static WebElement password;
	@FindBy(how=How.XPATH,using="//button[contains(text(),\"Login to Your Account\")]")
	public static WebElement loginButton;
	@FindBy(how=How.XPATH,using="//input[@class='form-control search-engine ng-pristine ng-valid ng-touched']")
	public static WebElement searchbox;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Speciality')]")
	public static WebElement Speciality;
	@FindBy(how=How.XPATH,using="//ul[@class=\"singlemenu list-unstyled mb-0\"]/li[6]/a")
	public static WebElement student_special;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Economy')]")
	public static WebElement Economy;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Tailormade')]")
	public static WebElement Tailormade;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'About Us')]")
	public static WebElement About_Us;
	
	
	public static void LoginPage()
	{
		LoginPage.click();
	}
	public static void Enetermailid(String emailid)
	{
		Enetermailid.sendKeys(emailid);
	}
	public static void password(String pass) {
		password.sendKeys(pass);
	}
	public static void loginButton() {
		loginButton.click();
	}
	public static void Speciality() {
		Actions action=new Actions(Constants.driver);
		action.moveToElement(Speciality).build().perform();
		student_special.click();
//		boolean b=student_special.isEnabled();
//		System.out.println(b);
	}
}
