public class Rover {

    private int x = 0;
    private int y = 0;
    private char direction = 'N';

    //Method to rotate right for every direction
    public String rotateRight(String value) {
        char[] valueChar = value.toUpperCase().replace(" ", "").toCharArray();
        x = Integer.parseInt(String.valueOf(valueChar[0]));
        y = Integer.parseInt(String.valueOf(valueChar[1]));
        if (valueChar[2] == 'N') return x + " " + y + " E";
        if (valueChar[2] == 'E') return x + " " + y + " S";
        if (valueChar[2] == 'S') return x + " " + y + " W";
        if (valueChar[2] == 'W') return x + " " + y + " N";
        else throw new IllegalArgumentException("You should pass a valid value for processing");
    }

    //Method to rotate left for every direction
    public String rotateLeft(String value) {
        char[] valueChar = value.toUpperCase().replace(" ", "").toCharArray();
        x = Integer.parseInt(String.valueOf(valueChar[0]));
        y = Integer.parseInt(String.valueOf(valueChar[1]));
        if (valueChar[2] == 'N') return x + " " + y + " W";
        if (valueChar[2] == 'W') return x + " " + y + " S";
        if (valueChar[2] == 'S') return x + " " + y + " E";
        if (valueChar[2] == 'E') return x + " " + y + " N";
        else throw new IllegalArgumentException("You should pass a valid value for processing");

    }

    //method to move forward for every direction
    public String move(String inputDirection) {
        char[] valueChar = inputDirection.toUpperCase().replace(" ", "").toCharArray();
        x = Integer.parseInt(String.valueOf(valueChar[0]));
        y = Integer.parseInt(String.valueOf(valueChar[1]));
        if (valueChar[2] == 'N') return x + " " + (y + 1) + " N";
        if (valueChar[2] == 'W') return (x - 1) + " " + y + " W";
        if (valueChar[2] == 'S') return x + " " + (y - 1) + " S";
        if (valueChar[2] == 'E') return (x + 1) + " " + y + " E";
        else throw new IllegalArgumentException("You should pass a valid value for processing");

    }

    //method for rover to reach at the initial position from default position
    public String moveToInitialPositionAndDirection(String defaultPositionOfRover) {

        char[] initialPosition = defaultPositionOfRover.toUpperCase().replace(" ", "").toCharArray();
        x = initialPosition[0];
        y = initialPosition[1];
        direction = initialPosition[2];
        return initialPosition[0] + " " + initialPosition[1] + " " + direction;
    }

    //method for rover to reach at final position by following the instructions and return the final position as String
    public String moveWithDirection(String initialPositionandDirectionOfRover, String instructionToMove) {
        String currentPositionOfRover = moveToInitialPositionAndDirection(initialPositionandDirectionOfRover);
        char[] instructionChar = instructionToMove.toUpperCase().replace(" ", "").toCharArray();
        for (char instructon : instructionChar) {
            if (instructon == 'L')
                currentPositionOfRover = rotateLeft(currentPositionOfRover);
            else if (instructon == 'R')
                currentPositionOfRover = rotateRight(currentPositionOfRover);
            else if (instructon == 'M')
                currentPositionOfRover = move(currentPositionOfRover);

        }
        return currentPositionOfRover;
    }


}
