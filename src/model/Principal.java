package model;

public class Principal {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada(); // Lista encadeada

        lista.inserir(10);
        lista.inserir(30);
        lista.inserir(20);
        lista.inserir(15);
        lista.inserir(45);
        lista.inserir(5);

        System.out.println("Elementos da lista:");

        No atual = lista.getInicio();
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }
}
