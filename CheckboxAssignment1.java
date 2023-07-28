package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		if(driver.findElement(By.id("checkBoxOption1")).isSelected()==true) {
			System.out.println("Checkbox successfully Checked");
		}
		Thread.sleep(2000);
		int count=0;
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		if(driver.findElement(By.id("checkBoxOption1")).isSelected()==false) { 
		System.out.println("Checkbox successfully UnChecked");
		}
		List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement checkbox:checkboxes) {
			if(checkbox.isDisplayed()) {
				count=count+1;
			}
		}
		System.out.println(count);
		
			

	}

}
