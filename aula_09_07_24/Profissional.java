public class Profissional extends Socio{
    private String empresa;

    public Profissional(String n, String m, String e){
        super(n, m);
        empresa = e;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Empresa: " + empresa);
    }

    
    
}
