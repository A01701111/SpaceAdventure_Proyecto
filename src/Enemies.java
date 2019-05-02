import java.awt.*;


public class Enemies extends ObjetoMovil{
    private int height, width, speed;
    

    public Enemies(Color color, int posX, int posY) {
        super(color,posX,posY);
        height=80;
        width=80;
        
        
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public void shoot() {

    }
    
    public void move(int flag,int lD){
        if (flag==-1) {//left

            if ( (posX - speed > 0)) {
                posX -= speed;
            }
        } else if (flag==1) {//right

            if (((posX + speed + width) < lD)) {
                posX += speed;
            }
        }
        
                   
        
    }

    
    public void moveDown(int lInf) {
    	
    	if (((posY + speed + width) < lInf)) {
            posY += speed;
        }
    	
    }
    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(posX, posY, width, height);

    }



}