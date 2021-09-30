package app;

import model.Grid;
import model.Rover;

import java.util.Scanner;

public class MarsRoverMain {
    public static void main(String[] args) {
        //Example input
        //5 5
        //1 2 N
        //LMLMLMLMM
        //3 3 E
        //MMRMMRMRRM
        Rover rover;
        Grid defaultGrid = new Grid(0,0);
        Scanner userInput = new Scanner(System.in);

        // plateau maxHeight and maxWidth
        System.out.println("Please enter plateau maxHeight and maxWidth");
        String maxCoordinatesForPlateau = userInput.nextLine();
        char[] maxCoordinatesForPlateauChar = maxCoordinatesForPlateau.toUpperCase()
                .replace(" ", "").toCharArray();

        //initial coordinates for rover1 and its direction
        System.out.println("Please enter initial coordinates for rover1 and its direction");
        String initialPositionAndDirectionOfRover1 = userInput.nextLine();

        //instructions to change direction and move for rover1
        System.out.println("Please enter instructions to change direction and move for rover1");
        String instructionsToMoveForRover1 = userInput.nextLine();

        //initial coordinates for rover2 and its direction
        System.out.println("Please enter initial coordinates for rover2 and its direction");
        String initialPositionAndDirectionOfRover2 = userInput.nextLine();

        //instructions to change direction and move for rover2
        System.out.println("Please enter instructions to change direction and move for rover2");
        String instructionsToMoveForRover2 = userInput.nextLine();

        Grid plateau = new Grid(maxCoordinatesForPlateauChar[0], maxCoordinatesForPlateauChar[1]);
        if(plateau.gridInFirstQuaderant())
            rover = new Rover(plateau);
        else
            rover=new Rover(defaultGrid);
        String rover1FinalPosition = rover.moveWithDirection(initialPositionAndDirectionOfRover1, instructionsToMoveForRover1);
        System.out.println("Position and direction of rover1  :"+rover1FinalPosition);

        String rover2FinalPosition = rover.moveWithDirection(initialPositionAndDirectionOfRover2, instructionsToMoveForRover2);
        System.out.println("Position and direction of rover1  :"+rover2FinalPosition);


    }
}
