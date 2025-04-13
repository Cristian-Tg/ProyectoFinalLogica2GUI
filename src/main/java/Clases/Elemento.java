package Clases;

public class Elemento {
    private String elemento;
    private int valor;

    public Elemento(String elemento, int value) {
        this.elemento = elemento;
        this.valor = value;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
