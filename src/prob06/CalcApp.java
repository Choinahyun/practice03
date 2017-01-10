package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.println(">>");
			String expression = scanner.nextLine();
			
			if (expression.equals("quit")) {
				break;
			}
			 
			String[] tokens = expression.split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			switch (tokens[1]) {
			case "+" :
				plus (a,b);
				break;
			case "-" :
				min (a,b);
				break;
			case "/" :
				div (a,b);
				break;
			case "*" :
				mul (a,b);
				break;
			default :
				break;
			}
		}
		
		scanner.close();
	}
	
	public static void plus (int a, int b) {
		System.out.println(a+b);
	}
	public static void min (int a, int b) {
		System.out.println(a-b);
	}
	public static void div (double a, double b) {
		System.out.println(a/b);
	}
	public static void mul (int a, int b) {
		System.out.println(a*b);
	}
	
	
}
