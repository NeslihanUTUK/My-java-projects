package controller;
import java.util.Scanner;
/*
* Neslihan Utuk
* Dit programma berekent op basis van lengte en gewicht de bmi- waarde,
* afhankelijke via de uitkkomstkrijg de gebruiker een melding */

public class BMIBerekeningLauncher {
// a. Gebruik een methode public static double berekenBMI(int mpLengte, double mpGewicht) die de
//   BMI uitrekent en teruggeeft. Rond de BMI af op 1 cijfer achter de komma. Je kunt hiervoor
//  Math.round() gebruiken.


// b. Pas je berekening van de BMI zo aan dat je in plaats van lengte * lengte gebruikt maakt
//     van lengte in het kwadraat. Gebruik hiervoor de methode Math.pow().

    public static double berekenBMI(int mpLengte, double mpGewicht){
         double lengteInMeters = mpLengte / 100.0;
         return Math.round( 10  * mpGewicht / Math.pow(lengteInMeters,2)) /10.0;
    }
    //                c. Bepaal op basis van de BMI of iemand een gezond gewicht heeft. Gebruik een methode public
//        static String bepaalCategorie(double mpBmi) die de waarde van een bmi omzet naar een String
//        behorend bij de juiste categorie. Maak hierbij gebruik van de volgende tabel:
    public static String bepaalCategorie(double mpBmi){
        //declareer de constanten voor de grenzen
        final double ONDERGEWICHT_GRENZ = 18.5;
        final double GEZOND_GEWICHT_GRENZ = 25.0;
        final double OVERGEWICHT_GRENZ = 30.0;
        //bepaal de juiste categorie
        String categorie ;
        if (mpBmi < ONDERGEWICHT_GRENZ ) {
            categorie = "Ondergewicht";
        }else if ( mpBmi <=  GEZOND_GEWICHT_GRENZ) {
            categorie = "Gezond gewicht";
        } else if (mpBmi <= OVERGEWICHT_GRENZ) {
            categorie = "Overgewicht";
        }else {
            categorie = "OBESITAS" ;
        }
        return categorie;
    }
    
    public static void main(String[] args) {
        double bmi;
        Scanner input;
        int lengte;
        double gewicht;
        String categorie;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef je lengte in centimeters: ");
        lengte = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geef je gewicht in kilogram:  ");
        gewicht = scanner.nextDouble();

        //bmi by methode
        bmi = berekenBMI(lengte,gewicht);
        categorie = bepaalCategorie(bmi);

        System.out.printf("Jouw BMI is: " + bmi + " ( " + categorie + " )");


    }
}
