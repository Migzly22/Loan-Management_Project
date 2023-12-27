import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdditionalFrames implements RootValue{


    public JButton okLoginwuc = new JButton("OK"); //OK

    public void Success(){
        JFrame successFrameLogin = new JFrame("Login Succesfully!");
        JPanel successPanelLogin = new JPanel(null);
        Border sucsBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        successPanelLogin.setBorder(sucsBorder);

        JLabel successLogoLogin = new JLabel();
        ImageIcon iconSuccessLogin = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        successLogoLogin.setIcon(iconSuccessLogin);


        JLabel lc = new JLabel("Login Succesfully!"); //Wrong User Credentials!
        
        lc.setFont(customFont0lbl);
        lc.setForeground(Color.decode("#4d4d4d"));

        JButton okLoginlc = new JButton("OK"); //OK

        okLoginlc.setFont(customFont19);

        okLoginlc.setForeground(Color.decode("#ffffff"));
        okLoginlc.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okLoginlc.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okLoginlc.setFocusPainted(false);

        //Mouse Icon Hover
        okLoginlc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okLoginlc.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okLoginlc.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        successFrameLogin.setLayout(null);
        successFrameLogin.setUndecorated(true);
        successFrameLogin.setBounds(0, 0, 350, 200);
        successFrameLogin.setLocationRelativeTo(null);
        successFrameLogin.setVisible(false);//false

		successPanelLogin.add(okLoginlc);
        successPanelLogin.add(successLogoLogin);
        successPanelLogin.add(lc);

        successFrameLogin.add(successPanelLogin);

    }

    public void Error(){
        //Error Frame Login
        JFrame errorFrameLogin = new JFrame("Wrong User Credentials!");
        JPanel errorPanelLogin = new JPanel(null);
        Border errBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        errorPanelLogin.setBorder(errBorder);

        JLabel errorLogoLogin = new JLabel();
        ImageIcon iconErrorLogin = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Ekis-65.png");
        errorLogoLogin.setIcon(iconErrorLogin);


        JLabel wuc = new JLabel("Wrong User Credentials!"); //Wrong User Credentials!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        wuc.setFont(customFont0lbl);
        wuc.setForeground(Color.decode("#4d4d4d"));


        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okLoginwuc.setFont(customFont19);

        okLoginwuc.setForeground(Color.decode("#ffffff"));
        okLoginwuc.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okLoginwuc.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okLoginwuc.setFocusPainted(false);

        //Mouse Icon Hover
        okLoginwuc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okLoginwuc.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okLoginwuc.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        errorFrameLogin.setLayout(null);
        errorFrameLogin.setUndecorated(true);
        errorFrameLogin.setBounds(0, 0, 350, 200);
        errorFrameLogin.setLocationRelativeTo(null);
        errorFrameLogin.setVisible(false);//false

		errorPanelLogin.add(okLoginwuc);
        errorPanelLogin.add(errorLogoLogin);
        errorPanelLogin.add(wuc);

        errorFrameLogin.add(errorPanelLogin);
    }
}
