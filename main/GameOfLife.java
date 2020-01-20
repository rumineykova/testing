

public class GameOfLife {
	
	 public static CellState GetNewState(CellState currentState, int liveNeighbours)
     {
         if (currentState == CellState.Dead)
         {
             if (liveNeighbours == 3)
             {
                 return CellState.Alive;
             }
         }
		return currentState;
     }
}
