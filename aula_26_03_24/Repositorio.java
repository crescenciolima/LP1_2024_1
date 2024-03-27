public class Repositorio {
    private Conta [] BD;
    private int indice;

    public Repositorio(){
        BD = new Conta[5];
        indice = 0;
    }

    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }

    public int procurar(Conta c){
        int temp = 0;
        for(int i = 0; i < indice; i++){
            if(BD[i] == c){
                temp = i;
            }
        }
        return temp;
    }

    public void remover_procurar(Conta c){
        int temp = procurar(c);
        BD[temp] = BD[indice-1];
        BD[indice-1] = null;
        indice--;
    }

    public void remover(Conta c){
        for(int i = 0; i < indice; i++){
            if(BD[i] == c){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
            }
        }
    }

    public void printALL(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }
}
