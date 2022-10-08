package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithMultiSelect {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	Thread.sleep(2000);
WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));
Select select = new Select(dropdown);
	
if(dropdown.isEnabled() && dropdown.isDisplayed())
{
	System.out.println("Dropdown is enabled and displayed");
}
else
{
	System.out.println("Dropdown is not enabled and not displayed");
}
if(select.isMultiple())
{
	System.out.println("DD allows selection of multiple options");
}
else
{
	System.out.println("DD does NOT allow selection of multiple options");
}

select.selectByIndex(1);//by index
select.selectByValue("Ma");//by value
select.selectByVisibleText("August");// by visible text

if(select.getAllSelectedOptions().size()==3)
{
	System.out.println("3 options are selected");
}
else
{
	System.out.println("some error");
}
Thread.sleep(2000);
driver.close();
}
}