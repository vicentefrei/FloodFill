import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class imagem {
    private BufferedImage imagem;

    public imagem(String caminho) throws IOException {
        this.imagem = ImageIO.read(new File(caminho));
    }

    public void salvarImagem(String caminho) throws IOException {
        ImageIO.write(imagem, "png", new File(caminho));
    }

    public Color getPixel(int x, int y) {
        int cor = imagem.getRGB(x, y);
        return new Color(cor);
    }

    public void setPixel(int x, int y, Color cor) {
        imagem.setRGB(x, y, cor.getRGB());
    }

    public int getAltura() {
        return imagem.getHeight();
    }

    public int getLargura() {
        return imagem.getWidth();
    }
}
