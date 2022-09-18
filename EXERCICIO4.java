public class EXERCICIO4 {
// Supondo que a população de um país A seja da ordem de 80000 habitantes com
// uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
// com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o
// número de anos necessários para que a população do país A ultrapasse ou iguale a
// população do país B, mantidas as taxas de crescimento.

    public static void main(String[] args) {
        double popA=80000, popB=200000;
        int ano=1;
        System.out.println("ANO -> "+ano);
        System.out.println("Populacao do pais A -> "+popA);
        System.out.println("Populacao do pais B -> "+popB);
        System.out.println("");
        do{
            popA = popA + (popA*0.03);
            popB = popB + (popB*0.015);
            ano = ano+1;
            System.out.println("ANO -> "+ano);
            System.out.println("Populacao do pais A -> "+popA);
            System.out.println("Populacao do pais B -> "+popB);
            System.out.println("");
        }while(popA < popB);

    }
}
