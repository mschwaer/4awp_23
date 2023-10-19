import java.util.Scanner;

public class TestIT {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int auswahl =0;

        do{
            System.out.print("Bitte den Wert eingeben(mit 4 ist schluss):");
            auswahl = scanner.nextInt();
            System.out.println("Hier kommt der Wert:"+ auswahl);

        } while (auswahl != 4);



    }
}
