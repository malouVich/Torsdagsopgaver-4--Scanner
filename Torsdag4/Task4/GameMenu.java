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

    // 4.h: Add method to display menu
    public void displayMenu() {
        System.out.println("Game Menu:");
        for (String action : actions) {
            System.out.println(action);
        }
    }

    // 4.j: Add getter method for actions
    public ArrayList<String> getActions() {
        return this.actions;
    }
}