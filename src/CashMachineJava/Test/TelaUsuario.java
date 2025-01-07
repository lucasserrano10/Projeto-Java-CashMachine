package CashMachineJava.Test;

import CashMachineJava.Domain.OperacoesCaixaEletronico;
import CashMachineJava.Domain.OperacoesCaixaEletronicoImplements;

import java.util.Scanner;

public class TelaUsuario {
    public static void main(String[] args) {
        OperacoesCaixaEletronico operacoes = new OperacoesCaixaEletronicoImplements();
        int numeroDeConta = 12345;
        int pinDaConta = 123;

        Scanner input = new Scanner(System.in);
        System.out.println("Bem Vindo(a) ao caixa eletrônico JAVA");
        System.out.print("Entre com o Número da Conta : ");

        int inputNumeroDeConta = input.nextInt();

        System.out.print("Entre com o PIN da conta : ");

        int inputPinDaConta = input.nextInt();

        if(inputNumeroDeConta == numeroDeConta && inputPinDaConta == pinDaConta ){
            while(true){
                System.out.println(" 1. Visualizar Saldo \n 2. Sacar Quantia \n 3. Depositar Quantia \n 4. Visualizar Extrato \n 5. Sair");
                System.out.print("Escolha uma Opção : ");
                int escolha = input.nextInt();
                if(escolha == 1){
                    operacoes.visualizarSaldo();
                } else if (escolha == 2) {
                    System.out.print("Digite Quanto Você Deseja Sacar : ");
                    double saqueTotal = input.nextDouble();
                    operacoes.sacarQuantia(saqueTotal);

                } else if (escolha == 3) {
                    System.out.print("Digite Quanto Você Deseja Depositar : ");
                    double depositoTotal = input.nextDouble();
                    operacoes.depositarQuantia(depositoTotal);
                } else if (escolha == 4) {
                    operacoes.visualizarExtrato();
                } else if (escolha == 5) {
                    System.out.println(" Colete seu Cartão do Caixa Eletrônico \n Obrigado por usar o Caixa Eletrônico Java !");
                    System.exit(0);
                }else{
                    System.out.println("Por favor, Escolha uma opção válida");
                }
            }
        }else{
            System.out.println("Numero da conta ou PIN inválidos !");
            System.exit(0);
        }
    }
}
