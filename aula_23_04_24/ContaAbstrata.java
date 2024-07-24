public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;

    public ContaAbstrata(String n, double s){
        numero = n;
        saldo = s;
    }

    public abstract void debitar(double valor);

    public void creditar(double valor){
        saldo += valor;
    }
}
