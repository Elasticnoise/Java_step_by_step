public class Elevator {
    static int currentFloor = 1;
    static int minFloor;
    static int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        Elevator.minFloor = minFloor;
        Elevator.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        Elevator.currentFloor = Elevator.currentFloor - 1;
    }

    public void moveUp() {
        Elevator.currentFloor = Elevator.currentFloor + 1;
    }

    public void move(int floor) {
        if (minFloor <= floor && floor <= maxFloor) {
            while (Elevator.currentFloor != floor) {
                if (floor > Elevator.currentFloor) {
                    moveUp();
                    System.out.println(Elevator.currentFloor);
                }
                else {
                    moveDown();
                    System.out.println(Elevator.currentFloor);
                }
            }
        } else {
            System.out.println("Этаж задан неверно!");
        }
    }
}
