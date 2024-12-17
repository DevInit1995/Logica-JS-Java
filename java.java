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
         * int n1 = sc.nextInt();
         * 
         * System.out.println("Informe o segundo valor: ");
         * int n2 = sc.nextInt();
         * int soma = n1 + n2;
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

        /*
         * Double raizQ;
         * 
         * System.out.println("Informe um valor: ");
         * raizQ = sc.nextDouble();
         * 
         * raizQ = Math.sqrt(raizQ);
         * 
         * System.out.println("A raiz quadrada é " + raizQ);
         */

        // OPERADORES LÓGICOS E RELACIONAIS

        int a = 5;
        int b = 8;
        int c = 10;
        int r;
        boolean m;

        m = a != b;
        System.out.println(m);

        // Maior que ou igual (>=)
        m = b >= a;
        System.out.println(m);
        // Menor que ou igual (<=)
        m = a <= b;
        System.out.println(m);

        m = a == b;
        boolean am = c > a;
        System.out.println(m);
        System.out.println(am);

        // Atribuição de adição
        int d, e, f, g;

        d = 10;
        e = 10;
        f = 5;

        int mar = d + f;
        d += f;

        int ma = d - f;
        d -= f;

        System.out.println(mar);
        System.out.println(d);

        System.out.println(ma);
        System.out.println(d);

        int l1, l2, l3;
        boolean eq, es;
        System.out.println("Digite o primeiro lado: ");
        l1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        l2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        l3 = sc.nextInt();

        if (l1 == l2 && l2 == l3) {
            eq = l1 == l2;
            eq = l2 == l3;
            System.out.println("O triangulo é equilatero: " + eq);
        } else if (l1 != l2 && l2 != l3) {
            es = l1 != l2;
            es = l2 != l3;
            System.out.println("O triangulo é escaleno: " + es);
        }
        sc.close();
    }
}