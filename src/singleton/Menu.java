package singleton;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static Menu instancia;
    private Map<String, Double> itens;

    private Menu() {
        itens = new HashMap<>();
        itens.put("Café", 2.50);
        itens.put("Chá", 1.50);
    }

    public static synchronized Menu getInstancia() {
        if (instancia == null) {
            instancia = new Menu();
        }
        return instancia;
    }

    public Map<String, Double> getItens() {
        return itens;
    }
}