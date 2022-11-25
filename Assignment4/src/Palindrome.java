import java.util.Arrays;

class  Palindrome
{
	public static void main(String... args) 
	{
		String s = "2552";
		s = s.toLowerCase();
		//System.out.println(s);
		char[] org = s.toCharArray();
		char[] rev = new char[org.length];
		for(int i=0;i<s.length();i++)
			{
			org[i] = s.charAt(i);
			}
		
	//	System.out.println(i);
		
		int l = org.length-1;
		int j = 0;
		
		while(l>=0)
		{
			rev[j]=org[l];
			j++;
			l--;
		}
		boolean res = Arrays.equals(org,rev);
		if(res)
		{
			System.out.println("This is a palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
		

			

	}
}