package model;

public class ListaEncadeada {

    private No inicio;
    private No fim;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else if (elemento <= inicio.getElemento()) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else if (elemento >= fim.getElemento()) {
            fim.setProximo(novoNo);
            fim = novoNo;
        } else {
            No anterior = null;
            No atual = inicio;

            while (atual != null && atual.getElemento() < elemento) {
                anterior = atual;
                atual = atual.getProximo();
            }

            anterior.setProximo(novoNo);
            novoNo.setProximo(atual);
        }
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }
}
