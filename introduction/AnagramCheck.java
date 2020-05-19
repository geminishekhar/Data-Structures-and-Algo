package introduction;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="dogo";
		String b="doog0";
		boolean isAnagram=true;
		
		if(a.length()==b.length())
		{
			
			int al[]=new int[256];
//			int bl[]=new int[256];
			for(char c:a.toCharArray())
			{
				int index=(int)c;
				al[index]++;
			}
			for(char c:a.toCharArray())
			{
				int index=(int)c;
				al[index]--;
			}
			for(int i=0;i<256;i++)
			{
				if(al[i]!=0)
				{
					isAnagram=false;
					break;
				}
				
			}
		}
		else {
			isAnagram=false;
			}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
