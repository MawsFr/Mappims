import java.util.ArrayList;


public class Map {
	
	//Carac de base
	private String nom;
	private int longueur;
	private int largeur;
	private int repetition;
	
	//Couches:
	private ArrayList<Couche> couches = new ArrayList<Couche>();
	
	//URL:
	private String chipset;
	private String fond;

	
	
	public Map(String nom, int longueur, int largeur, String chipset, int repetition)
	{
		//Couches: 1:Basse, 2:Haute, 3:Passabilité, 4:transparence
		couches.add(new Couche(1, longueur, largeur)); //Couche Basse
		couches.add(new Couche(2, longueur, largeur)); //Couche haute
		couches.add(new Couche(3, longueur, largeur)); //Couche passabilité
		couches.add(new Couche(4, longueur, largeur)); //Couche transparence
		
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
		this.chipset = chipset;
		this.repetition = repetition;
		
	}
	
	public Map(String nom, int longueur, int largeur, String chipset, int repetition, String fond)
	{
		this(nom, longueur, largeur, chipset, repetition);
		this.fond = fond;
		Remplisseur r = new Remplisseur();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public int getRepetition() {
		return repetition;
	}

	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}

	public String getChipset() {
		return chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getFond() {
		return fond;
	}

	public void setFond(String fond) {
		this.fond = fond;
	}

	public ArrayList<Couche> getCouches() {
		return couches;
	}
	
	
	
		

}
