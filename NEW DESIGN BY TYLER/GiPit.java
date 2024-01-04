import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GiPit {
    public static void main(String[] args) {

        // LOGIN FRAME
        JFrame frame1 = new JFrame("GiPit - Loan Management System");

        JPanel right = new JPanel(null); //NOTE: !!!!!LEFT DAPAT TO NALITO LANGGG TINAMAD NA AKO PALITAN HHAHAHHAHAHAHAHAHAHAAHAHAHAHAHA!!!!!

        JLabel logoRight = new JLabel();
        ImageIcon icon1 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\GiPit_lg.png");
        logoRight.setIcon(icon1);

        JLabel tagline = new JLabel("Where Financial Challenges Meet Solutions.");
        Font customFont1 = new Font("Century Gothic", Font.PLAIN, 15);
        tagline.setFont(customFont1);
        tagline.setForeground(Color.decode("#ffffff"));

        JPanel left = new JPanel(null); //NOTE: !!!!!RIGHT DAPAT TO NALITO LANGGG TINAMAD NA AKO PALITAN HHAHAHHAHAHAHAHAHAHAAHAHAHAHAHA!!!!!!

        JLabel login = new JLabel("LOGIN");
        Font customFont2 = new Font("Century Gothic", Font.BOLD, 36);
        login.setFont(customFont2);
        login.setForeground(Color.decode("#007dfe"));

        JLabel username = new JLabel("Username :");
        JTextField userNametf = new JTextField("");
        Font customFont3 = new Font("Century Gothic", Font.BOLD, 15);
        username.setFont(customFont3);
        username.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        userNametf.setForeground(Color.decode("#4d4d4d"));
        Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        userNametf.setFont(customFont4);
        userNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JLabel pass = new JLabel("Password :");
        JPasswordField passtf = new JPasswordField("");
        pass.setFont(customFont3);
        pass.setForeground(Color.decode("#4d4d4d"));

        passtf.setForeground(Color.decode("#4d4d4d"));
        passtf.setFont(customFont4);
        passtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#797A7B or #919293

        JCheckBox showPass = new JCheckBox("Show Password");
        Font customFont5 = new Font("Century Gothic", Font.PLAIN, 13);
        showPass.setFont(customFont5);
        showPass.setForeground(Color.decode("#4d4d4d"));
        showPass.setFocusPainted(false);

		//Mouse Icon Hover
        showPass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                showPass.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        JButton loginBtn = new JButton("Login");
        Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        loginBtn.setFont(customFont6);

        loginBtn.setForeground(Color.decode("#ffffff"));
        loginBtn.setBackground(Color.decode("#007dfe"));
        loginBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        loginBtn.setFocusPainted(false);

		//Mouse Icon Hover
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                loginBtn.setBackground(Color.decode("#006ad7"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                loginBtn.setBackground(Color.decode("#007dfe"));
            }
        });
        //


        //Success Frame Login
        JFrame successFrameLogin = new JFrame("Login Succesfully!");
        JPanel successPanelLogin = new JPanel(null);
        Border sucsBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        successPanelLogin.setBorder(sucsBorder);

        JLabel successLogoLogin = new JLabel();
        ImageIcon iconSuccessLogin = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        successLogoLogin.setIcon(iconSuccessLogin);


        JLabel lc = new JLabel("Login Succesfully!"); //Wrong User Credentials!
        Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        lc.setFont(customFont0lbl);
        lc.setForeground(Color.decode("#4d4d4d"));

        JButton okLoginlc = new JButton("OK"); //OK
        Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
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
        //

        //End Success Frame Login


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

        JButton okLoginwuc = new JButton("OK"); //OK
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
        //


        // END LOGIN FRAME

        // DASHBOARD
        JFrame frame2 = new JFrame("Dashboard");
        JPanel leftSidebar = new JPanel(null);

        Border dashbNoRightBorder = new MatteBorder(2, 2, 3, 0, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        leftSidebar.setBorder(dashbNoRightBorder);


        JLabel logoTopSidebar = new JLabel();
        ImageIcon icon2 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\gplg.png");
        logoTopSidebar.setIcon(icon2);

        JLabel lineLeft = new JLabel();
        lineLeft.setOpaque(true);
        lineLeft.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineLeft.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

		//Dashboard Sidebar
        JLabel dashbLogo = new JLabel("     Dashboard");
        ImageIcon dashbicon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\dashboard.png");
        dashbLogo.setIcon(dashbicon);

        //Mouse Icon Hover
        dashbLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                dashbLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                dashbLogo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        Font customFont7 = new Font("Century Gothic", Font.BOLD, 15);
        dashbLogo.setFont(customFont7);
        dashbLogo.setForeground(Color.decode("#ffffff"));

		//Dashboard Module
        //JPanel dashbRight = new JPanel(new FlowLayout());
        JPanel dashbRight = new JPanel(null);
        Border dashbNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        dashbRight.setBorder(dashbNoLefttBorder);

        JLabel dashword = new JLabel("Dashboard");
        Font customFont8 = new Font("Century Gothic", Font.BOLD, 30);
        dashword.setFont(customFont8);
        dashword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight1 = new JLabel();
        lineRight1.setOpaque(true);
        lineRight1.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight1.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JLabel lineBottom = new JLabel();
        lineBottom.setOpaque(true);
        lineBottom.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineBottom.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));


        JLabel wcUser = new JLabel("Welcome User: " + userNametf.getText());
        Font customFont9 = new Font("Century Gothic", Font.BOLD, 18);
        wcUser.setFont(customFont9);
        wcUser.setForeground(Color.decode("#4d4d4d"));

		//box debtors
        JPanel boxLeft1 = new JPanel(null);
        JPanel boxRight1 = new JPanel(null);
        JPanel border1 = new JPanel(null);

        JLabel leftbox1 = new JLabel();
        ImageIcon nodebtorsicon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\no.debtors.png");
        leftbox1.setIcon(nodebtorsicon);

        JLabel debtorswordBox = new JLabel("Debtors");
        JLabel debtorsnumberBox = new JLabel("10"); //ETO ATA PAPALITAN

        Font customFont10 = new Font("Century Gothic", Font.PLAIN, 17);
        debtorswordBox.setFont(customFont10);
        debtorswordBox.setForeground(Color.decode("#4d4d4d"));

        Font customFont11 = new Font("Century Gothic", Font.BOLD, 16);
        debtorsnumberBox.setFont(customFont11);
        debtorsnumberBox.setForeground(Color.decode("#4d4d4d"));
		//end box debtors

		//box due today
		JPanel boxLeft2 = new JPanel(null);
        JPanel boxRight2 = new JPanel(null);
        JPanel border2 = new JPanel(null);

        JLabel leftbox2 = new JLabel();
        ImageIcon duetodayicon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\due-today.png");
        leftbox2.setIcon(duetodayicon);

        JLabel duetodayword = new JLabel("Due Today");
        JLabel duetodaynumber = new JLabel("25"); //ETO ATA PAPALITAN

        duetodayword.setFont(customFont10);
        duetodayword.setForeground(Color.decode("#4d4d4d"));

        duetodaynumber.setFont(customFont11);
        duetodaynumber.setForeground(Color.decode("#4d4d4d"));
		//end box due today

		//box todays profit
		JPanel boxLeft3 = new JPanel(null);
        JPanel boxRight3 = new JPanel(null);
        JPanel border3 = new JPanel(null);

        JLabel leftbox3 = new JLabel();
        ImageIcon todaysProfiticon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\profit.png");
        leftbox3.setIcon(todaysProfiticon);

        JLabel todaysProfitword = new JLabel("Todays Profit");

        //peso sign
        JLabel todaysProfitPesoSignword = new JLabel("\u20B1 ");
        Font customFontPS = new Font("Segoe UI", Font.PLAIN, 18);
        todaysProfitPesoSignword.setFont(customFontPS);
        todaysProfitPesoSignword.setForeground(Color.decode("#4d4d4d"));

        //end peso sign

        JLabel todaysProfitnumber = new JLabel("1000"); //ETO ATA PAPALITAN

        todaysProfitword.setFont(customFont10);
        todaysProfitword.setForeground(Color.decode("#4d4d4d"));

        todaysProfitnumber.setFont(customFont11);
        todaysProfitnumber.setForeground(Color.decode("#4d4d4d"));
		//end box todays profit

		//Table Dashboard
		String [] [] rowDashboard = {{"Name1", "Debt1"},
							 {"Name2", "Debt2"},
							 {"Name3", "Debt3"},
							 {"Name4", "Debt4"},
							 {"Name5", "Debt5"}};

		String [] colDashboard = {"   Name", "   Total Debts"};

		DefaultTableModel dtmDashboard = new DefaultTableModel(rowDashboard,colDashboard);
		JTable tb1Dasboard = new JTable(dtmDashboard);

		JScrollPane spDashboard = new JScrollPane(tb1Dasboard);
		//end Table

        //End of Dashboard Module


		//DEBTOR

        //Debtor Module
        JLabel debtorLogo = new JLabel("     Debtors");
        ImageIcon debtoricon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\debtor.png");
        debtorLogo.setIcon(debtoricon);

        //Mouse Icon Hover
        debtorLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                debtorLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                debtorLogo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        debtorLogo.setFont(customFont7);
        debtorLogo.setForeground(Color.decode("#ffffff"));

        //JPanel debtorRight = new JPanel(new CardLayout());
        JPanel debtorRight = new JPanel(null);
        Border debNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        debtorRight.setBorder(debNoLefttBorder);


        JLabel debtorword = new JLabel("Debtors");
        debtorword.setFont(customFont8);
        debtorword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight2 = new JLabel();
        lineRight2.setOpaque(true);
        lineRight2.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight2.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JTextField searchtfDebtor = new JTextField("");
        searchtfDebtor.setForeground(Color.decode("#797A7B"));
        Font customFont12 = new Font("Century Gothic", Font.PLAIN, 16);
        searchtfDebtor.setFont(customFont12);
        searchtfDebtor.setBorder(new LineBorder(Color.decode("#4d4d4d"), 1)); //#ffffff or #DBDCDE


        JButton searchbtnDebtor = new JButton("Search");
        JButton addbtnDebtor = new JButton("Add");

        Font customFont13 = new Font("Century Gothic", Font.BOLD, 14);
        searchbtnDebtor.setFont(customFont13);
        addbtnDebtor.setFont(customFont13);

        searchbtnDebtor.setForeground(Color.decode("#ffffff"));
        addbtnDebtor.setForeground(Color.decode("#ffffff"));

        searchbtnDebtor.setBackground(Color.decode("#70baf8"));
        addbtnDebtor.setBackground(Color.decode("#57F287"));

        searchbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
        addbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2)); //#ffffff or #DBDCDE
        searchbtnDebtor.setFocusPainted(false);
        addbtnDebtor.setFocusPainted(false);


        //Mouse Icon Hover
        searchbtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                searchbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                searchbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Mouse Icon Hover
        addbtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                addbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

		//Table Debtor
		String [] [] rowDebtor = {{"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""}};

		String [] colDebtor = {"ID", "Name", "Date", "Loan", "Interest", "Total", "Status"};

		DefaultTableModel dtmDebtor = new DefaultTableModel(rowDebtor,colDebtor);
		JTable tb1Debtor = new JTable(dtmDebtor);

		JScrollPane spDebtor = new JScrollPane(tb1Debtor);
		//end Table

		JButton viewbtnDebtor = new JButton("View");
        JButton paybtnDebtor = new JButton("Pay");

        Font customFont14 = new Font("Century Gothic", Font.BOLD, 16);
        viewbtnDebtor.setFont(customFont14);
        paybtnDebtor.setFont(customFont14);

        viewbtnDebtor.setForeground(Color.decode("#ffffff"));
        paybtnDebtor.setForeground(Color.decode("#ffffff"));

        viewbtnDebtor.setBackground(Color.decode("#FEA948"));
        paybtnDebtor.setBackground(Color.decode("#007dfe"));

        viewbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
        paybtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2)); //#ffffff or #DBDCDE
        viewbtnDebtor.setFocusPainted(false);
        paybtnDebtor.setFocusPainted(false);

        //Mouse Icon Hover
        viewbtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //Mouse Icon Hover
        paybtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //


        //Add Button Frame
        JFrame frame3 = new JFrame("Add Debtor");
        JPanel addDebTop = new JPanel(null);

        JLabel logoTopLeft = new JLabel();
        ImageIcon icon3 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\gplg.png");
        logoTopLeft.setIcon(icon3);

        //End Add Button Frame

        //Add Debtor Frame
        JFrame addDebtorFrame = new JFrame("Add Debtor");
        JPanel addDebtorTopbar = new JPanel(null);
        Border addDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        addDebtorTopbar.setBorder(addDebTopBorder);

        JLabel addDebtorLogoTopbar = new JLabel();
        ImageIcon addDebtoricon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\gplg.png");
        addDebtorLogoTopbar.setIcon(addDebtoricon);

        JLabel addDebtorWord = new JLabel("Add Debtor");
        Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
        addDebtorWord.setFont(customFont15);
        addDebtorWord.setForeground(Color.decode("#073cb7"));


        JLabel addDebtorTopbarLine = new JLabel();
        addDebtorTopbarLine.setOpaque(true);
        addDebtorTopbarLine.setBackground(Color.decode("#DBDCDE")); // Set the line color
        addDebtorTopbarLine.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JPanel addDebtorBottombar = new JPanel(null);
        Border addDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        addDebtorBottombar.setBorder(addDebBottomBorder);

		//Jlabel left
        JLabel adFirstNameLabel = new JLabel("First Name:");
        JLabel adMiddleNameLabel = new JLabel("Middle Name:");
        JLabel adLastNameLabel = new JLabel("Last Name:");
        JLabel adEmailLabel = new JLabel("Email:");
        JLabel adAddressLabel = new JLabel("Address:");
        JLabel adConNumLabel = new JLabel("Contact Number:");

        //Jtextfield left
        JTextField adFirstNametf = new JTextField();
        JTextField adMiddleNametf = new JTextField();
        JTextField adLastNametf = new JTextField();
        JTextField adEmailtf = new JTextField();
        JTextField adAddresstf = new JTextField();
        JTextField adConNumtf = new JTextField();

        //Jlabel right
        JLabel adClassificationLabel = new JLabel("Classification:");
        JLabel adFrequencyLabel = new JLabel("Frequency: ");
        JLabel adPeriodLabel = new JLabel("Period:");
        JLabel adLoanAmountLabel = new JLabel("Loan Amount:");


        //Jtextfield right
        //JTextField adClassificationtf = new JTextField();
         String select1 [] ={"Student","Self Employed","Employee"};
		JComboBox adClassification = new JComboBox(select1);

        String select2 [] ={"Weekly","Montly","Annually"};
		JComboBox adFrequency = new JComboBox(select2);
        JTextField adPeriodtf = new JTextField();
        JTextField adLoanAmounttf = new JTextField();
        //

        //left style
        Font customFont16 = new Font("Century Gothic", Font.BOLD, 13);


        adFirstNameLabel.setFont(customFont16);
        adMiddleNameLabel.setFont(customFont16);
        adLastNameLabel.setFont(customFont16);
        adEmailLabel.setFont(customFont16);
        adAddressLabel.setFont(customFont16);
        adConNumLabel.setFont(customFont16);

        adFirstNameLabel.setForeground(Color.decode("#4d4d4d"));
        adMiddleNameLabel.setForeground(Color.decode("#4d4d4d"));
        adLastNameLabel.setForeground(Color.decode("#4d4d4d"));
        adEmailLabel.setForeground(Color.decode("#4d4d4d"));
        adAddressLabel.setForeground(Color.decode("#4d4d4d"));
        adConNumLabel.setForeground(Color.decode("#4d4d4d"));


        Font customFont17 = new Font("Century Gothic", Font.PLAIN, 14);

        adFirstNametf.setFont(customFont17);
        adFirstNametf.setForeground(Color.decode("#4d4d4d"));
        adFirstNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adMiddleNametf.setFont(customFont17);
        adMiddleNametf.setForeground(Color.decode("#4d4d4d"));
        adMiddleNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adLastNametf.setFont(customFont17);
        adLastNametf.setForeground(Color.decode("#4d4d4d"));
        adLastNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adEmailtf.setFont(customFont17);
        adEmailtf.setForeground(Color.decode("#4d4d4d"));
        adEmailtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adAddresstf.setFont(customFont17);
        adAddresstf.setForeground(Color.decode("#4d4d4d"));
        adAddresstf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE


		adConNumtf.setFont(customFont17);
        adConNumtf.setForeground(Color.decode("#4d4d4d"));
        adConNumtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE
        //end left style

		//right style

		adClassificationLabel.setFont(customFont16);
        adFrequencyLabel.setFont(customFont16);
        adPeriodLabel.setFont(customFont16);
        adLoanAmountLabel.setFont(customFont16);

        adClassificationLabel.setForeground(Color.decode("#4d4d4d"));
        adFrequencyLabel.setForeground(Color.decode("#4d4d4d"));
        adPeriodLabel.setForeground(Color.decode("#4d4d4d"));
        adLoanAmountLabel.setForeground(Color.decode("#4d4d4d"));


        adClassification.setFont(customFont17);
        adClassification.setForeground(Color.decode("#4d4d4d"));
        adClassification.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adFrequency.setFont(customFont17);
        adFrequency.setForeground(Color.decode("#4d4d4d"));
        adFrequency.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        /*adFrequency.setFont(customFont17);
        adFrequency.setForeground(Color.decode("#4d4d4d"));
        adFrequency.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE*/

        adPeriodtf.setFont(customFont17);
        adPeriodtf.setForeground(Color.decode("#4d4d4d"));
        adPeriodtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        adLoanAmounttf.setFont(customFont17);
        adLoanAmounttf.setForeground(Color.decode("#4d4d4d"));
        adLoanAmounttf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE
		//end right style

		JButton adSavebtn = new JButton("Save");
		JButton adCancelbtn = new JButton("Cancel");

		adSavebtn.setFont(customFont14);
        adCancelbtn.setFont(customFont14);

        adSavebtn.setForeground(Color.decode("#ffffff"));
        adCancelbtn.setForeground(Color.decode("#ffffff"));

        adSavebtn.setBackground(Color.decode("#57F287"));
        adCancelbtn.setBackground(Color.decode("#FF1A1A"));

        adSavebtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2));//#ffffff or #DBDCDE
        adCancelbtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #DBDCDE
        adSavebtn.setFocusPainted(false);
		adCancelbtn.setFocusPainted(false);


        //Mouse Icon Hover
        adSavebtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                adSavebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                adSavebtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //Mouse Icon Hover
        adCancelbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                adCancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                adCancelbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

		//

        // add debtor frame functions button
        addbtnDebtor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addDebtorFrame.setVisible(true);
                frame2.setVisible(false);
            }
        });
        //add detbor frame functions button

         // cancel debtor frame functions button
        adCancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
                addDebtorFrame.setVisible(false);
                adAddresstf.setText(""); //Clears the recen
            }
        });
        //



         //Add Debtor Saved Successfully Frame
        JFrame savedsuccFrameAD = new JFrame("Saved Succesfully!");
        JPanel savedPanelAD = new JPanel(null);
        Border savedBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        savedPanelAD.setBorder(savedBorder);

        JLabel savedLogoAD = new JLabel();
        ImageIcon iconSavedAD = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        savedLogoAD.setIcon(iconSavedAD);


        JLabel ss = new JLabel("Saved Succesfully!"); //Saved Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        ss.setFont(customFont0lbl);
        ss.setForeground(Color.decode("#4d4d4d"));

        JButton okAdss = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okAdss.setFont(customFont19);

        okAdss.setForeground(Color.decode("#ffffff"));
        okAdss.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okAdss.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdss.setFocusPainted(false);

        //Mouse Icon Hover
        okAdss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdss.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdss.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

       //End Add Debtor Saved Successfully Frame


        //Add Debtor Error Age Restriction Frame
        JFrame ageresFrameAD = new JFrame("Age Restriction!");
        JPanel ageresPanelAD = new JPanel(null);
        Border ageresBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        ageresPanelAD.setBorder(ageresBorder);

        JLabel ageresLogoAD = new JLabel();
        ImageIcon iconAgeresAD = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Ekis-65.png");
        ageresLogoAD.setIcon(iconAgeresAD);


        JLabel ar = new JLabel("Age Restriction!"); //Age Restriction!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        ar.setFont(customFont0lbl);
        ar.setForeground(Color.decode("#4d4d4d"));

        JButton okAdar = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okAdar.setFont(customFont19);

        okAdar.setForeground(Color.decode("#ffffff"));
        okAdar.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okAdar.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdar.setFocusPainted(false);

        //Mouse Icon Hover
        okAdar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdar.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //End Add Debtor Error Age Restriction Frame

        //

        //Add Debtor Saved Button Actions
        adSavebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String userAge = adAddresstf.getText(); //PRE GINAWA KO LANG TO PARA LUMABAS LANG YUNG MGA MESSAGE BOX
            	 int age = Integer.parseInt(userAge);

            	 if (age >= 18) {
               		savedsuccFrameAD.setVisible(true);

               		okAdss.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			frame2.setVisible(true);
	            			adAddresstf.setText(""); //Clears the recen
	            			savedsuccFrameAD.setVisible(false);
	            			frame3.setVisible(false);
	            		}
                    });
               	}
               	else{
               		ageresFrameAD.setVisible(true);

               		okAdar.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			//frame2.setVisible(true);
	            			adAddresstf.setText(""); //Clears the recen
	            			ageresFrameAD.setVisible(false);
	            			//frame3.setVisible(false);
	            		}
                    });

               	}
            }
        });

        //

        //

        //End Add Debtor Frame



        //View Debtor Frame

        /*View Debtor Frame
        JFrame viewDebtorFrame = new JFrame("View Debtor");
        JPanel viewDebtorTopbar = new JPanel(null);
        Border viewDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebtorTopbar.setBorder(viewDebTopBorder);

        JLabel viewDebtorLogoTopbar = new JLabel();
        ImageIcon viewDebtoricon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\gplg.png");
        viewDebtorLogoTopbar.setIcon(viewDebtoricon);

        JLabel viewDebtorWord = new JLabel("View Debtor");
        //Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
        viewDebtorWord.setFont(customFont15);
        viewDebtorWord.setForeground(Color.decode("#073cb7"));


        JLabel viewDebtorTopbarLine = new JLabel();
        viewDebtorTopbarLine.setOpaque(true);
        viewDebtorTopbarLine.setBackground(Color.decode("#DBDCDE")); // Set the line color
        viewDebtorTopbarLine.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JPanel viewDebtorBottombar = new JPanel(null);
        Border viewDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebtorBottombar.setBorder(viewDebBottomBorder);

		//Jlabel left
        JLabel vdFirstNameLabel = new JLabel("First Name :");
        JLabel vdMiddleNameLabel = new JLabel("Middle Name :");
        JLabel vdLastNameLabel = new JLabel("Last Name :");
        JLabel vdGenderLabel = new JLabel("Gender :");
        JLabel vdDoBLabel = new JLabel("Date of Birth :");
        JLabel vdJobLabel = new JLabel("Job :");

        //Jtextfield left
        JTextField vdFirstNametf = new JTextField();
        JTextField vdMiddleNametf = new JTextField();
        JTextField vdLastNametf = new JTextField();
        JTextField vdGendertf = new JTextField();
        JTextField vdDoBtf = new JTextField();
        JTextField vdJobtf = new JTextField();

        //Jlabel right
        JLabel vdAmountLoanLabel = new JLabel("Amount Loan");
        JLabel vdInterestRateLabel = new JLabel("Interest Rate");
        JLabel vdNoPLabel = new JLabel("Number of Payments");
        JLabel vdMPLabel = new JLabel("Monthly Pay");
        JLabel vdTLLabel = new JLabel("Total Loan");
        JLabel vdPALabel = new JLabel("Paid Amount");


        //Jtextfield right
        JTextField vdAmountLoantf = new JTextField();
        JTextField vdInterestRatetf = new JTextField();
        JTextField vdNoPtf = new JTextField();
        JTextField vdMPtf = new JTextField();
        JTextField vdTLtf = new JTextField();
        JTextField vdPAtf = new JTextField();
        //

        //left style
        //Font customFont16 = new Font("Century Gothic", Font.BOLD, 13);


        vdFirstNameLabel.setFont(customFont16);
        vdMiddleNameLabel.setFont(customFont16);
        vdLastNameLabel.setFont(customFont16);
        vdGenderLabel.setFont(customFont16);
        vdDoBLabel.setFont(customFont16);
        vdJobLabel.setFont(customFont16);

        vdFirstNameLabel.setForeground(Color.decode("#4d4d4d"));
        vdMiddleNameLabel.setForeground(Color.decode("#4d4d4d"));
        vdLastNameLabel.setForeground(Color.decode("#4d4d4d"));
        vdGenderLabel.setForeground(Color.decode("#4d4d4d"));
        vdDoBLabel.setForeground(Color.decode("#4d4d4d"));
        vdJobLabel.setForeground(Color.decode("#4d4d4d"));


        //Font customFont17 = new Font("Century Gothic", Font.PLAIN, 14);

        vdFirstNametf.setFont(customFont17);
        vdFirstNametf.setForeground(Color.decode("#4d4d4d"));
        vdFirstNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdMiddleNametf.setFont(customFont17);
        vdMiddleNametf.setForeground(Color.decode("#4d4d4d"));
        vdMiddleNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdLastNametf.setFont(customFont17);
        vdLastNametf.setForeground(Color.decode("#4d4d4d"));
        vdLastNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdGendertf.setFont(customFont17);
        vdGendertf.setForeground(Color.decode("#4d4d4d"));
        vdGendertf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdDoBtf.setFont(customFont17);
        vdDoBtf.setForeground(Color.decode("#4d4d4d"));
        vdDoBtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE


		vdJobtf.setFont(customFont17);
        vdJobtf.setForeground(Color.decode("#4d4d4d"));
        vdJobtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdFirstNametf.setEditable(false);
        vdFirstNametf.setBackground(Color.decode("#FBFBFC"));

        vdMiddleNametf.setEditable(false);
        vdMiddleNametf.setBackground(Color.decode("#FBFBFC"));

        vdLastNametf.setEditable(false);
        vdLastNametf.setBackground(Color.decode("#FBFBFC"));

        vdGendertf.setEditable(false);
        vdGendertf.setBackground(Color.decode("#FBFBFC"));

        vdDoBtf.setEditable(false);
        vdDoBtf.setBackground(Color.decode("#FBFBFC"));

        vdJobtf.setEditable(false);
        vdJobtf.setBackground(Color.decode("#FBFBFC"));
        //end left style

		//right style

		vdAmountLoanLabel.setFont(customFont16);
        vdInterestRateLabel.setFont(customFont16);
        vdNoPLabel.setFont(customFont16);
        vdMPLabel.setFont(customFont16);
        vdTLLabel.setFont(customFont16);
        vdPALabel.setFont(customFont16);

        vdAmountLoanLabel.setForeground(Color.decode("#4d4d4d"));
        vdInterestRateLabel.setForeground(Color.decode("#4d4d4d"));
        vdNoPLabel.setForeground(Color.decode("#4d4d4d"));
        vdMPLabel.setForeground(Color.decode("#4d4d4d"));
        vdTLLabel.setForeground(Color.decode("#4d4d4d"));
        vdPALabel.setForeground(Color.decode("#4d4d4d"));


        vdAmountLoantf.setFont(customFont17);
        vdAmountLoantf.setForeground(Color.decode("#4d4d4d"));
        vdAmountLoantf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdInterestRatetf.setFont(customFont17);
        vdInterestRatetf.setForeground(Color.decode("#4d4d4d"));
        vdInterestRatetf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdNoPtf.setFont(customFont17);
        vdNoPtf.setForeground(Color.decode("#4d4d4d"));
        vdNoPtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdMPtf.setFont(customFont17);
        vdMPtf.setForeground(Color.decode("#4d4d4d"));
        vdMPtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        vdTLtf.setFont(customFont17);
        vdTLtf.setForeground(Color.decode("#4d4d4d"));
        vdTLtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE


		vdPAtf.setFont(customFont17);
        vdPAtf.setForeground(Color.decode("#4d4d4d"));
        vdPAtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE


        vdAmountLoantf.setEditable(false);
        vdAmountLoantf.setBackground(Color.decode("#FBFBFC"));

        vdInterestRatetf.setEditable(false);
        vdInterestRatetf.setBackground(Color.decode("#FBFBFC"));

        vdNoPtf.setEditable(false);
        vdNoPtf.setBackground(Color.decode("#FBFBFC"));

        vdMPtf.setEditable(false);
        vdMPtf.setBackground(Color.decode("#FBFBFC"));

        vdTLtf.setEditable(false);
        vdTLtf.setBackground(Color.decode("#FBFBFC"));

        vdPAtf.setEditable(false);
        vdPAtf.setBackground(Color.decode("#FBFBFC"));
		//end right style

		//JButton vdSavebtn = new JButton("Save");
		JButton vdCancelbtn = new JButton("Cancel");

        vdCancelbtn.setFont(customFont14);

        vdCancelbtn.setForeground(Color.decode("#ffffff"));
        vdCancelbtn.setBackground(Color.decode("#FF1A1A"));

        vdCancelbtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #DBDCDE
        vdCancelbtn.setFocusPainted(false);

        //Mouse Icon Hover
        vdCancelbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                vdCancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                vdCancelbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

		//

        // view debtor frame functions button
        viewbtnDebtor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewDebtorFrame.setVisible(true);
                frame2.setVisible(false);
            }
        });
        //

        // cancel debtor frame functions button
        vdCancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
                viewDebtorFrame.setVisible(false);

            }
        });
        //

        /End View Debtor Frame*/

        //View Debtor Frame NEW DESIGN
        JPanel viewDebRight = new JPanel(null);
        Border viewDebNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebRight.setBorder(viewDebNoLefttBorder);

		JLabel lineRight10 = new JLabel();
        lineRight10.setOpaque(true);
        lineRight10.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight10.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JLabel vdNameDebtor = new JLabel("Name Debtor :");

        //left
        JLabel vdStartDate = new JLabel("Start Date :");
        JLabel vdEmail = new JLabel("Email :");
        JLabel vdPhoneNumber = new JLabel("Phone Number:");
        JLabel vdAddress = new JLabel("Address :");
        JLabel vdClassfication = new JLabel("Classification :");

        //right
        JLabel vdFrequency = new JLabel("Frequency :");
        JLabel vdPeriod = new JLabel("Period :");
        JLabel vdLoan = new JLabel("Loan :");
        JLabel vdInterestRate = new JLabel("Interest Rate :");
        JLabel vdStatus = new JLabel("Status :");

        JLabel vdPaymentHistory = new JLabel("Payment History");

        //fonts
        vdNameDebtor.setFont(customFont9);
        vdNameDebtor.setForeground(Color.decode("#4d4d4d"));
        //
        Font customFont31 = new Font("Century Gothic", Font.BOLD, 13);

        vdStartDate.setFont(customFont31);
        vdEmail.setFont(customFont31);
        vdPhoneNumber.setFont(customFont31);
        vdAddress.setFont(customFont31);
        vdClassfication.setFont(customFont31);

        vdFrequency.setFont(customFont31);
        vdPeriod.setFont(customFont31);
        vdLoan.setFont(customFont31);
        vdInterestRate.setFont(customFont31);
        vdStatus.setFont(customFont31);

        vdStartDate.setForeground(Color.decode("#4d4d4d"));
        vdEmail.setForeground(Color.decode("#4d4d4d"));
        vdPhoneNumber.setForeground(Color.decode("#4d4d4d"));
        vdAddress.setForeground(Color.decode("#4d4d4d"));
        vdClassfication.setForeground(Color.decode("#4d4d4d"));

        vdFrequency.setForeground(Color.decode("#4d4d4d"));
        vdPeriod.setForeground(Color.decode("#4d4d4d"));
        vdLoan.setForeground(Color.decode("#4d4d4d"));
        vdInterestRate.setForeground(Color.decode("#4d4d4d"));
        vdStatus.setForeground(Color.decode("#4d4d4d"));

        Font customFont32 = new Font("Century Gothic", Font.BOLD, 16);
        vdPaymentHistory.setFont(customFont32);
        vdPaymentHistory.setForeground(Color.decode("#4d4d4d"));

        //


        //Table View Debtor
		String [] [] vdrowDebtor = {{"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""}};

		String [] vdcolDebtor = {"ID", "Name", "Date", "Loan", "Interest", "Total", "Status"};

		DefaultTableModel vddtmDebtor = new DefaultTableModel(rowDebtor,colDebtor);
		JTable vdtb1Debtor = new JTable(vddtmDebtor);

		JScrollPane vdspDebtor = new JScrollPane(vdtb1Debtor);
		//end Table

        //End View Debtor Frame NEW DESIGN





         //Pay Debtor Frame
        JFrame payDebtorFrame = new JFrame("Pay");
        JPanel payDebtorTopbar = new JPanel(null);
        Border payDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        payDebtorTopbar.setBorder(payDebTopBorder);

        JLabel payDebtorLogoTopbar = new JLabel();
        ImageIcon payDebtoricon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\pay-logo.png");
        payDebtorLogoTopbar.setIcon(payDebtoricon);

        JLabel payDebtorWord = new JLabel("Pay");
        //Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
        payDebtorWord.setFont(customFont15);
        payDebtorWord.setForeground(Color.decode("#073cb7"));


        JLabel payDebtorTopbarLine = new JLabel();
        payDebtorTopbarLine.setOpaque(true);
        payDebtorTopbarLine.setBackground(Color.decode("#DBDCDE")); // Set the line color
        payDebtorTopbarLine.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JPanel payDebtorBottombar = new JPanel(null);
        Border payDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        payDebtorBottombar.setBorder(payDebBottomBorder);

		JLabel pdLoanerName = new JLabel("Loaner : Name"); //+.getText();
		Font customFont18 = new Font("Century Gothic", Font.BOLD, 15);
        pdLoanerName.setFont(customFont18);
        pdLoanerName.setForeground(Color.decode("#4d4d4d"));

		JLabel pdTLlabel = new JLabel("Total Loan :");
		JTextField pdTLtf = new JTextField();

		JLabel pdMPlabel = new JLabel("Monthly Pay :");
		JTextField pdMPtf = new JTextField();

		JLabel pdGMlabel = new JLabel("Given Money :");
		JTextField pdGMtf = new JTextField();

		JLabel pdRLlabel = new JLabel("Remaining Loan: ");
		JTextField pdRLtf = new JTextField();

		//style
		pdTLlabel.setFont(customFont16);
		pdMPlabel.setFont(customFont16);
		pdGMlabel.setFont(customFont16);
		pdRLlabel.setFont(customFont16);

		pdTLlabel.setForeground(Color.decode("#4d4d4d"));
		pdMPlabel.setForeground(Color.decode("#4d4d4d"));
		pdGMlabel.setForeground(Color.decode("#4d4d4d"));
		pdRLlabel.setForeground(Color.decode("#4d4d4d"));

		pdTLtf.setFont(customFont17);
		pdTLtf.setForeground(Color.decode("#4d4d4d"));
		pdTLtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		pdMPtf.setFont(customFont17);
		pdMPtf.setForeground(Color.decode("#4d4d4d"));
		pdMPtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		pdGMtf.setFont(customFont17);
		pdGMtf.setForeground(Color.decode("#4d4d4d"));
		pdGMtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		pdRLtf.setFont(customFont17);
		pdRLtf.setForeground(Color.decode("#4d4d4d"));
		pdRLtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		pdTLtf.setEditable(false);
        pdTLtf.setBackground(Color.decode("#FBFBFC"));

        pdMPtf.setEditable(false);
        pdMPtf.setBackground(Color.decode("#FBFBFC"));

        pdRLtf.setEditable(false);
        pdRLtf.setBackground(Color.decode("#FBFBFC"));
		//end style


		JButton pdSaveBtn = new JButton("Save");
		JButton pdCancelBtn = new JButton("Cancel");

		pdSaveBtn.setFont(customFont14);
		pdCancelBtn.setFont(customFont14);

		pdSaveBtn.setForeground(Color.decode("#ffffff"));
		pdCancelBtn.setForeground(Color.decode("#ffffff"));

		pdSaveBtn.setBackground(Color.decode("#57F287"));
		pdCancelBtn.setBackground(Color.decode("#FF1A1A"));

		pdSaveBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #DBDCDE
		pdCancelBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #DBDCDE
		pdSaveBtn.setFocusPainted(false);
		pdCancelBtn.setFocusPainted(false);

		//Mouse Icon Hover
        pdSaveBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                pdSaveBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pdSaveBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        //Mouse Icon Hover
        pdCancelBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                pdCancelBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pdCancelBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        //

        //Pay Saved Successfully Frame
        JFrame savesuccFramepay = new JFrame("Saved Succesfully!");
        JPanel savedPanelpay = new JPanel(null);
        Border savedBorderp = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        savedPanelpay.setBorder(savedBorderp);

        JLabel savedLogopay = new JLabel();
        ImageIcon iconSavedpay = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        savedLogopay.setIcon(iconSavedpay);


        JLabel ssp = new JLabel("Saved Succesfully!"); //Saved Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        ssp.setFont(customFont0lbl);
        ssp.setForeground(Color.decode("#4d4d4d"));

        JButton okAdssp = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okAdssp.setFont(customFont19);

        okAdssp.setForeground(Color.decode("#ffffff"));
        okAdssp.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okAdssp.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdssp.setFocusPainted(false);

        //Mouse Icon Hover
        okAdssp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdssp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdssp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

       //End Pay Saved Successfully Frame


        //Pay Error Wrong Amount Frame
        JFrame wrongamFramepay = new JFrame("Wrong Amount!");
        JPanel wrongamPanelpay = new JPanel(null);
        Border wrongamBorderp = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        wrongamPanelpay.setBorder(wrongamBorderp);

        JLabel wrongamLogpay = new JLabel();
        ImageIcon iconWrongampay = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Ekis-65.png");
        wrongamLogpay.setIcon(iconWrongampay);


        JLabel wa = new JLabel("Wrong Amount!"); //Age Restriction!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        wa.setFont(customFont0lbl);
        wa.setForeground(Color.decode("#4d4d4d"));

        JButton okPaywa = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okPaywa.setFont(customFont19);

        okPaywa.setForeground(Color.decode("#ffffff"));
        okPaywa.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okPaywa.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okPaywa.setFocusPainted(false);

        //Mouse Icon Hover
        okPaywa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okPaywa.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okPaywa.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //End Pay Error Wrong Amount Frame


        // pay debtor frame functions button
        paybtnDebtor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                payDebtorFrame.setVisible(true);
                frame2.setVisible(false);
            }
        });
        //

        //Pay Saved Button Actions
        pdSaveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String UserGm = pdGMtf.getText();//PRE GINAWA KO LANG TO PARA LUMABAS LANG YUNG MGA MESSAGE BOX
            	int GiveMoney = Integer.parseInt(UserGm);

            	if (GiveMoney >= 500) {
               		savesuccFramepay.setVisible(true);

               		okAdssp.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			frame2.setVisible(true);
	            			pdGMtf.setText(""); //Clears the recen
	            			savesuccFramepay.setVisible(false);
	            			payDebtorFrame.setVisible(false);
	            		}
                    });
               	}
               	else{
               		wrongamFramepay.setVisible(true);

               		okPaywa.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			pdGMtf.setText(""); //Clears the recen
	            			wrongamFramepay.setVisible(false);
	            		}
                    });
               	}

            }
        });

        //

		 // pay debtor frame functions button Cancel
        pdCancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
                payDebtorFrame.setVisible(false);
                pdGMtf.setText("");
            }
        });
        //

        //Pay Debtor Frame

		//

        //End of Debtor Module

		//


		//SETTINGS

		//Settings Module
        JLabel settingsLogo = new JLabel("     Settings");
        ImageIcon settingsicon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\settings.png");
        settingsLogo.setIcon(settingsicon);

        settingsLogo.setFont(customFont7);
        settingsLogo.setForeground(Color.decode("#ffffff"));

        //Mouse Icon Hover
        settingsLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                settingsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsLogo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        //Settings
        JPanel settingsRight = new JPanel(null);
        Border settNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        settingsRight.setBorder(settNoLefttBorder);

        JLabel settingsword = new JLabel("Settings");
        settingsword.setFont(customFont8);
       	settingsword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight3 = new JLabel();
        lineRight3.setOpaque(true);
        lineRight3.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight3.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        //

        /*Table Debtor
		String [] [] rowSettings = {{"Name", "Users Names"},
							 {"Username", "Users Usernames"},
							 {"Password", "Users Pasword"}};

		String [] colSettings = {"  ", "  "};

		DefaultTableModel dtmSettings = new DefaultTableModel(rowSettings,colSettings);
		JTable tb1Settings = new JTable(dtmSettings);

		JScrollPane spSettings = new JScrollPane(tb1Settings);

		//end Table*/

		//JLABEL AND TEXTFIELD
		JLabel settChangeUserInformation = new JLabel("Change User Information");

		JLabel settNicknameLabel = new JLabel("Nickname :");
		JLabel settUsernameLabel = new JLabel("Username :");
		JLabel settPasswordLabel = new JLabel("Password :");

		JTextField settNicknametf = new JTextField();
		JTextField settUsernametf = new JTextField();
		JTextField settPasswordtf = new JTextField();

		settChangeUserInformation.setFont(customFont9);
		settNicknameLabel.setFont(customFont16);
		settUsernameLabel.setFont(customFont16);
		settPasswordLabel.setFont(customFont16);

		settChangeUserInformation.setForeground(Color.decode("#4d4d4d"));
		settNicknameLabel.setForeground(Color.decode("#4d4d4d"));
		settUsernameLabel.setForeground(Color.decode("#4d4d4d"));
		settPasswordLabel.setForeground(Color.decode("#4d4d4d"));

		settNicknametf.setFont(customFont17);
		settNicknametf.setForeground(Color.decode("#4d4d4d"));
		settNicknametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		settUsernametf.setFont(customFont17);
		settUsernametf.setForeground(Color.decode("#4d4d4d"));
		settUsernametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		settPasswordtf.setFont(customFont17);
		settPasswordtf.setForeground(Color.decode("#4d4d4d"));
		settPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE



		//END JLABAEL AND TEXFIELD

		JButton changebtn1Settings = new JButton("Submit");
		JButton changebtn2Settings = new JButton("Submit");
		JButton changebtn3Settings = new JButton("Submit");

		changebtn1Settings.setFont(customFont13);
		changebtn2Settings.setFont(customFont13);
		changebtn3Settings.setFont(customFont13);

		changebtn1Settings.setForeground(Color.decode("#ffffff"));
		changebtn2Settings.setForeground(Color.decode("#ffffff"));
		changebtn3Settings.setForeground(Color.decode("#ffffff"));

		changebtn1Settings.setBackground(Color.decode("#57F287"));
		changebtn2Settings.setBackground(Color.decode("#57F287"));
		changebtn3Settings.setBackground(Color.decode("#57F287"));

		changebtn1Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
		changebtn2Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
		changebtn3Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE

		changebtn1Settings.setFocusPainted(false);
		changebtn2Settings.setFocusPainted(false);
		changebtn3Settings.setFocusPainted(false);


		//Mouse Icon Hover
        changebtn1Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn1Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn1Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Mouse Icon Hover
        changebtn2Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn2Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn2Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Mouse Icon Hover
        changebtn3Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn3Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn3Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Settings ChangeBtn1 Enter Admin Name: Frame
        JFrame cbtn1Framesett = new JFrame("Enter Admin Name");
        JPanel cbtn1Panelsett = new JPanel(null);
        Border cbtn1Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn1Panelsett.setBorder(cbtn1Bordersett);

        JLabel enterAdminNamelbl = new JLabel("Enter Admin Name :");
        JTextField enterAdminNametf = new JTextField("");

        enterAdminNamelbl.setFont(customFont3);
        enterAdminNamelbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterAdminNametf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterAdminNametf.setFont(customFont4);
        enterAdminNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JButton cbtn1SubmitBtn = new JButton("Submit");

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn1SubmitBtn.setFont(customFont6);

        cbtn1SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn1SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn1SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn1SubmitBtn.setFocusPainted(false);

        //Mouse Icon Hover
        cbtn1SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn1SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn1SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //End Settings ChangeBtn1 Enter Admin Name: Frame

        //Settings ChangeBtn1 Enter Admin Name: Updated Succesfully Frame
        JFrame updsuccFrameSettcbtn1 = new JFrame("Updated Succesfully!");
        JPanel updPanelcbtn1 = new JPanel(null);
        Border upBordercbtn1 = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        updPanelcbtn1.setBorder(upBordercbtn1);

        JLabel updLogocbtn1 = new JLabel();
        ImageIcon iconUpdcbtn1 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        updLogocbtn1.setIcon(iconUpdcbtn1);


        JLabel uscbtn1 = new JLabel("Updated Succesfully!"); //Updated Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        uscbtn1.setFont(customFont0lbl);
        uscbtn1.setForeground(Color.decode("#4d4d4d"));

        JButton okUpdcbtn1 = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okUpdcbtn1.setFont(customFont19);

        okUpdcbtn1.setForeground(Color.decode("#ffffff"));
        okUpdcbtn1.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okUpdcbtn1.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okUpdcbtn1.setFocusPainted(false);

        //Mouse Icon Hover
        okUpdcbtn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okUpdcbtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okUpdcbtn1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //End Settings ChangeBtn1 Enter Admin Name: Updated Succesfully Frame
		//

        //Change Button 1 function
		changebtn1Settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	cbtn1Framesett.setVisible(true);
            	frame2.setVisible(false);

            	cbtn1SubmitBtn.addActionListener(new ActionListener(){
            		public void actionPerformed(ActionEvent e){
            			cbtn1Framesett.setVisible(false);
            			updsuccFrameSettcbtn1.setVisible(true);

            			okUpdcbtn1.addActionListener(new ActionListener(){
            				public void actionPerformed(ActionEvent e){
            					updsuccFrameSettcbtn1.setVisible(false);
            					frame2.setVisible(true);
            					enterAdminNametf.setText("");
            				}
            			});
            		}
            	});

            }
          });

        //End Change Button 1 funtion

        //End Settings ChangeBtn1 Enter Admin Name: Frame

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//Settings ChangeBtn2 Enter new Username: Frame
        JFrame cbtn2Framesett = new JFrame("Enter new Username: ");
        JPanel cbtn2Panelsett = new JPanel(null);
        Border cbtn2Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn2Panelsett.setBorder(cbtn2Bordersett);

        JLabel enterNewUsernamelbl = new JLabel("Enter new Username :");
        JTextField enterNewUsernametf = new JTextField("");

        enterNewUsernamelbl.setFont(customFont3);
        enterNewUsernamelbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterNewUsernametf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterNewUsernametf.setFont(customFont4);
        enterNewUsernametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JButton cbtn2SubmitBtn = new JButton("Submit");

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn2SubmitBtn.setFont(customFont6);

        cbtn2SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn2SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn2SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn2SubmitBtn.setFocusPainted(false);

        //Mouse Icon Hover
        cbtn2SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn2SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn2SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //End Settings ChangeBtn2 Enter new Username: Frame

        //Settings ChangeBtn2 Enter new Username: Updated Succesfully Frame
        JFrame updsuccFrameSettcbtn2 = new JFrame("Updated Succesfully!");
        JPanel updPanelcbtn2 = new JPanel(null);
        Border upBordercbtn2 = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        updPanelcbtn2.setBorder(upBordercbtn2);

        JLabel updLogocbtn2 = new JLabel();
        ImageIcon iconUpdcbtn2 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        updLogocbtn2.setIcon(iconUpdcbtn2);


        JLabel uscbtn2 = new JLabel("Updated Succesfully!"); //Updated Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        uscbtn2.setFont(customFont0lbl);
        uscbtn2.setForeground(Color.decode("#4d4d4d"));

        JButton okUpdcbtn2 = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okUpdcbtn2.setFont(customFont19);

        okUpdcbtn2.setForeground(Color.decode("#ffffff"));
        okUpdcbtn2.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okUpdcbtn2.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okUpdcbtn2.setFocusPainted(false);

        //Mouse Icon Hover
        okUpdcbtn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okUpdcbtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okUpdcbtn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //End Settings ChangeBtn2 Enter new Username: Updated Succesfully Frame
		//

        //Change Button 2 function
		changebtn2Settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	cbtn2Framesett.setVisible(true);
            	frame2.setVisible(false);

            	cbtn2SubmitBtn.addActionListener(new ActionListener(){
            		public void actionPerformed(ActionEvent e){
            			//
            			cbtn2Framesett.setVisible(false);
            			updsuccFrameSettcbtn2.setVisible(true);

            			okUpdcbtn2.addActionListener(new ActionListener(){
            				public void actionPerformed(ActionEvent e){
            					updsuccFrameSettcbtn2.setVisible(false);
            					frame2.setVisible(true);
            					enterNewUsernametf.setText("");
            				}
            			});
            		}
            	});

            }
          });

        //End Change Button 2 funtion

		//End Settings ChangeBtn2 Enter new Username: Frame


		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		//Settings ChangeBtn3 Enter new Password: Frame
        JFrame cbtn3Framesett = new JFrame("Enter new Password: ");
        JPanel cbtn3Panelsett = new JPanel(null);
        Border cbtn3Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn3Panelsett.setBorder(cbtn3Bordersett);

        JLabel enterNewPasswordlbl = new JLabel("Enter new Password :");
        JPasswordField enterNewPasswordtf = new JPasswordField("");

        JLabel confirmNewPasswordlbl = new JLabel("Confirm new Password :");
        JPasswordField confirmNewPasswordtf = new JPasswordField("");

        enterNewPasswordlbl.setFont(customFont3);
        enterNewPasswordlbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        confirmNewPasswordlbl.setFont(customFont3);
        confirmNewPasswordlbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterNewPasswordtf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterNewPasswordtf.setFont(customFont4);
        enterNewPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        confirmNewPasswordtf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        confirmNewPasswordtf.setFont(customFont4);
        confirmNewPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JCheckBox showPassENP = new JCheckBox("Show Password");
        //Font customFont5 = new Font("Century Gothic", Font.PLAIN, 13);
        showPassENP.setFont(customFont5);
        showPassENP.setForeground(Color.decode("#4d4d4d"));
        showPassENP.setFocusPainted(false);

        JButton cbtn3SubmitBtn = new JButton("Submit");

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn3SubmitBtn.setFont(customFont6);

        cbtn3SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn3SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn3SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn3SubmitBtn.setFocusPainted(false);

         //Mouse Icon Hover
        showPassENP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showPassENP.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                showPassENP.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
         showPassENP.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    enterNewPasswordtf.setEchoChar((char) 0);
                } else {
                    enterNewPasswordtf.setEchoChar('\u2022');
                }
            }
        });

        //Mouse Icon Hover
        cbtn3SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn3SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn3SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Enter new Password Error Password is to Weak Frame
        JFrame pass2weakFrameENP = new JFrame("Password is too Weak!");
        JPanel pass2weakPanelENP = new JPanel(null);
        Border pass2weakBorderENP = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        pass2weakPanelENP.setBorder(pass2weakBorderENP);

        JLabel pass2weakLogENP = new JLabel();
        ImageIcon iconPass2weakENP = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Ekis-65.png");
        pass2weakLogENP.setIcon(iconPass2weakENP);


        JLabel pitw = new JLabel("Password is too Weak!"); //Password is too Weak!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        pitw.setFont(customFont0lbl);
        pitw.setForeground(Color.decode("#4d4d4d"));

        JButton okENPpitw = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okENPpitw.setFont(customFont19);

        okENPpitw.setForeground(Color.decode("#ffffff"));
        okENPpitw.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okENPpitw.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okENPpitw.setFocusPainted(false);

        //Mouse Icon Hover
        okENPpitw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okENPpitw.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okENPpitw.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //End Enter new Password Error Password is to Weak Frame

		//
        //End Settings ChangeBtn3 Enter new Password: Frame

        /*Settings ChangeBtn4 Confirm new Password: Frame
        JFrame cbtn4Framesett = new JFrame("Confirm new Password: ");
        JPanel cbtn4Panelsett = new JPanel(null);
        Border cbtn4Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn4Panelsett.setBorder(cbtn4Bordersett);

        JLabel confirmNewPasswordlbl = new JLabel("Confirm new Password :");
        JPasswordField confirmNewPasswordtf = new JPasswordField("");

        confirmNewPasswordlbl.setFont(customFont3);
        confirmNewPasswordlbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        confirmNewPasswordtf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        confirmNewPasswordtf.setFont(customFont4);
        confirmNewPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JCheckBox showPassCNP = new JCheckBox("Show Password");
        //Font customFont5 = new Font("Century Gothic", Font.PLAIN, 13);
        showPassCNP.setFont(customFont5);
        showPassCNP.setForeground(Color.decode("#4d4d4d"));
        showPassCNP.setFocusPainted(false);

        JButton cbtn4SubmitBtn = new JButton("Submit");

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn4SubmitBtn.setFont(customFont6);

        cbtn4SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn4SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn4SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn4SubmitBtn.setFocusPainted(false);

        //Mouse Icon Hover
        showPassCNP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showPassCNP.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                showPassCNP.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
		 showPassCNP.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    confirmNewPasswordtf.setEchoChar((char) 0);
                } else {
                    confirmNewPasswordtf.setEchoChar('\u2022');
                }
            }
        });

        //Mouse Icon Hover
        cbtn4SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn4SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn4SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        // */

        //Settings ChangeBtn4 Confirm new Password: Updated Succesfully Frame
        JFrame updsuccFrameSettcbtn4 = new JFrame("Updated Succesfully!");
        JPanel updPanelcbtn4 = new JPanel(null);
        Border upBordercbtn4 = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        updPanelcbtn4.setBorder(upBordercbtn2);

        JLabel updLogocbtn4 = new JLabel();
        ImageIcon iconUpdcbtn4 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Check-65.png");
        updLogocbtn4.setIcon(iconUpdcbtn4);


        JLabel uscbtn4 = new JLabel("Updated Succesfully!"); //Updated Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        uscbtn4.setFont(customFont0lbl);
        uscbtn4.setForeground(Color.decode("#4d4d4d"));

        JButton okUpdcbtn4 = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okUpdcbtn2.setFont(customFont19);

        okUpdcbtn4.setForeground(Color.decode("#ffffff"));
        okUpdcbtn4.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okUpdcbtn4.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okUpdcbtn4.setFocusPainted(false);

        //Mouse Icon Hover
        okUpdcbtn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okUpdcbtn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okUpdcbtn4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //End Settings ChangeBtn2 Enter new Username: Updated Succesfully Frame


        //Confirm new Password Error Password doesn't match Frame
        JFrame passDMFrameCNP = new JFrame("Password doesn't match!");
        JPanel passDMPanelCNP = new JPanel(null);
        Border passDMBorderCNP = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        passDMPanelCNP.setBorder(passDMBorderCNP);

        JLabel passDMLogCNP = new JLabel();
        ImageIcon iconPassDMENP = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\Ekis-65.png");
        passDMLogCNP.setIcon(iconPassDMENP);


        JLabel pdm = new JLabel("Password doesn't match!"); //Password doesn't match!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        pdm.setFont(customFont0lbl);
        pdm.setForeground(Color.decode("#4d4d4d"));

        JButton okCNPpdm = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okCNPpdm.setFont(customFont19);

        okCNPpdm.setForeground(Color.decode("#ffffff"));
        okCNPpdm.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okCNPpdm.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        okCNPpdm.setFocusPainted(false);

        //Mouse Icon Hover
        okCNPpdm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okCNPpdm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okCNPpdm.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //End Confirm new Password Error Password doesn't match Frame

        //End Settings ChangeBtn4 Confirm new Password: Frame


        //Change Button 3 function
		changebtn3Settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	cbtn3Framesett.setVisible(true);
            	frame2.setVisible(false);
            }
		});
            	/*cbtn3SubmitBtn.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {

            			String userNewPass = enterNewPasswordtf.getText();

            			String capitalLetterRegex = ".*[A-Z].*";
						String numberRegex = ".*\\d.*";
						String specialCharacterRegex = ".*[!@#$%^&*()-_=+{}|;:'\",.<>?/].*";

						if (userNewPass.matches(capitalLetterRegex) && userNewPass.matches(numberRegex) && userNewPass.matches(specialCharacterRegex)) {

							cbtn3Framesett.setVisible(false);
    						cbtn4Framesett.setVisible(true);

    						cbtn4SubmitBtn.addActionListener(new ActionListener() {
    							public void actionPerformed(ActionEvent e) {
    								String userNewPassword = enterNewPasswordtf.getText();
									String userConfirmPassword = confirmNewPasswordtf.getText();

									if(userNewPassword.equals(userConfirmPassword)){
										updsuccFrameSettcbtn4.setVisible(true);

										okUpdcbtn4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												updsuccFrameSettcbtn4.setVisible(false);
												cbtn4Framesett.setVisible(false);
												enterNewPasswordtf.setText("");
												confirmNewPasswordtf.setText("");
												showPassENP.setSelected(false);
												showPassCNP.setSelected(false);
												frame2.setVisible(true);
											}
										});
									}
									else{
										passDMFrameCNP.setVisible(true);

										okCNPpdm.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												passDMFrameCNP.setVisible(false);
												confirmNewPasswordtf.setText("");
											}
										});
									}

    							}
    						});

					}
					else{
						pass2weakFrameENP.setVisible(true);

						okENPpitw.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								pass2weakFrameENP.setVisible(false);
								enterNewPasswordtf.setText("");
								showPassENP.setSelected(false);
							}
						});
					}

            		}
            	});

            }
          });

        //End Change Button 3 funtion */

		//
        //End of Settings Module

		//

		//LOGOUT

        //Logout Module
        JLabel logoutLogo = new JLabel("     Logout");
        ImageIcon logouticon = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\logout.png");
        logoutLogo.setIcon(logouticon);
        logoutLogo.setFont(customFont7);
        logoutLogo.setForeground(Color.decode("#ffffff"));

        //Mouse Icon Hover
        logoutLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logoutLogo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

       	//End of Logout Module

       	//

        //Hover Effect Sidebar Dashboard
		MouseAdapter sidebarMouseListener = new MouseAdapter() {
    		private JLabel lastClickedLabel;

    		@Override
    		public void mouseClicked(MouseEvent e) {
        		JLabel clickedLabel = (JLabel) e.getSource();
        		String labelText = clickedLabel.getText().trim();

        		if (lastClickedLabel != null) {
            		lastClickedLabel.setForeground(Color.decode("#ffffff"));
        		}

        		switch (labelText) {
            		case "     Dashboard":
                		frame2.setTitle("Dashboard");
                		dashbRight.setVisible(true);
                		debtorRight.setVisible(false);
                		settingsRight.setVisible(false);
                		break;
            		case "     Debtors":
                		frame2.setTitle("Debtors");
                		dashbRight.setVisible(false);
                		debtorRight.setVisible(true);
                		settingsRight.setVisible(false);
                	break;
            		case "     Settings":
                		frame2.setTitle("Settings");
                		dashbRight.setVisible(false);
                		debtorRight.setVisible(false);
                		settingsRight.setVisible(true);
                		break;
            		case "     Logout":
                		frame2.setVisible(false);
                		frame1.setVisible(true);
                		userNametf.setText("");
                		passtf.setText("");
                		break;
        		}

        		clickedLabel.setForeground(Color.decode("#8CC7FC"));
        		JPanel hover = new JPanel(null);
        		lastClickedLabel = clickedLabel;
    		}

    		@Override
    		public void mouseEntered(MouseEvent e) {
        		JLabel enteredLabel = (JLabel) e.getSource();
        		enteredLabel.setForeground(Color.decode("#70BAFC")); // #8CC7FC
    		}

    		@Override
    		public void mouseExited(MouseEvent e) {
        		JLabel exitedLabel = (JLabel) e.getSource();

        		if (exitedLabel != lastClickedLabel) {
            		exitedLabel.setForeground(Color.decode("#ffffff"));
        		}
    		}
		};

		dashbLogo.addMouseListener(sidebarMouseListener);
		debtorLogo.addMouseListener(sidebarMouseListener);
		settingsLogo.addMouseListener(sidebarMouseListener);
		logoutLogo.addMouseListener(sidebarMouseListener);

		//

        // END DASHBOARD

        // login frame functions
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = userNametf.getText();
                String ps = passtf.getText();
                if (un.equals("Tyler") && ps.equals("pogi")) {
                    successFrameLogin.setVisible(true);

                    okLoginlc.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			frame1.setVisible(false);
	            			successFrameLogin.setVisible(false);
	          				frame2.setVisible(true);
	            		}
                    });
                }

                else {
                    errorFrameLogin.setVisible(true);

                    okLoginwuc.addActionListener(new ActionListener() {
	            		public void actionPerformed(ActionEvent e) {
	            			errorFrameLogin.setVisible(false);
	            			userNametf.setText("");
	            			passtf.setText("");
	            			showPass.setSelected(false);
	            		}
                    });
                }
            }
        });

        showPass.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    passtf.setEchoChar((char) 0);
                } else {
                    passtf.setEchoChar('\u2022');
                }
            }
        });
        // end login frame functions


        //dashboard functioin (switching panel)

        // Add MouseListener to make labels clickable
        dashbLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame2.setTitle("Dashboard");
                dashbRight.setVisible(true);
                debtorRight.setVisible(false);
                settingsRight.setVisible(false);
            }
        });

        debtorLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame2.setTitle("Debtor");
                dashbRight.setVisible(false);
                debtorRight.setVisible(true);
                settingsRight.setVisible(false);
            }
        });

        settingsLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame2.setTitle("Settings");
                dashbRight.setVisible(false);
                debtorRight.setVisible(false);
                settingsRight.setVisible(true);
            }
        });

        logoutLogo.addMouseListener(new MouseAdapter (){
        	@Override
        	public void mouseClicked(MouseEvent e){
        		frame2.setVisible(false);
        		frame1.setVisible(true);
        		userNametf.setText("");
        		passtf.setText("");
        		showPass.setSelected(false);
        	}
        });
         viewbtnDebtor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		viewDebRight.setVisible(true);
        		dashbRight.setVisible(false);
        		debtorRight.setVisible(false);
        		settingsRight.setVisible(false);

        	}
        });
        //end dashboard function (switching panel)


        // Set Bounds

        // login frame
        right.setBounds(0, 0, 400, 500);
        right.setBackground(Color.decode("#007dfe")); //#007dfe
        logoRight.setBounds(70, 60, 300, 300);
        tagline.setBounds(37, 320, 400, 100);

        left.setBounds(400, 0, 400, 500);
        left.setBackground(Color.decode("#ffffff"));
        login.setBounds(135, 30, 200, 100);
        username.setBounds(40, 100, 100, 100);
        userNametf.setBounds(40, 165, 300, 40);
        pass.setBounds(40, 185, 200, 100);
        passtf.setBounds(40, 250, 300, 40);
        showPass.setBounds(40, 295, 125, 20);
        loginBtn.setBounds(250, 320, 90, 37);

        //Success Frame Login
        successPanelLogin.setBounds(0, 0, 350, 200);
        successPanelLogin.setBackground(Color.decode("#ffffff"));
        successLogoLogin.setBounds(140, 15, 70, 70);

        lc.setBounds(105, 80, 200, 50);
        okLoginlc.setBounds(147, 130, 50, 40);
        //

        //Error Frame Login
        errorPanelLogin.setBounds(0, 0, 350, 200);
        errorPanelLogin.setBackground(Color.decode("#ffffff"));
        errorLogoLogin.setBounds(140, 15, 70, 70);

        wuc.setBounds(85, 80, 200, 50);
        okLoginwuc.setBounds(147, 130, 50, 40);

        //
        // end login frame




        // DASHBOARD
        leftSidebar.setBounds(0, 0, 200, 550); //600
        leftSidebar.setBackground(Color.decode("#007dfe")); //#007dfe
        logoTopSidebar.setBounds(20, 5, 200, 50);
        lineLeft.setBounds(0, 65, 600, 2);
        lineBottom.setBounds(0,460,600,2);

		//Sidebar
        dashbLogo.setBounds(20, 85, 130, 50);
        debtorLogo.setBounds(20, 135, 130, 50);
        settingsLogo.setBounds(20, 185, 130, 50);
        logoutLogo.setBounds(20, 470, 130, 50);

		//Dashboard content
        dashbRight.setBounds(200, 0, 700, 550);//600
        dashbRight.setBackground(Color.decode("#F2F3F5"));

        dashword.setBounds(15, 7, 200, 50);
        lineRight1.setBounds(0, 65, 700, 2);
        wcUser.setBounds(10,70,150,50);

		//box debtors
        boxLeft1.setBounds(25,130,65,80);
        boxLeft1.setBackground(Color.decode("#70bafa"));

        boxRight1.setBounds(90,130,115,80);
        boxRight1.setBackground(Color.decode("#ffffff"));

        border1.setBounds(24,129,182,82);
        border1.setBackground(Color.decode("#DBDCDE"));

        leftbox1.setBounds(40,140,80,60);
        leftbox1.setBackground(Color.decode("#ffffff"));

        debtorswordBox.setBounds(95,130,80,50);
        debtorsnumberBox.setBounds(95,160,80,50);

		//end box debtors

		//box due today
		boxLeft2.setBounds(250,130,65,80);
        boxLeft2.setBackground(Color.decode("#FEA948"));

        boxRight2.setBounds(315,130,115,80);
        boxRight2.setBackground(Color.decode("#ffffff"));

        border2.setBounds(249,129,182,82);
        border2.setBackground(Color.decode("#DBDCDE"));

		leftbox2.setBounds(265,140,80,60);
        leftbox2.setBackground(Color.decode("#ffffff"));

        duetodayword.setBounds(320,130,100,50);
        duetodaynumber.setBounds(320,160,80,50);
		//end box due today

		//box todays profit
		boxLeft3.setBounds(475,130,65,80);
        boxLeft3.setBackground(Color.decode("#57F287"));

        boxRight3.setBounds(540,130,115,80);
        boxRight3.setBackground(Color.decode("#ffffff"));

        border3.setBounds(474,129,182,82);
        border3.setBackground(Color.decode("#DBDCDE"));

		leftbox3.setBounds(490,140,80,60);
        leftbox3.setBackground(Color.decode("#ffffff"));

        todaysProfitword.setBounds(545,130,120,50);
        todaysProfitPesoSignword.setBounds(545, 174, 20, 20);
        todaysProfitnumber.setBounds(557,160,80,50);
		//end box todays profit

		//table
		spDashboard.setBounds(25,250,630,130);
		//end table

        //


		//Debtor content
       	debtorRight.setBounds(200, 0, 700, 550); //600
       	debtorRight.setBackground(Color.decode("#F2F3F5"));
       	debtorRight.setVisible(false);

	   	debtorword.setBounds(15, 7, 200, 50);
		lineRight2.setBounds(0, 65, 700, 2);

        searchtfDebtor.setBounds(200, 100, 230, 40);
		searchbtnDebtor.setBounds(440, 100, 90, 37);
		addbtnDebtor.setBounds(550, 100, 90, 37);
		//

		//Table Debtor
		spDebtor.setBounds(20,170,645,130);

		//
		viewbtnDebtor.setBounds(200, 330, 100, 40);
		paybtnDebtor.setBounds(350, 330, 100, 40);

		//

		//Add Debtor Frame
       	addDebtorTopbar.setBounds(0, 0, 800, 70);
        addDebtorTopbar.setBackground(Color.decode("#007dfe")); //#007dfe

        addDebtorLogoTopbar.setBounds(20, 0, 150, 70);

        addDebtorWord.setBounds(25, 65, 200, 50);

        addDebtorTopbarLine.setBounds(0, 70, 800, 2);

        addDebtorBottombar.setBounds(0, 71, 800, 480);
        addDebtorBottombar.setBackground(Color.decode("#ffffff")); //#007dfe


        //Labels and TextField
        //left
        adFirstNameLabel.setBounds(25, 130, 100, 50);
        adMiddleNameLabel.setBounds(25, 180, 100, 50);
        adLastNameLabel.setBounds(25, 230, 100, 50);
        adEmailLabel.setBounds(25, 280, 100, 50);
        adAddressLabel.setBounds(25, 330, 100, 50);
        adConNumLabel.setBounds(25, 380, 120, 50);

        adFirstNametf.setBounds(155, 136, 210, 35);
        adMiddleNametf.setBounds(155, 186, 210, 35);
        adLastNametf.setBounds(155, 236, 210, 35);
        adEmailtf.setBounds(155, 286, 210, 35);
        adAddresstf.setBounds(155, 336, 210, 35);
        adConNumtf.setBounds(155, 386, 210, 35);
        //

        //right
        adClassificationLabel.setBounds(400, 130, 100, 50);
        adFrequencyLabel.setBounds(400, 180, 100, 50);
        adPeriodLabel.setBounds(400, 230, 140, 50);
        adLoanAmountLabel.setBounds(400, 280, 100, 50);

        adClassification.setBounds(540, 136, 210, 35);
        adFrequency.setBounds(540, 186, 210, 35);
        adPeriodtf.setBounds(540, 236, 210, 35);
        adLoanAmounttf.setBounds(540, 286, 210, 35);
        //adLoanAmounttf.setEditable(false);
        adLoanAmounttf.setBackground(Color.decode("#FBFBFC"));
        //

        //Buttons
        adSavebtn.setBounds(520, 460, 100, 40);
        adCancelbtn.setBounds(650, 460, 100, 40);
        //

        //Saved Successfully Frame
        savedPanelAD.setBounds(0, 0, 350, 200);
        savedPanelAD.setBackground(Color.decode("#ffffff"));
        savedLogoAD.setBounds(140, 15, 70, 70);

        ss.setBounds(105, 80, 200, 50);
        okAdss.setBounds(147, 130, 50, 40);
        //End Saved Successfully Frame

        //Error Age Restriction Frame
        ageresPanelAD.setBounds(0, 0, 350, 200);
        ageresPanelAD.setBackground(Color.decode("#ffffff"));
        ageresLogoAD.setBounds(140, 15, 70, 70);

        ar.setBounds(110, 80, 200, 50);
        okAdar.setBounds(147, 130, 50, 40);

        //End Error Age Restriction Frame
        //

        //End Add Debtor Frame



        /*View Debtor Frame
       	viewDebtorTopbar.setBounds(0, 0, 800, 70);
        viewDebtorTopbar.setBackground(Color.decode("#007dfe")); //#007dfe

        viewDebtorLogoTopbar.setBounds(20, 0, 150, 70);

        viewDebtorWord.setBounds(25, 65, 200, 50);

        viewDebtorTopbarLine.setBounds(0, 70, 800, 2);

        viewDebtorBottombar.setBounds(0, 71, 800, 480);
        viewDebtorBottombar.setBackground(Color.decode("#ffffff")); //#007dfe


        //Labels and TextField
        //left
        vdFirstNameLabel.setBounds(25, 130, 100, 50);
        vdMiddleNameLabel.setBounds(25, 180, 100, 50);
        vdLastNameLabel.setBounds(25, 230, 100, 50);
        vdGenderLabel.setBounds(25, 280, 100, 50);
        vdDoBLabel.setBounds(25, 330, 100, 50);
        vdJobLabel.setBounds(25, 380, 100, 50);

        vdFirstNametf.setBounds(155, 136, 210, 35);
        vdMiddleNametf.setBounds(155, 186, 210, 35);
        vdLastNametf.setBounds(155, 236, 210, 35);
        vdGendertf.setBounds(155, 286, 210, 35);
        vdDoBtf.setBounds(155, 336, 210, 35);
        vdJobtf.setBounds(155, 386, 210, 35);
        //

        //right
        vdAmountLoanLabel.setBounds(400, 130, 100, 50);
        vdInterestRateLabel.setBounds(400, 180, 100, 50);
        vdNoPLabel.setBounds(400, 230, 140, 50);
        vdMPLabel.setBounds(400, 280, 100, 50);
        vdTLLabel.setBounds(400, 330, 100, 50);
        vdPALabel.setBounds(400, 380, 100, 50);

        vdAmountLoantf.setBounds(540, 136, 210, 35);
        vdInterestRatetf.setBounds(540, 186, 210, 35);
        vdNoPtf.setBounds(540, 236, 210, 35);
        vdMPtf.setBounds(540, 286, 210, 35);
        vdTLtf.setBounds(540, 336, 210, 35);
        vdPAtf.setBounds(540, 386, 210, 35);
        //

        //Buttons
        vdCancelbtn.setBounds(650, 460, 100, 40);
        //

        //End View Debtor Frame*/

        //View Debtor Frame NEW DESIGN
        viewDebRight.setBounds(200, 0, 700, 550);//600
        viewDebRight.setBackground(Color.decode("#F2F3F5"));
        viewDebRight.setVisible(false);
        lineRight10.setBounds(0, 65, 700, 2);

		vdNameDebtor.setBounds(12,70,150,50);

		vdStartDate.setBounds(12,130,100,20);
		vdEmail.setBounds(12,160,100,20);
		vdPhoneNumber.setBounds(12,190,100,20);
		vdAddress.setBounds(12,220,100,20);
		vdClassfication.setBounds(12,250,100,20);

		vdFrequency.setBounds(350,130,100,20);
		vdPeriod.setBounds(350,160,100,20);
		vdLoan.setBounds(350,190,100,20);
		vdInterestRate.setBounds(350,220,100,20);
		vdStatus.setBounds(350,250,100,20);

		vdPaymentHistory.setBounds(270,320,150,20);
		vdspDebtor.setBounds(35,350,630,130);



        //End View Debtor Frame NEW DESIGN

        //Pay Debtor

        payDebtorTopbar.setBounds(0, 0, 400, 60);
        payDebtorTopbar.setBackground(Color.decode("#007dfe")); //#007dfe

        payDebtorLogoTopbar.setBounds(15, 5, 150, 50);

        payDebtorWord.setBounds(20, 55, 200, 50);

        payDebtorTopbarLine.setBounds(0, 60, 400, 2);

        payDebtorBottombar.setBounds(0, 61, 400, 385);
        payDebtorBottombar.setBackground(Color.decode("#ffffff")); //#007dfe

        pdLoanerName.setBounds(35, 100, 130, 50);

        pdTLlabel.setBounds(35, 150, 100, 50);
        pdMPlabel.setBounds(35, 200, 100, 50);
        pdGMlabel.setBounds(35, 250, 100, 50);
        pdRLlabel.setBounds(35, 300, 120, 50);

        pdTLtf.setBounds(165, 156, 210, 35);
        pdMPtf.setBounds(165, 206, 210, 35);
        pdGMtf.setBounds(165, 256, 210, 35);
        pdRLtf.setBounds(165, 306, 210, 35);

        pdSaveBtn.setBounds(165, 370, 100, 40);
        pdCancelBtn.setBounds(275, 370, 100, 40);
        //

         //Saved Successfully Frame
        savedPanelpay.setBounds(0, 0, 350, 200);
        savedPanelpay.setBackground(Color.decode("#ffffff"));
        savedLogopay.setBounds(140, 15, 70, 70);

        ssp.setBounds(105, 80, 200, 50);
        okAdssp.setBounds(147, 130, 50, 40);
        //End Saved Successfully Frame

        //Error Wrong Amount Frame
        wrongamPanelpay.setBounds(0, 0, 350, 200);
        wrongamPanelpay.setBackground(Color.decode("#ffffff"));
        wrongamLogpay.setBounds(140, 15, 70, 70);

        wa.setBounds(110, 80, 200, 50);
        okPaywa.setBounds(147, 130, 50, 40);

        //End Error Wrong Amount Frame
        //


        //End Pay Debtor


		//Settings content
        settingsRight.setBounds(200, 0, 700, 550);//600
        settingsRight.setBackground(Color.decode("#F2F3F5"));
        settingsRight.setVisible(false);

        settingsword.setBounds(15, 7, 200, 50);
		lineRight3.setBounds(0, 65, 700, 2);
        //

        //Label and Textfield
        settChangeUserInformation.setBounds(12,70,230,50);

		settNicknameLabel.setBounds(55,130,100,30);
		settUsernameLabel.setBounds(55,180,100,30);
		settPasswordLabel.setBounds(55,230,100,30);

		settNicknametf.setBounds(180,130,270,35);
		settUsernametf.setBounds(180,180,270,35);
		settPasswordtf.setBounds(180,230,270,35);



        //End Label and Textfield


		//Change Buttons
        changebtn1Settings.setBounds(500,130,90,37);
        changebtn2Settings.setBounds(500,180,90,37);
		changebtn3Settings.setBounds(500,230,90,37);
		//End Change Buttons

		//End Settings Content

		//Change Enter Admin name
		cbtn1Panelsett.setBounds(0, 0, 350, 200);
		cbtn1Panelsett.setBackground(Color.decode("#ffffff"));

		enterAdminNamelbl.setBounds(107, 30, 150, 30);
		enterAdminNametf.setBounds(65, 70, 220, 35);
		cbtn1SubmitBtn.setBounds(130, 130, 90, 37);

		//ChangeBtn1 Enter Admin Name: Updated Succesfully Frame
		updPanelcbtn1.setBounds(0, 0, 350, 200);
        updPanelcbtn1.setBackground(Color.decode("#ffffff"));
        updLogocbtn1.setBounds(140, 15, 70, 70);

        uscbtn1.setBounds(90, 80, 200, 50);
        okUpdcbtn1.setBounds(147, 130, 50, 40);
		//EndChangeBtn1 Enter Admin Name: Updated Succesfully Frame

		//End Enter Admin name


		//Change Enter New Username
		cbtn2Panelsett.setBounds(0, 0, 350, 200);
		cbtn2Panelsett.setBackground(Color.decode("#ffffff"));

		enterNewUsernamelbl.setBounds(95, 30, 160, 30);
		enterNewUsernametf.setBounds(65, 70, 220, 35);
		cbtn2SubmitBtn.setBounds(130, 130, 90, 37);

		//ChangeBtn2 Enter new Username: Updated Succesfully Frame
		updPanelcbtn2.setBounds(0, 0, 350, 200);
        updPanelcbtn2.setBackground(Color.decode("#ffffff"));
        updLogocbtn2.setBounds(140, 15, 70, 70);

        uscbtn2.setBounds(90, 80, 200, 50);
        okUpdcbtn2.setBounds(147, 130, 50, 40);
		//End ChangeBtn2 Enter new Username: Updated Succesfully Frame

		//End Change Enter New Username


		//Change Enter New Password
		cbtn3Panelsett.setBounds(0, 0, 430, 250);
		cbtn3Panelsett.setBackground(Color.decode("#ffffff"));

		enterNewPasswordlbl.setBounds(15, 50, 150, 30);
		enterNewPasswordtf.setBounds(200, 50, 210, 35);

		confirmNewPasswordlbl.setBounds(15,110,190,30);
		confirmNewPasswordtf.setBounds(200,110,210,35);

		showPassENP.setBounds(200, 150, 125, 20);

		cbtn3SubmitBtn.setBounds(160, 190, 90, 37);

		//

		//ChangeBtn3 Error Password is too Weak Frame
		pass2weakPanelENP.setBounds(0, 0, 350, 200);
        pass2weakPanelENP.setBackground(Color.decode("#ffffff"));
        pass2weakLogENP.setBounds(140, 15, 70, 70);

        pitw.setBounds(90, 80, 200, 50);
        okENPpitw.setBounds(147, 130, 50, 40);
		//End Error Password is too Weak Frame

		//ChangeBtn3 End Change Enter New Password


		/*Change Confirm New Password
		cbtn4Panelsett.setBounds(0, 0, 350, 200);
		cbtn4Panelsett.setBackground(Color.decode("#ffffff"));

		confirmNewPasswordlbl.setBounds(97, 20, 180, 30);
		confirmNewPasswordtf.setBounds(65, 60, 220, 35);
		showPassCNP.setBounds(60, 100, 125, 20);
		cbtn4SubmitBtn.setBounds(130, 140, 90, 37);
		*/

		//ChangeBtn4 Confirm new Password: Updated Succesfully Frame
		updPanelcbtn4.setBounds(0, 0, 350, 200);
        updPanelcbtn4.setBackground(Color.decode("#ffffff"));
        updLogocbtn4.setBounds(140, 15, 70, 70);

        uscbtn4.setBounds(95, 80, 200, 50);
        okUpdcbtn4.setBounds(147, 130, 50, 40);
		//ChangeBtn4 Confirm new Password: Updated Succesfully Frame

		//ChangeBtn4 Error Password doesn't match! Frame
		passDMPanelCNP.setBounds(0, 0, 350, 200);
        passDMPanelCNP.setBackground(Color.decode("#ffffff"));
        passDMLogCNP.setBounds(140, 15, 70, 70);

        pdm.setBounds(80, 80, 200, 50);
        okCNPpdm.setBounds(147, 130, 50, 40);
		//End hangeBtn4 Error Password doesn't match Frame

		//EndChange Confirm New Password
		//

		//
        // END of DASHBOARD




        // Set and Add

        // login frame
        frame1.setLayout(null);
        frame1.setBounds(0, 0, 800, 500);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true); // true
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        right.add(logoRight);
        right.add(tagline);
        frame1.add(right);

        left.add(login);
        left.add(username);
        left.add(userNametf);
        left.add(pass);
        left.add(passtf);
        left.add(showPass);
        left.add(loginBtn);
        frame1.add(left);

        //Success Frame Login
        successFrameLogin.setLayout(null);
        successFrameLogin.setUndecorated(true);
        successFrameLogin.setBounds(0, 0, 350, 200);
        successFrameLogin.setLocationRelativeTo(null);
        successFrameLogin.setVisible(false);//false

		successPanelLogin.add(okLoginlc);
        successPanelLogin.add(successLogoLogin);
        successPanelLogin.add(lc);

        successFrameLogin.add(successPanelLogin);
        //

        //Error Frame Login
        errorFrameLogin.setLayout(null);
        errorFrameLogin.setUndecorated(true);
        errorFrameLogin.setBounds(0, 0, 350, 200);
        errorFrameLogin.setLocationRelativeTo(null);
        errorFrameLogin.setVisible(false);//false

		errorPanelLogin.add(okLoginwuc);
        errorPanelLogin.add(errorLogoLogin);
        errorPanelLogin.add(wuc);

        errorFrameLogin.add(errorPanelLogin);

        //

        // end login frame

        // dashboard
        frame2.setLayout(null);
        frame2.setUndecorated(true);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(false);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        leftSidebar.add(logoTopSidebar);
        leftSidebar.add(lineLeft);
        leftSidebar.add(lineBottom);
        leftSidebar.add(dashbLogo);
        leftSidebar.add(debtorLogo);
        leftSidebar.add(settingsLogo);
        leftSidebar.add(logoutLogo);
        frame2.add(leftSidebar);

		//Dashboard
		dashbRight.add(dashword);
		dashbRight.add(lineRight1);
		dashbRight.add(wcUser);

		dashbRight.add(boxLeft1);
		dashbRight.add(boxRight1);
		dashbRight.add(border1);
		dashbRight.setComponentZOrder(leftbox1, 0);
		dashbRight.add(debtorswordBox);
		dashbRight.setComponentZOrder(debtorswordBox, 0);
		dashbRight.add(debtorsnumberBox);
		dashbRight.setComponentZOrder(debtorsnumberBox, 0);

		dashbRight.add(boxLeft2);
		dashbRight.add(boxRight2);
		dashbRight.add(border2);
		dashbRight.setComponentZOrder(leftbox2, 0);
		dashbRight.add(duetodayword);
		dashbRight.setComponentZOrder(duetodayword, 0);
		dashbRight.add(duetodaynumber);
		dashbRight.setComponentZOrder(duetodaynumber, 0);

        dashbRight.add(boxLeft3);
		dashbRight.add(boxRight3);
		dashbRight.add(border3);
		dashbRight.setComponentZOrder(leftbox3, 0);
		dashbRight.add(todaysProfitword);
		dashbRight.setComponentZOrder(todaysProfitword, 0);
		dashbRight.add(todaysProfitnumber);
		dashbRight.setComponentZOrder(todaysProfitnumber, 0);
		dashbRight.add(todaysProfitPesoSignword);
		dashbRight.setComponentZOrder(todaysProfitPesoSignword, 0);

		dashbRight.add(spDashboard);

        frame2.add(dashbRight);
        //End Dashboard

		//Debtor
		debtorRight.add(debtorword);
		debtorRight.add(lineRight2);

		debtorRight.add(searchtfDebtor);
		debtorRight.add(searchbtnDebtor);
		debtorRight.add(addbtnDebtor);

		debtorRight.add(spDebtor);

		debtorRight.add(viewbtnDebtor);
		debtorRight.add(paybtnDebtor);

		frame2.add(debtorRight);

        //End of Debtor

		//Settings
		settingsRight.add(settingsword);
		settingsRight.add(lineRight3);

		//settingsRight.add(spSettings);

		settingsRight.add(settNicknameLabel);
		settingsRight.add(settUsernameLabel);
		settingsRight.add(settPasswordLabel);

		settingsRight.add(settChangeUserInformation);
		settingsRight.add(settNicknametf);
		settingsRight.add(settUsernametf);
		settingsRight.add(settPasswordtf);

		settNicknametf.setEditable(false);
        settNicknametf.setBackground(Color.decode("#FBFBFC"));

        settUsernametf.setEditable(false);
        settUsernametf.setBackground(Color.decode("#FBFBFC"));

        settPasswordtf.setEditable(false);
        settPasswordtf.setBackground(Color.decode("#FBFBFC"));

		settingsRight.add(changebtn1Settings);
		settingsRight.add(changebtn2Settings);
		settingsRight.add(changebtn3Settings);

        frame2.add(settingsRight);
        //End Settings

        //Settings ChangeBtn1 Enter Admin Name: Frame
        cbtn1Framesett.setLayout(null);
        cbtn1Framesett.setUndecorated(true);
        cbtn1Framesett.setBounds(0, 0, 350, 200);
        cbtn1Framesett.setLocationRelativeTo(null);
        cbtn1Framesett.setVisible(false);//false

        cbtn1Panelsett.add(enterAdminNamelbl);
        cbtn1Panelsett.add(enterAdminNametf);
        cbtn1Panelsett.add(cbtn1SubmitBtn);

        cbtn1Framesett.add(cbtn1Panelsett);

        //ChangeBtn1 Enter Admin Name: Updated Succesfully Frame
        updsuccFrameSettcbtn1.setLayout(null);
        updsuccFrameSettcbtn1.setUndecorated(true);
        updsuccFrameSettcbtn1.setBounds(0, 0, 350, 200);
        updsuccFrameSettcbtn1.setLocationRelativeTo(null);
        updsuccFrameSettcbtn1.setVisible(false);//false

        updPanelcbtn1.add(okUpdcbtn1);
        updPanelcbtn1.add(updLogocbtn1);
        updPanelcbtn1.add(uscbtn1);

        updsuccFrameSettcbtn1.add(updPanelcbtn1);
        //End ChangeBtn1 Enter Admin Name: Updated Succesfully Frame

        //End Settings ChangeBtn1 Enter Admin Name: Frame

        //////////////////////////////////////////////////////////////////

        //Settings ChangeBtn2 Enter new Username: Frame
        cbtn2Framesett.setLayout(null);
        cbtn2Framesett.setUndecorated(true);
        cbtn2Framesett.setBounds(0, 0, 350, 200);
        cbtn2Framesett.setLocationRelativeTo(null);
        cbtn2Framesett.setVisible(false);//false

        cbtn2Panelsett.add(enterNewUsernamelbl);
        cbtn2Panelsett.add(enterNewUsernametf);
        cbtn2Panelsett.add(cbtn2SubmitBtn);

        cbtn2Framesett.add(cbtn2Panelsett);

        //ChangeBtn2 Enter new Username: Updated Succesfully Frame
        updsuccFrameSettcbtn2.setLayout(null);
        updsuccFrameSettcbtn2.setUndecorated(true);
        updsuccFrameSettcbtn2.setBounds(0, 0, 350, 200);
        updsuccFrameSettcbtn2.setLocationRelativeTo(null);
        updsuccFrameSettcbtn2.setVisible(false);//false

        updPanelcbtn2.add(okUpdcbtn2);
        updPanelcbtn2.add(updLogocbtn2);
        updPanelcbtn2.add(uscbtn2);

        updsuccFrameSettcbtn2.add(updPanelcbtn2);
        //End ChangeBtn2 Enter new Username: Updated Succesfully Frame

        //End Settings ChangeBtn2 Enter new Username: Frame

  		//////////////////////////////////////////////////////////////////

        //Settings ChangeBtn3 Enter new Password: Frame
        cbtn3Framesett.setLayout(null);
        cbtn3Framesett.setUndecorated(true);
        cbtn3Framesett.setBounds(0, 0, 430, 250);
        cbtn3Framesett.setLocationRelativeTo(null);
        cbtn3Framesett.setVisible(false);//false

        cbtn3Panelsett.add(enterNewPasswordlbl);
        cbtn3Panelsett.add(enterNewPasswordtf);

        cbtn3Panelsett.add(confirmNewPasswordlbl);
        cbtn3Panelsett.add(confirmNewPasswordtf);

        cbtn3Panelsett.add(showPassENP);

        cbtn3Panelsett.add(cbtn3SubmitBtn);

        cbtn3Framesett.add(cbtn3Panelsett);
		//End Settings ChangeBtn3 Enter new Password: Frame

		//Settings ChangeBtn3 Enter new Password Error Password is to Weak Frame
		pass2weakFrameENP.setLayout(null);
        pass2weakFrameENP.setUndecorated(true);
        pass2weakFrameENP.setBounds(0, 0, 350, 200);
        pass2weakFrameENP.setLocationRelativeTo(null);
        pass2weakFrameENP.setVisible(false);//false

		pass2weakPanelENP.add(okENPpitw);
        pass2weakPanelENP.add(pass2weakLogENP);
        pass2weakPanelENP.add(pitw);

        pass2weakFrameENP.add(pass2weakPanelENP);

		//Settings ChangeBtn3 Enter new Password Error Password is to Weak Frame

		//////////////////////////////////////////////////////////////////

		/*Settings ChangeBtn4 Confirm new Password: Frame
		cbtn4Framesett.setLayout(null);
        cbtn4Framesett.setUndecorated(true);
        cbtn4Framesett.setBounds(0, 0, 350, 200);
        cbtn4Framesett.setLocationRelativeTo(null);
        cbtn4Framesett.setVisible(false);//false

        cbtn4Panelsett.add(confirmNewPasswordlbl);
        cbtn4Panelsett.add(confirmNewPasswordtf);
        cbtn4Panelsett.add(cbtn4SubmitBtn);
        cbtn4Panelsett.add(showPassCNP);

        cbtn4Framesett.add(cbtn4Panelsett);

		//End Settings ChangeBtn4 Confirm new Password: Frame*/

		//Settings ChangeBtn4 Updated Successfully Frame
		updsuccFrameSettcbtn4.setLayout(null);
        updsuccFrameSettcbtn4.setUndecorated(true);
        updsuccFrameSettcbtn4.setBounds(0, 0, 350, 200);
        updsuccFrameSettcbtn4.setLocationRelativeTo(null);
        updsuccFrameSettcbtn4.setVisible(false);//false

		updPanelcbtn4.add(okUpdcbtn4);
        updPanelcbtn4.add(updLogocbtn4);
        updPanelcbtn4.add(uscbtn4);

        updsuccFrameSettcbtn4.add(updPanelcbtn4);

		//End Settings ChangeBtn4 Updated Successfully Frame

		//Settings ChangeBtn4 Error Password Doesn't Match Frame
		passDMFrameCNP.setLayout(null);
        passDMFrameCNP.setUndecorated(true);
        passDMFrameCNP.setBounds(0, 0, 350, 200);
        passDMFrameCNP.setLocationRelativeTo(null);
        passDMFrameCNP.setVisible(false);//false

		passDMPanelCNP.add(okCNPpdm);
        passDMPanelCNP.add(passDMLogCNP);
        passDMPanelCNP.add(pdm);

        passDMFrameCNP.add(passDMPanelCNP);

		//End Settings ChangeBtn4 Error Password Doesn't Match Frame
		//

		//
        //Enf of Settings

        // end dashboard

        //Add Debtor Frame
        addDebtorFrame.setLayout(null);
        addDebtorFrame.setUndecorated(true);
        addDebtorFrame.setBounds(0, 0, 800, 550); //480 or 550
        addDebtorFrame.setLocationRelativeTo(null);
        addDebtorFrame.setVisible(false);
        addDebtorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addDebtorFrame.add(addDebtorLogoTopbar);
		addDebtorFrame.add(addDebtorWord);
        addDebtorFrame.add(addDebtorTopbar);
        addDebtorFrame.add(addDebtorTopbarLine);

        addDebtorFrame.add(adFirstNameLabel);
        addDebtorFrame.add(adMiddleNameLabel);
        addDebtorFrame.add(adLastNameLabel);
        addDebtorFrame.add(adEmailLabel);
        addDebtorFrame.add(adAddressLabel);
        addDebtorFrame.add(adConNumLabel);

        addDebtorFrame.add(adFirstNametf);
        addDebtorFrame.add(adMiddleNametf);
        addDebtorFrame.add(adLastNametf);
        addDebtorFrame.add(adEmailtf);
        addDebtorFrame.add(adAddresstf);
        addDebtorFrame.add(adConNumtf);

        addDebtorFrame.add(adClassificationLabel);
        addDebtorFrame.add(adFrequencyLabel);
        addDebtorFrame.add(adPeriodLabel);
        addDebtorFrame.add(adLoanAmountLabel);

		addDebtorFrame.add(adClassification);
		addDebtorFrame.add(adFrequency);
		addDebtorFrame.add(adPeriodtf);
		addDebtorFrame.add(adLoanAmounttf);

		addDebtorFrame.add(adSavebtn);
		addDebtorFrame.add(adCancelbtn);

        addDebtorFrame.add(addDebtorBottombar);


        //Add Debtor Saved Successfully Frame
        savedsuccFrameAD.setLayout(null);
        savedsuccFrameAD.setUndecorated(true);
        savedsuccFrameAD.setBounds(0, 0, 350, 200);
        savedsuccFrameAD.setLocationRelativeTo(null);
        savedsuccFrameAD.setVisible(false);//false

		savedPanelAD.add(okAdss);
        savedPanelAD.add(savedLogoAD);
        savedPanelAD.add(ss);

        savedsuccFrameAD.add(savedPanelAD);

        //End Add Debtor Saved Successfully Frame

        //Add Debtor Error Age Restriction Frame
        ageresFrameAD.setLayout(null);
        ageresFrameAD.setUndecorated(true);
        ageresFrameAD.setBounds(0, 0, 350, 200);
        ageresFrameAD.setLocationRelativeTo(null);
        ageresFrameAD.setVisible(false);//false

		ageresPanelAD.add(okAdar);
        ageresPanelAD.add(ageresLogoAD);
        ageresPanelAD.add(ar);

        ageresFrameAD.add(ageresPanelAD);
        //End Add Debtor Error Age Restriction Frame
        //

        //End Add Debtor Frame



        /*View Debtor Frame
        viewDebtorFrame.setLayout(null);
        viewDebtorFrame.setUndecorated(true);
        viewDebtorFrame.setBounds(0, 0, 800, 550);
        viewDebtorFrame.setLocationRelativeTo(null);
        viewDebtorFrame.setVisible(false);
        viewDebtorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		viewDebtorFrame.add(viewDebtorLogoTopbar);
		viewDebtorFrame.add(viewDebtorWord);
        viewDebtorFrame.add(viewDebtorTopbar);
        viewDebtorFrame.add(viewDebtorTopbarLine);

        viewDebtorFrame.add(vdFirstNameLabel);
        viewDebtorFrame.add(vdMiddleNameLabel);
        viewDebtorFrame.add(vdLastNameLabel);
        viewDebtorFrame.add(vdGenderLabel);
        viewDebtorFrame.add(vdDoBLabel);
        viewDebtorFrame.add(vdJobLabel);

        viewDebtorFrame.add(vdFirstNametf);
        viewDebtorFrame.add(vdMiddleNametf);
        viewDebtorFrame.add(vdLastNametf);
        viewDebtorFrame.add(vdGendertf);
        viewDebtorFrame.add(vdDoBtf);
        viewDebtorFrame.add(vdJobtf);

        viewDebtorFrame.add(vdAmountLoanLabel);
        viewDebtorFrame.add(vdInterestRateLabel);
        viewDebtorFrame.add(vdNoPLabel);
        viewDebtorFrame.add(vdMPLabel);
        viewDebtorFrame.add(vdTLLabel);
        viewDebtorFrame.add(vdPALabel);

		viewDebtorFrame.add(vdAmountLoantf);
		viewDebtorFrame.add(vdInterestRatetf);
		viewDebtorFrame.add(vdNoPtf);
		viewDebtorFrame.add(vdMPtf);
		viewDebtorFrame.add(vdTLtf);
		viewDebtorFrame.add(vdPAtf);

		viewDebtorFrame.add(vdCancelbtn);

        viewDebtorFrame.add(viewDebtorBottombar);
        //End View Debtor Frame*/

        //View Debtor Frame NEW DESIGN

        viewDebRight.add(lineRight10);

        viewDebRight.add(vdNameDebtor);

        viewDebRight.add(vdStartDate);
        viewDebRight.add(vdEmail);
        viewDebRight.add(vdPhoneNumber);
        viewDebRight.add(vdAddress);
        viewDebRight.add(vdClassfication);

        viewDebRight.add(vdFrequency);
        viewDebRight.add(vdPeriod);
        viewDebRight.add(vdLoan);
        viewDebRight.add(vdInterestRate);
        viewDebRight.add(vdStatus);

        viewDebRight.add(vdPaymentHistory);
        viewDebRight.add(vdspDebtor);

        frame2.add(viewDebRight);
        //End View Debtor Frame NEW DESIGN


        //Pay Debtor
        payDebtorFrame.setLayout(null);
        payDebtorFrame.setUndecorated(true);
        payDebtorFrame.setBounds(0, 0, 400, 445);
        payDebtorFrame.setLocationRelativeTo(null);
        payDebtorFrame.setVisible(false);
        payDebtorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        payDebtorFrame.add(payDebtorLogoTopbar);
		payDebtorFrame.add(payDebtorWord);
        payDebtorFrame.add(payDebtorTopbar);
        payDebtorFrame.add(payDebtorTopbarLine);

        payDebtorFrame.add(pdLoanerName);

        payDebtorFrame.add(pdTLlabel);
        payDebtorFrame.add(pdTLtf);

        payDebtorFrame.add(pdMPlabel);
        payDebtorFrame.add(pdMPtf);

        payDebtorFrame.add(pdGMlabel);
        payDebtorFrame.add(pdGMtf);

        payDebtorFrame.add(pdRLlabel);
        payDebtorFrame.add(pdRLtf);

        payDebtorFrame.add(pdSaveBtn);
        payDebtorFrame.add(pdCancelBtn);

        payDebtorFrame.add(payDebtorBottombar);


        //Pay Saved Successfully Frame
        savesuccFramepay.setLayout(null);
        savesuccFramepay.setUndecorated(true);
        savesuccFramepay.setBounds(0, 0, 350, 200);
        savesuccFramepay.setLocationRelativeTo(null);
        savesuccFramepay.setVisible(false);//false

		savedPanelpay.add(okAdssp);
        savedPanelpay.add(savedLogopay);
        savedPanelpay.add(ssp);

        savesuccFramepay.add(savedPanelpay);

        //End Pay Saved Successfully Frame

        //Pay Error Wrong Amount Frame
        wrongamFramepay.setLayout(null);
        wrongamFramepay.setUndecorated(true);
        wrongamFramepay.setBounds(0, 0, 350, 200);
        wrongamFramepay.setLocationRelativeTo(null);
        wrongamFramepay.setVisible(false);//false

		wrongamPanelpay.add(okPaywa);
        wrongamPanelpay.add(wrongamLogpay);
        wrongamPanelpay.add(wa);

        wrongamFramepay.add(wrongamPanelpay);
        //End Pay Error Wrong Amount Frame

        //End Pay Debtor

    }
}
//EEEEEEEEEEEeNNNNNDDDDAAAAAAAAABBBBBBBBBBBLEEEEEEEEEEEEEE!!!!!!!!!!!!!!


