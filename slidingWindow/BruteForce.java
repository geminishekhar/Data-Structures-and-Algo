package slidingWindow;

public class BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={1,3,-1,-3,5,3,6,7};
		int n=8;
		int k=3;
		int ans[]=new int[6];
		for(int i=0;i<n-k+1;i++)
		{
			int highest=arr[i];
			for(int j=i+1;j<i+k;j++)
			{
				if(arr[j]>highest)
				{
					highest=arr[j];
				}
			}
			ans[i]=highest;
		}
		for(int i=0;i<n-k+1;i++)
		System.out.println(ans[i]);
		
		

	}

}
