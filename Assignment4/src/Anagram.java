
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			String s1 = "triangle";
			String s2 = "integrral";
			s1 = s1.replace(" ","").toLowerCase();
			s2 = s2.replace(" ","").toLowerCase();
			char [] ch1 =  s1.toCharArray();
			char [] ch2 =  s2.toCharArray();
			int sum1 =0;
			int sum2 =0;
			if(s1.length()!=s2.length())
			{
		System.out.println("This is not an anagram");
			System.exit(0);
			}
			for(int i=0;i<s1.length();i++)
			{
				sum1+=(int)ch1[i];
				sum2+=(int)ch2[i];
			}
				
			if(sum1==sum2)
				System.out.println("This is an anagram");
			else
				System.out.println("This is not an anagram");
			
	}

}
