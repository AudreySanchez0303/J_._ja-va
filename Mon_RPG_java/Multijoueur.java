
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Multijoueur extends AbstractAction{

	public Multijoueur(String texte) {
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("Désoler mais ce jeu ne contient pas de multijoueur.");
		System.out.println("-------------------------");
		
	}



}
