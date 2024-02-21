import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //part 1 skriva och läsa från fil
        System.out.println("Ange filnamn:");
        String fileName = scan.nextLine();
        System.out.println("Vill du skriva över allt innehåll eller bara skriva till i slutet av filen?");
        char option = scan.next().charAt(0);

        if (option == 'B' || option == 'b') {
            writeToFile(fileName, false);
        } else if (option == 'A' || option == 'a') {
            writeToFile(fileName, true);
        }
        
    }

    private static void writeToFile(String fileName, boolean b) {
    }
}
