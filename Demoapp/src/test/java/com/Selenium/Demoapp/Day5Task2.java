package com.Selenium.Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://j2store.net/free/");
		dr.manage().window().maximize();
		if(dr.getCurrentUrl().equals("https://j2store.net/free/") )
		{
			System.out.println("URL is same");
		}
		else
		{
			System.out.println("URL is Different");
		}
		dr.findElement(By.xpath("//*[@id=\"t3-mainnav\"]/div/div/div[1]/div[2]/div/ul/li[2]/div/div/div/div[1]/div/ul/li/span")).click();
		if(dr.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("URL is same");
		}
		else
		{
			System.out.println("URL is Different");
		}
	
	}

}
