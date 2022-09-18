import java.util.Scanner;

public class EXERCICIO7 {
// Faça um programa que leia 5 números e informe o maior número.

    public static void main(String[] args) {
        int num, cont = 1, maior=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("informe o " + cont + " numero -> ");
            num = scanner.nextInt();
            cont=cont+1;
            if(num > maior){
                maior=num;
            }
        } while (cont <= 5);
        System.out.println("O maior numero e o "+maior);
    }
}
