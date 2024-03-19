public class Conta {
    private String numero;
    private double saldo;

    public Conta(){
        numero = null;
        saldo = 0.0;
    }

    public Conta(String n, double s){
        numero = n;
        saldo = s;
    }

    public Conta(String n){
        numero = n;
        saldo = 0.0;
    }

    public void imprimirConta(){
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
    
}
