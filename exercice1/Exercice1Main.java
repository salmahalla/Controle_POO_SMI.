package TP1.exercice1;

import java.time.LocalDate;

public class Exercice1Main {

    public static void main(String[] args) {
    
       Employe e1 = new Employe("M123456" ,"HAllA" ,"Salma" ,LocalDate.of(2000,04,07), LocalDate.of(2018,5,4), 14000 );
        e1.afficherEmploye();
    }
    
}
