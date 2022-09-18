import java.util.Scanner;

public class EXERCICIO2 {
    // Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
    //igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
    //informações.

    public static void main(String[] args) {
        String usuario, senha;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.print("Informe o usuario:");
            usuario = scanner.next();
            System.out.print("Informe a senha:");
            senha = scanner.next();
            if (usuario.equals(senha)) {
                System.err.println("USUARIO IGUAL SENHA");
            }
        } while (usuario.equals(senha));

    }
}

