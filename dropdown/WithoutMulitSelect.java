package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutMulitSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		
	if(dropdown.isEnabled() && dropdown.isDisplayed())
	{
		System.out.println("Dropdown is enabled and displayed");
	}
	else
	{
		System.out.println("Dropdown is not enabled and not displayed");
	}
	Thread.sleep(2000);
	Select select = new Select(dropdown);
	if(select.isMultiple())
	{
		System.out.println("DD  supports multiple options");
	}
	else
	{
		System.out.println("DD  does not support multiple options");
	}
	Thread.sleep(2000);
	int listSize = select.getOptions().size();
	System.out.println("Number of countries is : " + listSize);
	Thread.sleep(2000);
	select.selectByVisibleText("India");//by visible text
	    String  text1  = select.getFirstSelectedOption().getText();
	    System.out.println("selected country is :" + text1);
	    Thread.sleep(2000);
	    
	    select.selectByIndex(12);//by index
	 String text2=  select.getFirstSelectedOption().getText();
	    System.out.println("selected country is :" + text2);
	    Thread.sleep(2000);
	    
	    select.selectByValue("ID");//by attibute value
	    String text3=  select.getFirstSelectedOption().getText();
	    System.out.println("selected country is :" + text3);
	    Thread.sleep(2000);
	    
	    
	    driver.close();
	}

}
