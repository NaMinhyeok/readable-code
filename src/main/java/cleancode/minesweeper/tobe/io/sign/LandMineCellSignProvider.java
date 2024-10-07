package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapShotStatus;
import cleancode.minesweeper.tobe.cell.CellSnapshot;

public class LandMineCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "X";

    @Override
    public boolean support(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapShotStatus.LAND_MINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }
}
