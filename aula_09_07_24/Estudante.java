public class Estudante extends Socio {
    private String universidade;

    public Estudante(String n, String m, String u){
        super(n, m);
        universidade = u;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Universidade: " + universidade);
    }

}
