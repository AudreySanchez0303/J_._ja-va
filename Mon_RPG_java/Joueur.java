import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Joueur extends JFrame {
	private JButton boutonFleur = new JButton("Donner une fleur");
	private JButton boutonCombat = new JButton("Attaquer");
	private JButton boutonSoin = new JButton("Soin");
	
	private int pv = 4;
	private int pvToi = 3;
	private int clickSoin = 0;
	
	
	public Joueur() {
		JPanel combat = new JPanel();
		this.setTitle("Combat");
	    this.setSize(450, 450);
	    this.setBackground(Color.RED);
	    this.setLocationRelativeTo(null);  
	    this.setContentPane(combat);
	    this.setVisible(true);
	    
	    ImageIcon icon = new ImageIcon("ennemi1.jpeg");
	    JLabel img = new JLabel(icon);
	    combat.add(img);
	    combat.add(boutonCombat);
	    combat.add(boutonSoin);
	    combat.add(boutonFleur);
	    
	   

	    
	    boutonCombat.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				if(e.getSource() == boutonCombat) {
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");	
					System.out.println("Les pv de James : " + pv);
					System.out.println("Les pv de Toi : " + pvToi);
					System.out.println("Vous perdez 1 pv chacun.");
					System.out.println("-------------------------");
					
					pv--;
					pvToi--;
					
					System.out.println("Les pv de James : " + pv);
					System.out.println("Les pv de Toi : " + pvToi);
					System.out.println("-------------------------");
				}
				
				if(pvToi == 0) {
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");
					System.out.println("C'est pas gentil d'être méchant !");
					System.out.println("");
					System.out.println("Game Over");
					System.out.println("-------------------------");
					System.exit(1);
				}
				
				else if(pv == 0) {
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");
					System.out.println("C'est pas gentil d'être méchant !");
					System.out.println("");
					System.out.println("Vous avez remporté le combat.");
					System.out.println("Levy : Hey Listen !");
					System.out.println("La Fée soigne Toi.");
					System.out.println("-------------------------");
					dispose();
					
				}
				
			}

		
			
		});
	    
	    boutonSoin.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				if(pvToi < 3) {
					if(clickSoin < 2) {
						System.out.println("");
						System.out.println("");
						System.out.println("-------------------------");
						System.out.println("Tu as utilisé une potion de soin.");
						System.out.println("James te regarde boire la potion.");
						pvToi++;
						System.out.println("pv de Toi : " + pvToi);
						System.out.println("-------------------------");
						clickSoin++;
					}
				
					else if(clickSoin > 1) {
						System.out.println("Tu as plus de potion de soin.");	
					}
				}
				
				else {
					System.out.println("Toi a déjà sa vie au maximum.");
				}
				
			}

		
			
		});
	    
	    boutonFleur.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent fermerFenetre)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("-------------------------");
				System.out.println("James est admiratif de la fleur.");
				System.out.println("Toi en profite pour fuir.");
				System.out.println("-------------------------");
				dispose();
			}
			
		});
	    
	}
}
