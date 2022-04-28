import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name=\"name\"][1]")).sendKeys("Meera");
		driver.findElement(By.name("email")).sendKeys("meera@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement drop = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(drop);
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("22/04/2022");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
		
		
	}

}
