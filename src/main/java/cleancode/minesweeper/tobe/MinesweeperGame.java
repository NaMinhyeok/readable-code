package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelebel.GameLevel;
import cleancode.minesweeper.tobe.gamelebel.VeryBeginner;

public class MinesweeperGame {
    public static void main(String[] args) {
        GameLevel gameLevel = new VeryBeginner();

        Minesweeper minesweeper = new Minesweeper(gameLevel);
        minesweeper.run();
    }

}
