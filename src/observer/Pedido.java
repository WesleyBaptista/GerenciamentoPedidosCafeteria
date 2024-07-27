package observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String pedido) {
        for (Observador observador : observadores) {
            observador.atualizar(pedido);
        }
    }
}