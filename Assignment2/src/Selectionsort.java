
public class Selectionsort {

	public static void main(String[] args) {
		
		int [] a = {22,6,9,12,45,65,76,2} ;
		
		int min,temp=0;
		for(int i=0;i<a.length;i++) 
		{
			min = i;
			 for(int j=i+1;j<a.length;j++) 
			 {
				 if(a[j]<a[min]) 
				{
					min = j;
				}
			}
			 
			 temp=a[i];
			 a[i]=a[min];
			 a[min]=temp;
		}

		for(int ele: a)
		{
			System.out.print(ele +" ");
		}
	}
		
}
		
		

	
