import java.util.Scanner;
import java.util.Random;

public class MenuDojo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n########### MENU DO DOJÔ ###########");
            System.out.println("1 - Múltiplos de 5 (1 a 500)");
            System.out.println("2 - Gerenciador de Crédito");
            System.out.println("3 - Sistema de Login");
            System.out.println("4 - Jogo de Adivinhação");
            System.out.println("5 - Caixa Eletrônico");
            System.out.println("0 - Sair");
            System.out.println("####################################");
            System.out.print("Escolha um exercício: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Executando Múltiplos de 5 (1 a 500) ---");
                    multiplosDe5(sc);
                    break;
                case 2:
                    System.out.println("\n--- Executando Gerenciador de Crédito ---");
                    gerenciadorDeCredito(sc);
                    break;
                case 3:
                    System.out.println("\n--- Executando Sistema de Login ---");
                    sistemaDeLogin(sc);
                    break;
                case 4:
                    System.out.println("\n--- Executando Jogo de Adivinhação ---");
                    jogoDeAdivinhacao(sc);
                    break;
                case 5:
                    System.out.println("\n--- Executando Caixa Eletrônico ---");
                    caixaEletronico(sc);
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("\n Opção inválida! Por favor, digite um número de 0 a 5.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void multiplosDe5(Scanner scanner) {
        System.out.println("Múltiplos de 5 no intervalo de 1 a 500:");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void gerenciadorDeCredito(Scanner scanner) {
        System.out.println("--- Sistema de Análise de Crédito ---");

        while (true) {
            System.out.print("Digite o número da conta (ou -1 para encerrar): ");
            int numeroConta = scanner.nextInt();

            if (numeroConta == -1) {
                System.out.println("Saindo do gerenciador de crédito...");
                break; 
            }

            System.out.print("Saldo no início do mês: R$ ");
            double saldoInicial = scanner.nextDouble();

            System.out.print("Total de despesas (itens cobrados) no mês: R$ ");
            double despesas = scanner.nextDouble();

            System.out.print("Total de créditos aplicados no mês: R$ ");
            double creditos = scanner.nextDouble();

            System.out.print("Limite de crédito autorizado: R$ ");
            double limiteCredito = scanner.nextDouble();

            double novoSaldo = saldoInicial + despesas - creditos;

            System.out.printf("Novo saldo da conta %d: R$ %.2f\n", numeroConta, novoSaldo);

            if (novoSaldo > limiteCredito) {
                System.out.println("Limite de crédito excedido!");
            }
            
            System.out.println("----------------------------------------");
        }
    }

    public static void sistemaDeLogin(Scanner scanner) {
        int senhaCorreta = 12345; 
        int tentativas = 0;
        boolean acessoLiberado = false;

        System.out.println("--- Tela de Login ---");

        while (tentativas < 3) {
            System.out.print("Digite a senha numérica: ");
            int senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso permitido");
                acessoLiberado = true;
                break;
            } else {
                System.out.println("Senha incorreta");
                tentativas++;
            }
        }

        if (!acessoLiberado) {
            System.out.println("Acesso bloqueado");
        }
    }

    public static void jogoDeAdivinhacao(Scanner scanner) {
        Random random = new Random(); 
        boolean jogarNovamente;

        System.out.println("--- Jogo de Adivinhação ---");

        do {
            int numeroSecreto = random.nextInt(100) + 1; 
            int tentativas = 0;
            boolean venceu = false;

            System.out.println("\nUm número secreto entre 1 e 100 foi sorteado. Você tem 10 tentativas!");

            while (tentativas < 10) {
                System.out.print("Tentativa " + (tentativas + 1) + "/10. Qual o seu palpite? ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite == numeroSecreto) {
                    System.out.println("Acertou!");
                    venceu = true;
                    break; 
                } else if (palpite > numeroSecreto) {
                    System.out.println("Muito alto!");
                } else {
                    System.out.println("Muito baixo!");
                }
            }

            if (venceu) {
                System.out.println("Parabéns! Você venceu na " + tentativas + "ª tentativa.");
            } else {
                System.out.println("Fim de jogo! Você perdeu. O número secreto era: " + numeroSecreto);
            }

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            String resposta = scanner.next();
            
            jogarNovamente = resposta.equalsIgnoreCase("S");

        } while (jogarNovamente); 
    }

    public static void caixaEletronico(Scanner scanner) {
        System.out.println("--- Caixa Eletrônico ---");
        System.out.print("Informe o valor que deseja sacar: R$ ");
        int valor = scanner.nextInt();
        
        if (valor <= 0) {
            System.out.println(" Erro: O valor do saque deve ser maior que zero!");
        } else {
            System.out.println("\nSaque autorizado! Entregando as notas:");
            
            int[] notas = {100, 50, 20, 10, 5, 2, 1};
            
            for (int i = 0; i < notas.length; i++) {
                int valorNotaAtual = notas[i];
                
                int quantidadeDeNotas = valor / valorNotaAtual;
                
                if (quantidadeDeNotas > 0) {
                    System.out.println(quantidadeDeNotas + " nota(s) de R$ " + valorNotaAtual);
                    
                    valor = valor % valorNotaAtual;
                }
            }
            System.out.println("\nSaque finalizado com sucesso!");
        }
    }
}
