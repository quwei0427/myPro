package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "chrome");
		WebDriver driver=DriverUtils.getDriver();
		driver.get("http://http://172.18.1.147:5555/demo/survey/cybbbk/qdjcqk.htm");
		driver.findElement(By.xpath("//input[@name=''dtDyjsrq]"));
		Thread.sleep(2000);
		driver.quit();
	}

}
