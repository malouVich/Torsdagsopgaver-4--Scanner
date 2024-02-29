import java.util.Scanner;
import java.util.ArrayList;

// 4.e: Create client class Main
public class Main {
    // 4.f: Main method
    public static void main(String[] args) {
        // 4.f: Create ArrayList of actions
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");



        // 4.g: Instantiate GameMenu class with actions as argument to the constructor
        GameMenu gameMenu = new GameMenu(actions);

        String userChoice = gameMenu.getAction();

        // 5.g: Convert the value to an int before using it as an argument in a call to the doAction method
        int choice = Integer.parseInt(userChoice);

        // 5.f: Call doAction method based on user's choice
        doAction(choice);
    }

    // 5.d: Create a new method for printing the message corresponding to the user's choice
    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

      
    