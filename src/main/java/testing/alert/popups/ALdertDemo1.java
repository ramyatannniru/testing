package testing.alert.popups;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALdertDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		
		
		
		//Alert alertwindow=driver.switchTo().alert();
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText());
		
		//alertwindow.accept(); // this will close alert window using ok button
		alertwindow.dismiss();  // close alert window by using cancel button
		
		
		


	}

}
