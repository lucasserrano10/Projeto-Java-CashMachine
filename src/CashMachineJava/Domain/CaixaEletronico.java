package CashMachineJava.Domain;

public class CaixaEletronico {
    private double saldo;
    private double depositoTotal;
    private double saqueTotal;

    public CaixaEletronico(){

    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositoTotal() {
        return depositoTotal;
    }

    public void setDepositoTotal(double depositoTotal) {
        this.depositoTotal = depositoTotal;
    }

    public double getSaqueTotal() {
        return saqueTotal;
    }

    public void setSaqueTotal(double saqueTotal) {
        this.saqueTotal = saqueTotal;
    }
}
