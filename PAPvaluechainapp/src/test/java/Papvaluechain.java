import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.Dashboard.Baseclass;
import com.Dashboard.Runner2;

import Pappom.Papmanager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.Manager;

public class Papvaluechain extends Baseclass {
		

	@Test
	public void testcase() throws IOException, Exception  {
		Logger  log=Logger.getLogger(Papvaluechain.class);

		Papmanager Pappom=new Papmanager(driver);
	//hide
	driver.hideKeyboard();

	//scroll
	//driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))"+".scrollIntoView(new UiSelector().text(\"SUBMIT\"))"));


	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//driver.hideKeyboard();
	//Thread.sleep(2000);
	driver.hideKeyboard();
    //Verify your number
	inputonElement(Pappom.get_Instance_phno().getPhoneno(),"9999999999");
	driver.hideKeyboard();
	clickonElement(Pappom.get_Instance_phno().getAcceptpp());
	clickonElement(Pappom.get_Instance_phno().getContinuep());
	
	//Partner
	clickonElement(Pappom.get_Instance_phno().getPp());
	clickonElement(Pappom.get_Instance_phno().getok());
	
	//Verification
	inputonElement(Pappom.get_Instance_phno().getOtpverify(),"123456");
	driver.hideKeyboard();
	Thread.sleep(1000);
	clickonElement(Pappom.get_Instance_phno().getVerify());
	
	//Usersetting
	Thread.sleep(2000);
	clickonElement(Pappom.get_Instance_usersetting().getUsersetting1());
	clickonElement(Pappom.get_Instance_usersetting().getup());
	clickonElement(Pappom.get_Instance_usersetting().getusedit());
	clickonElement(Pappom.get_Instance_usersetting().getUsername());
	inputonElement(Pappom.get_Instance_usersetting().getUsername(),"Dvara");
	inputonElement(Pappom.get_Instance_usersetting().getOrgs(),"Dvara");
	clickonElement(Pappom.get_Instance_usersetting().getUpdetails());
	//langtamil
	clickonElement(Pappom.get_Instance_usersetting().getus1());
	clickonElement(Pappom.get_Instance_usersetting().gettamil());
	clickonElement(Pappom.get_Instance_usersetting().gettr1());
	clickonElement(Pappom.get_Instance_usersetting().gettok2());
	//lang guja
	
	
	
	
	
	}

}