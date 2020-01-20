import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameOfLifeTest
{
    // Any live cell with fewer than two live neighbours dies, as if caused by under-population.
    // Any live cell with two or three live neighbours lives on to the next generation.
    // Any live cell with more than three live neighbours dies, as if by overcrowding.
    // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

    @Test
    public void LiveCell_LessThanTwoLiveNeighbours_Dies(int liveNeighbours)
    {
        CellState cell = GameOfLife.GetNewState(CellState.Alive, liveNeighbours);
        assertTrue(cell==CellState.Dead);
    }

}
