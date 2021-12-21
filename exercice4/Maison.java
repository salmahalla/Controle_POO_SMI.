package TP1.exercice4;

public class Maison extends Batiment  {
    
    // Atrributs :
    private int nbrePieces;
    
    // Getters :
    public int getnbrePieces() {
        return nbrePieces;
    }

    // Setters : 
    public void setnbrePieces(int newnbrePieces) {
        this.nbrePieces = newnbrePieces;
    }
    
    // Constructeurs :
    public Maison(){
    }
    
    public Maison(String nom ,String adresse ,int nbrePieces) {
        super(nom , adresse); 
        this.nbrePieces = nbrePieces;       
    }

    
    // Methodes :
    @Override
        // Redefinition de la methode toString(): 
    public String toString() {
        return super.toString() + "\nNombre de pièces de la maison : " + getnbrePieces() + " ." ; 
    }
    
}
