package com.Selenium.Demoapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set
      WebDriverManager.edgedriver().setup();
      //start
      WebDriver driver=new EdgeDriver();
      //Url
      driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
      driver.manage().window().maximize();
      //wait for 5 sec
      Thread.sleep(5000);
      //scroll down
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)","");
      // driver.close();
      driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Anu");
		//driver.close();
		
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("varsini");
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec019@skct.edu.in");
		
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("arts");
		
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();

      
	}

}
