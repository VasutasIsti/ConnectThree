package org.connectthree;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Map;

public class LevelStorage extends AbstractTableModel {
    private List<Level> levels;

    @Override
    public int getRowCount() {
        return levels.size();
    }

    @Override
    public int getColumnCount() {
        // game name or pic, objective, done
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
