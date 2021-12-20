package TP1.exercice2;

public class Point {
    
    // Atrributs :
    private String nomPoint;
    private double x;
    private double y;
    private double z;
    
    // Constructeurs :
    public Point(String nomPoint,double x,double y,double z){
        this.nomPoint = nomPoint;
        this.x = x;
        this.y = y;
        this.z = z;    
    } 

         
    // Methodes :
    public void affiche(){
        System.out.println("Vous avez bien créé le point " + nomPoint + " : " );
        System.out.println("   " + nomPoint + " --> x" + nomPoint + " : " + x + ", y" + nomPoint + " : " + y +", z" + nomPoint + " : " + z );
    }
    
        // La règle de translation du point A(x,y,z) par t(a,b,c) est t:A(x,y,z)↦ A'(x+a,y+b,z+c).
    public void translate(double a, double b, double c){
        double tx, ty, tz; 
        tx = x + a;
        ty = y + b;
        tz = z + c;
        System.out.println("\nLa translation du point " + nomPoint + " donne un nouveau point " + nomPoint + "' :");
        System.out.println("   " + nomPoint + "' --> x" + nomPoint + "' : " + tx + ", y" + nomPoint + "' : " + ty +", z" + nomPoint + "' : " + tz );
    }
        // La distance entre les points A(x1,y1,z1) et B(x2,y2,z2) est d(A,B)=√((x2−x1)^2+(y2−y1)^2).
    public void distance(Point nouveauPoint){
        String nvNomPoint = nouveauPoint.nomPoint;
        double nvx = nouveauPoint.x;
        double nvy = nouveauPoint.y;
        double nvz = nouveauPoint.z;
        double distance ;
        // On utilise Math.pow(x,n)pour la fonction carre de x et Math.sqrt(x) pour √x .
        distance = Math.sqrt(Math.pow((nvx - x),2) + Math.pow((nvy - y),2) + Math.pow((nvz - z),2)); 
        System.out.println("\nLa distance entre le point " + nomPoint + " et le point " + nvNomPoint + " est :" );
        System.out.println("   d("+ nomPoint + " , " + nvNomPoint + ") = " + distance );
    }
    
}
