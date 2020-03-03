package entites;

public class Personne {
	

	 public String nom;
	 public String prenom;
	 public AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
    public void AfficherIdentite() {
    	System.out.println (prenom + " " + nom.toUpperCase());
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
    
      
	}



