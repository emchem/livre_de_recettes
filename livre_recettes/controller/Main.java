package livre_recettes.controller;

import livre_recettes.model.Recette;
import livre_recettes.model.LivreRecettes;

public class Main {

	public static void main(String[] args) {
		LivreRecettes monLivreDeRecettes = new LivreRecettes();


		Recette recette1 = new Recette("soupe");
		Recette recette2 = new Recette("café");
		Recette recette3 = new Recette("épinards");
		monLivreDeRecettes.ajouteRecette(recette1);
		monLivreDeRecettes.ajouteRecette(recette2);
		monLivreDeRecettes.ajouteRecette(recette3);
		
		recette1.setNote(1);
		recette2.setNote(5);
		recette3.setNote(3);
		monLivreDeRecettes.affiche();
		monLivreDeRecettes.afficheParNote();
		monLivreDeRecettes.afficheParNom();;
	}

}
