import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sidebar implements RootValue{

    static Sidebar leftSidebar2 = new Sidebar();
    public JPanel leftSidebar = new JPanel(null);
    
    public void sidebar(){
        
        ImageIcon icon2 = new ImageIcon( currentDirectory +"\\gplg.png");
        ImageIcon dashbicon = new ImageIcon( currentDirectory +"\\dashboard.png");
        ImageIcon settingsicon = new ImageIcon( currentDirectory +"\\settings.png");
        ImageIcon debtoricon = new ImageIcon( currentDirectory +"\\debtor.png");//there is a bug here
        ImageIcon logouticon = new ImageIcon( currentDirectory +"\\logout.png");

        JLabel logoTopSidebar = new JLabel();

        Border dashbNoRightBorder = new MatteBorder(2, 2, 3, 0, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        leftSidebar.setBorder(dashbNoRightBorder);



        logoTopSidebar.setIcon(icon2);

        JLabel lineLeft = new JLabel();

        lineLeft.setOpaque(true);
        lineLeft.setBackground(Color.decode("#DBDCDE")); // Set the line color
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
        lineBottom.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineBottom.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));


        // SIDEBAR
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

    }
}
