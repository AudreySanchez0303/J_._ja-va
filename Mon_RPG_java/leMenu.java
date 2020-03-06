
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class leMenu extends JFrame{
	private JButton bouton;
	private JButton bouton2;
	private JButton bouton3;
	private JButton bouton4;

	public leMenu() {
		super("RPG Poke-Slender");
    	
		bouton = new JButton("Solo");
		bouton2 = new JButton(new Multijoueur("Multijoueur"));
		bouton3 = new JButton (new Readme ("Readme"));
		bouton4 = new JButton("Exit");
		JPanel panneau = new JPanel();
		
    	bouton.setForeground(Color.magenta);
    	bouton2.setForeground(Color.PINK);
    	bouton3.setForeground(Color.cyan);
    	bouton4.setForeground(Color.red);
    	
    	panneau.add(bouton);
    	panneau.add(bouton2);
    	panneau.add(bouton3);
    	panneau.add(bouton4);
    	bouton4.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent fermerFenetre)
			{
					System.exit(1);
			}

		
			
		});
    	setContentPane(panneau);
    	setSize(400,60);
    	setVisible(true);
    	bouton.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent fermerFenetre)
			{
				JFrame laMap = new Map();
			}

		});
    
    
	}

	
	

	
 }
	
