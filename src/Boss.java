import java.awt.*;

public class Boss extends ObjetoMovil{

    private int lives;
    private int height, width;

    public Boss(Color color, int posX, int posY) {
        super(color,posX,posY);
        lives=20;
        height=600;
        width=1600;
    }
    public void shoot() {

    }
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(posX, posY, width, height);

    }


}