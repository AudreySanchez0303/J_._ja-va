import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pika extends JFrame{
	JFrame Pikachu = new JFrame();
	private JPanel pikachu = new JPanel();
	public Pika() throws IOException {
		this.setTitle("Gagné");
	    this.setSize(450, 450);
	    this.setLocationRelativeTo(null);  
	    this.setBackground(Color.YELLOW);
	    this.setContentPane(pikachu);
	    this.setVisible(true);
	    try{
	    	Desktop desktop = Desktop.getDesktop();
	    	Thread.sleep(1500);
	    	desktop.open(new File("gagné.txt"));
	    	Thread.sleep(3000);
	    	System.exit(1);
	    }
	    
	    catch(InterruptedException e){
	    	System.out.println(e);
	    }  
	    
	}
	
	 
}
