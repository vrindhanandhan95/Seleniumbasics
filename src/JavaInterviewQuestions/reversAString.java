package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reversAString {
	
	public void usingStringBuffer() {
		StringBuffer given = new StringBuffer("Vrindha");
		given.reverse();
		System.out.println(given);
	}
	
	public void usingForLoop()
	{
		String given ="Vrindha";
		char[]  character = given.toCharArray();
		
		String revString = "";
		
		for(int i=character.length-1;i>=0;i--)
		{
			revString=revString+character[i];
		}
		System.out.println(revString);
	}
	
	public void usingCollections()
	{
		String given = "Vrindha Nandhan";
		char [] charr= given.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : charr) {
			
			list.add(character);
		}
		
		Collections.reverse(list);
		
		ListIterator iterator= list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		reversAString aString = new reversAString();
		aString.usingStringBuffer();
		aString.usingForLoop();
		aString.usingCollections();
	}
}
