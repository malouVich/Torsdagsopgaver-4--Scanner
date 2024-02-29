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

        // 4.i: Test displayMenu method
        gameMenu.displayMenu();
    }
}