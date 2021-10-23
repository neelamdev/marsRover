import model.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GridTest {


    @ParameterizedTest
    @CsvSource({"0,0", "-1,1", "3,-3", "-4,-4"})
    public void gridWithNegativeOrZeroCoordinatesTest(int xCoordinate, int yCoordinate) {
        //arrange
        Grid roverGrid = new Grid(xCoordinate, yCoordinate);
        //act and catch exception gracefully
        assertThrows(IllegalArgumentException.class, () -> roverGrid.validateValidGridSize(),
                "Your rover  position is outside of grid");
    }


    @ParameterizedTest
    @CsvSource({"1,1", "3,4", "5,5"})
    public void gridWithPositiveCoordinatesTest(int xCoordinate, int yCoordinate) {
        //arrange
        Grid roverGrid = new Grid(xCoordinate, yCoordinate);
        //act
        boolean isAllowed = roverGrid.validateValidGridSize();
        //assert
        Assertions.assertTrue(isAllowed);


    }


}

