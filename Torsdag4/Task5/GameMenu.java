import java.util.Scanner;
import java.util.ArrayList;

// 4.a: Create GameMenu class
public class GameMenu {
    // 4.b: Add private instance variable
    private ArrayList<String> actions = new ArrayList<>();

    // 4.c: Add constructor
    public GameMenu(ArrayList<String> actions) {
        // 4.d: Assign the list received as an argument to the instance variable actions
        this.actions = actions;
    }

    // 4.j: Add getter method for actions
    public ArrayList<String> getActions() {
        return this.actions;
 
    }

        public String getAction() {
        System.out.println("Type a number to choose an action:");
        for (String action : actions) {
            System.out.println(action);
        }

        // 5.b: Create Scanner object and get user's choice
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // 5.c: Return the user's choice
        return choice;
    }

}