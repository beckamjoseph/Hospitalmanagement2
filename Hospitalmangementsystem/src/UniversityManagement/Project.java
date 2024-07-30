package UniversityManagement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


@SuppressWarnings("unused")
public class Project extends JFrame implements ActionListener{
    Project() {
        setSize(800, 550);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pictures/cartoon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); 
        add(image);
            
        // menu bar new information
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("new information");
        newInformation.setForeground(Color.BLACK);
        mb.add(newInformation);

        JMenuItem HospitalInfo = new JMenuItem("New Hospital information");
        newInformation.add(HospitalInfo);

        JMenuItem HospitalInfo2 = new JMenuItem("Clinic News");
        newInformation.add(HospitalInfo2);

        // consult a doctor
        JMenu consult = new JMenu();
        JMenu newInformation2 = new  JMenu("Consultant");
        consult.setForeground(Color.BLACK);
        mb.add(newInformation2);

        JMenuItem consultant = new JMenuItem("Book Appointment");
        newInformation2.add(consultant);

        JMenuItem consultant2 = new JMenuItem("See doctor");
        newInformation2.add(consultant2);

        // view details

        JMenu details = new JMenu();
        JMenu newInformation3 = new  JMenu("Details");
        details.setForeground(Color.RED);
        mb.add(newInformation3);

        JMenuItem Details = new JMenuItem("Check student clinic details");
        newInformation3.add(Details);

        // Prescription
        JMenu prescription = new JMenu();
        JMenu newInformation4 = new JMenu("Doctors prescription");
        prescription.setForeground(Color.RED);
        mb.add(newInformation4);

        JMenuItem Prescription = new JMenuItem("Check Doctors prescription");
        newInformation4.add(Prescription);

        JMenuItem Prescription2 = new JMenuItem("Write prescription");
        newInformation4.add(Prescription2);

        //exit 
        JMenu exit = new JMenu("Exit");
        JMenu newInformation5 = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
     }

        public void actionPerformed(ActionEvent ae) {
            String msg = ae.getActionCommand();

            if (msg.equals("Exit")) {
                setVisible(false);
            }
        }
    public static void main(String[] args) {
             new Project();
                
            }
        }