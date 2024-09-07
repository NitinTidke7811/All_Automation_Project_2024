package Handling_oF_dynamic_Element_Ex_flipkart_rating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Dynamic_Element_GetFlipkart_rating 
{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",
"C:\\\\\\\\Users\\\\\\\\Tidke\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//go to flipkart.com
 driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
//   2.clic on close button
 //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
Thread.sleep(3000);
 //3.inspect search box pass input va

driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 11");
                   
Thread.sleep(3000);
//4.click on search button
 driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
 Thread.sleep(3000);
 //5.get rating
 WebElement Rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[2]"));
System.out.println(Rating.getText());
 // get star rating
 WebElement starrating = driver.findElement(By.xpath("//div[@class='col col-7-12']/div[2]/span[1]"));
 System.out.println(starrating.getText());
 //get review 
  WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
 System.out.println(review.getText());
 WebElement all_mobiinfo= driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]"));
	     
 System.out.println(all_mobiinfo.getText());
 //review absolute xpath=(//div[@class='col col-7-12'])[1]/div[2]/span[2]/span/span[3]
 //-----//-relative xpath=((//div[@class='col col-7-12'])[1]//span)[6]
 
      }

}
