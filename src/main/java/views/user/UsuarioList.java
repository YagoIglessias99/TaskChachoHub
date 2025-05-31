package views.user;

import UserListTableModel.UserListTableModel;

import javax.swing.*;
import java.awt.*;

import java.util.List;
public class UsuarioList extends JPanel {
    private UserListTableModel.UserListTableModel tableModel;

    public UsuarioList(){
        this.initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        
        this.tableModel = new UserListTableModel(List.of());
    }
}
