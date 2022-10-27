package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

//
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test

		Druide panoramix = new Druide("panoramix", 5, 9);
		Gaulois axterix = new Gaulois("Axtérix", 5);
		Gaulois Obélix = new Gaulois("Obélix", 8);
		Romain minus = new Romain("Minus", 15);

		minus.sEquiper(Equipement.CASQUE);

		panoramix.preparerPotion();
		axterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		panoramix.booster(axterix);
		axterix.frapper(minus);
		axterix.frapper(minus);
		axterix.frapper(minus);

	}

}
