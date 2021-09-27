import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GridTest {


    @ParameterizedTest
    @CsvSource({"0,0", "-1,1", "3,-3","-4,-4"})
    public void gridWithNegativeOrZeroCoordinatesTest(int xCoordinate, int yCoordinate) {
        //arrange
        Grid roverGrid = new Grid(xCoordinate, yCoordinate);
        //act
        boolean isAllowed = roverGrid.gridInFirstQuaderant();
        //assert
        Assertions.assertFalse(isAllowed);
    }


    @ParameterizedTest
    @CsvSource({"1,1", "3,4", "5,5"})
    public void gridIsInFirstQuaderentTest(int xCoordinate, int yCoordinate) {
        //arrange
        Grid roverGrid = new Grid(xCoordinate, yCoordinate);
        //act
        boolean isAllowed = roverGrid.gridInFirstQuaderant();
        //assert
        Assertions.assertTrue(isAllowed);


    }


}

