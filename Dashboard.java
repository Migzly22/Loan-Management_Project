import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard implements RootValue{

    Entity entity = Entity.getInstance();
    public String USERNAME = entity.getAdminNAME();

    JPanel dashbRight = new JPanel(null);
    DefaultTableModel dtmDashboard = new DefaultTableModel();
    JLabel wcUser = new JLabel();

    public void dashboardFrame() {

        ImageIcon nodebtorsicon = new ImageIcon( currentDirectory +"\\no.debtors.png");
        ImageIcon duetodayicon = new ImageIcon( currentDirectory +"\\due-today.png");
        ImageIcon todaysProfiticon = new ImageIcon( currentDirectory +"\\profit.png");
        
        
		//Dashboard Module

        Border dashbNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode(greycolor));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        dashbRight.setBorder(dashbNoLefttBorder);

        JLabel dashword = new JLabel("Dashboard");

   
        dashword.setFont(customFont8);
        dashword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight1 = new JLabel();

        lineRight1.setOpaque(true);
        lineRight1.setBackground(Color.decode(greycolor)); // Set the line color
        lineRight1.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        wcUser.setText("Welcome User: " + USERNAME);;
  

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
        JLabel duetodaynumber = new JLabel(); //ETO ATA PAPALITAN

        duetodaynumber.setFont(customFont11);
        duetodaynumber.setForeground(Color.decode(blackColor));

		JPanel boxLeft3 = new JPanel(null);
        JPanel boxRight3 = new JPanel(null);
        JPanel border3 = new JPanel(null);

        JLabel leftbox3 = new JLabel();
        
        leftbox3.setIcon(todaysProfiticon);

        JLabel todaysProfitword = new JLabel("Profit");
        todaysProfitword.setFont(customFont10);
        todaysProfitword.setForeground(Color.decode(blackColor));

        //peso sign
        JLabel todaysProfitPesoSignword = new JLabel("\u20B1 ");
        todaysProfitPesoSignword.setFont(customFontPS);
        todaysProfitPesoSignword.setForeground(Color.decode(blackColor));


        JLabel todaysProfitnumber = new JLabel("1000"); //ETO ATA PAPALITAN
        todaysProfitnumber.setFont(customFont11);
        todaysProfitnumber.setForeground(Color.decode(blackColor));

		/*Table Dashboard
		String [] [] rowDashboard = {{"Name1", "Debt1"},
							 {"Name2", "Debt2"},
							 {"Name3", "Debt3"},
							 {"Name4", "Debt4"},
							 {"Name5", "Debt5"}};
        */
		JTable tb1Dasboard = new JTable(dtmDashboard);

		JScrollPane spDashboard = new JScrollPane(tb1Dasboard);


		//Dashboard content
        dashbRight.setBounds(200, 0, 700, 550);//600
        dashbRight.setBackground(Color.decode("#F2F3F5"));

        dashword.setBounds(15, 7, 200, 50);
        lineRight1.setBounds(0, 65, 700, 2);
        wcUser.setBounds(10,70,350,50);

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


        String sqltable = "SELECT CONCAT(b.LastName, ', ', b.FirstName) AS name, ROUND((a.TotalCollection) / a.Period, 2) FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID " +
        "WHERE (b.PayFrequency = 'WEEKLY' AND DATEDIFF(CURDATE(), a.StartDate) % 7 = 0) OR "+
        "(b.PayFrequency = 'MONTHLY' AND DATEDIFF(CURDATE(), a.StartDate) % 30 = 0) OR "+
        "(b.PayFrequency = 'YEARLY' AND DATEDIFF(CURDATE(), a.StartDate) % 365 = 0) ORDER BY b.LastName;";
        String sqlForCollection = "SELECT ROUND(SUM(AmountPaid)) as num FROM payments WHERE PaymentDate = CURRENT_DATE;";
        String slqForDebtor = "SELECT COUNT(*) as num FROM loans WHERE Status = 'Active';";

        try {
            PreparedStatement statement = conn.prepareStatement(sqltable);
            ResultSet resultSet = statement.executeQuery();

            // Clear existing data from table1
            dtmDashboard.setRowCount(0);
            dtmDashboard.setColumnCount(0);

            // Get the number of columns in the result set
            int columnCount = resultSet.getMetaData().getColumnCount();

            String [] colDash = {"Name", "To Be Collected"};

            // Set the column names using the colLoan array
            dtmDashboard.setColumnIdentifiers(colDash);

            // Add data rows to the table model
            int rowCount = 0;
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                dtmDashboard.addRow(row);
                rowCount++;
            }
            duetodaynumber.setText(String.valueOf(rowCount));

//2nd SQL STATMENT
            statement = conn.prepareStatement(sqlForCollection);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               todaysProfitnumber.setText(String.valueOf(resultSet.getInt("num"))); 
            }
//3rd SQL STATMENT
            statement = conn.prepareStatement(slqForDebtor);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                debtorsnumberBox.setText(String.valueOf(resultSet.getInt("num"))); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

