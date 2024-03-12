package bee1017_gastocombustivel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int kmh = sc.nextInt();
		
		float result = (float) (kmh * h)/12;
	
		System.out.printf("%.3f\n", result);
		
		sc.close();
	}

}
