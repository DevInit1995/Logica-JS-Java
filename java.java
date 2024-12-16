import java.util.Scanner;
import java.lang.Math;

public class java {
    public String nome;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Comandos de entrada e operadores
        /*
         * System.out.println("Informe o seu nome: ");
         * String nome = sc.nextLine();
         * System.out.println("Muito Prazer, " + nome);
         */

        /*
         * System.out.println("Informe o primeiro valor: ");
         * Integer n1 = sc.nextInt();
         * 
         * System.out.println("Informe o segundo valor: ");
         * Integer n2 = sc.nextInt();
         * Integer soma = n1 + n2;
         * System.out.println("O resultado da soma" + " é: " + soma);
         */

        /*
         * Integer n1, n2, media;
         * 
         * System.out.println("Informe o primeiro valor: ");
         * n1 = sc.nextInt();
         * System.out.println("Informe o segundo valor: ");
         * n2 = sc.nextInt();
         * 
         * media = (n1 + n2) / 2;
         * System.out.println("A média entre " + n1 + " e " + n2 + " é: " + media);
         */

        // FUNÇÕES ARITMÉTICAS
        /*
         * Integer abs;
         * System.out.println("Informe o valor");
         * abs = sc.nextInt();
         * 
         * abs = Math.abs(abs);
         * 
         * System.out.println("O valor absoluto é: " + abs);
         */

        /*
         * Double expo;
         * System.out.println("Informe o valor: ");
         * expo = sc.nextDouble();
         * 
         * expo = Math.exp(expo);
         * 
         * System.out.println("Valor exponecial: " + expo);
         */

        Double raizQ;

        System.out.println("Informe um valor: ");
        raizQ = sc.nextDouble();

        raizQ = Math.sqrt(raizQ);

        System.out.println("A raiz quadrada é " + raizQ);

        sc.close();
    }
}