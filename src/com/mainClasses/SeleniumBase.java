package com.mainClasses;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class SeleniumBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//segunda alteração
			
		System.setProperty("webdriver.chrome.driver", "/webdrivers/chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
				
		/*
		*Switch Window
		*/
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		
		WebElement newTab = driver.findElement(By.id("new-tab-button"));
		
		newTab.click();
		
		
		String originalHaldler = driver.getWindowHandle();
		
		for(String Haldle1: driver.getWindowHandles()){
			
			driver.switchTo().window(Haldle1);
		}
		
		driver.switchTo().window(originalHaldler);
		
		
		
		
		/*
		 * Scroll
		 
		
		driver.get("http://formy-project.herokuapp.com/scroll");
		
		WebElement fullname = driver.findElement(By.id("name"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(fullname);
		
		fullname.sendKeys("Carlos Valente");
		
		WebElement date = driver.findElement(By.id("date"));
		
		date.sendKeys("01/01/2020");
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * autocomplete
		 
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement address = driver.findElement(By.id("autocomplete"));		
		
		address.sendKeys("Amsterdam, Science Park Aer, Amsterdam");
		
		Thread.sleep(1000);
		
		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		
		autocompleteResult.click();
		
		*
				
		/*
		 * Key Press 
		 *
		 *
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement element = driver.findElement(By.id("name"));
		
		element.click();
		
		element.sendKeys("Carlos Valente");	
		
		
		WebElement button = driver.findElement(By.id("button"));
		
		button.click();
		
		driver.quit();
		
		*/
		
		
					

	}

}
