package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test 
		int effetPotion;
		
		Druide panoramix = new Druide("panoramix",5,10);
		Gaulois axterix = new Gaulois("Axtérix",8);
		Romain jules = new Romain("Jules",6);
		
		effetPotion=panoramix.preparerPotion();
		axterix.boirePotion(effetPotion);
		
		axterix.frapper(jules,effetPotion);
		
	}

}
