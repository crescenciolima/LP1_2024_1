public class Conta extends ContaAbstrata{
    public Conta(String n, double s){
        super(n, s);
    }  

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
