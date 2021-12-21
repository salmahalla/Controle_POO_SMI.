package TP1.exercice5;
 
public class ComptePayant extends Compte {
     
    // Constructeurs :
    public ComptePayant(){
    }
    
    public ComptePayant(double solde){
        // Ce constructeur initialise le compte bancaire epargne .
        super(solde);       
    }

    //Méthodes
    
    @Override
    public void deposer(double somme){
            super.deposer(somme);
            super.retirer(20);
        }

    @Override
    public void retirer(double sommme){
            super.retirer(sommme);
            super.retirer(20);
        }

    @Override
    public String toString() {
        return "\n\nCompte Payant: " + super.toString() ; 
    }
    
}
