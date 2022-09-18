import java.util.Scanner;

public class EXERCICIO8 {
//Faça um programa que leia 5 números e informe a soma e a média dos números.

    public static void main(String[] args) {
        int num, cont = 1;
        double soma=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("informe o " + cont + " numero -> ");
            num = scanner.nextInt();
            cont=cont+1;
            soma= num + soma;
        } while (cont <= 5);
        System.out.println("A soma dos numeros  -> "+soma);
        System.out.println("A media dos numeros -> "+(soma/5));
    }
}