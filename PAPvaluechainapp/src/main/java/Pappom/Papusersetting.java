package Pappom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dashboard.Baseclass;

public class Papusersetting extends Baseclass {
	public WebDriver driver;
	public Papusersetting(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

    }	

	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"More options\"]")private WebElement Usersetting1;
		
		public WebDriver getDriver() {
			return driver;
		}

	public WebElement getUsersetting1() {
		return Usersetting1;
	}
	public void setUsersetting1(WebElement Usersetting1) {
		this.Usersetting1 =Usersetting1;
	}
	public WebElement getusedit() {
		return usedit;
	}
	public void setusedit(WebElement usedit) {
		this.usedit = usedit;
	}
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")private WebElement up;	
	public WebElement getup() {
		return up;
	}

	public void setup(WebElement up) {
		this.up = up;
	}

	@FindBy(id="com.DvaraEDairy.fposasdev:id/EditDetails")private WebElement usedit;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/name")private WebElement Username;


	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	} 
	
	
	@FindBy(id="com.DvaraEDairy.fposasdev:id/Organization")private WebElement orgs;
	
	public WebElement getOrgs() {
		return orgs;
	}

	public void setOrgs(WebElement orgs) {
		this.orgs = orgs;
	}

	@FindBy(id="com.DvaraEDairy.fposasdev:id/UpdateDetails")private WebElement updetails;



	public WebElement getUpdetails() {
		return updetails;
	}

	public void setUpdetails(WebElement updetails) {
		this.updetails = updetails;
	}
	
	//setlanguagetamil
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"More options\"]")private WebElement us1;
	public WebElement getus1() {
		return us1;
	}

	public void setus1(WebElement us1) {
		this.us1 = us1;
	}

	public WebElement gettamil() {
		return tamil;
	}

	public void setTamil(WebElement tamil) {
		this.tamil = tamil;
	}

	public WebElement gettr1() {
		return tr1;
	}

	public void settr1(WebElement tr1) {
		this.tr1 = tr1;
	}
	public WebElement gettok2() {
		return tok2;
	}

	public void setTr1(WebElement tok2) {
		this.tok2 = tok2;
	}
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]"
			+ "/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")private WebElement tamil;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[7]")private WebElement tr1;
	@FindBy(id="com.DvaraEDairy.fposasdev:id/dialog_OK")private WebElement tok2;
	
	//lang2guja
  @FindBy(xpath="//android.widget.ImageView[@content-desc=\"More options\"]")private WebElement us2;
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")private WebElement gujarathi;
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]")private WebElement g1;
  @FindBy(id="com.DvaraEDairy.fposasdev:id/dialog_OK")private WebElement gok2;
	

/*
	
	
	
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//Hindi
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[4]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//kanada

	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[5]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//Marathi
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[6]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//Telugu
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[8]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//english
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
	//Refresh
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	//driver.findElement(By.xpath("")).click();
	//customer support
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/closeicon")).click();

	//version
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	WebElement version= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
	version.getText();
	version.click();
	//logout
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
	@FindBy(xpath="")private WebElement Username;
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	@FindBy(xpath="")private WebElement Username;

	public WebElement getUsersetting1() {
		// TODO Auto-generated method stub
		return null;
	}
	driver.findElement(By.id("android:id/button1")).click();
*/
}
