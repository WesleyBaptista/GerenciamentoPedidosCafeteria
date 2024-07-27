package factory;

public class BebidaFactory {
    public Bebida criarBebida(String tipo) {
        if (tipo.equalsIgnoreCase("cafe")) {
            return new Cafe();
        } else if (tipo.equalsIgnoreCase("cha")) {
            return new Cha();
        }
        return null;
    }
}