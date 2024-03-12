package bee1035_testedeselecao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		int D = Integer.parseInt(input[3]);
		
		
		if ((B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0)) {
			System.out.print("Valores aceitos\n");
		}else {
			System.out.print("Valores nao aceitos\n");
		}
		
		sc.close();
	}

}
