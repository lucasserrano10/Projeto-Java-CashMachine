package CashMachineJava.Domain;

import java.util.HashMap;
import java.util.Map;

public class OperacoesCaixaEletronicoImplements implements OperacoesCaixaEletronico{
    CaixaEletronico caixa = new CaixaEletronico();

    Map<Double, String> extrato = new HashMap<>();

    @Override
    public void visualizarSaldo() {
        System.out.println();
        System.out.println("Saldo Disponível : " + caixa.getSaldo());
        System.out.println();
    }

    @Override
    public void sacarQuantia(double montanteSaque) {
        double saldoAtual = caixa.getSaldo();
        if (saldoAtual < montanteSaque){
            System.out.println();
            System.out.println("Saldo insuficiente");
            System.out.println();
        }else{
            if(montanteSaque > 1000){
                System.out.println("Não é possivel sacar mais que 1000R$");
            }else{
                caixa.setSaldo(saldoAtual - montanteSaque);
                extrato.put(montanteSaque, "R$ Quantia Sacada");
                visualizarSaldo();
                System.out.println();
                System.out.println("Saque de " + montanteSaque + "R$ Realizado com Sucesso !");
                System.out.println();
            }
        }

    }

    @Override
    public void depositarQuantia(double montanteDeposito) {
        caixa.setSaldo(montanteDeposito + caixa.getSaldo());
        extrato.put(montanteDeposito, "Quantia Depositada");
        System.out.println();
        System.out.println(montanteDeposito + " Depositado com Sucesso !");
        System.out.println();
        visualizarSaldo();
    }

    @Override
    public void visualizarExtrato() {
        for(Map.Entry<Double,String> e:extrato.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
