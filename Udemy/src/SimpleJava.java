import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleJava {

	public static void main(String[] args) {

		// invoking the browser 
		// Chrome Browser----- Chrome driver----methods
		
		// Webdriver is parent interface to all this browser specific classes
		
		// to access the methods of class we need to create object of that class first
		// ChromeDriver driver = new ChromeDriver();
	//	WebDriver driver = new ChromeDriver();
// above declaration is the preferrable one bcoz here chromedriver object can use webdriver methods only
// class specific methods of chromedriver will not be accessible bcoz of above declaration.
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}
