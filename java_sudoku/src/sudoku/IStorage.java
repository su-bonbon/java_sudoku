package sudoku;

public interface IStorage {
	void updateGameData(SudokuGame game) throws IOException;
	SudokuGame getGameData() throws IOException;
}
