import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Joueur3 extends JFrame {
	
	private JButton boutonFleur = new JButton("Donner une fleur");
	private JButton boutonCombat = new JButton("Attaquer");
	private JButton boutonSoin = new JButton("Soin");
	private int pv = 5;
	private int pvToi = 3;
	private int clickSoin = 0;
	private int click = 0;
	public Joueur3() {
		JPanel combat3 = new JPanel();
		this.setTitle("Combat");
	    this.setSize(450, 450);
	    this.setBackground(Color.RED);
	    this.setLocationRelativeTo(null);  
	    this.setContentPane(combat3);
	    this.setVisible(true);
	    
	    ImageIcon icon = new ImageIcon("ennemi3.jpeg");
	    JLabel img = new JLabel(icon);
	    combat3.add(img);
	    combat3.add(boutonCombat);
	    combat3.add(boutonSoin);
	    combat3.add(boutonFleur);
	    
	    boutonCombat.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				if(e.getSource() == boutonCombat) {
					if(click == 0) {
						System.out.println("");
						System.out.println("");
						System.out.println("-------------------------");
						System.out.println("Etant donné que le salaire des femmes est 25% de moins que les hommes.");
						System.out.println("Jessie étant une femme se fait offrir 25% de pv en plus par sa créatrice.");
						System.out.println("-------------------------");
					}
					
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");	
					System.out.println("Les pv de Jessie : " + pv);
					System.out.println("Les pv de Toi : " + pvToi);
					System.out.println("Vous perdez 1 pv chacun.");
					System.out.println("-------------------------");
					
					click++;
					pv--;
					pvToi--;
					
					System.out.println("Les pv de Jessie : " + pv);
					System.out.println("Les pv de Toi : " + pvToi);
					System.out.println("-------------------------");
				}
				
				if(pvToi == 0) {
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");
					System.out.println("On frappe pas les femmes voyons !");
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
	    
	    boutonFleur.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent fermerFenetre)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("-------------------------");
				System.out.println("Jessie est admiratif de la fleur.");
				System.out.println("Toi en profite pour fuir.");
				System.out.println("-------------------------");
				dispose();
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
						System.out.println("Jessie te regarde boire la potion.");
						pvToi++;
						System.out.println("pv de Toi : " + pvToi);
						System.out.println("-------------------------");
						clickSoin++;
					}
						
					else if(clickSoin > 1) {
						 System.out.println("Tu as plus de potion de soin.");
						 
						 if(clickSoin == 10) {
							 System.out.println("");
							 System.out.println("");
							 System.out.println("-------------------------");
							 System.out.println("Tu as obtenu le titre : 'Déterminé'.");
							 System.out.println("Toi obtient 1 pv de plus. C'est pile ce qui te faut pour gagner.");
							 System.out.println("Toi est rempli de détermination.");
							 System.out.println("-------------------------");
							 pvToi++;
						 }	
					
						 clickSoin++;
					}
				}
				
				else {
					System.out.println("Toi a déjà sa vie au maximum.");
				}
				
			}

		
			
		});
	    
	}
}
