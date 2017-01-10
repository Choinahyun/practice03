package prob04;

import java.util.Scanner;

public class StringUtilTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String[] strArr = new String [3];
        
        for (int i=0; i<3; i++) {
        	strArr[i] = scan.nextLine();
        }
        String resultStr = StringUtil.concatenate( strArr );

        System.out.println( "결과 문자열 : " + resultStr ); 
	}

}
