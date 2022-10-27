package Lieu;

import Objet.Trophee;
import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	protected Trophee reserve[] = new Trophee[200];
	protected int nbTrophee;

	public Trophee[] getReserve() {
		return reserve;
	}

	public int getNbTrophee() {
		return nbTrophee;
	}

	public void donnerTrophees(Gaulois gaulois, Equipement equipDonne) {
		reserve[nbTrophee] = new Trophee(gaulois, equipDonne);
		nbTrophee++;
	}

	public void extraireInstructionsCaml() {
		String texte = "let musee = [\n";
		for (int i = 0; i < nbTrophee - 1; i++) {

			texte = texte + "	\"" + reserve[i].donneNom() + "\"";
			texte = texte + ", ";
			texte = texte + "\"" + reserve[i].getEquipement() + "\"";
			texte = texte + ";";
			texte = texte + "\n";

		}

		if (nbTrophee != 0) {

			texte = texte + "	\"" + reserve[nbTrophee - 1].donneNom() + "\"";
			texte = texte + ", ";
			texte = texte + "\"" + reserve[nbTrophee - 1].getEquipement() + "\"";
			texte = texte + "\n";

		}

		texte = texte + "]";
		System.out.println(texte);
	}
}
