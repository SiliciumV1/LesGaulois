package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
//
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test 
		
		Druide panoramix = new Druide("panoramix",5,9);
		Gaulois axterix = new Gaulois("Axt�rix",3);
		Gaulois Ob�lix = new Gaulois("Ob�lix",1);
		Romain minus = new Romain("Minus",15);
		
		panoramix.preparerPotion();
		panoramix.booster(Ob�lix);
		panoramix.booster(axterix);
		axterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		axterix.frapper(minus);
		axterix.frapper(minus);
		axterix.frapper(minus);
		
		
		
		
	}

}
