package TP1.exercice2;

public class Exercice2Main {

    public static void main(String[] args) {
        //La Créeation des points :
        Point a = new Point("A",1,2,3);
        Point b = new Point("B",1,2,3);
        
        //L'affichage des caractéristiques du point :
        a.affiche();
        
        //Le déplacement et l’affichage du nouveau point :
        a.translate(7, 9, 4);
        
        //Le calcule de la distance entre ce point et un autre point :
        a.distance(b);
        
        /* La sortie de la méthode main sera la suivante :
        
            Vous avez bien créé le point A : 
              A --> xA : 1.0, yA : 2.0, zA : 3.0

           La translation du point A donne un nouveau point A' :
              A' --> xA' : 8.0, yA' : 11.0, zA' : 7.0

           La distance entre le point A et le point B est :
              d(A , B) = 0.0
        
        */
    }
    
}
