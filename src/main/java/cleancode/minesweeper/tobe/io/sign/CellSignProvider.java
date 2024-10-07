package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapShotStatus;
import cleancode.minesweeper.tobe.cell.CellSnapshot;

import java.util.Arrays;
import java.util.Optional;

public enum CellSignProvider implements CellSignProvidable {


    EMPTY(CellSnapShotStatus.EMPTY) {
        @Override
        public String provide(CellSnapshot cellSnapshot) {
            return EMPTY_SIGN;
        }
    },
    FLAG(CellSnapShotStatus.FLAG) {
        @Override
        public String provide(CellSnapshot cellSnapshot) {
            return FLAG_SIGN;
        }
    },
    LAND_MINE(CellSnapShotStatus.LAND_MINE) {
        @Override
        public String provide(CellSnapshot cellSnapshot) {
            return LAND_MINE_SIGN;
        }
    },
    NUMBER(CellSnapShotStatus.NUMBER) {
        @Override
        public String provide(CellSnapshot cellSnapshot) {
            return String.valueOf(cellSnapshot.getNearByLandMineCount());
        }
    },
    UNCHECKED(CellSnapShotStatus.UNCHECKED) {
        @Override
        public String provide(CellSnapshot cellSnapshot) {
            return UNCHECKED_SIGN;
        }
    },
    ;

    private static final String EMPTY_SIGN = "■";
    private static final String FLAG_SIGN = "⚑";
    private static final String UNCHECKED_SIGN = "□";
    private static final String LAND_MINE_SIGN = "☼";


    private final CellSnapShotStatus status;

    CellSignProvider(CellSnapShotStatus status) {
        this.status = status;
    }


    @Override
    public boolean support(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(status);
    }

    public static String findCellSignFrom(CellSnapshot snapshot) {
        CellSignProvider cellSignProvider = findBy(snapshot);
        return cellSignProvider.provide(snapshot);
    }

    private static CellSignProvider findBy(CellSnapshot snapshot) {
        return Arrays.stream(values())
            .filter(provider -> provider.support(snapshot))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("확인 할 수 없는 셀입니다."));
    }

}
