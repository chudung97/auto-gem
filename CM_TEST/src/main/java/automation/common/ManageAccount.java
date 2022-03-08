package automation.common;

import org.openqa.selenium.WebDriver;

import static automation.common.TestLogger.*;
import static automation.constant.CT_Account.*;

/**
 * @author lientm
 * @date 18-Nov-2014
 */
public class ManageAccount extends CommonBase {
	
	public ManageAccount (WebDriver dr) {
		driver = dr;
	}
	
	/**
	 * login to system
	 * @param user
	 * @param pass
	 */
	public void login(String user, String pass){
		type(ELEMENT_USERNAME_TEXTBOX, user, true);
		type(ELEMENT_PASSWORD_TEXTBOX, pass, true);
		info("Login vao he thong voi user " + user);
		click(ELEMENT_LOGIN_BUTTON);
		waitForPageLoaded(driver);
	}
	
	/**
	 * logout system
	 */
	public void logout(){
		mouseOver(ELEMENT_LOGOUT_LINK, true);
		click(ELEMENT_LOGOUT_LINK);
		getElementPresent(ELEMENT_USERNAME_TEXTBOX);
	}
}
