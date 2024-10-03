import java.util.NoSuchElementException;

public class fila {
    private int[][] elementos;
    private int frente, tras, tamanho, capacidade;

    public fila(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade][2]; // Armazena coordenadas x, y
        frente = tras = tamanho = 0;
    }

    public void enfileirar(int x, int y) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Fila cheia");
        }
        elementos[tras][0] = x;
        elementos[tras][1] = y;
        tras = (tras + 1) % capacidade;
        tamanho++;
    }

    public int[] desenfileirar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        int[] resultado = elementos[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return resultado;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}
