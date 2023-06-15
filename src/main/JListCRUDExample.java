package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JListCRUDExample extends JFrame {
    private JList<String> itemList;
    private DefaultListModel<String> listModel;

    private JTextField textField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;

    private List<String> items;

    public JListCRUDExample() {
        setTitle("Minha Lista");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        items = new ArrayList<>();

        listModel = new DefaultListModel<>();
        itemList = new JList<>(listModel);
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        addButton = new JButton("Adicionar");
        updateButton = new JButton("Atualizar");
        deleteButton = new JButton("Apagar");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        buttonPanel.add(addButton);
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner quantitySpinner = new JSpinner(spinnerModel);
        buttonPanel.add(quantitySpinner);
        
        buttonPanel.add(updateButton);
        
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Event handlers
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = textField.getText();
                if (!item.isEmpty()) {
                    int quantity = (int) quantitySpinner.getValue(); // Obtém o valor do JSpinner
                    String itemWithQuantity = item + " (Quantidade: " + quantity + ")";
                    listModel.addElement(itemWithQuantity);
                    textField.setText("");
                    quantitySpinner.setValue(0); // Reinicia o valor do JSpinner
                    textField.requestFocus();
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = itemList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String updatedItem = textField.getText();
                    if (!updatedItem.isEmpty()) {
                        items.set(selectedIndex, updatedItem);
                        listModel.setElementAt(updatedItem, selectedIndex);
                        textField.setText("");
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = itemList.getSelectedIndex();
                if (selectedIndex != -1) {
                    items.remove(selectedIndex);
                    listModel.removeElementAt(selectedIndex);
                    textField.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Set look and feel to the system's default
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
    }
}


