package com.mycompany.handsonii;
import java.util.Scanner;

public class HandsOnII {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\n#################MENU#################");
            System.out.println("1. Imprimir Rosto ASCII");
            System.out.println("2. Calcular Distância na Terra");
            System.out.println("3. Contar Caracteres");
            System.out.println("4. Questão Múltipla Escolha");
            System.out.println("0. Sair");
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            
            sc.nextLine(); 

            switch (n) {
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    System.out.println("\n--- Executando Att 1 ---");
                    imprimirRosto();
                    break;
                case 2:
                    System.out.println("\n--- Executando Att 2 ---");
                    calcularDistancia(sc);
                    break;
                case 3:
                    System.out.println("\n--- Executando Att 3 ---");
                    contarCaracteres(sc);
                    break;
                case 4:
                    System.out.println("\n--- Executando Att 4 ---");
                    questaoMultiplaEscolha(sc);
                    break;
                default: 
                    System.out.println("Essa opção não existe. Tente novamente.");
            }
       
        } while (n != 0); 
        
        sc.close();
    }
    
    public static void imprimirRosto() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    
    public static void calcularDistancia(Scanner sc) {
        double raio = 6371.01;
        
        System.out.print("Latitude da coordenada 1: ");
        double x1 = Math.toRadians(sc.nextDouble()); 
        
        System.out.print("Longitude da coordenada 1: ");
        double y1 = Math.toRadians(sc.nextDouble());
        
        System.out.print("Latitude da coordenada 2: ");
        double x2 = Math.toRadians(sc.nextDouble());
        
        System.out.print("Longitude da coordenada 2: ");
        double y2 = Math.toRadians(sc.nextDouble());
        
        double distancia = raio * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        
        System.out.println("A distância entre esses pontos é: " + distancia + " km");
    }
    
    public static void contarCaracteres(Scanner sc) {
        System.out.print("Digite uma frase/string de entrada: ");
        String texto = sc.nextLine();
        
        int letras = 0, espacos = 0, numeros = 0, outros = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isSpaceChar(c)) {
                espacos++;
            } else {
                outros++;
            }
        }
        
        System.out.println("Letras: " + letras);
        System.out.println("Espaços: " + espacos);
        System.out.println("Números: " + numeros);
        System.out.println("Outros caracteres: " + outros);
    }
    
    public static void questaoMultiplaEscolha(Scanner sc) {
        int tentativa = 1;
        boolean acertou = false;
        String resposta;
        
        do {
            System.out.println("\nDisciplina: Banco de Dados");
            System.out.println("Qual é a linguagem padrão usada para interagir com bancos de dados relacionais?");
            System.out.println("(a) HTML");
            System.out.println("(b) Python");
            System.out.println("(c) SQL");
            System.out.println("(d) Java");
            System.out.println("(e) C++");
            System.out.print("Escolha uma alternativa (tentativa " + tentativa + " de 3): ");
            
            resposta = sc.nextLine().toLowerCase(); 
            
            switch (resposta) {
                case "c":
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na " + tentativa + "ª tentativa.");
                    acertou = true;
                    break;
                case "a":
                case "b":
                case "d":
                case "e":
                    System.out.println("Resposta incorreta.");
                    tentativa++;
                    break;
                default:
                    System.out.println("Opção inválida! Digite apenas a letra da alternativa (a, b, c, d ou e).");
                    
            }
            
        } while (!acertou && tentativa <= 3);
        
        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }
    }
}
