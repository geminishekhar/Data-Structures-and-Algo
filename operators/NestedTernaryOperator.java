package operators;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14;
		int b=14;
		int c=14;
		int result= a>b?a>c?a:c:b>c?b:c;
		System.out.println(result);

	}

}
