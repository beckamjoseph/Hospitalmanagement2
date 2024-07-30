package UniversityManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class signup extends JFrame implements ActionListener {

    private JTextField tfusername;
    private JPasswordField tfpassword;
    private JTextField tfmat;
    private JButton registerButton, loginButton;

    public signup() {
        getComponents();
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lbusername = new JLabel("new username");
        lbusername.setBounds(40, 20, 100, 20);
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        JLabel lb1password = new JLabel("new password");
        lb1password.setBounds(40, 70, 100, 20);
        add(lb1password);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        JLabel lb2mat = new JLabel("matric number");
        lb2mat.setBounds(40, 130, 100, 20);
        add(lb2mat);

        tfmat = new JTextField();
        tfmat.setBounds(150, 130, 150, 20);
        add(tfmat);

        registerButton = new JButton("Register");
        registerButton.setBounds(20, 190, 170, 30);
        registerButton.setBackground(Color.BLACK);
        registerButton.setForeground(Color.WHITE);
        registerButton.addActionListener(this);
        add(registerButton);

        loginButton = new JButton("Login");
        loginButton.setBounds(220, 190, 170, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pictures/window.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(605, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword());
            String mat = tfmat.getText();

            try (FileWriter writer = new FileWriter("txtlogin.txt", true)) {
                writer.write(username + "," + password + "," + mat);
                writer.write(System.lineSeparator());
                JOptionPane.showMessageDialog(this, "Registration successful!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage());
            }
        } else if (e.getSource() == loginButton) {
            try {
                Thread.sleep(900);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(signup::new);
    }
}

