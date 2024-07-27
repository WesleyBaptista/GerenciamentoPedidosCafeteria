package factory;

public class Cha extends Bebida {
    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public double getCusto() {
        return 1.50;
    }
}