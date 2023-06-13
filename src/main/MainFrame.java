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
        setLayout(new FlowLayout());

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
        
        JButton yard= new JButton("Qintal");
        yard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JListCRUDExample example = new JListCRUDExample();
                example.setVisible(true);
            }
        });
        
        
        add(room);
        
        add(livingRoom);
        
        add(kitchen);
        
        add(bathroom);
        
        add(laundryRoom);
        
        add(garage);
        
        add(yard);
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

