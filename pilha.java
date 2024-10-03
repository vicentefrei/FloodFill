import java.util.EmptyStackException;

public class pilha {
    private int[][] elementos;
    private int topo;

    public pilha(int capacidade) {
        elementos = new int[capacidade][2]; // Armazena coordenadas x, y
        topo = -1;
    }

    public void empilhar(int x, int y) {
        if (topo == elementos.length - 1) {
            throw new StackOverflowError("Pilha cheia");
        }
        elementos[++topo][0] = x;
        elementos[topo][1] = y;
    }

    public int[] desempilhar() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        return elementos[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}
