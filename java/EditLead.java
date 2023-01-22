import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		
		
		
		//Edit Lead
		
//		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("HELLO ALL! THIS IS MY 1ST SELENIUM AUTOMATION PROJECT");
		
		
		//update
        driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The Resulting Page : "+driver.getTitle());
		
		

	}

}
