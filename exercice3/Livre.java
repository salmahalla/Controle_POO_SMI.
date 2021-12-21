package TP1.exercice3;

import java.util.Arrays;

public class Livre {
    
    // Atrributs :
    private String ref;
    private String titre;
    private String listeAuteurs[];
    private String annee;
    private String maisonEdition;
    
    // Getters :
    public String getref() {
        return ref;
    }
    public String gettitre() {
        return titre;
    }
    public String[] getlisteAuteurs() {
        return listeAuteurs;
    }
    public String getannee() {
        return annee;
    }
    public String getmaisonEdition() {
        return maisonEdition;
    }
    
    // Setters : 
    public void setref(String newref) {
        this.ref = newref;
    }
    public void settitre(String newtitre) {
        this.titre = newtitre;
    }
    public void setlisteAuteurs(String[] newlisteAuteurs) {
        this.listeAuteurs = newlisteAuteurs;
    }
    public void setannee(String newannee) {
        this.annee = newannee;
    }
    public void setmaisonEdition(String newmaisonEdition) {
        this.maisonEdition = newmaisonEdition;
    }
    
    // Methodes :
    @Override
    public String toString() {
        return "Reference : " + getref() + 
               "\nTitre  : " + gettitre() +
	       "\nListe des auteurs  : " + Arrays.toString(getlisteAuteurs()) +
               "\nAnnee  : " + getannee() +
               "\nMison d'edition  : " + getmaisonEdition() +
               " .";
    }
    
    public boolean chercherAuteur(String auteur){
        /*La méthode contains() vérifie si une chaîne contient une séquence de caractères.
          Retourne true si les caractères existent et false sinon.*/
        return Arrays.toString(getlisteAuteurs()).contains(auteur); 
    }
    
    public boolean chercherTheme(String theme){
        //La méthode split() divise une chaîne en sous-chaînes à l'aide du séparateur " " (caractère espace).
        String[] resultTheme = theme.split(" ");
        String[] resultTitre = gettitre().split(" ");
        for (String wordTheme : resultTheme)
            for (String wordTitre : resultTitre) {
                    //La méthode equals() utilisée pour comparer deux chaînes et déterminer si elles sont égales.
                    if (wordTheme.equals(wordTitre)){
                        return true; 
                    }
            }  
    return false; 
    }
   
}
 
