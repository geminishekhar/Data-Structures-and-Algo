package introduction;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="dogo";
		String b="dogg";
		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];
		if(a.length()==b.length())
		{
		for(int i=0;i<a.length();i++)
		{     isAnagram=false;
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j) && !visited[j])
					{isAnagram=true;
					visited[j]=true;
					break;
					}
			}
			if(!isAnagram)
				break;
		}
		}
      if(isAnagram)
    	  System.out.println("Anagram");
      else
      {
    	System.out.println("Not anagram");  
      }
	}

}
