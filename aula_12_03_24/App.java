public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();

        String n2 = "123-4";
        double s2 = 100.0;

        Conta c2 = new Conta(n2, s2);
        Conta c3 = new Conta("333-3");

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        Curso BSI = new Curso(987, "Sistemas de Informação");
        Aluno Tonhao = new Aluno("Antonio", "543-1", 23, BSI, c2);

        Tonhao.imprimir();


    }
}
