public class App {
    public static void main(String[] args) throws Exception {
        Conta x = new Conta();
        Conta y = new Conta();



        Livro l = new Livro();

        x.setNumero("123-4");
        x.setSaldo(100.0);
        x.creditar(100.0);
        x.debitar(105.0);
        y = x;


        System.out.println(x);
        System.out.println(y);
        System.out.println("Numero da conta: " + x.getNumero());
        x.setNumero("555-5");
        System.out.println("Numero da conta: " + y.getNumero());
        System.out.println("Saldo: " + x.getSaldo());

        l.setAll("Duna", 1965, "Frank Herbert");
        System.out.println(l);
        l.imprimir();
    }
}
