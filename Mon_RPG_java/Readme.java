
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Readme extends AbstractAction{

	public Readme(String texte) {
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("Règlement :");
		System.out.println("");
		System.out.println("Tu es Toi nommé 'Toi'.");
		System.out.println("Et tu es perdu dans un grand cube de 4x4 en pleine nuit.");
		System.out.println("Il y a la Team Rocket qui veut t'attaquer.");
		System.out.println("Récupère vite le Pickachu invisible dans une des cases de ce cube pour faire échouer la Team Rocket.");
		System.out.println("");
		System.out.println("Le déplacement se fera en tour par tour.");
		System.out.println("Bonne chance pour ne pas que l'ennemi se retrouve sur votre case.");
		System.out.println("");
		System.out.println("Conseil :");
		System.out.println("Les fleurs sont tes amies.");
		System.out.println("");
		System.out.println("ATTENTION :");
		System.out.println("Ne pas spammer les boutons s'il vous plait.");
		System.out.println("-------------------------");
	}

}
