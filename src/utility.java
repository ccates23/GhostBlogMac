

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class utility {
	
	@Test
	public static String captureScreenshot(WebDriver driver, String screenshotName)
	{
try
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String dest = "C:\\Users\\chad.cates\\Desktop\\Automation\\chad.cates.workbench 2-16-16\\beWell\\Screenshots"+screenshotName+".png";
//String dest = "./Screenshots/"+screenshotName+".png";
	File destination=new File(dest);
FileUtils.copyFile(source, destination);
System.out.println("* Screenshot Takes");
return dest;
}
catch(Exception e)
{
	System.out.println("Exception while taking screenshot" +e.getMessage());
	return e.getMessage();
}
}
}
