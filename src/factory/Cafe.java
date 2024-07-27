package factory;

public class Cafe extends Bebida {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getCusto() {
        return 2.50;
    }
}