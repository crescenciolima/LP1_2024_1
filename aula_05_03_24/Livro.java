public class Livro {
    private String Titulo;
    private int anoPublicacao;
    private String autor;

    public void setAll(String t, int ap, String a){
        Titulo = t;
        anoPublicacao = ap;
        autor = a;
    }

    public void imprimir(){
        System.out.println("Informações do Livro");
        System.out.println("Titulo: " + Titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor);
    }

}
