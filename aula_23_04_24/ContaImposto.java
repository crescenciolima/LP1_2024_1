public class ContaImposto extends ContaAbstrata {
    public ContaImposto(String n, double s){
        super(n, s);
    }

    public void debitar(double valor){
        double imposto = valor * 0.01;
        if(saldo >= (valor+imposto)){
            saldo -= (valor+imposto);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
