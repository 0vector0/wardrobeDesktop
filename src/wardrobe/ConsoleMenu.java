package wardrobe;

import java.util.Scanner;

public class ConsoleMenu {
	
	private static Scanner sc = new Scanner(System.in);
	private static int inputNumber = 9999;
	static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User user1 = new User();

		
		User petro = new User("Petrovich");
		
		System.out.println("Покупаем");
		petro.byuProduct();
		//System.out.println("Печатаем");
		//petro.printProduct();
		
		//Calendar testDay = new Calendar();
		Day testDay = new Day();
		System.out.println(testDay.toString());
		testDay.setCurrentDay(15);
		System.out.println(testDay.toString());
		
		petro.setProductOnDay(testDay);
		
		System.out.println("printOneProduct");
		petro.printOneProduct(testDay);
		
		
		
		
		
		
		//day1.TestMethod();
	}

}
