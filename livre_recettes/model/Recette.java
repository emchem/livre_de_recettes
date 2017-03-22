package livre_recettes.model;

public class Recette implements Comparable<Recette> {
	private int noteCourante = 0;


	private String nomRecette = null;

	public Recette(String nomRecette) {
		this.nomRecette = nomRecette;
	}
	public void setNote(int note) {
		noteCourante = note;
	}
	
	public int getNote() {
		return noteCourante;
	}

	public void setNom(String nom) {
		nomRecette = nom;
	}
	
	public String getNom() {
		return nomRecette;
	}
	@Override
	public int compareTo(Recette o) {
		return this.getNom().compareTo(o.getNom());
		
	}
}
