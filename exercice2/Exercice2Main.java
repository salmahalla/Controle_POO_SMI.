package TP1.exercice2;

public class Exercice2Main {

    public static void main(String[] args) {
        //La Créeation du point:
        Point a = new Point("A",1,2,3);
        Point b = new Point("B",1,2,3);
        
        //L'affichage des caractéristiques du point :
        a.affiche();
        
        //Le déplacement et l’affichage du nouveau point :
        a.translate(7, 9, 4);
        
        //Le calcule de la distance entre ce point et un autre point :
        a.distance(b);
    }
    
}
