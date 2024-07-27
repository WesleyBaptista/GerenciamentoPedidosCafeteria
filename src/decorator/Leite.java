package decorator;

import factory.Bebida;

public class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.50;
    }
}