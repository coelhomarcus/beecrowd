package bee1021_notasmoedas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double val = sc.nextDouble();
        
        System.out.println("NOTAS:");

        double cd100 = val / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n",(int) cd100);
        val = val % 100;

        double cd50 = val / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) cd50);
        val = val % 50;

        double cd20 = val / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int) cd20);
        val = val % 20;

        double cd10 = val / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n",(int) cd10);
        val = val % 10;

        double cd5 = val / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) cd5);
        val = val % 5;

        double cd2 = val / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) cd2);
        val = val % 2;
        
        System.out.println("MOEDAS:");

        double md100 = val;
        System.out.printf("%d moeda(s) de R$ 1.00\n",(int) md100);  
        val = val % 1;
        
        double md50 = val / 0.50;
        System.out.printf("%d moeda(s) de R$ 0.50\n",(int) md50);
        val = val % 0.50;

        double md25 = val / 0.25;
        System.out.printf("%d moeda(s) de R$ 0.25\n",(int) md25);
        val = val % 0.25;

        double md10 = val / 0.10;
        System.out.printf("%d moeda(s) de R$ 0.10\n",(int) md10);
        val = val % 0.10;

        double md5 = val / 0.05;
        System.out.printf("%d moeda(s) de R$ 0.05\n",(int) md5);
        val = val % 0.05;

        double md1 = val / 0.01;
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", md1);
        
        sc.close();
    }

}