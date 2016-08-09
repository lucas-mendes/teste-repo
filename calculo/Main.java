package calculo;

public class Main{

    private Soma soma;
    private Subtracao sub;

    public static void main(String[] args) {
        int numx = 10;
        int numy = 5;
        Main main = new Main(numx, numy);
    }

    public Main(int numA, int numB) {
        soma = new Soma(numA, numB);
        System.out.println(soma.somar());

        sub = new Subtracao(numA, numB);
        System.out.println(sub.subtrair());
    }
}
