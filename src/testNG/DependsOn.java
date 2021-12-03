package testNG;

import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void sampleTest1()
	{
		System.out.println("vrindha");
	}
	@Test(dependsOnMethods = "sampleTest1")
	public void sampleTest2()
	{
		System.out.println("Deepan");
	}
	@Test(dependsOnMethods = "sampleTest2")
	public void sampleTest3()
	{
		System.out.println("varsha");
	}


}
