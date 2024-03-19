public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private Curso cursoAluno;
    private Conta contaAluno;

    public Aluno(String n, String c, int i, Curso ca, Conta contaA){
        nome = n;
        cpf = c;
        idade = i;
        cursoAluno = ca;
        contaAluno = contaA;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        cursoAluno.imprimirCurso();
        contaAluno.imprimirConta();
    }

}
