import java.util.Scanner;

public class RobotCleaner {
  
  public static final int MAX_SIZE = 10;

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

 
    int[][] room = new int[MAX_SIZE][MAX_SIZE];


    System.out.println("Enter the initial position of the robot (x, y):");
    int x = scanner.nextInt();
    int y = scanner.nextInt();

   
    System.out.println("Enter the movement of the robot (N, S, E, W):");
    String movement = scanner.next();

  
    int cleanedCells = 0;

    
    while (cleanedCells < MAX_SIZE * MAX_SIZE) {
     
      room[x][y] = 1;
      cleanedCells++;

      
      switch (movement) {
        case "N":
          y = Math.max(0, y - 1);
          break;
        case "S":
          y = Math.min(MAX_SIZE - 1, y + 1);
          break;
        case "E":
          x = Math.min(MAX_SIZE - 1, x + 1);
          break;
        case "W":
          x = Math.max(0, x - 1);
          break;
      }
    }

    
    System.out.println("The robot has cleaned the room.");
    System.out.println("Final position of the robot: (" + x + ", " + y + ")");
  }
}