package com.Selenium.Demoapp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
       WebDriver dr=new ChromeDriver();
        dr.get("https://j2store.net/free/");
        dr.manage().window().maximize();
        String title=dr.getTitle();
        if(title.equals("Home"))
        {
        	System.out.println("Title are Same");
        }
        else
        {
        	System.out.println("Title are Different");
        }
        dr.findElement(By.xpath("//*[@id=\"t3-mainnav\"]/div/div/div[1]/div[2]/div/ul/li[2]/a")).click();
        dr.findElement(By.xpath("//*[@id=\"t3-mainnav\"]/div/div/div[1]/div[2]/div/ul/li[2]/div/div/div/div[1]/div/ul/li/span")).click();
        if(title.equals("Shop"))
        {
        	System.out.println("Title are same");
        	
        }
        else
        {
        	System.out.println("Title are Different");
        }
        
        
        
	}

}
