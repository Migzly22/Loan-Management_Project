import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;


public class Login extends Entity implements RootValue{

    static AdditionalFrames addons = new AdditionalFrames();
    static Login entitycontainer = new Login();

    public static void main(String[] args) {

        String imagePath = currentDirectory + "\\GiPit_lg.png";

        // LOGIN FRAME (LEFT PART)
        JFrame frame1 = new JFrame("GiPit - Loan Management System");

        JPanel left = new JPanel(null); 

        JLabel logoLeft = new JLabel();

        ImageIcon icon1 = new ImageIcon(imagePath);
        logoLeft.setIcon(icon1);

        JLabel tagline = new JLabel("Where Financial Challenges Meet Solutions.");
        
        tagline.setFont(customFont1);
        tagline.setForeground(Color.decode(whiteColor));


        // LOGIN FRAME (RIGHT PART)
        JPanel right = new JPanel(null); 

        JLabel login = new JLabel("LOGIN");
        
        
        login.setFont(customFont2);
        login.setForeground(Color.decode(blueColor));

        JLabel username = new JLabel("Username :");

        username.setFont(customFont3);
        username.setForeground(Color.decode(blackColor)); //#4d4d4d or #808080


        JTextField userNametf = new JTextField("");

        userNametf.setForeground(Color.decode(blackColor));
        userNametf.setFont(customFont4);
        userNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JLabel pass = new JLabel("Password :");

        pass.setFont(customFont3);
        pass.setForeground(Color.decode(blackColor));

        JPasswordField passTf = new JPasswordField("");

        passTf.setForeground(Color.decode(blackColor));
        passTf.setFont(customFont4);
        passTf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#797A7B or #919293

        JCheckBox showPass = new JCheckBox("Show Password");

        showPass.setFont(customFont5);
        showPass.setForeground(Color.decode(blackColor));
        showPass.setBackground(Color.decode(whiteColor));
        showPass.setFocusPainted(false);

        showPass.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                passTf.setEchoChar(showPass.isSelected() ? '\0' : '\u2022');
            }
        });

        JButton loginBtn = new JButton("Login");

        loginBtn.setFont(customFont6);
        loginBtn.setForeground(Color.decode(whiteColor));
        loginBtn.setBackground(Color.decode(blueColor));
        loginBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        loginBtn.setFocusPainted(false);


        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent  e){
                frame1.setVisible(false);
                addons.Success("String Title","String Message");
                Dashboard dashboard = new Dashboard();
                dashboard.dashboardFrame();

            }
        });


        //SETBOUNDS
        left.setBounds(0, 0, 400, 500);
        left.setBackground(Color.decode(blueColor)); //#007dfe
        logoLeft.setBounds(70, 60, 300, 300);
        tagline.setBounds(37, 320, 400, 100);

        right.setBounds(400, 0, 400, 500);
        right.setBackground(Color.decode(whiteColor));
        login.setBounds(135, 30, 200, 100);
        username.setBounds(40, 100, 100, 100);
        userNametf.setBounds(40, 165, 300, 40);
        pass.setBounds(40, 185, 200, 100);
        passTf.setBounds(40, 250, 300, 40);
        showPass.setBounds(40, 295, 125, 20);
        loginBtn.setBounds(250, 320, 90, 37);


        //ADD TO FRAME
        frame1.setLayout(null);
        frame1.setBounds(0, 0, 800, 500);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true); // true
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        left.add(logoLeft);
        left.add(tagline);
        frame1.add(left);

        right.add(login);
        right.add(username);
        right.add(userNametf);
        right.add(pass);
        right.add(passTf);
        right.add(showPass);
        right.add(loginBtn);
        frame1.add(right);

    }
}
