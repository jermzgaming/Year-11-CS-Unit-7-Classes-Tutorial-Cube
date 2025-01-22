import java.util.Scanner;

public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = i;
    }

    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }
}
