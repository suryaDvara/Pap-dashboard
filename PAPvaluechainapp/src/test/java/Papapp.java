import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Papapp {
public static AndroidDriver driver;
public static DesiredCapabilities caps;
public static void readPropertiesfile(){ 
	Properties prop=new Properties();
try {
InputStream input=new FileInputStream("C:\\Users\\Surya.m\\eclipse-workspace\\Dashboard\\src\\main\\java\\com\\testdata\\property\\Configuration.properties");

prop.load(input);
prop.getProperty("URL");
System.out.println(prop.getProperty("URL"));
}catch(Exception e) {
	e.printStackTrace();
}
}







@Test
public void testcase() throws IOException, Exception  {

DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");



caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sumsung");
caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
caps.setCapability(MobileCapabilityType.UDID, "RZCT80JRFPY");
caps.setCapability("enableCameraImageInjection", "true");



caps.setCapability("PackageName", "com.DvaraEDairy.fposasdev");
caps.setCapability("appActivity", "com.DvaraEDairy.fposasdev");
URL UI = new URL("http://0.0.0.0:4723/wd/hub");
driver = new AndroidDriver(UI, caps);
driver.getDeviceTime();
driver.activateApp("com.DvaraEDairy.fposasdev");

//hide
//driver.hideKeyboard();

//scroll
//driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))"+".scrollIntoView(new UiSelector().text(\"SUBMIT\"))"));


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.hideKeyboard();
//Login
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/editTextPhone")).sendKeys("9999999999");

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/checkBoxPrivacyPolicy")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/buttonContinue")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")).click();
driver.findElement(By.id("android:id/button1")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//homepage
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/editTextCode")).sendKeys("123456");
driver.hideKeyboard();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/btnVerify")).click();

//verify need to add

System.out.println("Login successfully");
Thread.sleep(2000);

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_3")).sendKeys("1239870000");
driver.hideKeyboard();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/whatsapp")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/whatsappnumber")).sendKeys("4545454545");

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_1")).sendKeys("TESTAuto01");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_2")).sendKeys("TESTAuto01");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next1")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_sp106")).click();
System.out.println("Successfully entered farmer details");

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_42")).sendKeys("TESTAUTO01");

//barcode.click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_48")).sendKeys("151");
//pregnant
//Thread.sleep(2000);
driver.findElement(By.xpath("/hierarchy/android.wid"
		+ "get.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
//No of months
//Thread.sleep(2000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[4]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
//Milking status
driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))"+
".scrollIntoView(new UiSelector().text(\"Milking Statsus\"))"));
Thread.sleep(2000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[5]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
//lactation
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_47")).sendKeys("2");
//onboarding
Thread.sleep(2000);

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[4]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[5]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next_1")).click();
System.out.println("Succesfully Entered bovine details");


driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_52")).sendKeys("12");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_53")).sendKeys("13");
//Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next_3")).click();
System.out.println("succesfully entered the Lactation details");

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_19")).sendKeys("12");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_21")).sendKeys("13");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_58")).sendKeys("14");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next11")).click();
System.out.println("Entered feed details");

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_24")).sendKeys("test");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_25")).sendKeys("12");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next_6")).click();
System.out.println("Entered Local feed ingredents");
 
//preventive care details
//Deworming status
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();

//date of deworming
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_39")).click();
driver.findElement(By.xpath("//android.view.View[@content-desc=\"02 November 2022\"]")).click();
driver.findElement(By.id("android:id/button1")).click();
//Vaccination status
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();


//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")).click();
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();


//driver.findElement(By.xpath("02 November 2022")).click();
//driver.findElement(By.xpath("android:id/button1")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_40")).sendKeys("1200");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/id_41")).sendKeys("test");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next10")).click();
System.out.println("preventive care details");

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/et_question")).sendKeys("test question");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/btn_question_next")).click();
System.out.println("successfully entered Farmer question");

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo1")).click();
Thread.sleep(2000);
//driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/make_photo_button")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
Thread.sleep(3000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/allMuzzleImage")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/okButton")).click();
//driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/autoCapture")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo5")).click();
Thread.sleep(2000);

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();

Thread.sleep(3000);
driver.findElement(AppiumBy.androidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))"+".scrollIntoView(new UiSelector().text(\"Left_side_Shoulder_to_Tail.jpg\"))"));
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo6")).click();

Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();

Thread.sleep(3000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo7")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
//driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo8")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
//driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
Thread.sleep(3000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo9")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
//driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();

driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/photo10")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
Thread.sleep(3000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/submit")).click();
Thread.sleep(2000);
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/camera_icon")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/crop_image_menu_crop")).click();
Thread.sleep(3000);
System.out.println("photos page");
//edit 
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/edit")).click(); //edit follow
//yes button 
driver.findElement(By.id("android:id/button1")).click();//scrollup
//next1
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next_1")).click();
//next2
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next11")).click();
//next3
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next_6")).click();
//next4
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/next10")).click();
//next5
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/btn_question_next")).click();//scroll down

//
Thread.sleep(3000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout")).click();
System.out.println("Succesfully uploaded image");
Thread.sleep(4000);

driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/EditDetails")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/name")).sendKeys("DVARA");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/Organization")).sendKeys("DVARA");
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/UpdateDetails")).click();

//setlanguage
//tamil
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[7]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//gujarathi
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//Hindi
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[4]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//kanada

driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[5]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//Marathi
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[6]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//Telugu
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[8]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//english
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/dialog_OK")).click();
//Refresh
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
//driver.findElement(By.xpath("")).click();
//customer support
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.id("com.DvaraEDairy.fposasdev:id/closeicon")).click();

//version
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
WebElement version= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
version.getText();
version.click();
//logout
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
driver.findElement(By.id("android:id/button1")).click();
}
}
