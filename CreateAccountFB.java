package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFB {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Adira");
		driver.findElement(By.name("lastname")).sendKeys("Dinesh");
		driver.findElement(By.id("sex")).click();
		WebElement ele1=driver.findElement(By.id("day"));
		Select dropdown1=new Select(ele1);
		dropdown1.selectByValue("6");
		
		WebElement ele2=driver.findElement(By.id("month"));
		Select dropdown2=new Select(ele2);
		dropdown2.selectByValue("11");
					
		WebElement ele3=driver.findElement(By.id("year"));
		Select dropdown3=new Select(ele3);
		dropdown3.selectByValue("1996");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8939006873");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testing123");
		
	}

}
