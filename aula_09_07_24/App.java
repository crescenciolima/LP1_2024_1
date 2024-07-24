public class App {
    public static void main(String[] args) throws Exception {
        Profissional p1 = new Profissional("Wiliam", "123", "Google");
        Estudante e1 = new Estudante("Mary", "333", "IFBA");

        Repositorio BD = new Repositorio();
        BD.inserir(p1);
        BD.inserir(e1);
        BD.remover(p1);
        BD.relatorio();
    }
}
