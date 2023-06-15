package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame() {
        setTitle("Cômodos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
       
        
        JPanel panel = new JPanel();
        panel .setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        
        JButton room = new JButton("Quarto");
        room.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });

        JButton livingRoom = new JButton("Sala");
        livingRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });

        JButton kitchen= new JButton("cozinha");
        kitchen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
            
        });
        JButton bathroom= new JButton("Banheiro");
        bathroom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
        
        JButton laundryRoom= new JButton("Lavanderia");
        laundryRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
        
        JButton garage= new JButton("Garagem");
        garage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
        
        JButton yard= new JButton("Quintal");
        yard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        add(room, gbc);
        gbc.gridy = 1;
       
        add(livingRoom, gbc);
        gbc.gridy = 2;
        
        add(kitchen, gbc);
        gbc.gridy = 3;
        
        add(bathroom, gbc);
        gbc.gridy = 4;
        add(laundryRoom, gbc);
        gbc.gridy = 5;
        add(garage, gbc);
        gbc.gridy = 6;
        add(yard, gbc);
        gbc.gridy = 7;
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

                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }
}

