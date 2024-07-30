package UniversityManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
//import java.sql.ResultSet;
//import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//import com.mysql.cj.xdevapi.Result;


public class Login extends JFrame implements ActionListener{
    JButton login, cancel;
    // sql
    JTextField tfusername, tfpassword;

    Login () {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //username

        JLabel lbusername = new JLabel("Username");
        lbusername.setBounds(40, 20, 100, 20);
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);


        //password

        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40, 70, 100, 20);
        add(lbpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        //buttons login and cancel

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        //login image 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pictures/hospital.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 200, 200);
        add(image);



        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);


    
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login) {
            setVisible(false);
            new Project();
           
        } try {
            Thread.sleep(100);
            setVisible(false);
        }catch (Exception e){}

    }
        


    public static void main(String[] args) {
        new Login();
    }
}