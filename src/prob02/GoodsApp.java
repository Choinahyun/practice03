package prob02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		

		Goods[] goods = new Goods[3];
		String name = scan.nextLine();
		goods[0].setName(name);
		
		System.out.println(goods[0].getName());
		
//		for (int i=0; i<3; i++) {
//			String name = scan.nextLine();
//			int price = scan.nextInt();
//			int countStock = scan.nextInt();
//			
//			goods[i].setName(name);
//			goods[i].setPrice(price);
//			goods[i].setCountStock(countStock);
//			
//
//		}
//		
//		for (int i=0; i<3; i++) {
//			goods[i].show();
//		}
	}
}
