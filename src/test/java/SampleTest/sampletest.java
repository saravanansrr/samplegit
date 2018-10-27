package SampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampletest
{
	@Test
public void logintest() throws IOException
{
WebDriver wd=new FirefoxDriver();
wd.manage().window().maximize();
wd.get("https://www.bing.com/");
WebElement input= wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
input.sendKeys("abc");
input.submit();
File srcfile=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\SAshwinKrithik\\eclipse-app\\Webdriver\\screenshot\\crop5.png"));

		
}
}
