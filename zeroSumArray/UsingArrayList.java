package zeroSumArray;

import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,-3};
		boolean found=false;
		ArrayList<Integer> ansArrayList=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			ansArrayList.add(sum);
			sum=sum+a[i];
			for(int j=0;j<ansArrayList.size();i++)
			{
				if (sum==ansArrayList.get(j))
				{
					found=true;
					break;
				}
			}
		}
    if(found)
    	System.out.println("found");
    else {
		System.out.println("not found");
	}
	}

}
