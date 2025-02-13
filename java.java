import java.lang.Math;
import java.util.*;

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
        /*
         * int a = 5;
         * int b = 8;
         * int c = 10;
         * int r;
         * boolean m;
         * 
         * m = a != b;
         * System.out.println(m);
         * 
         * // Maior que ou igual (>=)
         * m = b >= a;
         * System.out.println(m);
         * // Menor que ou igual (<=)
         * m = a <= b;
         * System.out.println(m);
         * 
         * m = a == b;
         * boolean am = c > a;
         * System.out.println(m);
         * System.out.println(am);
         * 
         * // Atribuição de adição
         * int d, e, f, g;
         * 
         * d = 10;
         * e = 10;
         * f = 5;
         * 
         * int mar = d + f;
         * d += f;
         * 
         * int ma = d - f;
         * d -= f;
         * 
         * System.out.println(mar);
         * System.out.println(d);
         * 
         * System.out.println(ma);
         * System.out.println(d);
         * 
         * int l1, l2, l3;
         * boolean eq, es;
         * System.out.println("Digite o primeiro lado: ");
         * l1 = sc.nextInt();
         * System.out.println("Digite o segundo lado: ");
         * l2 = sc.nextInt();
         * System.out.println("Digite o terceiro lado: ");
         * l3 = sc.nextInt();
         * 
         * if (l1 == l2 && l2 == l3) {
         * eq = l1 == l2;
         * eq = l2 == l3;
         * System.out.println("O triangulo é equilatero: " + eq);
         * } else if (l1 != l2 && l2 != l3) {
         * es = l1 != l2;
         * es = l2 != l3;
         * System.out.println("O triangulo é escaleno: " + es);
         * }
         */

        // Exercicios
        // conversor de moedas
        /*
         * double reais;
         * System.out.println("Quantos reais?");
         * reais = sc.nextDouble();
         * double calculo = (reais / 6.17);
         * 
         * System.out.println("Para dólar: " + String.format("%.2f", calculo));
         */

        // converter temperatura
        /*
         * int fahrenheit;
         * double calculo;
         * System.out.println("Informe o Fahrenheit: ");
         * fahrenheit = sc.nextInt();
         * 
         * calculo = (5.0 / 9.0) * (fahrenheit - 32);
         * System.out.println("A temperatura em Celcius é: " + String.format("%.2f",
         * calculo));
         */

        // porcentagem preços de imposto
        // double percentual, preco_com_imposto;
        // double preco;

        /*
         * System.out.println("Qual o preço do produto? US$");
         * preco = sc.nextDouble();
         * 
         * if (preco == 50) {
         * percentual = 20;
         * double calculo = (preco * percentual) / 100;
         * preco_com_imposto = preco + calculo;
         * System.out.println("O valor total com imposto: " + String.format("%.2f",
         * preco_com_imposto));
         * 
         * } else if (preco > 50.01 && preco <= 3000) {
         * percentual = 60;
         * double calculo = (preco * percentual) / 100;
         * preco_com_imposto = preco + calculo;
         * System.out.println("O valor total com imposto: " + String.format("%.2f",
         * preco_com_imposto));
         * }
         */

        // Estruturas condicionais
        /*
         * int ano, nasc, idade;
         * 
         * System.out.println("Em que ano estamos?");
         * ano = sc.nextInt();
         * System.out.println("Em que ano nasceu?");
         * nasc = sc.nextInt();
         * 
         * idade = ano - nasc;
         * 
         * System.out.println("Em " + ano + " você terá " + idade + " anos.");
         * if (idade >= 21) {
         * System.out.println("Você atingiu a maior idade." + " idade, " + idade);
         * }
         */

        /*
         * int valor;
         * System.out.println("Digite um número qualquer: ");
         * valor = sc.nextInt();
         * 
         * if (valor % 2 == 0) {
         * System.out.println("O número " + valor + " é PAR");
         * } else {
         * System.out.println("O número " + valor + " é IMPAR");
         * }
         */

        /*
         * float m, a;
         * double imc;
         * 
         * System.out.println("Mass (Kg): ");
         * m = sc.nextFloat();
         * 
         * System.out.println("Altura (m): ");
         * a = sc.nextFloat();
         * 
         * imc = m / Math.pow(a, 2);
         * 
         * System.out.println("IMC: " + String.format("%.2f", imc));
         * 
         * if (imc < 17) {
         * System.out.println("Muito abaixo do peso.");
         * } else if (imc >= 17 && imc <= 18.5) {
         * System.out.println("Abaixo do peso.");
         * } else if (imc >= 18.5 && imc <= 25) {
         * System.out.println("Parabens! Você está no seu peso ideal");
         * } else if (imc >= 25 && imc <= 30) {
         * System.out.println("Sobrepeso.");
         * } else if (imc >= 30 && imc <= 35) {
         * System.out.println("Obesidade.");
         * } else if (imc >= 35 && imc <= 40) {
         * System.out.println("Obesidade severa.");
         * } else if (imc >= 40) {
         * System.out.println("Obesidade Mórbida.");
         * }
         */

        /*
         * int anoAtual, anoNascimento, idade;
         * 
         * System.out.println("Ano atual (YYYY): ");
         * anoAtual = sc.nextInt();
         * System.out.println("Ano nascimento (YYYY): ");
         * anoNascimento = sc.nextInt();
         * 
         * idade = anoAtual - anoNascimento;
         * 
         * if (idade >= 18) {
         * System.out.println("Apto a tirar carteira." + " Idade: " + idade);
         * } else {
         * System.out.println("Inapto a tirar carteira." + " Idade: " + idade);
         * }
         */

        /*
         * float nota1, nota2;
         * double calculo;
         * 
         * System.out.println("Primeira nota: ");
         * nota1 = sc.nextFloat();
         * System.out.println("Segunda nota: ");
         * nota2 = sc.nextFloat();
         * 
         * calculo = (nota1 + nota2) / 2;
         * 
         * if (calculo >= 6) {
         * System.out.println("Aluno aprovado." + " Nota: " + String.format("%.2f",
         * calculo));
         * } else {
         * System.out.println("Aluno reprovado." + " Nota: " + String.format("%.2f",
         * calculo));
         * }
         */

        /*
         * float n1, n2, m;
         * 
         * System.out.println("Primeira nota: ");
         * n1 = sc.nextFloat();
         * System.out.println("Segunda nota: ");
         * n2 = sc.nextFloat();
         * 
         * m = (n1 + n2) / 2;
         * 
         * System.out.println("A média do aluno foi " + String.format("%.2f", m));
         * 
         * if (m >= 7) {
         * System.out.println("Aluno aprovado");
         * } else {
         * if (m >= 5 && m < 7) {
         * System.out.println("Aluno em RECUPERAÇÃO");
         * } else {
         * System.out.println("Aluno REPROVADO");
         * }
         * }
         */

        /*
         * System.out.println("CRIANÇA ESPERANAÇA");
         * 
         * int d;
         * System.out.println("Muito obrigado por ajudar \n " +
         * "[1] para doar R$10 \n " +
         * "[2] para doar R$25 \n " +
         * "[3] para doar R$50 \n " +
         * "[4] para doar outro valor \n " +
         * "[5] para cancelar");
         * 
         * d = sc.nextInt();
         * 
         * int valor = 0;
         * switch (d) {
         * case 1:
         * valor = 10;
         * break;
         * case 2:
         * valor = 25;
         * break;
         * case 3:
         * valor = 50;
         * break;
         * case 4:
         * System.out.println("Qual o valor da doação? R$");
         * valor = sc.nextInt();
         * break;
         * case 5:
         * valor = 0;
         * break;
         * }
         * System.out.println("Sua doação foi de R$ " + valor);
         * System.out.println("Muito obrigado!");
         */

        /*
         * String nome;
         * float sal;
         * int dep;
         * System.out.println("Qual o nome do Funcionário?");
         * nome = sc.nextLine();
         * System.out.println("Qual o salário do Funcionário?");
         * sal = sc.nextFloat();
         * System.out.println("Qual á quantidade de dependentes?");
         * dep = sc.nextInt();
         * 
         * float nSal;
         * switch (dep) {
         * case 0:
         * nSal = sal + (sal * 5) / 100;
         * break;
         * case 1:
         * case 2:
         * case 3:
         * nSal = sal + (sal * 10) / 100;
         * break;
         * case 4:
         * case 5:
         * case 6:
         * nSal = sal + (sal * 15) / 100;
         * break;
         * default:
         * nSal = sal + (sal * 18) / 100;
         * }
         * 
         * System.out.println("O novo salário de " + nome + " será de R$ " +
         * String.format("%.2f", nSal));
         */

        /*
         * float nota1, nota2, media;
         * 
         * System.out.println("Informe a primeira nota: ");
         * nota1 = sc.nextInt();
         * System.out.println("Informe a segunda nota: ");
         * nota2 = sc.nextInt();
         * media = (nota1 + nota2) / 2;
         * 
         * if (media == 10 || media == 9) {
         * System.out.println("A");
         * } else if (media == 8.9 || media == 8) {
         * System.out.println("B");
         * } else if (media == 7.9 || media == 7) {
         * System.out.println("C");
         * } else if (media == 6.5 || media == 6) {
         * System.out.println("D");
         * } else if (media == 5.9 || media == 5) {
         * System.out.println("E");
         * } else if (media < 5) {
         * System.out.println("F");
         * }
         */

        /*
         * int diferenca, golsB, golsM;
         * System.out.println("Quantos gols do Bangu: ");
         * golsB = sc.nextInt();
         * System.out.println("Quantos gols do Madureira: ");
         * golsM = sc.nextInt();
         * 
         * if (golsB > golsM) {
         * diferenca = golsB - golsM;
         * } else {
         * diferenca = golsM - golsB;
         * }
         * 
         * System.out.println("Diferença: " + diferenca);
         * switch (diferenca) {
         * case 0:
         * System.out.println("STATUS: EMPATE");
         * break;
         * case 1:
         * case 2:
         * case 3:
         * System.out.println("STATUS: PARTIDA NORMAL");
         * break;
         * case 4:
         * case 5:
         * case 6:
         * System.out.println("STATUS: GOLEADA");
         * default:
         * System.out.println("STATUS: ALGO INCOMUM.");
         * System.out.println("Você digitou os dados corretos?");
         * break;
         * }
         */

        // ESTRUTURAS DE REPETIÇÃO
        /*
         * for (int i = 0; i <= 10; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * int i = 0;
         * while (i <= 10) {
         * System.out.println(i);
         * i++;
         * }
         */

        /*
         * int x = 10;
         * while (x >= 0) {
         * System.out.println(x);
         * x--;
         * }
         */

        /*
         * int valor;
         * int a = 0;
         * System.out.println("Informe um valor: ");
         * valor = sc.nextInt();
         * 
         * while (a <= valor) {
         * System.out.println(a);
         * a++;
         * }
         */

        /*
         * int soma = 0;
         * int i = 1;
         * int valor;
         * 
         * while (i <= 10) {
         * System.out.println("Informe o " + i + "° valor: ");
         * valor = sc.nextInt();
         * soma = soma + valor;
         * i++;
         * }
         * System.out.println("O resultado da soma dos valores é: " + soma);
         */

        /*
         * float real,
         * dolar,
         * contacao = 1,
         * conta;
         * 
         * System.out.println("Quantas conversões deseja realizar?");
         * conta = sc.nextFloat();
         * 
         * while (contacao <= conta) {
         * System.out.println("Informe o valor em R$ para converter: ");
         * real = sc.nextFloat();
         * 
         * dolar = real / 6.2f;
         * contacao++;
         * System.out.println("O valor covertido em US$ é: " + String.format("%2f",
         * dolar));
         * }
         */

        /*
         * int inicio,
         * fim;
         * System.out.println("Informe o inicio: ");
         * inicio = sc.nextInt();
         * System.out.println("Informe o fim da contagem: ");
         * fim = sc.nextInt();
         * System.out.println("CONTANDO: ");
         * while (inicio <= fim) {
         * System.out.println(inicio + "..");
         * inicio++;
         * }
         */

        /*
         * *
         * int conta = 1,
         * valores[],
         * quantidade;
         * float nota,
         * maior = 0;
         * String nome = "";
         * 
         * System.out.println("Quantos alunos a turma tem?");
         * quantidade = sc.nextInt();
         * 
         * while (conta <= quantidade) {
         * System.out.println("ALUNO: " + conta);
         * System.out.println("Nome do aluno: ");
         * nome = sc.next();
         * System.out.println("Informe a nota: ");
         * nota = sc.nextFloat();
         * 
         * if (nota > maior) {
         * maior = nota;
         * }
         * conta++;
         * }
         * System.out.println("O aluno com a maior nota é o: " + nome +
         * " e sua nota é: " + maior);
         */

        // do-while
        /*
         * int conta = 1, resultado, numero;
         * 
         * System.out.println("Quer ver a tabuada de qual número: ");
         * numero = sc.nextInt();
         * 
         * do {
         * resultado = numero * conta;
         * System.out.println(numero + " X " + conta + " = " + resultado);
         * conta++;
         * } while (conta <= 10);
         */

        /*
         * // total de números negativos
         * int contador = 0, totalNegativos = 0;
         * 
         * do {
         * int numero;
         * System.out.println("Informe um número: ");
         * numero = sc.nextInt();
         * 
         * if (numero <= 0) {
         * totalNegativos++;
         * }
         * contador++;
         * } while (contador <= 5);
         * System.out.println("Foram digitados: " + totalNegativos +
         * " valores negativos.");
         */

        // fatorial
        /*
         * int conta, numero, fatorial;
         * String continua = "s";
         * 
         * do {
         * System.out.println("Digite um número: ");
         * numero = sc.nextInt();
         * fatorial = 1;
         * conta = numero;
         * 
         * do {
         * fatorial = fatorial * conta;
         * System.out.println(conta + " X ");
         * conta--;
         * } while (conta >= 1);
         * 
         * System.out.println("O fatorial do valor: " + numero + " é " + fatorial);
         * } while (continua.equals("s"));
         */

        /*
         * int conta = 1, contaDiv = 0, numero;
         * 
         * System.out.println("Digite um número: ");
         * numero = sc.nextInt();
         * 
         * // números divisíveis e primos
         * do {
         * System.out.println(conta);
         * if (numero % conta == 0) {
         * contaDiv = contaDiv + 1;
         * }
         * conta++;
         * } while (conta <= numero);
         * 
         * System.out.println("Ao todo existem " + contaDiv + " valores divisíveis.");
         * 
         * if (contaDiv > 2) {
         * System.out.println("O valor " + numero + " não é primo!");
         * } else {
         * System.out.println("O valor " + numero + " é primo!");
         * }
         */

        // opção contador
        /*
         * int conta, opcao;
         * String sair = "s";
         * 
         * do {
         * System.out.println(" Informe a opção: " + "\n" + "[1] De 1 a 10 \n" +
         * "[2] De 10 a 1");
         * opcao = sc.nextInt();
         * 
         * if (opcao == 1) {
         * for (conta = 1; conta <= 10; conta++) {
         * System.out.println(conta + " .. ");
         * }
         * } else if (opcao == 2) {
         * for (conta = 10; conta >= 1; conta--) {
         * System.out.println(conta + " .. ");
         * }
         * }
         * System.out.println("[s/n] Deseja continuar?");
         * sair = sc.next();
         * } while (sair.equals("s"));
         */
        // seletor de pessoas
        /*
         * Stack<Pessoa> pessoas = new Stack<>();
         * 
         * String sexo,
         * corCabelo,
         * continua = "s";
         * int idade;
         * // String pessoas[];
         * do {
         * System.out.println("Qual o seu sexo? [M/F]");
         * sexo = sc.next();
         * System.out.println("Qual a idade?");
         * idade = sc.nextInt();
         * System.out.println("Qual a cor do Cabelo? \n" +
         * "[1] Preto \n" +
         * "[2] Castanho \n" +
         * "[3] Loiro \n" +
         * "[4] Ruivo");
         * corCabelo = sc.next();
         * 
         * switch (corCabelo) {
         * case "1":
         * corCabelo = "Preto";
         * break;
         * case "2":
         * corCabelo = "Castanho";
         * break;
         * case "3":
         * corCabelo = "Loiro";
         * break;
         * case "4":
         * corCabelo = "Ruivo";
         * break;
         * default:
         * corCabelo = "Desconhecido";
         * break;
         * }
         * 
         * pessoas.push(new Pessoa(sexo, idade, corCabelo));
         * 
         * System.out.println("Deseja continuar? [s/n]");
         * continua = sc.next();
         * } while (continua.equals("s"));
         * 
         * // exemplo de como visualizar as pessoas na pilha
         * System.out.println("\nPessoas cadastros:");
         * 
         * int contaM = 0,
         * contaF = 0;
         * for (Pessoa p : pessoas) {
         * if (p.sexo.equalsIgnoreCase("m") && p.idade > 18
         * && p.corCabelo.equals("Castanho")) {
         * contaM = contaM + 1;
         * } else if (p.sexo.equalsIgnoreCase("f") &&
         * p.idade >= 25 && p.idade <= 30 && p.corCabelo.equals("Loiro")) {
         * contaF = contaF + 1;
         * }
         * }
         * System.out.
         * println("Número de homens com mais de 18 anos e cabelos castanhos: " +
         * contaM);
         * System.out.println("Número de mulheres entre 25 a 30 anos e cabelos loiros: "
         * + contaF);
         */

        // soma de valores
        /*
         * int conta,
         * numero,
         * soma = 0;
         * for (conta = 1; conta <= 5;) {
         * while (conta <= 5) {
         * System.out.println("Digite um valor: ");
         * numero = sc.nextInt();
         * soma = soma + numero;
         * conta++;
         * }
         * System.out.println("A soma dos valores é: " + soma);
         * }
         */

        /*
         * int numero,
         * soma = 0;
         * String continua;
         * 
         * do {
         * System.out.println("Digite um valor: ");
         * numero = sc.nextInt();
         * 
         * soma = soma + numero;
         * 
         * System.out.println("Quer continuar? (s/n)");
         * continua = sc.next();
         * } while (continua.equals("s"));
         * System.out.println("A soma dos valores é: " + soma);
         */

        // números pares
        /*
         * int conta, valor;
         * System.out.println("Digite um valor: ");
         * valor = sc.nextInt();
         * if (valor % 2 == 1) {
         * valor--;
         * }
         * 
         * for (conta = valor; conta >= 0; conta -= 2) {
         * System.out.println(conta);
         * }
         */

        /*
         * int totalDez = 0,
         * simp = 0,
         * valor;
         * for (int conta = 1; conta <= 6; conta++) {
         * System.out.println("Digite um valor: ");
         * valor = sc.nextInt();
         * 
         * if (valor >= 0 && valor <= 10) {
         * totalDez = totalDez + 1;
         * if (valor % 2 == 1) {
         * simp = simp + valor;
         * }
         * }
         * }
         * System.out.println("Ao todo foram " + totalDez + " valores entre 0 e 10");
         * System.out.println("Nesse intervalo, a soma de impares foi: " + simp);
         */

        /*
         * // combinações
         * for (int c1 = 1; c1 <= 3; c1++) {
         * for (int c2 = 1; c2 <= 3; c2++) {
         * System.out.println(c1 + " " + c2);
         * }
         * }
         */

        sc.close();
    }

}

class Pessoa {
    String sexo;
    int idade;
    String corCabelo;

    public Pessoa(String sexo, int idade, String corCabelo) {
        this.sexo = sexo;
        this.idade = idade;
        this.corCabelo = corCabelo;
    }
}