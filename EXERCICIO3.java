import java.util.Scanner;

public class EXERCICIO3 {
    // Faça um programa que leia e valide as seguintes informações:
    //  a. Nome: maior que 3 caracteres;
    //  b. Idade: entre 0 e 150;
    //  c. Salário: maior que zero;
    //  d. Sexo: 'f' ou 'm';
    //  e. Estado Civil: 's', 'c', 'v', 'd';

    public static void main(String[] args) {
        String nome,sexo, estadocivil;
        int idade, salario, s=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("informe o nome (min 3 caracteres): ");
            nome = scanner.next();
            System.out.println("");
        } while (nome.length() <= 3);
        do {
            System.out.print("informe a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
            System.out.println("");
        }while((idade < 0)||(idade >150));
        do {
            System.out.print("informe o salario (maior que zero): ");
            salario = scanner.nextInt();
            System.out.println("");
        }while (salario<0);
        do{
            System.out.print("informe o sexo (f ou m): ");
            sexo = scanner.next();
            System.out.println("");
            if(sexo.equals("f") || sexo.equals("m")){
                s = 1;
            }
        }while (s == 0 );

        do{
            s=0;
            System.out.print("informe o estado civil (c, s ,v ,d): ");
            estadocivil = scanner.next();
            System.out.println("");
            if (estadocivil.equals("c")||estadocivil.equals("s")||estadocivil.equals("v")||estadocivil.equals("d")){
                s=1;
            }
        }while (s==0);
    }
}