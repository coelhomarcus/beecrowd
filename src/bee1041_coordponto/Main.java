package bee1041_coordponto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");
		String result = "";
		
		Double x = Double.parseDouble(input[0]);
		Double y = Double.parseDouble(input[1]);
		
		
		if(x == 0 && y == 0) {
			result = "Origem";
		}
		else if (x == 0) {
			result = "Eixo Y";
		} 
		else if (y == 0) {
            result = "Eixo X";
       	}
	 	else if (y > 0 && x > 0) {
         	result = "Q1";
     	}
		else if(x < 0 && y > 0) {
			result = "Q2";
		}
		else if(x < 0 && y < 0) {
			result = "Q3";
		}
		else if (x > 0 && y < 0){
			result = "Q4";
		}
		
		
		System.out.println(result);
		
		sc.close();
	}

}
