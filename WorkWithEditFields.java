package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("mdivyacivil13@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Divya",Keys.TAB);
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
	    System.out.println(attribute);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    WebElement findElement = driver.findElement(By.xpath("//label[contains(text(),'disabled')]/following-sibling::input"));
		System.out.println(findElement.isEnabled());
	

	}

}
