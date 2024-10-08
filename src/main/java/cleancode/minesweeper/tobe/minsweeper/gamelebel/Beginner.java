package cleancode.minesweeper.tobe.minsweeper.gamelebel;

public class Beginner implements GameLevel {

    @Override
    public int getRowSize() {
        return 8;
    }

    @Override
    public int getColSize() {
        return 10;
    }

    @Override
    public int getLandMineCount() {
        return 10;
    }
}
