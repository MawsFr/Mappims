
public class Couche {

	private int numero;
	private Case tab[][];
	
	private int longueur;
	private int largeur;
	
	public Couche(int numero, int longueur, int largeur)
	{
		this.numero = numero;
		this.longueur = longueur;
		this.largeur = largeur;
		tab = new Case[longueur][largeur];
	}
	
	public Case[][] getTab()
	{
		return tab;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setTab(Case[][] tab) {
		this.tab = tab;
	}
	
	
	
	
}
