package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Paramasivan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println("Title: "+title);
		driver.quit();
					
	}

}
