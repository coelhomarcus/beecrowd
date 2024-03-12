package bee1038_lanches;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");

		int lanche = Integer.parseInt(input[0]);
		int quantidade = Integer.parseInt(input[1]);
		double valor = 0.0;

		switch (lanche) {
		case 1:
			valor = 4;
			break;
		case 2:
			valor = 4.5;
			break;
		case 3:
			valor = 5;
			break;
		case 4:
			valor = 2;
			break;
		case 5:
			valor = 1.50;
			break;
		}

		System.out.printf("Total: R$ %.2f\n", valor * quantidade);

		sc.close();
	}

}