package introduction;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {-3,-2,5};
      int n=a.length;
      boolean result=false;
      for(int i=0;i<n-2;i++)
      {
    	  result=twosum(a,-a[i],i+1);
    	  if(result)
    	  {
//    		  System.out.println("True");
    		  break;
    	  }
      }
      if(result)
      System.out.println("true");
      else {
		System.out.println("False");
	}
      
	}
	
	
	public static boolean twosum(int a[],int x,int i)
	{
		int n=a.length;
//		int i=0;
		int j=n-1;
		while(i<j)
		{
			if( a[i] + a[j] > x)
				j--;
			else if( a[i] + a[j] < x)
				i++;
			else {
				return true;
			}
		}
		return false;
	}

}
