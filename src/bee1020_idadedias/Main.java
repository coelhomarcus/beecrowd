package bee1020_idadedias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int anos = 0;
		int meses = 0;
		int dias = 0;
		

		anos = input/365;
		meses = input%365/30;
		dias = input%365 - (meses*30);	
		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
		
		sc.close();
	}

}
