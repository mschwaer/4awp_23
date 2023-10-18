package at.sma.basics;


import java.util.ArrayList;
import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {

        int i = 0;
        String s = "jj";
        float f = 3;
        double d = 3.56;
        boolean b = true;



        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        if (randomNumber < 20){
            System.out.println("Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.println("Medium");
        } else if (randomNumber > 50 ){
            System.out.println("Large");
        }
        System.out.println(randomNumber);
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }
}
