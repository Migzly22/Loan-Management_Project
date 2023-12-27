import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard implements RootValue{
    public static String USERNAME = "AdminName";

    static Sidebar leftSidebar2 = new Sidebar();

    public void dashboardFrame() {
                
        leftSidebar2.sidebar();//run the sidebar code


        ImageIcon nodebtorsicon = new ImageIcon( currentDirectory +"s\\no.debtors.png");
        ImageIcon duetodayicon = new ImageIcon( currentDirectory +"\\due-today.png");
        ImageIcon todaysProfiticon = new ImageIcon( currentDirectory +"\\profit.png");
        
        
        // DASHBOARD
        JFrame frame2 = new JFrame("Dashboard");
       


		//Dashboard Module
        //JPanel dashbRight = new JPanel(new FlowLayout());
        JPanel dashbRight = new JPanel(null);

        Border dashbNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode(greycolor));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        dashbRight.setBorder(dashbNoLefttBorder);

        JLabel dashword = new JLabel("Dashboard");

   
        dashword.setFont(customFont8);
        dashword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight1 = new JLabel();

        lineRight1.setOpaque(true);
        lineRight1.setBackground(Color.decode(greycolor)); // Set the line color
        lineRight1.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));




        JLabel wcUser = new JLabel("Welcome User: " + USERNAME);

        wcUser.setFont(customFont9);
        wcUser.setForeground(Color.decode(blackColor));

		//box debtors
        JPanel boxLeft1 = new JPanel(null);
        JPanel boxRight1 = new JPanel(null);
        JPanel border1 = new JPanel(null);

        JLabel leftbox1 = new JLabel();
        
        leftbox1.setIcon(nodebtorsicon);

        JLabel debtorswordBox = new JLabel("Debtors");

        debtorswordBox.setFont(customFont10);
        debtorswordBox.setForeground(Color.decode(blackColor));

        //DEBTORSNUMBER
        JLabel debtorsnumberBox = new JLabel("10");

        debtorsnumberBox.setFont(customFont11);
        debtorsnumberBox.setForeground(Color.decode(blackColor));

		JPanel boxLeft2 = new JPanel(null);
        JPanel boxRight2 = new JPanel(null);
        JPanel border2 = new JPanel(null);

        JLabel leftbox2 = new JLabel();
        
        leftbox2.setIcon(duetodayicon);

        JLabel duetodayword = new JLabel("Due Today");

        duetodayword.setFont(customFont10);
        duetodayword.setForeground(Color.decode(blackColor));

        //TODAYDUE
        JLabel duetodaynumber = new JLabel("25"); //ETO ATA PAPALITAN

        duetodaynumber.setFont(customFont11);
        duetodaynumber.setForeground(Color.decode(blackColor));

		JPanel boxLeft3 = new JPanel(null);
        JPanel boxRight3 = new JPanel(null);
        JPanel border3 = new JPanel(null);

        JLabel leftbox3 = new JLabel();
        
        leftbox3.setIcon(todaysProfiticon);

        JLabel todaysProfitword = new JLabel("Todays Profit");
        todaysProfitword.setFont(customFont10);
        todaysProfitword.setForeground(Color.decode(blackColor));

        //peso sign
        JLabel todaysProfitPesoSignword = new JLabel("\u20B1 ");
        todaysProfitPesoSignword.setFont(customFontPS);
        todaysProfitPesoSignword.setForeground(Color.decode(blackColor));


        JLabel todaysProfitnumber = new JLabel("1000"); //ETO ATA PAPALITAN
        todaysProfitnumber.setFont(customFont11);
        todaysProfitnumber.setForeground(Color.decode(blackColor));

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
        boxRight1.setBackground(Color.decode(whiteColor));

        border1.setBounds(24,129,182,82);
        border1.setBackground(Color.decode(greycolor));

        leftbox1.setBounds(40,140,80,60);
        leftbox1.setBackground(Color.decode(whiteColor));

        debtorswordBox.setBounds(95,130,80,50);
        debtorsnumberBox.setBounds(95,160,80,50);

		//end box debtors

		//box due today
		boxLeft2.setBounds(250,130,65,80);
        boxLeft2.setBackground(Color.decode("#FEA948"));

        boxRight2.setBounds(315,130,115,80);
        boxRight2.setBackground(Color.decode(whiteColor));

        border2.setBounds(249,129,182,82);
        border2.setBackground(Color.decode(greycolor));

		leftbox2.setBounds(265,140,80,60);
        leftbox2.setBackground(Color.decode(whiteColor));

        duetodayword.setBounds(320,130,100,50);
        duetodaynumber.setBounds(320,160,80,50);
		//end box due today

		//box todays profit
		boxLeft3.setBounds(475,130,65,80);
        boxLeft3.setBackground(Color.decode(greenColor));

        boxRight3.setBounds(540,130,115,80);
        boxRight3.setBackground(Color.decode(whiteColor));

        border3.setBounds(474,129,182,82);
        border3.setBackground(Color.decode(greycolor));

		leftbox3.setBounds(490,140,80,60);
        leftbox3.setBackground(Color.decode(whiteColor));

        todaysProfitword.setBounds(545,130,120,50);
        todaysProfitPesoSignword.setBounds(545, 174, 20, 20);
        todaysProfitnumber.setBounds(557,160,80,50);
		//end box todays profit

		//table
		spDashboard.setBounds(25,250,630,130);



        frame2.setLayout(null);
        frame2.setUndecorated(true);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame2.add(leftSidebar2.leftSidebar);//add sidebar

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

    }
}
