public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(5, "janeiro", 2024);
        Data d2 = new Data(10, "janeiro", 2024);
        //d1.imprimir_data();
        //d2.imprimir_data();
        Hospede h = new Hospede(123, "Joana Dark", "44-3", "11-2", "555-5251");
        //h.imprimir_hospede();
        Hospedagem hm1 = new Hospedagem(11, d1, d2, h, 406);
        hm1.relatorio();
    }
}
