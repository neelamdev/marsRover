import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {

    //test to check if finding right of every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 0 E", "0 0 E ,0 0 S", "0 0 S ,0 0 W", "0 0 W ,0 0 N"})
    public void rotateRightTest(String inputDirection, String expectedDirection) {
        //arrange
        Rover rover = new Rover();
        //act
        String rightRotate = rover.rotateRight(inputDirection);
        //assert
        Assertions.assertEquals(expectedDirection, rightRotate);
    }

    //test to check if finding Left of every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 0 W", "0 0 W,0 0 S", "0 0 S ,0 0 E", "0 0 E ,0 0 N"})
    public void rotateLeftTest(String inputDirection, String expectedDirection) {
        //arrange
        Rover rover = new Rover();
        //act
        String rightRotate = rover.rotateLeft(inputDirection);
        //assert
        Assertions.assertEquals(expectedDirection, rightRotate);
    }

    //test to check if moving to every direction(NEWS)is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N ,0 1 N", "0 0 W,-1 0 W", "0 0 S ,0 -1 S", "0 0 E ,1 0 E"})
    public void moveTest(String inputDirection, String expectedDirection) {
        //arrange
        Rover rover = new Rover();
        //act
        String rightmove = rover.move(inputDirection);
        //assert
        Assertions.assertEquals(expectedDirection, rightmove);
    }

    //test to check if movement of rover from default position to initial position is working correctly
    @ParameterizedTest
    @CsvSource({"0 0 N,1 2 N" })
    public void moveToInitialPositionTest(String defaultPositionOfRover,String initialPositionOfRover) {
        //arrange
        Rover rover = new Rover();
        //act
        String initialMove = rover.moveToInitialPositionAndDirection(initialPositionOfRover);
        //assert
        Assertions.assertEquals(initialPositionOfRover, initialMove);
    }

    //Given the initial position of rover and instructions to move then rover change directions correctly
    // and reach at the final position .
    @ParameterizedTest
    @CsvSource({"1 2 N,LMLMLMLMM ,1 3 N" ,"3 3 E,MMRMMRMRRM,5 1 E"})
    public void moveWithDirectionsTest(String initialPositionOfRover,String moveInstructions, String expectedPositionAndDirectionOfRover) {
        //arrange
        Rover rover = new Rover();
        //act
        String expectedMove = rover.moveWithDirection(initialPositionOfRover,moveInstructions);
        //assert
        Assertions.assertEquals(expectedPositionAndDirectionOfRover, expectedMove);
    }


}
