import model.Grid;
import model.Rover;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {

    //test to check if finding right of every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 0 E", "0 0 E ,0 0 S", "0 0 S ,0 0 W", "0 0 W ,0 0 N"})
    public void rotateRightTest(String inputDirection, String expectedDirection) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act
        String rightRotate = rover.rotateRight(inputDirection);
        //assert
        assertEquals(expectedDirection, rightRotate);
    }

    //test to check if finding Left of every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 0 W", "0 0 W,0 0 S", "0 0 S ,0 0 E", "0 0 E ,0 0 N"})
    public void rotateLeftTest(String inputDirection, String expectedDirection) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act
        String rightRotate = rover.rotateLeft(inputDirection);
        //assert
        assertEquals(expectedDirection, rightRotate);
    }

    //test to check if moving to every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 1 N", "0 0 W,-1 0 W", "0 0 S ,0 -1 S", "0 0 E ,1 0 E"})
    public void moveTest(String inputDirection, String expectedDirection) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act
        String rightMove = rover.move(inputDirection);
        //assert
        assertEquals(expectedDirection, rightMove);
    }

    //test to check if movement of rover from default position to initial position is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N,1 2 N", "0 0 N,5 5 N"})
    public void moveToInitialPositionTest(String defaultPositionOfRover, String initialPositionOfRover) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act
        String initialMove = rover.moveToRightPositionAndDirection(initialPositionOfRover);
        //assert
        assertEquals(initialPositionOfRover, initialMove);
    }

    //test to catch Exception if initial position of rover is outside the scope of our Grid
    @ParameterizedTest
    @CsvSource({"0 0 N,1 7 N", "0 0 N,6 5 N"})
    public void moveToInitialPositionAndThrowExceptionTest(String defaultPositionOfRover, String initialPositionOfRover) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act and assert
        assertThrows(IllegalArgumentException.class, () -> rover.moveToRightPositionAndDirection(initialPositionOfRover),
                "Your rover  position is outside of grid");

    }

    //Given the initial position of rover and instructions to move then rover change directions correctly
    // and reach at the final position .
    @ParameterizedTest
    @CsvSource({"1 2 N,LMLMLMLMM ,1 3 N", "3 3 E,MMRMMRMRRM,5 1 E"})
    public void moveWithDirectionsTest(String initialPositionOfRover, String moveInstructions, String expectedPositionAndDirectionOfRover) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act
        String expectedMove = rover.moveWithDirection(initialPositionOfRover, moveInstructions);
        //assert
        assertEquals(expectedPositionAndDirectionOfRover, expectedMove);
    }

    //Catching IllegalArgumentException for coordinates outside defined grid
    @ParameterizedTest
    @CsvSource({"3 3 E,MMRMMRMRRMMMM,8 1 E"})
    public void moveWithInstructionAndCatchException(String initialPositionOfRover, String moveInstructions, String expectedPositionAndDirectionOfRover) {
        //arrange
        Grid gridPlateau = new Grid(5, 5);
        Rover rover = new Rover(gridPlateau);
        //act and assert
        assertThrows(IllegalArgumentException.class, () -> rover.moveWithDirection(initialPositionOfRover, moveInstructions),
                "Your rover  position is outside of grid");

    }


}
