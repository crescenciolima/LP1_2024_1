public class Curso {
    private int codigo;
    private String nome;

    public Curso(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void imprimirCurso(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome do curso: " + nome);
    }

    
}
