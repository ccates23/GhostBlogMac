

	
import static org.junit.Assert.fail;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


	public class GhostModule {
		
	  public WebDriver driver;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  ExtentReports report;
	  ExtentTest logger;
	  

       
 @BeforeClass
	  public void setUp() throws Exception {
	  
		  System.setProperty("webdriver.chrome.driver", "./jar/chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get("https://automate-it.ghost.io/ghost/signin/");
			driver.manage().window().maximize();
	   
	    }

	  @Test 
	  public void Login() throws Exception {
		String Path = ".\\report\\report.html";
		report = new ExtentReports(Path, false);
	    logger = report.startTest("Automate It Report");
	    WebDriverWait wait = new WebDriverWait(driver, 60);
	    logger.assignCategory("Automate It Blog");
	    report.addSystemInfo("Environment", "");
	    report.addSystemInfo("Version", "1.0");
	    report.addSystemInfo("OS", "Windows 7");
	    report.addSystemInfo("Browsers", "Chrome");
	    report.config()
	    .documentTitle("Ghost Blog Automation Report")
	    .reportName("Regression Suite");
	    logger.log(LogStatus.INFO, "* Browser Started");
	    Thread.sleep(5000);
	    String title = driver.getTitle();
	    System.out.println("* The page title is " + title);
	    Assert.assertTrue(title.contains("Sign In - Automate It"));
	    logger.log(LogStatus.PASS, "* Title verified and printed");
	    
	    
	    //=======
	    
	       String username = "cates.chad@gmail.com";
	       String password = "takamine";
		   System.out.println("* User used: " + username);
		   logger.log(LogStatus.INFO, "* User used: " + username);
		   
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.className("email")));
		   driver.findElement(By.className("email")).clear();
		   driver.findElement(By.className("email")).sendKeys(username);
		   driver.findElement(By.name("password")).clear();
		   driver.findElement(By.name("password")).sendKeys(password);
		   driver.findElement(By.className("login")).click();
		   System.out.println("* Clicked on Sign In button");
		   logger.log(LogStatus.INFO, "* Clicked on Sign In button");
           

	 // Take screenshot and store as a file format
	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	     // now copy the  screenshot to desired location using copyFile //method
	    FileUtils.copyFile(src, new File("C:\\Users\\chad.cates\\Desktop\\Automation\\chad.cates.workbench 2-16-16\\beWell\\Screenshots\\homepage.png"));
	    }
	     
	    catch (IOException e)
	     {
	      System.out.println(e.getMessage());
	     
	     }
	    
	    
	    /* ***Home Page Verification***
	     ******************************/
	    
	    String homepageTitle = driver.getTitle();
	    System.out.println("* The page title is" + homepageTitle);
	    logger.log(LogStatus.INFO, "* The page title is " + homepageTitle);
	    String homepage = driver.getCurrentUrl();
	    System.out.println("* The Page URL is " + homepage);
	    logger.log(LogStatus.INFO, "* The Page URL is " + homepage);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("icon-arrow")));
	    driver.findElement(By.className("icon-arrow")).click();
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul/li[1]")));
	    Assert.assertEquals("About Ghost", driver.findElement(By.xpath("//ul/li[1]")).getText());
	    Assert.assertEquals("Your Profile", driver.findElement(By.xpath("//ul/li[3]")).getText());
	    Assert.assertEquals("Sign Out", driver.findElement(By.xpath("//ul/li[4]")).getText());
	    driver.findElement(By.className("icon-arrow")).click();
	    System.out.println("* Dropdown menu verified");
	    logger.log(LogStatus.INFO, "* Dropdown menu verified");
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/ul[1]/li[1]")));
	    
	    // New Post
	    
	    driver.findElement(By.xpath("//section/ul[1]/li[1]")).click();
	    System.out.println("* Clicked on New Post in side nav bar");
	    logger.log(LogStatus.INFO, "* Clicked on New Post in side nav bar");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/header/section/button")));
	    driver.findElement(By.xpath("//section/header/section/button")).click();
	    System.out.println("* Clicked on Settings icon");
	    logger.log(LogStatus.INFO, "* Clicked on Settings icon");
	    Thread.sleep(2000);
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id='entry-controls']/div[1]/div[2]")).isDisplayed());
	    driver.findElement(By.xpath("//*[@id='entry-controls']/div[1]/div[1]/button")).click();
	    System.out.println("* Clicked on Close button for Post Settings");
	    
	    // Team link in side navigation
	    
	    driver.findElement(By.xpath("//section/ul[1]/li[3]")).click();
	    System.out.println("* Clicked on Team link");
	    logger.log(LogStatus.INFO, "* Clicked on Team link");
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("user-list-item-body")));
	    driver.findElement(By.className("user-list-item-body")).click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-location")));
	    driver.findElement(By.id("user-location")).clear();
	    driver.findElement(By.id("user-location")).sendKeys("Nashville, TN");
	    Thread.sleep(2000);
	    driver.findElement(By.id("user-website")).clear();
	    driver.findElement(By.id("user-website")).sendKeys("http://chadcates.org/");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("body")).sendKeys(Keys.END);
	    driver.findElement(By.id("user-bio")).clear();
	    driver.findElement(By.id("user-bio")).sendKeys("Hi! My name is Chad Cates. I'm an Automation Engineer. Thanks for reading this. Have a great day!");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//section/header/section")).click();
	    System.out.println("* Clicked on Save button in Team ccates profile");
	    logger.log(LogStatus.INFO, "* Clicked on Save button in Team ccates profile");
	    
	    // General link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[2]")).click();
	    System.out.println("* Clicked on General link in side nav bar");
	    logger.log(LogStatus.INFO, "* Clicked on General link in side nav bar");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("blog-description")));
	    driver.findElement(By.id("blog-description")).clear();
	    driver.findElement(By.id("blog-description")).sendKeys("This blog is used to demonstrate how to Automate a Web Application");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("body")).sendKeys(Keys.END);
	    driver.findElement(By.xpath("//*[@id='activeTimezone']/select")).click();
	    Thread.sleep(2000);
	    System.out.println("* Clicked on TimeZone dropdown");
	    logger.log(LogStatus.INFO, "* Clicked on TimeZone dropdown");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='activeTimezone']/select/option[9]")));
	    driver.findElement(By.xpath("//*[@id='activeTimezone']/select/option[9]")).click();
	    Thread.sleep(2000);
	    System.out.println("* Clicked on Central Time (US & Canada) option");
	    logger.log(LogStatus.INFO, "* Clicked on Central Time (US & Canada) option"); 
	    driver.findElement(By.className("view-actions")).click();
	    Thread.sleep(2000);
	    System.out.println("* Clicked on Save button in General link");
	    logger.log(LogStatus.INFO, "* Clicked on Save button in General link");
	    
	    // Navigation link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[3]")).click();
	    System.out.println("* Clicked on Navigation link");
	    logger.log(LogStatus.INFO, "* Clicked on Navigation link");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/header/section")));
	    driver.findElement(By.xpath("//section/header/section")).click();
	    System.out.println("* Clicked on Save button in Navigation link");
	    logger.log(LogStatus.INFO, "* Clicked on Save button in Navigation link");
	    
	    // Tags link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[4]")).click();
	    System.out.println("* Clicked on Tags link in side navigation");
	    logger.log(LogStatus.INFO, "* Clicked on Tags link in side navigation menu");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("settings-menu-content")));
	    Assert.assertTrue(driver.findElement(By.className("settings-menu-content")).isDisplayed());
	    
	    // Code Injection link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[5]")).click();
	    System.out.println("* Clicked on Code Injection link in the side navigation menu");
	    logger.log(LogStatus.INFO, "* Clicked on Code Injection link in the side navigation menu");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings-code")));
	    Assert.assertTrue(driver.findElement(By.id("settings-code")).isDisplayed());
	    
	    // Apps link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[6]")).click();
	    System.out.println("* Clicked on Apps link in the side navigation menu");
	    logger.log(LogStatus.INFO, "* Clicked on Apps link in the side navigation menu");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/section/section")));
	    Assert.assertTrue(driver.findElement(By.xpath("//section/section/section")).isDisplayed());
	    
        // Search Box
	    
	    driver.findElement(By.xpath("//div/input")).clear();
	    driver.findElement(By.xpath("//div/input")).sendKeys("Test text");
	    driver.findElement(By.xpath("//div/input")).clear();
	    System.out.println("* Search box was tested");
	    logger.log(LogStatus.INFO, "* Search box was tested");
	    
	    
	    // Labs link in side nav
	    
	    driver.findElement(By.xpath("//section/ul[2]/li[7]")).click();
	    System.out.println("* Clicked on Labs link in the side navigation menu");
	    logger.log(LogStatus.INFO, "* Clicked on Labs link in the side navigation menu");
	    Assert.assertTrue(driver.findElement(By.xpath("//section/section")).isDisplayed());
	    driver.findElement(By.xpath("//section/ul[1]/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("icon-minimise")).click();
	    Thread.sleep(2000);
	    System.out.println("* Clicked on button to close side navigation menu");
	    logger.log(LogStatus.INFO, "* Clicked on button to close side navigation menu");
	    
	    
	 
	    
	    
	    // Create Post
	    
	    driver.findElement(By.id("entry-title")).clear();
	    driver.findElement(By.id("entry-title")).sendKeys("Automation 101");
	    Thread.sleep(2000);
	    driver.findElement(By.className("ember-text-area")).sendKeys("This is my first blog post. Thank You!");
	    Thread.sleep(3000);
	    driver.findElement(By.className("dropdown-toggle")).click();
	    System.out.println("* Clicked on dropdown button to publish post");
	    logger.log(LogStatus.INFO, "* Clicked on dropdown button to publish post");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//a[contains(text(),'Publish Now')]")).click();
	    System.out.println("* Selected Publish Now option from dropdown");
	    logger.log(LogStatus.INFO, "* Selected Publish Now optionn from dropdown");
	    driver.findElement(By.className("js-publish-button")).click();
	    System.out.println("* Clicked on Publish button");
	    logger.log(LogStatus.INFO, "* Clicked on Publish button");
	    Thread.sleep(2000);
	    
	    // Edit Post
	    
	    driver.findElement(By.className("btn-blue")).click();
	    System.out.println("* Clicked on Update Post button");
	    logger.log(LogStatus.INFO,"* Clicked on Update Post button");
	    driver.findElement(By.className("ember-text-area")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.className("ember-text-area")).sendKeys("This is my first blog post edit.");
	    Thread.sleep(2000);
	    driver.findElement(By.className("js-publish-button")).click();
	    System.out.println("* Clicked on UPDATE POST button");
	    logger.log(LogStatus.INFO, "* Clicked on UPDATE POST button");
	    Thread.sleep(2000);
	    
	    // Delete Post
	    
	    driver.findElement(By.className("dropdown-toggle")).click();
	    System.out.println("* Clicked on dropdown button");
	    logger.log(LogStatus.INFO, "* Clicked on dropdown button");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//a[contains(text(),'Delete Post')]")).click();
	    System.out.println("* Clicked on Delete Post button");
	    logger.log(LogStatus.INFO, "* Clicked on Delete Post button");
	    Thread.sleep(2000);	
	    driver.findElement(By.className("btn-red")).click();
	    System.out.println("* Clicked on Delete Button in pop up modal");
	    logger.log(LogStatus.INFO, "* Clicked on Delete Button in pop up modal");
	    Thread.sleep(2000);
	    driver.findElement(By.className("gh-autonav-toggle")).click();
	    System.out.println("* Clicked on Side Nav toggle");
	    logger.log(LogStatus.INFO, "* Clicked on Side Nav toggle");
	    Thread.sleep(2000);
	    driver.findElement(By.className("icon-arrow")).click();
	    Thread.sleep(1000);
	    System.out.println("* Clicked on drop down for sign out");
	    logger.log(LogStatus.INFO, "* Clicked on drop down for sign out");
	    driver.findElement(By.className("user-menu-signout")).click();
	    Thread.sleep(4000);
	    System.out.println("* Clicked on Sign Out");
	    logger.log(LogStatus.INFO, "* Clicked on Sign Out");
	    logger.log(LogStatus.PASS, "* Ghost Blog Test Case Passed");
	    logger.log(LogStatus.INFO, "* Regression Complete");
	    driver.close();
      	  
 	     
       }

	  @AfterMethod 
	  
	  public void tearDown(ITestResult result) throws Exception {
		  if(result.getStatus()==ITestResult.FAILURE)
		  {
			  String screenshot_path = utility.captureScreenshot(driver, result.getName());
			  String image = logger.addScreenCapture(screenshot_path);
			  logger.log(LogStatus.FAIL, "* Title Verification",image );
		  }
		  report.endTest(logger);
		  report.flush();
		  driver.get("./report/report.html");
		  Thread.sleep(15000);
		  System.out.println("* Screenshot above failed");
		  report.close();
		  
		  
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	}



