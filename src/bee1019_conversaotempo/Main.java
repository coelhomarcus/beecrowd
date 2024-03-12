package bee1019_conversaotempo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		if (input < 60) {
			segundos = input;
		}else if(input > 60 && input < 3600) {
			minutos = input/60;
			segundos = input%60;
		}else {
			horas = input / 3600;
			minutos = (input % 3600) / 60;
			segundos = input%60;
		}
	
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
