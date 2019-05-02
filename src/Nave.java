import java.awt.*;

public class Nave extends ObjetoMovil {
    private int lives, speed, height, width;
    private Misil misil;

    public Nave(Color color, int posX, int posY, Misil misil2) {
        super(color, posX, posY);
        lives = 3;
        height = 100;
        width = 100;
        speed = 10;
        misil = new Misil(Color.BLACK, posX, posY);
    }

    public void move(int tecla, int lD) {
        
    	if (tecla == 37) {//left

            if ( (posX - speed > 0)) {
                posX -= speed;
            }
        } 
    	
    	if (tecla == 39) {//right

            if (((posX + speed + width) < lD)) {
                posX += speed;
            }
        }
    }

    public void returnBala() {
    	misil.returnBala(posX, posY);
    }
    
    public Misil getMisil() {
		return misil;
	}

	public void setMisil(Misil misil) {
		this.misil = misil;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(posX, posY, width, height);
        
        if(misil.isActiva()) {
        	misil.paint(graphics);
        }

    }

    public boolean colision() {
		return false;
    	
    	
    }
}