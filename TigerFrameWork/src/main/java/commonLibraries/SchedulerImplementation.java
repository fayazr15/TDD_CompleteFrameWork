package commonLibraries;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * @code This Class is used to capture the failed testCases Screenshot
 * @author Fayaz
 *
 */
public class SchedulerImplementation implements ITestListener
{
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * To capture the failed testCases Screenshot
	 * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
	 */
	public void onTestFailure(ITestResult res) 
	{
		SimpleDateFormat df	= new SimpleDateFormat("-yyyy-MM-dd-HH-mm");
		String date = df.format(new Date());
		
		String name = res.getName();
		TakesScreenshot ts = (TakesScreenshot)ConfigFiles.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+name+"_"+date+".png");
		try 
		{
			FileUtils.copyFile(srcFile, destFile);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
