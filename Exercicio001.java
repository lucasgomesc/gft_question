package GFT;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        int i;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor de 4 digitos");
        i = input.nextInt();

        while (i<=999 || i>=10000) {
            System.out.println("O programa deve conter no minimo 4 digitos, insira outro numero: ");
            i = input.nextInt();
        }


        i = Integer.parseInt(Integer.toString(i));
        String s = "" + i;

        String a = String.valueOf(s.charAt(0) + "" + s.charAt(1)+ "" + s.charAt(2)+ "" + s.charAt(3));
        System.out.println("Valor inserido: " + a);
        int par = 0;

            if (s.charAt(0) % 2 == 0) {
                par++;
            }
            if (s.charAt(1) % 2 == 0) {
                par++;
            }
            if (s.charAt(2) % 2 == 0) {
                par++;
            }
            if (s.charAt(3) % 2 == 0) {
                par++;
            }

        System.out.println("Quantidade de numeros pares: " + par);
    }
}
