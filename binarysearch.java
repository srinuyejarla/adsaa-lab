//implementation of binarysearch
import java.util.Scanner;
public class bisearch{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the key:");
		int key=sc.nextInt();
		int pos=binarysearch(n,a,key);
		if(pos==-1)
			System.out.println("key is not found");
		else
			System.out.println("key is found at"+pos);	
	}
	public static int binarysearch(int n,int a[], int key){
	int high=a.length-1;
	int low=0;
		while(low<=high){
			int mid=(low+high)/2;
				if(a[mid]==a[key])
					return mid;
				else if(a[mid]<a[key])
					low=mid+1;
				else
					high=mid-1;
		}
		return -1;
	}
}
