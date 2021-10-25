import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Adventure {
  Player creator;
  ChoiceHandler cHandler = new ChoiceHandler();
  UI ui = new UI();
  VisibilityManager vm = new VisibilityManager(ui);

  public static void main(String[] args) {
  new Adventure();
  startGame();
  }
  public Adventure(){
    ui.createUI(cHandler);
    vm.showTitleScreen();
}

  public class ChoiceHandler implements ActionListener{

    public void actionPerformed(ActionEvent event) {

      String yourChoice = event.getActionCommand();

      switch(yourChoice){
        case "Start":
          vm.titleToTown();
          break;
        case "c1":
          //this.creater.setCurrentRoom(currentRoom.getNorthExit(), "north", true);
          break;
        case "c2": break;
        case "c3": break;
        case "c4": break;
        case "c5": break;
        case "c6": break;
      }


    }
  }


public static void startGame(){
  Map map = new Map(); //Sets the map in a 3x3 grid.
  Scanner scanner = new Scanner(System.in);
  CountUp counter = new CountUp();
  Item item1 = new Item("","","");
  Command.startInfo();

  //Prompts the user to enter a name
  System.out.print("Please enter your name: ");
  String userName = scanner.nextLine();
  //Creates the player instance with a name and their starting position
  Player player = new Player(userName, map.getStartRoom());
  System.out.println("Well hello "+userName +"! Lets get this game started!");
  System.out.println("A mechanical noise is filling your ears and it feels like the ground beneath is moving.. " +
      "Oh! That's right. You are on Mo's Space Station!\n" +
      "Why don't you have a look around?");

  String userInput = "";
  counter.start();
  while (!userInput.equals("exit")) {
    //Gets the user's command and makes it lowercase
    userInput = scanner.nextLine().toLowerCase();
    //Removes white space from the beginning and end of the user's input
    userInput = userInput.trim();

    //Creates a command instance and sets the player instance as it's creator for easy reference
    Command command = new Command(player);
    //Calls the go method in the Command class which evaluates the user's command
    command.go(userInput, player.getCurrentRoom(), map.getEndRoom());
  }
}
public static String playerName(String userInput){
    return userInput;
}
}
