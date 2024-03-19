public class Data {
    private int dia;
    private String mes;
    private int ano;

    public Data(int d, String m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void imprimir_data(){
        System.out.println(dia + " de " + mes + " de " + ano);
    }
    
}
