public class App {
    
    static double fatorial(double x){
        if(x <= 1){
            return 1;
        } else {
            return x * fatorial(x-1);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(fatorial(5.0));
    }
}
