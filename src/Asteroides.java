import java.awt.*;
import java.util.Random;

public class Asteroides extends ObjetoMovil {
    private int width, height,max=50,min=15;
    private Random r;


    public Asteroides (Color color, int posX, int posY) {
        super(color,posX,posY);
        width = r.nextInt(((max - min) + 1) + min);
        height = r.nextInt(((max - min) + 1) + min);
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(posX,posY,width,height);
    }
    public void bOOOM(){

    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

}