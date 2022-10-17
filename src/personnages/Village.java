package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] Villageois;
	private int NbVillageois = 0;

	public Village(String nom, int NbVillageoisMaximun) {
		this.nom = nom;
		this.Villageois = new Gaulois[NbVillageoisMaximun];
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Gaulois[] ajouterHabitant(Gaulois gaulois, int nbVillageoisMaximum) {
		if (NbVillageois < nbVillageoisMaximum) {
			Villageois[NbVillageois] = gaulois;
			NbVillageois++;
		}
		return Villageois;
	}

	public Gaulois trouverHabitant(int numHabitant) {
		return Villageois[numHabitant - 1];
	}



	public void afficherVillageois() {
		System.out.println("Dans " + getNom() + " du chef " + chef.getNom() + " vivent les legendaires gaulois :");
		for (int i = 0; NbVillageois > i; i++) {
			System.out.println("- " + Villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// The value of the local variable gaulois is not used
		// Car gaulois n'est pas utilisé
		Chef Abraracourcix = new Chef("Abraracourcix", 6, 1, village);
		Gaulois axterix = new Gaulois("Axtérix", 8);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		village.setChef(Abraracourcix);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obélix,30);
		village.afficherVillageois();

	}

}
