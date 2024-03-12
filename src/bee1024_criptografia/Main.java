package bee1024_criptografia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int j = 0; j < n; j++) {

			String input = sc.nextLine();
			char[] character = input.toCharArray();
			String first_pass = "";
			String second_pass = "";
			String third_pass = "";
			String final_pass = "";
			
			
			for(int i = character.length - 1; i >= 0; i--) {
				
				int ascii = (int) character[i];
				
				
				if (ascii >= 65 && ascii <= 122) {
					first_pass += (char) (ascii + 3);
					}
				else {
					first_pass += (char)ascii;
				}

			}

			
			for(int i = character.length - 1; i >= 0; i--) second_pass += first_pass.toCharArray()[i];

			
			
			for(int i = 0; i < character.length; i++) {
				
				int ascii = (int) second_pass.toCharArray()[i];
							
				if (character.length % 2 == 0) {
					
					if (i < (character.length / 2)) {
						third_pass += (char) (ascii - 1);
					}else {
						third_pass += (char)ascii;
					}
					
				}else {
					
					if (i - 1 < (character.length / 2)) {
						third_pass += (char) (ascii - 1);
					}else {
						third_pass += (char)ascii;
					}
					
				}
			}

			
			for(int i = character.length - 1; i >= 0; i--)  final_pass += third_pass.toCharArray()[i];
			
			System.out.println(final_pass);
		}
		
		sc.close();
	}

}
