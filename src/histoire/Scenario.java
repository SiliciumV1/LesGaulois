package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test 
		Gaulois axterix = new Gaulois("Axtérix",10);
		Romain minus = new Romain("Minus",8);
		axterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UNGAUGAU...");
		axterix.frapper(minus);
		axterix.frapper(minus);
		axterix.frapper(minus);
		
		
	}

}
