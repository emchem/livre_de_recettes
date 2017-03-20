package livre_recettes.controller;

import livre_recettes.model.Recette;
import livre_recettes.model.LivreRecettes;

public class Main {

	public static void main(String[] args) {
		LivreRecettes monLivreDeRecettes = new LivreRecettes();

		Recette recette1 = new Recette("soupe");
		Recette recette2 = new Recette("café");
		monLivreDeRecettes.ajouteRecette(recette1);
		monLivreDeRecettes.ajouteRecette(recette2);
		monLivreDeRecettes.affiche();
	}

}
