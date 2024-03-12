package bee1022_tdaracional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			
			String input = sc.nextLine();
			
			String[] parts = input.split(" ");
			
			int N1 = Integer.parseInt(parts[0]);
			int D1 = Integer.parseInt(parts[2]);
			
			int N2 = Integer.parseInt(parts[4]);
			int D2 = Integer.parseInt(parts[6]);
			
			int numerador = 0;
			int denominador = 0;
			
			if(parts[3].equals("+"))
			{
				 numerador = (N1*D2 + N2*D1);
				 denominador = (D1*D2);
			} 
			else if(parts[3].equals("-"))
			{
				numerador = (N1*D2 - N2*D1);
				denominador = (D1*D2);
			}
			else if(parts[3].equals("*"))
			{
				numerador = (N1 * N2);
				denominador = (D1*D2);
			}
			else if(parts[3].equals("/"))
			{
				numerador = (N1 * D2);
				denominador = (D1*N2);
			}
			
			
	        int resto = 1;
	        int a = 0;
	        int b = 0;

	        if (numerador > denominador) {
	            a = numerador;
	            b = denominador;
	            while (resto != 0) {
	                resto = a % b;
	                a = b;
	                b = resto;
	            }
	        } else {
	            a = denominador;
	            b = numerador;
	            while (resto != 0) {
	                resto = a % b;
	                a = b;
	                b = resto;
	            }
	            if (a < 0)
	                a = a * -1;

	        }

			
			System.out.println(numerador + "/" + denominador + " = " + numerador / a + "/" + denominador / a);
		}
		
		sc.close();
		
	}

}
