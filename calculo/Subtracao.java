package calculo;

public class Subtracao {

    private int numA, numB;

    public Subtracao(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int subtrair() {
        return numA - numB;
    }
}
