public class Repositorio {
    private Conta [] bd;
    private int indice;

    public Repositorio(){
        bd = new Conta[5];
        indice = 0;
    }

    public void inserir(Conta c){
        bd[indice] = c;
        indice++;
    }

    public void remover(Conta c){
        for(int i = 0; i < indice; i++){
            if(bd[i] == c){
                bd[i] = bd[indice-1];
                bd[indice-1] = null;
                indice--;
            }
        }
    }

    public void printAll(){
        for(int i = 0; i < indice; i++){
            bd[i].imprimir();
        }
    }
}
