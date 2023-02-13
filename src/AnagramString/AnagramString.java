package AnagramString;

public class AnagramString {

	public static boolean isAnagram(String str1, String str2)   
	{  
		//comparing length      
		if (str1.length() != str2.length())   
		{  
			//returns false if the strings are not equal in length      
			return false;  
		}  
		//converts string into character array  
		char[] chars = str1.toCharArray();  
		//loop iterates over the array  
		for (char c : chars)   
		{  
			//finds the index      
			int index = str2.indexOf(c);  
			if (index != -1)   
			{  
				//the substring() method returns a new string that is a substring of this string  
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());  
			}   
			else   
			{  
				return false;  
			}  
		}  
		return str2.isEmpty();  
	}
	  
	public static void main(String args[])   
	{    
		//calling function      
		System.out.println(isAnagram("HEART", "EARTH"));    
		System.out.println(isAnagram("TRIANGLE", "INTEGRAL"));    
		System.out.println(isAnagram("TOSS", "SHOT"));   
	}    
}
