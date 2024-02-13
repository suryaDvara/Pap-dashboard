package Pappom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dashboard.Baseclass;


public class Paplogin extends Baseclass {
	
	public WebDriver driver;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/editTextPhone")private WebElement Phoneno;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/checkBoxPrivacyPolicy")private WebElement acceptpp;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/buttonContinue")private WebElement continuep;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget."
			+ "CheckedTextView[1]")private WebElement pp;
	@FindBy(id="android:id/button1")private WebElement ok;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/editTextCode")private WebElement Otpverify;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/btnVerify")private WebElement verify;
	
	public WebElement getOtpverify() {
		return Otpverify;
	}


	public void setOtpverify(WebElement otpverify) {
		Otpverify = otpverify;
	}


	public WebElement getVerify() {
		return verify;
	}


	public void setVerify(WebElement verify) {
		this.verify = verify;
	}

public Paplogin(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

		
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(WebElement Phoneno) {
		this.Phoneno= Phoneno;
	}
	public WebElement getok() {
		return ok;
	}

	public void setok(WebElement ok) {
		this.ok= ok;

	
	}


	public WebElement getAcceptpp() {
		return acceptpp;
	}


	public void setAcceptpp(WebElement acceptpp) {
		this.acceptpp = acceptpp;
	}


	public WebElement getContinuep() {
		return continuep;
	}


	public void setContinuep(WebElement continuep) {
		this.continuep = continuep;
	}


	public WebElement getPp() {
		return pp;
	}


	public void setPp(WebElement pp) {
		this.pp = pp;
	}

	
}