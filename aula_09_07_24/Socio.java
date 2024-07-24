public abstract class Socio {
    protected String nome;
    protected String matricula;

    public Socio(String n, String m){
        nome = n;
        matricula = m;
    }

    public abstract void imprimir();

}
