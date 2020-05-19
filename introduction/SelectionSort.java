package introduction;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,4,3,2,1};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
        	int smallest=i;
        	for(int j=i;j<n;j++)
        	{
        		
        		if(a[j]<a[smallest])
        			
        		{
        			smallest=j;
        		}
        		
        	}
        	int temp=a[i];
        	a[i]=a[smallest];
        	a[smallest]=temp;
        }
		for(int item:a)
		{
			System.out.println(item);
		}

	}

}
