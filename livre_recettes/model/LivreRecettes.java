package livre_recettes.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

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
	
	public void afficheParNote() {
		if (livre.isEmpty()) {
			System.out.println("Aucune recette");
			return;
		}
		
		System.out.println("Classement des recettes par note :");
		ArrayList<Recette> livreOrdonneParNoteRecettes = new ArrayList<Recette> (livre);
		Collections.sort(livreOrdonneParNoteRecettes, getComparateurParNotes());
		for (Recette r : livreOrdonneParNoteRecettes ) {
			System.out.println("recette : " + r.getNom() + " -- " + r.getNote());
		}
		
		System.out.println("Classement des recettes par ordre alphabétique :");
		ArrayList<Recette> livreOrdonneParNomDeRecettes = new ArrayList<Recette> (livre);
		Collections.sort(livreOrdonneParNomDeRecettes);
		for (Recette r : livreOrdonneParNomDeRecettes ) {
			System.out.println("recette : " + r.getNom() + " -- " + r.getNote());
		}
	}
	
	public Comparator<Recette> getComparateurParNotes() {
		
		return new Comparator<Recette>() {

			@Override
			public int compare(Recette arg0, Recette arg1) {
				return (arg0.getNote() < arg1.getNote()) ? -1 : (arg0.getNote() > arg1.getNote()) ? 1 : 0;
			}
           
        };
		
	}

}
