import java.util.Random;

public class NebulaRover {
    private int positionX;
    private int positionY;

    public NebulaRover() {
        positionX = 0;
        positionY = 0;
    }

    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4); // 0: North, 1: East, 2: South, 3: West

        switch (direction) {
            case 0:
                positionY += 1; // Move North
                break;
            case 1:
                positionX += 1; // Move East
                break;
            case 2:
                positionY -= 1; // Move South
                break;
            case 3:
                positionX -= 1; // Move West
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    public void printPosition() {
        System.out.println("Current position: (" + positionX + ", " + positionY + ")");
    }

    public static void main(String[] args) {
        NebulaRover rover = new NebulaRover();

        System.out.println("Starting position:");
        rover.printPosition();

        // Move the rover randomly
        for (int i = 0; i < 5; i++) {
            rover.move();
            rover.printPosition();
        }
    }
}
