import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---WELCOME TO JAVA-LOOT-EM-ALL! HERE TO TRY YOUR LUCK?---");
        play();
        playAgain();

    }
    public static void play(){
        ChestTypes chestTypes = new ChestTypes();
        Scanner input = new Scanner(System.in);
        System.out.println("Please select a chest you would liked to open, by typing in it's number:" +
                "\n 1. - Bronze chest" +
                "\n 2. - Gold chest" +
                "\n 3. - Diamond chest");
        boolean loop = true;
        while (loop)
        switch (input.nextByte()){
            case 1:
                chestTypes.bronzeChest();
                loop = false;
                break;
            case 2:
                chestTypes.goldChest();
                loop = false;
                break;
            case 3:
                chestTypes.diamondChest();
                loop = false;
                break;
            default:
                System.out.println("Invalid choice, please enter either 1, 2 or 3.");
                break;
        }
    }
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        String response;
        do {
            System.out.println("Would you like to play again? If you are in for some more opening just say 'yes' otherwise 'no'.");
            response = input.nextLine();
            switch (response){
                case "yes":
                    play();
                    break;
                case "no":
                    System.out.println("Thank you for playing Java-Loot-Em-All. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    break;
            }
        } while (!response.equals("no"));
    }
}