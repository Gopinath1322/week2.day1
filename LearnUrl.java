package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=new String();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC pvt Limited");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopinath");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Con");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("gopi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gopi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("gamingapp");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12,00,000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("78678");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Surendhran");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("420");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("MSFT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TEST THE APPLICATION");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("FIX THE BUGS");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("624001");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopin9353@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9500339662");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Gopinath");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Gopinath S");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("gopi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3rd,street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("annanagar(p.o)");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dindigul");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("624001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0451");
		driver.findElement(By.name("submitButton")).click();
	}

}
