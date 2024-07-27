package observer;

public class Funcionario implements Observador {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String pedido) {
        System.out.println(nome + " recebeu o pedido: " + pedido);
    }
}