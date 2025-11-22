package org.connectthree;

import java.io.Serializable;
import java.util.List;

public class GameMap implements Serializable {
    enum CellType {
        NonUsed,    // There can be no items in this cell.
        Used,       // Normal cell
        Special,    // Has some kind of mutation
        Generator   // Can generate items to other cells but can't hold any
    }
    class Cell {
        CellType type;
        FallingItem item;
    }

    private List<List<Cell>> cells;

    public Cell getCell(int row, int col) {
        return cells.get(row).get(col);
    }
}
