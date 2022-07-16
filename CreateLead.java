package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();	
//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mindtree");
//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvana");
//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
//Enter FirstName(Local) Field Using id Locator  
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhuvi");
//Enter Department Field Using any Locator of Your Choice	
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
//Enter Description Field Using any Locator of your choice
        driver.findElement(By.id("createLeadForm_description")).sendKeys("New Lead");
// Enter your email in the E-mail address Field using the locator of your choice
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhuvaneswari991105@gmail.com");
//Select State/Province as NewYork Using Visible Text
        WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select select=new Select (dropdown);
        select.selectByVisibleText("New York");
//Click on Create Button
        driver.findElement(By.className("smallSubmit")).click();
//Get the Title of Resulting Page
        String title = driver.getTitle();
		System.out.println(title);	
			
		}	
}

