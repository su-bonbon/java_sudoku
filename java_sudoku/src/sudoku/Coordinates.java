package sudoku;

public class Coordinates {
	private final int x;
	private final int y;
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(this != o) return false;
	}
}
