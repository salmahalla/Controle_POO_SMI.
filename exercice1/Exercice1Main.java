package TP1.exercice1;

import java.time.LocalDate;

public class Exercice1Main {

    public static void main(String[] args) {
       //La créeation de l'employe :
       Employe e1 = new Employe("M123456" ,"HAllA" ,"Salma" ,LocalDate.of(2000,04,07), LocalDate.of(2018,5,4), 14000 );
       
       //L'affichage de l'employe :
       e1.afficherEmploye();
       
       /* La sortie de la méthode main sera la suivante :
       
          Matricule : [M123456], Nom complet : [Salma HAllA], Âge : [21], Ancienneté : [3], Salaire : [14280.0]
       
       */
    }
    
}
