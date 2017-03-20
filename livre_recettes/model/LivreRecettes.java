package livre_recettes.model;

import java.util.ArrayList;

public class LivreRecettes {
	ArrayList<Recette> livre = new ArrayList<Recette>();

	public void ajouteRecette(Recette laRecette) {
		livre.add(laRecette);
	}

	public void supprimeRecette(Recette laRecette) {
		livre.remove(laRecette);
	}
	
	public void affiche() {
		for (Recette it : livre) {
			System.out.println("recette : " + it.getNom() + " -- " + it.getNote());
		}
	}
}
