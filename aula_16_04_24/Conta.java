public class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String n, double s){
        numero = n;
        saldo = s;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void imprimir(){
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
