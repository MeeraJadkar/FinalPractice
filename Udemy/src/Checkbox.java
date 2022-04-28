import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement check = driver.findElement(By.id("checkBoxOption1"));
		check.click();
		if(check.isSelected()) {
			System.out.println("Successfully checked");
		}else {
			System.out.println("Unchecked");
		}
		check.click();
		if(check.isSelected()) {
			System.out.println("Still checked");
		}else {
			System.out.println("Successfully unchecked");
		}		
		
	}
}
