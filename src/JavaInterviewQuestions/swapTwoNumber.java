package JavaInterviewQuestions;

public class swapTwoNumber {
	
	public void usingTemp()
	{
		int a=50;
		int b=20;
		
		System.out.println("Frist: " + a + " second: " + b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Frist: " + a + " second: " + b);
		
	}
	
	public void usingMath()
	{
		int a= 20;
		int b= 50;
		System.out.println("Frist: " + a + " second: " + b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Frist: " + a + " second: " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapTwoNumber number= new swapTwoNumber();
		number.usingTemp();
		number.usingMath();

	}

}
