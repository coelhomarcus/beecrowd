package bee1023_estiagem;

import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        int cidade = 0;
        
        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            
            if (n == 0) {
                break;
            }


            int totalMoradores = 0;
            int totalConsumo = 0;
            int[] consumos = new int[201];
            
            for (int i = 0; i < n; i++) {
                String[] numeros = sc.nextLine().trim().split(" ");

                int moradores = Integer.parseInt(numeros[0]);
                int consumo = Integer.parseInt(numeros[1]);

                totalMoradores = totalMoradores + moradores;
                totalConsumo = totalConsumo + consumo;
                
                consumos[consumo / moradores] = consumos[consumo / moradores] +  moradores;
            }

            cidade++;
            System.out.printf("Cidade# %d:\n", cidade);
            
            boolean primeiravez = true;
            
            for (int i = 0; i < 201; i++) {
                if (consumos[i] > 0) {
                	
                    if (primeiravez) {
                    	primeiravez = false;
                    } else {
                        System.out.print(" ");
                    }

                    System.out.printf("%d-%d", consumos[i], i);
                }
            }
            System.out.println("");

            System.out.printf("Consumo medio: %.2f m3.\n", Math.floor((100.0 * totalConsumo) / totalMoradores) / 100.0);
        }
        
        sc.close();
    }
}
