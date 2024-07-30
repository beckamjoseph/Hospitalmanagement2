package UniversityManagement;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class university extends JFrame implements Runnable {
    Thread t;

    university() {
        // JFrame setup
        setTitle("Bingham University Hospital Management System");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Image for the main display in the JFrame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pictures/window.png"));
        if (i1.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("Error loading image");
        }
        Image i2 = i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setLayout(new BorderLayout());
        add(image);

        // Add text overlay
        JLabel text = new JLabel("Bingham University Hospital Management System", JLabel.CENTER);
        text.setFont(new Font("Serif", Font.BOLD, 24));
        text.setForeground(Color.WHITE);
        text.setBackground(new Color(0, 0, 0, 150)); // Semi-transparent background
        text.setOpaque(true);
        image.add(text, BorderLayout.SOUTH);

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            // Next frame for the login page
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(university::new);
    }
}
