package testRunner;


import org.testng.TestNG;

import automationTestScripts.Organizations.CreatOrganisationTest;

public class TestRunnerClass 
{

	static TestNG testng;
	public static void main(String[] args)
	{
		testng =new org.testng.TestNG();
		testng.setTestClasses(new Class[]{CreatOrganisationTest.class});
		testng.run();
	}

}
