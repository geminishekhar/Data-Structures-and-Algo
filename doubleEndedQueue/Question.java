//to find the n largest element in the array
package doubleEndedQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Question {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("the number of elements in the array");
		int n=scanner.nextInt();
		
		System.out.println("the number of largest elements in the array to found out");
		int k=scanner.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("the elements in the array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				pq.add(a[i]);
			}
			if(pq.peek()<a[i])
			{
				pq.poll();
				pq.add(a[i]);
			}
		}
		ArrayList<Integer> alArrayList=new ArrayList<Integer>(pq);
		Collections.sort(alArrayList,Collections.reverseOrder());
		System.out.println("the largest elemenst are");
		for(int i:alArrayList)
		{
			System.out.println(i);
		}
		}

}
