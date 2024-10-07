package cleancode.minesweeper.tobe.minsweeper.io;

import cleancode.minesweeper.tobe.minsweeper.board.position.CellPosition;
import cleancode.minesweeper.tobe.minsweeper.user.UserAction;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();

}
