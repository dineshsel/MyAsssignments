package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Google Inc");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester.");
		WebElement ele=driver.findElement(By.name("industryEnumId"));
		Select dropdown=new Select(ele);
		dropdown.selectByValue("IND_SOFTWARE");
		WebElement ele2=driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2=new Select(ele2);
		dropdown2.selectByVisibleText("S-Corporation");
		WebElement ele3=driver.findElement(By.id("dataSourceId"));
		Select dropdown3=new Select(ele3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		WebElement ele4=driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4=new Select(ele4);
		dropdown4.selectByIndex(6);
		WebElement ele5=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdown5=new Select(ele5);
		dropdown5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
					
	}

}
