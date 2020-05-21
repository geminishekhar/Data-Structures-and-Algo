'package zeroSumArray;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		int a[]= {3,4,-1,4,3,-6,-7,2};
		Set<Integer> sumSet=new HashSet<Integer>();
		int sum=0;
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			sumSet.add(sum);
			sum=sum+a[i];
			if(sumSet.contains(sum))
			{
				found=true;
				break;
			}
		}
		}
 }
