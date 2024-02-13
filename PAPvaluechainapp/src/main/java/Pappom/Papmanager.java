package Pappom;

import org.openqa.selenium.WebDriver;

import pom.Edit;
import pom.FPO1dashboard;
import pom.Homepage;
import pom.Pendingcattle;
import pom.Scoredcattle;

public class Papmanager {
	
	public WebDriver driver;
    
    private Paplogin phno;
    private Papusersetting usersetting;
    private Scoredcattle scored;
    private FPO1dashboard FPO1;
    private Edit Edit;
    
    
    public Papmanager(WebDriver driver) {
    	this.driver=driver;
    }
    public Paplogin get_Instance_phno() {
    	if (phno==null) {
        phno=new Paplogin(driver);     
    	}
    return phno;
    }
    public Papusersetting get_Instance_usersetting() {
    	if (usersetting==null) {
        usersetting=new Papusersetting();     
    	}
    return usersetting;
    }
    

}
