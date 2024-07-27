package main;

import factory.Bebida;
import factory.BebidaFactory;
import singleton.Menu;
import observer.Funcionario;
import observer.Pedido;
import decorator.Leite;
import decorator.Acucar;

public class CafeMain {
    public static void main(String[] args) {
        // Singleton
        Menu menu = Menu.getInstancia();
        System.out.println("Menu: " + menu.getItens());

        // Factory Method
        BebidaFactory bebidaFactory = new BebidaFactory();
        Bebida cafe = bebidaFactory.criarBebida("cafe");
        Bebida cha = bebidaFactory.criarBebida("cha");
        System.out.println("Bebida criada: " + cafe.getDescricao() + " - Custo: " + cafe.getCusto());
        System.out.println("Bebida criada: " + cha.getDescricao() + " - Custo: " + cha.getCusto());

        // Decorator
        cafe = new Leite(cafe);
        cafe = new Acucar(cafe);
        System.out.println("Bebida com extras: " + cafe.getDescricao() + " - Custo: " + cafe.getCusto());

        // Observer
        Pedido pedido = new Pedido();
        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Maria");
        pedido.adicionarObservador(funcionario1);
        pedido.adicionarObservador(funcionario2);
        pedido.notificarObservadores("Café com leite e açúcar");
    }
}