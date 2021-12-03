package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = {"Apple"})
	public void Apple1()
	{
		System.out.println("Apple testing");
	}
	@Test(groups = {"Apple"})
	public void Apple2()
	{
		System.out.println("Apple testing");
	}
	@Test(groups = {"Moto"})
	public void Moto1()
	{
		System.out.println("Moto testing");
	}
	@Test(groups = {"Moto"})
	public void Moto2()
	{
		System.out.println("Moto testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1()
	{
		System.out.println("Vivo testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo2()
	{
		System.out.println("Vivo testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1()
	{
		System.out.println("Lenovo testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo2()
	{
		System.out.println("Lenovo testing");
	}
}
