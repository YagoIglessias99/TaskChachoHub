package UserListTableModel;

import models.Usuario;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserListTableModel extends AbstractTableModel {
    public UserListTableModel(List<Usuario> usuarios) {
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
