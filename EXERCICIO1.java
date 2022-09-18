import java.util.Scanner;

public class EXERCICIO1 {
    //Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
    //caso o valor seja inválido e continue pedindo até que o usuário informe um valor
    //válido.
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite uma nota, entre zero e dez:");
        nota = scanner.nextInt();
        if ((nota < 0) || (nota > 10)) {
            do {
                System.out.println("informe um valor valido");
                nota = scanner.nextInt();
            } while ((nota < 0) || (nota > 10));

            }
        }
    }
