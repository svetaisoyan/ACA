package aca.first.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.youtube.com");
		 //Test Case
		 //Description:Verifying URL
		 //Steps
		 //1.Open browser
		 //2.Enter youtube URL "https://www.youtube.com/"
		 //Expected results
		 //Expected Browser should be opened and Browser should navigate to youtube home page.
		 boolean present;
		 try {
		    driver.findElement(By.id("search-btn"));
		    present = true;
		 } catch (NoSuchElementException exception) {
			
		    present = false;
		 }
		 boolean present2;
		 try {
		    driver.findElement(By.id("upload-btn"));
		    present2 = true;
		 } catch (NoSuchElementException exception) {
			
		    present2 = false;
         driver.close();
		 driver.quit(); 
		 }
	}
}
