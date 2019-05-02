import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener{


	private JPanel panelS;
	 private JButton iniciar,salir;
	 private CanvasMenu fondo;
	
	 public Menu() {
		 super("juego ");
			setSize(1800,980);
			setLocationRelativeTo(null);
			
			this.setLayout(new BorderLayout());
			panelS=new JPanel();
			iniciar= new JButton("START");
			salir= new JButton("EXIT");
			iniciar.addActionListener(this);
			salir.addActionListener(this);
			
			iniciar.setPreferredSize(new Dimension(150,60));
			salir.setPreferredSize(new Dimension(150,60));
			
			panelS.setLayout(new FlowLayout());
			panelS.setOpaque(true);
			panelS.setBackground(Color.BLUE);
			panelS.setForeground(Color.BLUE);
			panelS.add(iniciar);
			panelS.add(salir);
			fondo = new CanvasMenu("Space Adventure");
			this.add(fondo,BorderLayout.CENTER);
			this.add(panelS,BorderLayout.SOUTH);
	 }
	
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getSource()==iniciar){
			Ventana mv =new Ventana();
			mv.setVisible(true);
			mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(false);
		}else{
			System.exit(0);
			
		}
	}
	}
	
