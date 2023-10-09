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
		if(o == null || getClass() != o.getClass()) return false;
		Coordinaes that = (Coordinates) o;
		return x == that.x && y == that.y;
	}
	@Override
	public int hashCode() {
		return Object.hash(x, y);
	}
}
