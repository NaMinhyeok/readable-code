package cleancode.minesweeper.tobe.minsweeper.io.sign;

import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean support(CellSnapshot cellSnapshot);

    String provide(CellSnapshot cellSnapshot);

}
