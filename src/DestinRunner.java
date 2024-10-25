import java.util.Scanner;
public class DestinRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello fellow people");
        System.out.println("Hello my name is destin what is urs?");
        String personName = scan.nextLine();
        System.out.println(personName);
        if (personName.equals("Destin")) {
            System.out.println("you are the gratest person in the world");
        } else {
            System.out.println("Hello" + personName);
        }
        System.out.println("beware of the destin clones they might take over the world");
    }
}
