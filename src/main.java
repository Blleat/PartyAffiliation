import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String affiliation = "";

        System.out.print("Enter your party affiliation [D, R or I]: ");
        affiliation = in.nextLine();

        if (affiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        }

        else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Elephant");
        }

        else if (affiliation.equals("I")) {
            System.out.println("You get a Independent man");
        }

        else {
            System.out.println("You get an Other");
        }

    }
}
