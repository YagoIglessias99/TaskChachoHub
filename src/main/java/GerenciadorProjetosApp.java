import views.user.UsuarioList;

import javax.swing.*;
import java.awt.*;

public class GerenciadorProjetosApp extends JFrame {

    private  CardLayout cardLayout;
    private JPanel mainPanel;

    private final String LIST_USER = "LIST_USER";
    private final String EMPTY_SCREEN = "EMPTY_SCREEN";

    public GerenciadorProjetosApp() {
        setTitle("Gerenciado de Projetos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        this.cardLayout = new CardLayout();
        this.mainPanel = new JPanel(cardLayout);

        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("Bem vindo! Use o menu para navegar.",
                        SwingConstants.CENTER),
                BorderLayout.CENTER);

        UsuarioList usurioList = new UsuarioList();

        this.mainPanel.add(emptyPanel, EMPTY_SCREEN);
        this.mainPanel.add(usurioList, LIST_USER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem listUserItem = new JMenuItem("Lista Usuários");
        JMenuItem listTaskItem = new JMenuItem("Lista Tarefas");
        JMenuItem exitItem = new JMenuItem("Sair");

        menuBar.add(menu);
        setJMenuBar(menuBar);

        menu.add(listUserItem);
        menu.add(listTaskItem);
        menu.add(exitItem);

        menuBar.add(menu);
        setJMenuBar(menuBar);

        add(mainPanel);

        listUserItem.addActionListener(e -> {
            this.cardLayout.show(mainPanel, LIST_USER);
        });

        listTaskItem.addActionListener( e -> {
            JOptionPane.showMessageDialog(this,
                    "Lista de Projetos só se eu repetir UC!");

        });

        exitItem.addActionListener( e ->{
            dispose();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GerenciadorProjetosApp().setVisible(true);
        });

    }
}
