import java.awt.Color;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            // Carregar a imagem
            imagem img = new imagem("Circle.png");

            // Criar o objeto FloodFill
            FloodFill floodFill = new FloodFill();

            // Executar o FloodFill usando Pilha
            floodFill.floodFillComPilha(img, 10, 10, Color.RED);
            img.salvarImagem("Circle.png");

            // Executar o FloodFill usando Fila
            floodFill.floodFillComFila(img, 10, 10, Color.BLUE);
            img.salvarImagem("Circle.png");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
