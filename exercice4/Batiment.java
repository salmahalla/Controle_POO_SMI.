package TP1.exercice4;

public class Batiment {
    
    // Atrributs :
    private String nom;
    private String adresse;
    
    // Getters :
    public String getnom() {
        return nom;
    }
    public String getadresse() {
        return adresse;
    }

    // Setters : 
    public void setnom(String newnom) {
        this.nom = newnom;
    }
    public void setadresse(String newadresse) {
        this.adresse = newadresse;
    }
    
    // Constructeurs :
    public Batiment(){
    }
    
    public Batiment(String nom ,String adresse) {
        this.nom = nom;
        this.adresse = adresse;        
    }
    
    // Methodes :
    @Override
    public String toString() {
        return "Nom du batiment : " + getnom() + 
               "\nAdresse : " + getadresse();
    }
}
