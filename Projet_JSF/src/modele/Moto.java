package modele;

public class Moto {
	
	private String marque;
	private String modele;
	private int annee;
	private int cv;
	private int cylindree;
	private String reference;
	private String type_moteur;
	private String[] style_moto;
	
	public Moto() {
	}
	

	public Moto(String marque, String modele, int annee, int cv, int cylindree, String reference, String type_moteur,
			String[] style_moto) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.cv = cv;
		this.cylindree = cylindree;
		this.reference = reference;
		this.type_moteur = type_moteur;
		this.style_moto = style_moto;
	}



	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public int getCylindree() {
		return cylindree;
	}
	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getType_moteur() {
		return type_moteur;
	}
	public void setType_moteur(String type_moteur) {
		this.type_moteur = type_moteur;
	}
	public String getStyle_moto() {
		return style_moto;
	}
	public void setStyle_moto(String style_moto) {
		this.style_moto = style_moto;
	}
	
}
