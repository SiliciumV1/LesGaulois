package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	private int forcePotion=1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax-effetPotionMin+1);
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force : "+ forcePotion);
			
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est" + 
					" seulement de force : "+ forcePotion);
		}
	}
	
	public void booster(Gaulois nom) {
		// TODO Auto-generated method stub
		if (nom.getNom().equals("Obélix")) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
			nom.parler("Par Bélénos, ce n'est pas juste");
			
		}
		else {
			nom.boirePotion(forcePotion);
		}


	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix",5,10);
		Gaulois Obélix = new Gaulois("Obélix",5);
		panoramix.preparerPotion();
		
		
	}
	
	
}