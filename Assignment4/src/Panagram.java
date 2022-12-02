
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGhJKLmnopqrstuvwxyzzaahih";
		s = s.replace(" ","").toLowerCase();
		char[] ch = s.toCharArray();
		int[] store	= new int[26];
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			int index = (int)(ch[i])-97;
			store[index]++;
		}

		for(int i=0;i<store.length;i++)
		{
			if(store[i]!=0)
			{
				count++;
			}
		}

		System.out.println(count);

		if(count!=26)
		{
			System.out.println("This is not a panagram");
		}
		else
			{
			System.out.println("This is a panagram");
			}

	}

}
