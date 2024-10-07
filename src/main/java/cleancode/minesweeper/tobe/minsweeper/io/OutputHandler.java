package cleancode.minesweeper.tobe.minsweeper.io;

import cleancode.minesweeper.tobe.minsweeper.board.GameBoard;
import cleancode.minesweeper.tobe.minsweeper.exception.GameException;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingComment();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);

}
