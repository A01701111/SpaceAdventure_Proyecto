import java.awt.*;

public abstract class ObjetoMovil{
    protected Color color;
    protected int posX,posY;

    public ObjetoMovil(Color color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}