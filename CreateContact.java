package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("divyasaivani");
		driver.findElement(By.id("lastNameField")).sendKeys("muraliprasad");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("divya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("murali");
		driver.findElement(By.name("departmentName")).sendKeys("testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Non It - IT");
		driver.findElement(By.name("primaryEmail")).sendKeys("mdivyacivil13@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDown = new Select(state);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
	
		
		
	}

}
