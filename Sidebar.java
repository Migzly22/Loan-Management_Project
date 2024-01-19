import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.table.*;

public class Sidebar implements RootValue{
    
    JFrame frame2 = new JFrame("Dashboard");
    Dashboard dashboard = new Dashboard();
    Setting setting = new Setting();
    Loan loan = new Loan();    
    Loan_client loan2 = new Loan_client();     
    ViewLoan vloan = new ViewLoan();

    private static Sidebar instance;
    private Sidebar() {
        // Private constructor to prevent instantiation
    }
    public static void resetInstance() {
        instance = null;
    }
    public static Sidebar getInstance() {
        if (instance == null) {
            instance = new Sidebar();
        }
        return instance;
    }



    public void sidebar(){//sidebar
        JPanel leftSidebar = new JPanel(null);
        

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
                frame2.remove(vloan.viewDebRight);  

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
                frame2.remove(vloan.viewDebRight);  
        
                dashboard = new Dashboard();
                dashboard.dashboardFrame();

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
                frame2.remove(vloan.viewDebRight);  

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

                frame2.remove(dashboard.dashbRight);
                frame2.remove(setting.settingsRight);
                frame2.remove(loan.debtorRight);
                frame2.remove(vloan.viewDebRight); 

                frame2.setVisible(false);
                resetInstance();

                Login login = Login.getInstance();
                login.frame1.setVisible(true);
            }

        });
//ADD TO FRAME
        frame2.setLayout(null);
        frame2.setUndecorated(true);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame2.add(leftSidebar);//add sidebar
        frame2.add(dashboard.dashbRight);



    }
    public void addLoanToFrame2(int BID) {
        frame2.remove(dashboard.dashbRight);
        frame2.remove(setting.settingsRight);
        frame2.remove(loan.debtorRight);
        frame2.remove(vloan.viewDebRight);  

        vloan = new ViewLoan();
        vloan.viewLoanFrames(BID);

       
        frame2.add(vloan.viewDebRight);  
        frame2.setTitle("View User");

        frame2.revalidate();
        frame2.repaint();
    }


    public void sidebar2(){//sidebar
        JPanel leftSidebar = new JPanel(null);
    

        dashboard.dashboardFrame();
        setting.settingspanel();
        loan2.loanlist();


        
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
                frame2.remove(loan2.debtorRight);
                frame2.remove(vloan.viewDebRight);  

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
                frame2.remove(loan2.debtorRight);
                frame2.remove(vloan.viewDebRight);  
        
                dashboard = new Dashboard();
                dashboard.dashboardFrame();

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
                frame2.remove(loan2.debtorRight);
                frame2.remove(vloan.viewDebRight);  

                frame2.setTitle("Loan");
                frame2.add(loan2.debtorRight);  

                frame2.revalidate();
                frame2.repaint();
            }

        });
        //GOING BACK TO LOGIN
        logoutLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frame2.remove(dashboard.dashbRight);
                frame2.remove(setting.settingsRight);
                frame2.remove(loan.debtorRight);
                frame2.remove(vloan.viewDebRight); 

                frame2.setVisible(false);
                resetInstance();

                Login login = Login.getInstance();
                login.frame1.setVisible(true);
            }

        });
//ADD TO FRAME
        frame2.setLayout(null);
        frame2.setUndecorated(true);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame2.add(leftSidebar);//add sidebar
        frame2.add(dashboard.dashbRight);



    }



    public void ReloadData() {        
        String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            loan.loadTheData(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void reloadSettings1(String name) {
        setting.settNicknametf.setText(name);
        dashboard.wcUser.setText(name);
    }
    public void reloadSettings2(String usernmae) {
        setting.settUsernametf.setText(usernmae);
    }
    public void reloadSettings3(String usernmae) {
        
    }
}
