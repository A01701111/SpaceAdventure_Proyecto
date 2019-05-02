import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;


public class MyCanvas extends Canvas implements KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Nave ship;
	private Timer reloj;
	private int cuantos;
	private Enemies enemies;
	private Boss master;
	private BufferedImage imagen;
    
	public MyCanvas(){
        super();
        this.setFocusable(true);
        cuantos=0;
        ship = new Nave(Color.GREEN, 600, 490, new Misil(Color.BLACK, 600, 490));
        enemies = new Enemies(Color.BLUE, 400, 100);
        reloj = new Timer(10, this);
        this.addKeyListener(this);
        this.setFocusable(true);
    }
	
	
    public Nave getShip() {
		return ship;
	}
	public void setShip(Nave ship) {
		this.ship = ship;
	}
	public Timer getReloj() {
		return reloj;
	}
	public void setReloj(Timer reloj) {
		this.reloj = reloj;
	}
	public int getCuantos() {
		return cuantos;
	}
	public void setCuantos(int cuantos) {
		this.cuantos = cuantos;
	}
	
	public Enemies getEnemies() {
		return enemies;
	}
	public void setEnemies(Enemies enemies) {
		this.enemies = enemies;
	}
	public Boss getMaster() {
		return master;
	}
	public void setMaster(Boss master) {
		this.master = master;
	}
	
	
	
	@Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent tecla) {
    	int oprimida;
    	oprimida=tecla.getKeyCode();
    	System.out.println(oprimida);
    	
    	if(oprimida!=32) {
    		
    		ship.move(oprimida, 1800);
    			
    	}
    	
    	//Disparar bala con tecla espacio
    	if(oprimida==32) {
    		ship.getMisil().setPosX(ship.getPosX() + ship.getHeight()/2);
    		ship.getMisil().setPosY(ship.getPosY() + ship.getHeight()/2);
    		ship.returnBala();
    	//activa la bala
    	ship.getMisil().setActiva(true);
    		
    	//eventos del timer
    	reloj.start();
    	}
    	this.repaint();
    	
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
        
    public void paint(Graphics g){
		ship.paint(g);
		enemies.paint(g);
		Graphics gra=imagen.createGraphics();
		gra.setColor(Color.WHITE);
		gra.fillRect(0,0,this.getWidth(),this.getHeight());
		g.drawImage(imagen,0,0,null);
		if(enemies != null){
			enemies.paint(g);
		}
	}


	public BufferedImage getImagen() {
		return imagen;
	}


	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		boolean colision = false;
    	ship.getMisil().move();
    	
    	    	
    	if(enemies != null) {
    		Rectangle r1,r2;
			r1=new Rectangle(enemies.getPosX(), enemies.getPosY(), enemies.getHeight(),enemies.getWidth());
			r2=new Rectangle(ship.getMisil().getPosX(),ship.getMisil().getPosY(),5,5);
			colision=r1.intersects(r2);
			if(colision){
				enemies=null;
			}
    	}cuantos+=1;
		
    	if((cuantos>50) || (colision) || ship.getMisil().getPosY()<=0){
			reloj.stop();
			ship.getMisil().setActiva(false);
			
		}
		repaint();
	}
}