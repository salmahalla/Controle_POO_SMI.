package TP1.exercice5;

public class Exercice5Main {

    public static void main(String[] args) {
        //La Créeation des comptes :
        Compte C1 = new Compte(); 
        CompteEpargne C2 = new CompteEpargne();
        ComptePayant C3 = new ComptePayant();
        
        //L'appel à la méthode 𝑑é𝑝𝑜𝑠𝑒𝑟():    
        C1.deposer(1000);
        C2.deposer(1000);
        C3.deposer(1000);
            
        //L'appel à la méthode 𝑟𝑒𝑡𝑖𝑟𝑒𝑟() :
        C1.retirer(500);
        C2.retirer(500);
        C3.retirer(500);
        
        //L'appel à la méthode 𝑐𝑎𝑙𝑐𝑢𝑙𝐼𝑛𝑡𝑒𝑟ê𝑡() :
        C2.CalculerInteret();
         
        //L'affichage des soldes des comptes :
        System.out.print(C1.toString());
        System.out.print(C2.toString());
        System.out.print(C3.toString());
        
        /* La sortie de la méthode main sera la suivante :
        
           Code : 1
           Solde  : 500.0

           Compte Epargne: Code : 2
           Solde  : 525.0

           Compte Payant: Code : 3
           Solde  : 460.0
        
        */
            

    
    }
    
}
