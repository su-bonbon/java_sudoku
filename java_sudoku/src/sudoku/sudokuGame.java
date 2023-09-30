package sudoku;

public class sudokuGame {
	private final GameState gameState;
	private final int[][] gridState;
	
	public static final GRID_BOUNDARY = 9;
	
	public sudokuGame(GameState gameState, int[][] gridState) {
		this.gameState = gameState;
		this.gridState = gridState;
	}

	public GameState getGameState() {
		return gameState;
	}

	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNewArray(gridState);
	}
	
	
	
	
}
