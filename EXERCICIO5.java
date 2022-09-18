import java.util.Scanner;

public class EXERCICIO5 {
    //Altere o programa anterior permitindo ao usuário informar as populações e as taxas
    //de crescimento iniciais. Valide a entrada e permita repetir a operação.

    public static void main(String[] args) {
        double popA, popB, taxaA, taxaB;
        int ano=1, rep=0, cont=0;
        Scanner scanner = new Scanner(System.in);

do {
    System.out.print("Informe a populacao do pais A: ");
    popA = scanner.nextDouble();
    System.out.print("Informe a taxa de crecimento do pais A: ");
    taxaA = scanner.nextDouble();
    System.out.print("Informe a populacao do pais B: ");
    popB = scanner.nextDouble();
    System.out.print("Informe a taxa de crecimento do pais B: ");
    taxaB = scanner.nextDouble();
    taxaA = taxaA / 100;
    taxaB = taxaB / 100;
    System.out.println("");
    System.out.println("ANO -> " + ano);
    System.out.println("Populacao do pais A -> " + popA);
    System.out.println("Populacao do pais B -> " + popB);
    System.out.println("");
    if(popA<popB) {
        do {
            popA = popA + (popA * taxaA);
            popB = popB + (popB * taxaB);
            ano = ano + 1;
            System.out.println("ANO -> " + ano);
            System.out.println("Populacao do pais A -> " + popA);
            System.out.println("Populacao do pais B -> " + popB);
            System.out.println("");
        } while (popA <= popB);
    }
    else{
        do {
            popA = popA + (popA * taxaA);
            popB = popB + (popB * taxaB);
            ano = ano + 1;
            System.out.println("ANO -> " + ano);
            System.out.println("Populacao do pais A -> " + popA);
            System.out.println("Populacao do pais B -> " + popB);
            System.out.println("");
        } while (popB <= popA);
    }
    System.out.println("Digite 1 para repetir a operacao ou outro numero para sair ");
    rep = scanner.nextInt();
}while (rep==1);
    }
}

