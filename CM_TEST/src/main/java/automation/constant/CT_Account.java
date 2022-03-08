package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
	public static By ELEMENT_USERNAME_TEXTBOX = By.id("username");
	public static By ELEMENT_PASSWORD_TEXTBOX = By.id("password");
	public static By ELEMENT_LOGIN_BUTTON = By.id("btnLogin");
	//public static By ELEMENT_LOGIN_BUTTON = By.xpath("//input[@value='�?ĂNG NHẬP']");
	public static By ELEMENT_LOGOUT_ICON = By.xpath("//*[text()='Logout']/../../..");
	public static By ELEMENT_LOGOUT_LINK = By.xpath("//*[text()='Logout']/..");
	
}
