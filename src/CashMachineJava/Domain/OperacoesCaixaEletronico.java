package CashMachineJava.Domain;

public interface OperacoesCaixaEletronico {
    void visualizarSaldo();
    void sacarQuantia(double montanteSaque);
    void depositarQuantia(double montanteDeposito);
    void visualizarExtrato();
}
