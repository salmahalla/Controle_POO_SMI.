package TP1.exercice5;
 
public class CompteEpargne extends Compte {
    
    // Atrributs :
    private double tauxinteret=5;
    
    // Getters :
    public double gettauxinteret() {
        return tauxinteret;
    }

    // Setters : 
    public void settauxinteret(double newtauxinteret) {
        this.tauxinteret = newtauxinteret;
    }
    
    // Constructeurs :
    public CompteEpargne(){
    }
    
    public CompteEpargne(double solde){
        // Ce constructeur initialise le compte bancaire epargne .
        super(solde);       
    }

    //Méthodes
    public void CalculerInteret(){
        deposer((getsolde() * tauxinteret)/ 100);
    }

    @Override
    public String toString() {
        return "\n\nCompte Epargne: " + super.toString() ; 
    }
}
