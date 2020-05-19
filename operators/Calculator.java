package operators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the first number");
		int firstNumber=scanner.nextInt();
		System.out.println("enter the first number");
		int secondNumber=scanner.nextInt();
		scanner.nextLine();
        System.out.println("Enter the operator");
        char operator=scanner.nextLine().charAt(0);
        switch(operator)
        {
        case '+':
        	result=firstNumber+secondNumber;
        	System.out.println("the result by adding two number is :" + result);
        	break;
        case '-':
        	result=firstNumber - secondNumber;
        	System.out.println("the result by subtracting two number is :" + result);
        	break;
        case '*':
        	result=firstNumber * secondNumber;
        	System.out.println("the result by multiplying two number is :" + result);
        	break;
        case '/':
        	result=firstNumber / secondNumber;
        	System.out.println("the result by dividing two number is :" + result);
        	break;
        default:
        	System.out.println("Wrong operator");
        	
        }
		

	}

}
