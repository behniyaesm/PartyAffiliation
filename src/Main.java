import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in); //creating the scanner object
        String partyAfil = "";

        System.out.println("Enter your party affiliation [R, D, I]: ");
        partyAfil = console.nextLine(); //read what teh user inputs and store it as partyAffil

        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You get a republican elephant");

        } else if (partyAfil.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");

        } else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Man");

        } else {
            System.out.println("I don't know what party you belong to!");
        }
    }
}