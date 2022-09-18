public class EXERCICIO6 {
    // Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
    //Depois modifique o programa para que ele mostre os números um ao lado do outro.

    public static void main(String[] args) {
        int num=1;
        do{
            System.out.println(num);
            num=num+1;
        }while (num!=21);
        System.out.println("");
            num=1;
        do{
            System.out.print(num+"  ");
            num=num+1;
        }while (num!=21);
    }
}
