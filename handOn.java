package com.mycompany.handson;

import java.util.Scanner;

/**
 * @author gabrielrezende
 */
public class HandsOn {

    public static void main(String[] args) {
        
        
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]  ");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        
        
        Scanner sc = new Scanner(System.in);
        int n, q;
        q = 0;
        System.out.println("###########MENU############");
        for (q = 1; q < 11; q++){
            System.out.println("Exercicio: " + q);
            if (q > 10){
                return;
            }
        }
        System.out.println("Sair: 0");
        System.out.println("##########################");
        do{
            System.out.println("Qual Exercicio você gostaria de escolher?");
            System.out.println("Digite um numero:");
            n = sc.nextInt();

            switch (n){
                case 0:
                    System.out.println("Sair");
                case 1:
                    System.out.println("Executando exercicio 1");
                    exercicio1(sc);
                    break;
                case 2:
                    System.out.println("Executando exercicio 2");
                    exercicio2(sc);
                    break;
                case 3:
                    System.out.println("Executando exercicio 3");
                    exercicio3(sc);
                    break;
                case 4:
                    System.out.println("Executando exercicio 4");
                    exercicio4(sc);
                    break;
                case 5:
                    System.out.println("Executando exercicio 5");
                    exercicio5(sc);
                    break;
                case 6:
                    System.out.println("Executando exercicio 6");
                    execicio6(sc);
                    break;
                case 7:
                    System.out.println("Executando exercicio 7");
                    exercicio7(sc);
                    break;
                case 8:
                    System.out.println("Executando exercicio 8");
                    exercicio8(sc);
                    break;
                case 9:
                    System.out.println("Executando exercicio 9");
                    exercicio9(sc);
                    break;
                case 10:
                    System.out.println("Executando exercicio 10");
                    exercicio10(sc);
                    break;
                default:
                    System.out.println("\\nOpção inválida! Por favor, digite um número de 0 a 10.");
            }
            } while (n != 0); 
        sc.close();
    }
    
   
    public static void exercicio1(Scanner sc) {
       System.out.println("Exercicio 1: Executando código da Exercicio 1");
       int numinteiro;

       System.out.println("Digite um número inteiro");
       numinteiro = sc.nextInt();

       if (numinteiro % 2 == 0){
        System.out.println("O número informado é PAR.");
       }
       else {
        System.out.println("O número informado é ÍMPAR.");
       }
    
    }
    
    public static void exercicio2(Scanner sc) {
       System.out.println("Exercicio 2: Executando código da Exercicio 2");
       int numinteiroum, numinteirodois;

       System.out.println("Digite o primeiro número inteiro");
       numinteiroum = sc.nextInt();
       System.out.println("Digite o segundo número inteiro");
       numinteirodois = sc.nextInt();

       if (numinteiroum > numinteirodois){
        System.out.println("O primeiro número é maior que o segundo.");
       }
       else if (numinteiroum < numinteirodois) {
        System.out.println("O segundo número é maior que o primeiro.");
       }
       else {
        System.out.println("Os números são iguais.");
        
       }
    }
    
    public static void exercicio3(Scanner sc) { 
        double result;
        int n, n1, n2;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Voltar ao menu");
            n = sc.nextInt();
            
            switch (n) {
                case 1:
                    System.out.println("Somar");
                    System.out.println("Digite um numero:");
                    n1 = sc.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = sc.nextInt();
                    result = n1 + n2;
                    System.out.println("Resultado: " + result);
                    break;
                case 2:
                    System.out.println("Subtrair");
                    System.out.println("Digite um numero:");
                    n1 = sc.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = sc.nextInt();
                    result = n1 - n2;
                    System.out.println("Resultado: " + result);
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    System.out.println("Digite um numero:");
                    n1 = sc.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = sc.nextInt();
                    result = n1 * n2;
                    System.out.println("Resultado: " + result);
                    break;
                case 4:
                    System.out.println("Dividir");
                    System.out.println("Digite um numero:");
                    n1 = sc.nextInt();
                    System.out.println("Digite outro numero:");
                    n2 = sc.nextInt();
                    
                    if (n2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        result = (double) n1 / n2; 
                        System.out.println("Resultado: " + result);
                    }
                    break;
                case 0:
                    System.out.println("Voltando para o menu principal...");
                    break; 
                default:
                    System.out.println("Opção inválida.");
            }
        } while (n != 0);
    }
    
    public static void exercicio4(Scanner sc) {
        System.out.println("\n--- VALIDAÇÃO DE ENTRADA ---");
        double nota;
        
        do {
            System.out.print("Digite uma nota válida (entre 0 e 10): ");
            nota = sc.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Erro: A nota deve estar entre 0 e 10. Tente novamente!\n");
            }
            
        } while (nota < 0 || nota > 10); 
        
        System.out.println("\nSucesso! A nota " + nota + " foi registrada.");
        System.out.println("----------------------------\n");
    }
    
    public static void exercicio5(Scanner sc) {
        System.out.println("\n--- SENTINELA (PARADA NO 0) ---");
        System.out.println("Digite números inteiros (digite 0 para encerrar):");
        
        int numero;
        int soma = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            soma += numero;
            contador++; 
        }
        
        System.out.println("\n[Programa encerrado pelo valor sentinela '0']");
        System.out.println("Quantidade de números digitados (sem o zero): " + contador);
        System.out.println("Soma dos números: " + soma);
        System.out.println("-------------------------------\n");
    }
    
    public static void execicio6(Scanner sc){
        float saldo, sacar, depositar, verSaldo, n1;
        saldo = 1000;
        int n;
        
        do{
            System.out.println("\n --- Simulador de caixa ---");
            System.out.println("1. Depositar: ");
            System.out.println("2. Sacar: ");
            System.out.println("3. Ver saldo: ");
            System.out.println("4. Sair: ");
            n = sc.nextInt();
            switch (n){
                case 1 :
                    System.out.println("Depositar");
                    n1 = sc.nextFloat();
                    depositar = saldo + n1;
                    saldo = depositar;
                    System.out.println("O seu saldo é: " + saldo);
                    break;
                case 2 :
                    System.out.println("Sacar");
                    n1 = sc.nextFloat();
                    sacar = saldo - n1;
                    saldo = sacar;
                    System.out.println("O seu saldo é: " + saldo);
                    break;
                case 3 :
                    System.out.println("Ver saldo");
                    verSaldo = saldo;
                    System.out.println("O seu saldo é: " + verSaldo);
                    break;
                case 4 :
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
            } 
        } while (n != 4); 
    }
    
    public static void exercicio7(Scanner sc) {
        System.out.println("\n--- CALCULADORA DE DESCONTO POR CATEGORIA ---");
        System.out.print("Digite o preço original do produto: R$ ");
        double preco = sc.nextDouble();
        
        System.out.println("\nSelecione a categoria do produto:");
        System.out.println("1 - Eletrônicos (10% de desconto)");
        System.out.println("2 - Vestuário (20% de desconto)");
        System.out.println("3 - Alimentos (5% de desconto)");
        System.out.print("Digite o código da categoria: ");
        int categoria = sc.nextInt();
        
        double porcentagemDesconto = 0.0;
        
        switch (categoria) {
            case 1:
                porcentagemDesconto = 0.10; 
                break;
            case 2:
                porcentagemDesconto = 0.20; 
                break;
            case 3:
                porcentagemDesconto = 0.05; 
                break;
            default:
                System.out.println("Categoria inválida! O produto será cobrado sem desconto.");
        }
        
        double valorDesconto = preco * porcentagemDesconto;
        double precoFinal = preco - valorDesconto;
        
        System.out.println("\n--- RECIBO ---");
        System.out.printf("Preço original: R$ %.2f\n", preco);
        System.out.printf("Desconto aplicado: R$ %.2f\n", valorDesconto);
        System.out.printf("Preço final a pagar: R$ %.2f\n", precoFinal);
        System.out.println("---------------------------------------------\n");
    }
    
    public static void exercicio8(Scanner sc){
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        int numero;

        System.out.println("\n--- CONTADOR DE NÚMEROS ---");
        System.out.println("Por favor, digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++; 
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++; 
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
        System.out.println("-----------------------\n");
    }
    
    public static void exercicio9(Scanner sc) {
        System.out.println("\n--- SOMA DE 1 ATÉ N ---");
        System.out.print("Digite o valor de N (um número inteiro positivo): ");
        int n = sc.nextInt();
        
        int soma = 0;
        
        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
        } else {
            for (int i = 1; i <= n; i++) {
                soma += i; 
            }
            
            System.out.println("A soma de todos os números de 1 até " + n + " é: " + soma);
        }
        System.out.println("-----------------------\n");
    }
    
    public static void exercicio10(Scanner sc) {
        System.out.println("\n--- CONTAGEM REGRESSIVA E SOMA ---");
        System.out.print("Digite um número inteiro N (maior que zero): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Valor inválido! O número precisa ser maior que zero.");
        } else {
            int soma = 0;
            
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " "); 
                soma += i; 
            }
            
            System.out.println(); 
            System.out.println("Soma = " + soma);
        }
        System.out.println("----------------------------------\n");
    }
    
}
