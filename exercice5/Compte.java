package TP1.exercice5;
 
public class Compte {
    
    // Atrributs :
    private int code;
    private double solde;
    private static int nbreComptes = 0;
    
    
    // Getters :
    public int getcode() {
        return code;
    }
    public double getsolde() {
        return solde;
    }
    public int getnbreComptes() {
        return nbreComptes;
    }

    // Setters : 
    public void setcode(int newcode) {
        this.code = newcode;
    }
    public void setsolde(double newsolde) {
        this.solde = newsolde;
    }
    public void setnbreComptes(int newnbreComptes) {
        Compte.nbreComptes = newnbreComptes;
    }
   
    // Constructeurs :
    public Compte(){
        // Ce constructeur precise que a la création, un compte bancaire a un solde nul et un code incrémenté.
        nbreComptes++;
        code = nbreComptes;
    }
    
    public Compte(double solde){
        // Ce constructeur donne la possibilite de la création d'un compte bancaire en précisant son solde initial.
            nbreComptes++;
            code = nbreComptes;
            this.solde = solde;
        }
    
    // Methodes :
    public void deposer(double somme){
            solde += somme;
        }

    public void retirer(double sommme){
            solde -= sommme;
        }
    
    @Override
    public String toString() {
        return "Code : " + getcode() + 
               "\nSolde  : " + getsolde();
    }
}
