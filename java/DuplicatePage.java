import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicatePage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Login pages
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		
		
		
		//Create leads
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Changepond Technology");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramadevi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manual Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("WELCOME TO THE WEB AUTOMATION BY SELENIUM");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramadevianand08@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The Resulting Page : "+driver.getTitle());
		
		//Duplicate Lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("Tata consultancy services");
		
		
		
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Ramadevi");
		
		
		
		driver.findElement(By.id("createLeadForm_departmentName")).clear();
		WebElement DepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		DepartmentName.sendKeys("Automation test Engineer");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Resulting Page : "+driver.getTitle());
	}

}
