package UniversityManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel;
    JTextField tfusername;
    JPasswordField tfpassword;

    Login() {
        // Set up the frame
        setTitle("Login");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Username label and text field
        JLabel lbusername = new JLabel("Username");
        lbusername.setBounds(40, 20, 100, 20);
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        // Password label and password field
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40, 70, 100, 20);
        add(lbpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        // Login button
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // Cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        // Image
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("pictures/hospital.png"));
        Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(img));
        image.setBounds(350, 20, 200, 200);
        add(image);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword());
            boolean found = false;

            try (BufferedReader reader = new BufferedReader(new FileReader("txtlogin.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals(username) && parts[1].equals(password)) {
                        found = true;
                        break;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading data: " + e.getMessage());
            }

            if (found) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                new Project(); // Move to the next screen or functionality
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "User not registered. Please register first.");
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false); // Close the login window
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}