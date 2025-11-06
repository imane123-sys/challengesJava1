//import java.util.Scanner;
//


////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
////1. Système de Facturation Électrique
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entrez le nombre d’unités consommées :");
//        int NombreUnite = sc.nextInt();
//        double montantAfterTax =0;
//
//        double montantTotal = 0;
//        double montantTaxe = 0;
//        if (NombreUnite <= 100) {
//            montantTotal = NombreUnite * 0.8;
//            System.out.println( "le montant avant taxe :"+montantTotal+"DH");
//            montantTaxe = montantTotal * 0.1;
//            System.out.println( "le montant du  taxe :"+montantTaxe);
//            montantAfterTax= montantTotal+ montantTaxe;
//            System.out.println( "le montant apres  taxe :"+montantAfterTax);
//
//
//
//
//
//
//        } else if (NombreUnite >= 101 || NombreUnite < 300) {
//            montantTotal = NombreUnite * 1.2;
//            System.out.println( "le montant avant taxe :"+montantTotal +"DH");
//            montantTaxe = montantTotal * 0.1;
//            System.out.println( "le montant du  taxe :"+montantTaxe +"DH");
//            montantAfterTax= montantTotal+ montantTaxe;
//            System.out.println( "le montant apres  taxe :"+montantAfterTax+"DH");
//
//
//
//        } else {
//            montantTotal = NombreUnite * 1.5;
//            montantTaxe = montantTotal * 0.1;
//            System.out.println( "le montant avant taxe :"+montantTotal+"DH");
//            System.out.println( "le montant du  taxe :"+montantTaxe +"DH");
//            montantAfterTax= montantTotal+ montantTaxe;
//            System.out.println( "le montant apres  taxe :"+montantAfterTax+"DH");
//
//
//            System.out.println(montantTotal);
//        }
//    }
//}

//    2. Robot Navigateur (Robot Path Finder) Brouillon
import javax.sql.PooledConnection;
import java.awt.*;
import java.util.Scanner;

//public class Main{
//    public static void main(String[] args){
//        String choix ="UP";
//
//
//        System.out.println("les mouvements possibles:\n" +
//                "1_ UP \n" +
//                "2_ DOWN \n" +
//                 "3_ RIGHT \n" +
//                 "4_ LEFT \n"+
//                 "5_ Retour au position initiale"
//
//
//                );
//        System.out.println("Enter votre choix \"UP\"  \"DOWN\" \"RIGHT\" \"LEFT\" ");
//        Scanner sc = new Scanner(System.in);
//        System Choix= sc.nextLine();
//        Point p1 = new Point(0,0);//0
//        Point p2 = new  Point(1,0);//right
//        Point p3 =new Point(-1,0);//left
//        Point p4 = new Point(0,1);//up
//        Point p5 = new Point(0,-1);//down
//
//        switch(choix){
//            case "UP":
//                System.out.println(p4);
//                break;
//             case "DOWN":
//                 System.out.println(p5);
//                 break;
//             case "RIGHT ":
//                 System.out.println(p2);
//                 break;
//
//              case "LEFT":
//                  System.out.println(p3);
//                  break;
//            default:
//                System.out.println(p1);
//
//
//        }
//
//    }
//
//}


//import java.awt.Point;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        Point position = new Point(0, 0);
//
//        System.out.println("Les mouvements possibles :");
//        System.out.println("UP, DOWN, LEFT, RIGHT");
//        System.out.println("Entrez une série de commandes séparées par des virgules (UP,LEFT,DOWN,RIGHT):");
//
//
//        String input = sc.nextLine();
//        String[] commandes = input.split(",");
//
//        for (String cmd : commandes) {
//            String commande = cmd.trim().toUpperCase();
//
//            switch (commande) {
//                case "UP":
//                    position.translate(0, 1);   // +1 sur Y
//                    break;
//                case "DOWN":
//                    position.translate(0, -1);  // -1 sur Y
//                    break;
//                case "LEFT":
//                    position.translate(-1, 0);  // -1 sur X
//                    break;
//                case "RIGHT":
//                    position.translate(1, 0);   // +1 sur X
//                    break;
//                default:
//                    System.out.println("Commande inconnue : " + commande);
//                    break;
//            }
//        }
//
//        System.out.println("Position finale : (" + position.x + ", " + position.y + ")");
//
//        if (position.equals(new Point(0, 0))) {
//            System.out.println("Le robot est revenu au point de départ.");
//        } else {
//            System.out.println("Le robot n'est pas revenu au point de départ.");
//        }
//
//
//    }
//}

// challenge3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants (N) : ");
        int N = scanner.nextInt();

        System.out.print("Entrez le nombre de bancs (M) : ");
        int M = scanner.nextInt();

        int capaciteTotale = M * 2;

        if (N > capaciteTotale) {
            System.out.println("Erreur : Il n'y a pas assez de places pour tous les étudiants.");
        }

        int numeroEtudiant = 1;
        for (int i = 1; i <= M; i++) {
            System.out.print("Banc " + i + " : ");
            if (numeroEtudiant <= N) {
                System.out.print("Étudiant " + numeroEtudiant);
                numeroEtudiant++;
            }
            if (numeroEtudiant <= N) {
                System.out.print(", Étudiant " + numeroEtudiant);
                numeroEtudiant++;
            }
            System.out.println();
        }


        while (numeroEtudiant <= N) {
            System.out.println("Étudiant " + numeroEtudiant + " ne trouve pas de place");
            numeroEtudiant++;
        }

        scanner.close();
    }
}







