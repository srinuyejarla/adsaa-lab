import java.util.scanner;
public class bubblesort
{
	public static void main(String[] args)
	{
		Scanner sc = new scanner(system.in);
		System.out.println("Enter the  number of elements");
				int n = sc.nextInt();
				int a[] = new int[n];
		System.out.println("enter the no of elements");
			for(int i=0; i<n; i++)
				a[i]=sc.nextint[]
			bubblesort(a);
		System.out.println("Sorted arrray");
		for(int i=0;i<a.length; i++)
		System.out.println(a[i]" + +);
	}
	public static void Bubblesort(int a[])
		{
			int n = a.length;
			for(int i=0;i<a.length;i++)
				for(int j=0;j<=(n-i-i);j++)
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
		}
}
				
			
		
		
