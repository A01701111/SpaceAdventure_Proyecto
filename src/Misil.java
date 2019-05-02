import java.awt.*;

public class Misil extends ObjetoMovil{
    private int speedY;
    private int height, width;
    
    private boolean activa;

    public Misil(Color color, int posX, int posY) {
        super(color,posX,posY);
        
        speedY=10;
        height=10;
        width=10;
        
        activa = false;
    }

    
    
    public boolean isActiva() {
		return activa;
	}



	public void setActiva(boolean activa) {
		this.activa = activa;
	}



	public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
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

    public void move() {
    	posY -= speedY;
    }
    
    public void paint(Graphics g) {
    	
    	g.setColor(Color.BLACK);
		g.fillOval(posX, posY, height, width);
    	
    }
    
    public void returnBala(int posX, int posY) {
    	
    	this.posX=posX;
    	this.posY=posY;
    	
    	
    	
    }
    
}
