
public class BubbleSort {

	public static void printarray(int[]a)
	{
		for(int ele : a)
		{
			System.out.print(ele +" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {11,7,26,4,8,9,2,1,5};
		int temp =0;
		int key = 9;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		printarray(a);
		System.out.println();
				
	}

}

