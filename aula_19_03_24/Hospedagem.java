public class Hospedagem {
    private int codigo, aposento;
    private Data dataEntrada, dataSaida;
    private Hospede info_hospede;
    
    public Hospedagem(int c, Data d1, Data d2, Hospede h, int a){
        codigo = c;
        dataEntrada = d1;
        dataSaida = d2;
        info_hospede = h;
        aposento = a;
    }

    public void relatorio(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Data entrada: ");
        dataEntrada.imprimir_data();
        System.out.println("Data saida: ");
        dataSaida.imprimir_data();
        System.out.println("Hospede: ");
        info_hospede.imprimir_hospede();
        System.out.println("Aposento: " + aposento);
    }

}
