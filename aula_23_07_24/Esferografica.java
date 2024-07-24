public class Esferografica implements Caneta {
    private String cor;

    public Esferografica(String cor){
        this.cor = cor;
    }

    public void escrever(String texto){
        System.out.println("Escrevendo " + texto + " com caneta esferografica de cor " + cor);
    }

    public String getCor(){
        return cor;
    }
}
