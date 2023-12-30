import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.table.*;

public class Sidebar implements RootValue{

    public void sidebar(){//sidebar
        JFrame frame2 = new JFrame("Dashboard");
        JPanel leftSidebar = new JPanel(null);

        
        Dashboard dashboard = new Dashboard();
        Setting setting = new Setting();
        Loan loan = new Loan();

        dashboard.dashboardFrame();
        setting.settingspanel();
        loan.loanlist();
        
        ImageIcon icon2 = new ImageIcon( currentDirectory +"\\gplg.png");
        ImageIcon dashbicon = new ImageIcon( currentDirectory +"\\dashboard.png");
        ImageIcon settingsicon = new ImageIcon( currentDirectory +"\\settings.png");
        ImageIcon debtoricon = new ImageIcon( currentDirectory +"\\debtor.png");//there is a bug here
        ImageIcon logouticon = new ImageIcon( currentDirectory +"\\logout.png");

        JLabel logoTopSidebar = new JLabel();

        Border dashbNoRightBorder = new MatteBorder(2, 2, 3, 0, Color.decode(greycolor));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        leftSidebar.setBorder(dashbNoRightBorder);

        logoTopSidebar.setIcon(icon2);

        JLabel lineLeft = new JLabel();

        lineLeft.setOpaque(true);
        lineLeft.setBackground(Color.decode(greycolor)); // Set the line color
        lineLeft.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));


		//Dashboard Sidebar
        JLabel dashbLogo = new JLabel("     Dashboard");

        dashbLogo.setIcon(dashbicon);
        dashbLogo.setFont(customFont7);
        dashbLogo.setForeground(Color.decode(whiteColor));
        
        //Settings Module
        JLabel settingsLogo = new JLabel("     Settings");
        
        settingsLogo.setIcon(settingsicon);
        settingsLogo.setFont(customFont7);
        settingsLogo.setForeground(Color.decode(whiteColor));

        JLabel debtorLogo = new JLabel("     Debtors");
        
        debtorLogo.setIcon(debtoricon);
        debtorLogo.setFont(customFont7);
        debtorLogo.setForeground(Color.decode(whiteColor));

        JLabel logoutLogo = new JLabel("     Logout");
        
        logoutLogo.setIcon(logouticon);
        logoutLogo.setFont(customFont7);
        logoutLogo.setForeground(Color.decode(whiteColor));

        JLabel lineBottom = new JLabel();

        lineBottom.setOpaque(true);
        lineBottom.setBackground(Color.decode(greycolor)); // Set the line color
        lineBottom.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));


// SETBOUNDS
        leftSidebar.setBounds(0, 0, 200, 550); //600
        leftSidebar.setBackground(Color.decode(blueColor)); //#007dfe
        logoTopSidebar.setBounds(20, 5, 200, 50);
        lineLeft.setBounds(0, 65, 600, 2);
        lineBottom.setBounds(0,460,600,2);

        dashbLogo.setBounds(20, 85, 130, 50);
        debtorLogo.setBounds(20, 135, 130, 50);
        settingsLogo.setBounds(20, 185, 130, 50);
        logoutLogo.setBounds(20, 470, 130, 50);
        leftSidebar.add(logoTopSidebar);
        leftSidebar.add(lineLeft);
        leftSidebar.add(lineBottom);
        leftSidebar.add(dashbLogo);
        leftSidebar.add(debtorLogo);
        leftSidebar.add(settingsLogo);
        leftSidebar.add(logoutLogo);

//ACTION
        settingsLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
    
                frame2.remove(dashboard.dashbRight);
                frame2.remove(setting.settingsRight);
                frame2.remove(loan.debtorRight);

                frame2.setTitle("Settings");
                frame2.add(setting.settingsRight);

                // Update the container
                frame2.revalidate();
                frame2.repaint();
            }

        });
        dashbLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frame2.remove(dashboard.dashbRight);
                frame2.remove(setting.settingsRight);
                frame2.remove(loan.debtorRight);

                frame2.setTitle("Dashboard");
                frame2.add(dashboard.dashbRight);

                // Update the container
                frame2.revalidate();
                frame2.repaint();
            }

        });
        debtorLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frame2.remove(dashboard.dashbRight);
                frame2.remove(setting.settingsRight);
                frame2.remove(loan.debtorRight);

                frame2.setTitle("Loan");
                frame2.add(loan.debtorRight);  

                frame2.revalidate();
                frame2.repaint();
            }

        });
        //GOING BACK TO LOGIN
        logoutLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame2.setVisible(false);
                Login login = new Login();
                login.login();
            }

        });
//ADD TO FRAME
        frame2.setLayout(null);
        frame2.setUndecorated(false);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame2.add(leftSidebar);//add sidebar
        frame2.add(dashboard.dashbRight);



    }

}
