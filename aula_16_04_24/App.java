public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("333-3", 250.0);
        Poupanca p1 = new Poupanca("567-8", 50.0, 35);
        Poupanca p2 = new Poupanca("888", 340.0, 25);
        p1.renderJuros(0.01);

        Repositorio banco = new Repositorio();
        banco.inserir(c1);
        banco.inserir(c2);
        banco.inserir(p1);
        banco.inserir(p2);

        banco.printAll();


        
    }
}
