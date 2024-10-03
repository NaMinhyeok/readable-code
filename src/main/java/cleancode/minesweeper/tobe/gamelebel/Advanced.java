package cleancode.minesweeper.tobe.gamelebel;

public class Advanced implements GameLevel{

    @Override
    public int getRowSize() {
        return 20;
    }

    @Override
    public int getColSize() {
        return 24;
    }

    @Override
    public int getLandMineCount() {
        return 99;
    }

}
