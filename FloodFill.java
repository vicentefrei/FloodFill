import java.awt.Color;

public class FloodFill {
    // Algoritmo com Pilha
    public void floodFillComPilha(imagem img, int xInicial, int yInicial, Color novaCor) {
        Color corOriginal = img.getPixel(xInicial, yInicial);
        if (corOriginal.equals(novaCor)) return;

        pilha pilha = new pilha(img.getLargura() * img.getAltura());
        pilha.empilhar(xInicial, yInicial);

        while (!pilha.estaVazia()) {
            int[] ponto = pilha.desempilhar();
            int x = ponto[0];
            int y = ponto[1];

            if (x < 0 || y < 0 || x >= img.getLargura() || y >= img.getAltura()) continue;
            if (!img.getPixel(x, y).equals(corOriginal)) continue;

            img.setPixel(x, y, novaCor);

            pilha.empilhar(x + 1, y); // Direita
            pilha.empilhar(x - 1, y); // Esquerda
            pilha.empilhar(x, y + 1); // Abaixo
            pilha.empilhar(x, y - 1); // Acima
        }
    }

    // Algoritmo com Fila
    public void floodFillComFila(imagem img, int xInicial, int yInicial, Color novaCor) {
        Color corOriginal = img.getPixel(xInicial, yInicial);
        if (corOriginal.equals(novaCor)) return;

        fila fila = new fila(img.getLargura() * img.getAltura());
        fila.enfileirar(xInicial, yInicial);

        while (!fila.estaVazia()) {
            int[] ponto = fila.desenfileirar();
            int x = ponto[0];
            int y = ponto[1];

            if (x < 0 || y < 0 || x >= img.getLargura() || y >= img.getAltura()) continue;
            if (!img.getPixel(x, y).equals(corOriginal)) continue;

            img.setPixel(x, y, novaCor);

            fila.enfileirar(x + 1, y); // Direita
            fila.enfileirar(x - 1, y); // Esquerda
            fila.enfileirar(x, y + 1); // Abaixo
            fila.enfileirar(x, y - 1); // Acima
        }
    }
}
