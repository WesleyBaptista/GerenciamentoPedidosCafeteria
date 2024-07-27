package decorator;

import factory.Bebida;

public class Acucar extends IngredienteDecorator {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Açúcar";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.20;
    }
}