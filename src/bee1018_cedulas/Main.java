package bee1018_cedulas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		System.out.printf("%d\n", val);
		
		int cd100 = val/100;
		System.out.printf("%d nota(s) de R$ 100,00\n", cd100);
		val = val - (cd100 * 100);
		
		int cd50 = val/50;
		System.out.printf("%d nota(s) de R$ 50,00\n", cd50);
		val = val - (cd50 * 50);
		
		int cd20 = val/20;
		System.out.printf("%d nota(s) de R$ 20,00\n", cd20);
		val = val - (cd20 * 20);
		
		int cd10 = val/10;
		System.out.printf("%d nota(s) de R$ 10,00\n", cd10);
		val = val - (cd10 * 10);
		
		int cd5 = val/5;
		System.out.printf("%d nota(s) de R$ 5,00\n", cd5);
		val = val - (cd5 * 5);
		
		int cd2 = val/2;
		System.out.printf("%d nota(s) de R$ 2,00\n", cd2);
		val = val - (cd2 * 2);
		
		int cd1 = val;
		System.out.printf("%d nota(s) de R$ 1,00\n", cd1);	
		
		sc.close();
	}

}
