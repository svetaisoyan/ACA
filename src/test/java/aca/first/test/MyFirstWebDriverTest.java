package aca.first.test;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.youtube.com");
		 //1.Search something
		 WebElement search = driver.findElement(By.id("masthead-search-term"));
		 search.sendKeys("Git tutorial");
		 //2.Click search button
		 WebElement click = driver.findElement(By.id("search-btn"));
		 click.click();
		 //3.Open the page by searching Git tutorial
		 Assert.assertTrue("Learn Git in 20 Minutes" !=null);
		//4.Open the first video of the loaded page.
		 WebElement firstvideo = driver.findElement(By.xpath(".//ol[@div class='yt-lockup yt-lockup-tile yt-lockup-video clearfix'//a[2]"));
		 firstvideo.click();
		 //xndiry estex e,chi bacum videon
	
		
		 //1.Open Youtube menu 
		 WebElement homepage = driver.findElement(By.id("appbar-guide-button"));
		 homepage.click();
		 //2.Go to watched videos
		 WebElement watched = driver.findElement(By.id(".//li[@id='history-guide-item']"));
		 watched.click();	
		
		 
	
	}
	

}