public class Hospede {
    private int codigo;
    private String nome, cpf, rg, telefone;

    public Hospede(int c, String n, String cpf, String r, String t){
        codigo = c;
        nome = n;
        this.cpf = cpf;
        rg = r;
        telefone = t;
    }

    public void imprimir_hospede(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + telefone);
    }
    
}
