import javax.swing.*;

public class Ventana extends JFrame {
    

	private MyCanvas canvas;
    public Ventana(){
        super("Space Adventure");
        setSize(1800, 980);
        setLocationRelativeTo(null);
        canvas = new MyCanvas();
        this.add(canvas);
        
    }

    public MyCanvas getCanvas() {
        return canvas;
    }

    public void setCanvas(MyCanvas canvas) {
        this.canvas = canvas;
    }
}