package GFT;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o dia de seu aniversario: ");
            int day = input.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Dia Invalido : " + day + ", o dia não existe");
                return;
            }
        System.out.println("Digite o mes de seu aniversario em numeros: ");
            int month = input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("mes Invalido : " + month + ", o mês nao existe");
                return;
            }
        System.out.println("Digite o ano de seu aniversario: ");
            int year = input.nextInt();
            if (year == 2020 || year == 2021) {
                System.out.println("ano Invalido : " + year + ", o ano é invalido");
                return;
            } else {
                System.out.println(day + "/" + month + "/" + year);
                System.out.println("Data valida");
            }

        }
    }