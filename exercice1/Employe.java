package TP1.exercice1;

import java.time.LocalDate;

public class Employe {
    
    // Atrributs :
    private String matricule;
    private String nom ;
    private String prenom;
        //utiliser la classe LocalDate comme méthode préférée pour effectuer des opérations de date.
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private float salaire;
    
    // Getters :
    public String getmatricule() {
        return matricule;
    }
    public String getnom() {
        return nom;
    }
    public String getprenom() {
        return prenom;
    }
    public LocalDate getdateNaissance() {
        return dateNaissance;
    }
    public LocalDate getdateEmbauche() {
        return dateEmbauche;
    }
    public float getsalaire() {
        return salaire;
    }

    // Setters : 
    public void setmatricule(String newmatricule) {
        this.matricule = newmatricule;
    }
    public void setnom(String newnom) {
        this.nom = newnom;
    }
    public void setprenom(String newprenom) {
        this.prenom = newprenom;
    }
    public void setdateNaissance(LocalDate newdateNaissance) {
        this.dateNaissance = newdateNaissance;
    }
    public void setdateEmbauche(LocalDate newdateEmbauche) {
        this.dateEmbauche = newdateEmbauche;
    }
    public void setsalaire(float newsalaire) {
        this.salaire = newsalaire;
    }
    
    // Constructeurs :
    public Employe(){
    }
    
    public Employe (String matricule ,String nom ,String prenom ,LocalDate dateNaissance ,LocalDate dateEmbauche ,float salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;   
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;        
    }
    
    // Methodes :
    public int age(){
        int age ;
        age = LocalDate.now().getYear() - dateNaissance.getYear();
        return age;    
    }
    
    public int anciennete(){
        int anciennete ;
        //La méthode getyear() utilisée pour obtenir individuellement le champs année de la date qui est soustraite à l’année 1900.
        anciennete = LocalDate.now().getYear() - dateEmbauche.getYear();
        return anciennete;    
    }
    
    public float augmentationDuSalaire(){
        if ( anciennete() < 5  ){
            salaire += (salaire * 2 )/100;
        }
        else if ( anciennete() < 10  ){
            salaire += (salaire * 5 )/100;
        }
        else {
            salaire += (salaire * 10 )/100;
        }
        return salaire;
    
    }
    
    public void afficherEmploye(){
        System.out.print("Matricule : [" + matricule + "], Nom complet : [" + prenom + " " + nom + "], Âge : [" + age() + "], Ancienneté : [" + anciennete() + "], Salaire : [" + augmentationDuSalaire() + "]");
    }
}


   