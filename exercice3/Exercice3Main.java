package TP1.exercice3;

public class Exercice3Main {

    public static void main(String[] args) {
        //La Créeation du livre :
        Livre l1 = new Livre();
        
        //l'affectation des valeurs :
        l1.setref("2409013643") ;  
        l1.settitre("Apprendre la programmation orientée objet avec le langage Java");
        l1.setannee("2018");
            //Il faut tout d'abord créer un tableau et le remplire.
            String listeAuteurs[] = { "Luc Gervais", "Thierry Groussard", "Thierry Richard"};
            //On affecte ce tableau a l'objet l1.   
        l1.setlisteAuteurs(listeAuteurs);      
        l1.setmaisonEdition("Eni Editions");
        
        //L'affichage des caractéristiques du livre :
        System.out.println( l1.toString() );
        
        //La recherche d'un auteur donné en paramètre :
        System.out.println("\nLe livre est écrit par cet auteur ? --> " + l1.chercherAuteur("Claude Delannoy") );
        
        //La recherche d'un thème du livre :
        System.out.println("\nLe livre traite ce thème ? --> " + l1.chercherTheme("la programmation") );
        
     
        /* La sortie de la méthode main sera la suivante :
        
           Reference : 2409013643
           Titre  : Apprendre la programmation orientée objet avec le langage Java
           Liste des auteurs  : [Luc Gervais, Thierry Groussard, Thierry Richard]
           Annee  : 2018
           Mison d'edition  : Eni Editions .
        
           Le livre est écrit par cet auteur ? --> false
        
           Le livre traite ce thème ? --> true 
        
        */
    }
    
}
