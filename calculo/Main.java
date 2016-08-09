package calculo;

public class Main{

    private Soma soma;

    public static void main(String[] args) {
        int numx = 10;
        int numy = 5;
        Main main = new Main(numx, numy);
    }

    public Main(int numA, int numB) {
        soma = new Soma(numA, numB);
        System.out.println(soma.somar());
    }
}
