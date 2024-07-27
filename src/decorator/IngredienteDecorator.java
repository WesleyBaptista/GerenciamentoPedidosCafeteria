package decorator;

import factory.Bebida;

public abstract class IngredienteDecorator extends Bebida {
    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract String getDescricao();
}