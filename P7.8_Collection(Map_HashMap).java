import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution 
{
	private static Scanner inputScanner;
	public static void main(String[] args) 
  {
		Map<String, String> phoneBook = new HashMap<String, String>();
		inputScanner = new Scanner(System.in);
		int numFriends = inputScanner.nextInt();
		inputScanner.nextLine();
		for (int i = 0; i < numFriends; i++) 
    {
			String name = inputScanner.nextLine();
			String phone = inputScanner.nextLine();
			phoneBook.put(name, phone);
		}
		while (inputScanner.hasNext()) 
    {
			String inputName = inputScanner.nextLine();
			if (phoneBook.containsKey(inputName)) 
      {
				System.out.println(inputName + "=" + phoneBook.get(inputName));
			} 
      else 
      {
				System.out.println("Not found");
			}
		}
	}
}
