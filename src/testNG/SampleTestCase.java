package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test(priority=2)
	public void sampleTest1()
	{
		System.out.println("vrindha");
	}
	@Test(priority=3)
	public void sampleTest2()
	{
		System.out.println("Deepan");
	}
	@Test(priority=1,enabled = false)
	public void sampleTest3()
	{
		System.out.println("varsha");
	}

}
