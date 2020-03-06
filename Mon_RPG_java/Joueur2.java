import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Joueur2 extends JFrame {
	
	private JButton boutonFleur = new JButton("Donner une fleur");
	private JButton boutonCombat = new JButton("Attaquer");
	private JButton boutonSoin = new JButton("Soin");
	private JButton boutonCroquette = new JButton("Donner une croquette de chat.");
	
	private int clickSoin = 0;
	private int clickCroquette = 0;
	private int pv = 4;
	private int pvToi = 3;
	
	public Joueur2() {
		
		
		JPanel combat2 = new JPanel();
		this.setTitle("Combat");
	    this.setSize(450, 450);
	    this.setBackground(Color.RED);
	    this.setLocationRelativeTo(null);  
	    this.setContentPane(combat2);
	    this.setVisible(true);
	 
	    
	    ImageIcon icon = new ImageIcon("ennemi2.jpeg");
	    JLabel img = new JLabel(icon);
	    combat2.add(img);
	    combat2.add(boutonCombat);
	    combat2.add(boutonSoin);
	    combat2.add(boutonCroquette);
	    combat2.add(boutonFleur);
	   
	    
	    boutonCombat.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				
				if(e.getSource() == boutonCombat) {
					System.out.println("");
					System.out.println("");
					System.out.println("-------------------------");	
					System.out.println("Les pv de Miaouss : " + pv);
					System.out.println("Les pv de Toi : " + pvToi);
					System.out.println("Vous perdez 1 pv chacun.");
					System.out.println("-------------------------");
					
					pv--;
					pvToi--;
					
					System.out.println("Les pv de Miaouss : " + pv);
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
						System.out.println("Miaouss te regarde boire la potion.");
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
				System.out.println("Miaouss est admiratif de la fleur.");
				System.out.println("Toi en profite pour fuir.");
				System.out.println("-------------------------");
				dispose();
			}
			
		});
	    
	    
	    boutonCroquette.addActionListener(new java.awt.event.ActionListener()
    	{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				if(clickCroquette == 0) {
				System.out.println("");
				System.out.println("");
				System.out.println("-------------------------");
				System.out.println("Miaouss la mange. Il gagne 1 pv.");
				pv++;
				System.out.println("Pv de Miaouss : " + pv);
				System.out.println("Toi se dit qu'il n'aurait pas du.");
				System.out.println("-------------------------");
				}
				
				else if(clickCroquette  > 0) {
					 System.out.println("Apprend de tes erreurs voyons.");	
				}
				
				clickCroquette++;
			}
			
		});
	}

}
