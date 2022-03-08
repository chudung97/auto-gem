package automation.testsuite;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import automation.common.ManageAccount;

public final class TS_EpicLogin extends automation.common.CommonBase{ 		
	@BeforeMethod
	public void init() {	
		driver = initDriverTest("app-release.apk");
	}
	@AfterMethod
	public void after() {
		quitDriver(driver);
	}
@Test 
 public void CA_1_Login_16(){click(By.xpath("//android.widget.EditText[@text='회사 �?�메�?��?� 입력해주세요']"));
getElementPresent(By.xpath("//android.webkit.WebView[@text='제조 고�? 매칭 서비스 - CAPA partners']"));}
@Test 
 public void CA_1_Login_17(){click(By.xpath("//android.widget.TextView[@text='비밀번호 재설정']"));
getElementPresent(By.xpath("//android.widget.TextView[@text='비밀번호를 재설정할 카파계정�?� �?�메�?�를 입력해 주세요.']"));}
@Test 
 public void CA_1_Login_18(){type(By.xpath("//android.view.ViewGroup[@enabled='false']"),"quannh1+1@gemvietnam",false);
type(By.xpath("//android.widget.EditText[@text='비밀번호를 입력해주세요']"),"quannh1@",false);
getElementPresent(By.xpath("//android.view.ViewGroup[@enabled='false']"));}
@Test 
 public void CA_1_Login_20(){type(By.xpath("//android.widget.EditText[@text='회사 �?�메�?��?� 입력해주세요']"),"quannh1+1@gemvietnam.com",false);
type(By.xpath("//android.widget.EditText[@text='비밀번호를 입력해주세요']"),"quannh1@",false);
click(By.xpath("//android.widget.TextView[@text='로그�?�']"));}
@Test 
 public void CA_1_Login_21(){type(By.xpath("//android.widget.EditText[@text='회사 �?�메�?��?� 입력해주세요']"),"abc@mailinator",false);
 
 }

@Test 
 public void CA_1_Login_22(){type(By.xpath("//android.widget.EditText[@text='회사 �?�메�?��?� 입력해주세요']"),"qazxsw@gmail.com",false);
type(By.xpath("//android.widget.EditText[@text='비밀번호를 입력해주세요']"),"0123456789",false);
click(By.xpath("//android.widget.TextView[@text='로그�?�']"));
}
 }