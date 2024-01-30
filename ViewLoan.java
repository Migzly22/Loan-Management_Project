import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.HashMap;

public class ViewLoan implements RootValue {

    public JPanel viewDebRight = new JPanel(null);

    DefaultTableModel dtmBorrowersLoans = new DefaultTableModel();
    JTable vdtb1Debtor = new JTable(dtmBorrowersLoans);

    public void viewLoanFrames(int bID) {

        System.out.println(bID);
        //View Debtor Frame NEW DESIGN
        Border viewDebNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebRight.setBorder(viewDebNoLefttBorder);
        
        JLabel dashword = new JLabel("User Details");
        dashword.setFont(customFont8);
        dashword.setForeground(Color.decode("#073cb7"));
        dashword.setBounds(15, 7, 200, 50);

        JLabel lineRight10 = new JLabel();
        lineRight10.setOpaque(true);
        lineRight10.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight10.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));




        //CONTAINER OF DATA
        HashMap<String, String> userData = loadTheData(bID);



        JLabel vdNameDebtor = new JLabel(userData.get("LastName") + ", "+ userData.get("FirstName"));

        //left
        JLabel vdStartDate = new JLabel("Start Date :");
        JLabel vdEmail = new JLabel("Email :");
        JLabel vdPhoneNumber = new JLabel("Phone Number:");
        JLabel vdAddress = new JLabel("Address :");
        JLabel vdClassfication = new JLabel("Classification :");

        JLabel vdStartDate1 = new JLabel(userData.get("StartDate"));
        JLabel vdEmail1 = new JLabel(userData.get("Email"));
        JLabel vdPhoneNumber1 = new JLabel(userData.get("PhoneNumber"));
        JLabel vdAddress1 = new JLabel(userData.get("Address"));
        JLabel vdClassfication1 = new JLabel(userData.get("Classification"));

        //right
        JLabel vdFrequency = new JLabel("Frequency :");
        JLabel vdPeriod = new JLabel("Period :");
        JLabel vdLoan = new JLabel("Loan :");
        JLabel vdInterestRate = new JLabel("Interest Rate :");
        JLabel vdStatus = new JLabel("Status :");

        JLabel vdFrequency1 = new JLabel(userData.get("PayFrequency"));
        JLabel vdPeriod1 = new JLabel(userData.get("Period"));
        JLabel vdLoan1 = new JLabel(userData.get("LoanAmount"));

        float interest = Float.parseFloat(userData.get("InterestRate"))* 100;

        JLabel vdInterestRate1 = new JLabel(interest + "%");
        JLabel vdStatus1 = new JLabel(userData.get("Status"));

        JLabel vdPaymentHistory = new JLabel("Payment History");

        //fonts
        vdNameDebtor.setFont(customFont9);
        vdNameDebtor.setForeground(Color.decode("#4d4d4d"));
        //
        JButton paybtnDebtor = new JButton("Pay");
        paybtnDebtor.setFont(customFont14);
        paybtnDebtor.setForeground(Color.decode("#ffffff"));
        paybtnDebtor.setBackground(Color.decode("#007dfe"));
        paybtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2)); //#ffffff or #DBDCDE
        paybtnDebtor.setFocusPainted(false);
        paybtnDebtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                Payment viewFrame = new Payment();  
                viewFrame.paymentFrame(bID);
            }
        });
        paybtnDebtor.setBounds(564, 488, 100, 40);


        Font customFont31 = new Font("Century Gothic", Font.BOLD, 13);

        vdStartDate.setFont(customFont31);
        vdEmail.setFont(customFont31);
        vdPhoneNumber.setFont(customFont31);
        vdAddress.setFont(customFont31);
        vdClassfication1.setFont(customFont31);
        vdStartDate1.setFont(customFont31);
        vdEmail1.setFont(customFont31);
        vdPhoneNumber1.setFont(customFont31);
        vdAddress1.setFont(customFont31);
        vdClassfication1.setFont(customFont31);

        vdFrequency.setFont(customFont31);
        vdPeriod.setFont(customFont31);
        vdLoan.setFont(customFont31);
        vdInterestRate.setFont(customFont31);
        vdStatus.setFont(customFont31);
        vdFrequency1.setFont(customFont31);
        vdPeriod1.setFont(customFont31);
        vdLoan1.setFont(customFont31);
        vdInterestRate1.setFont(customFont31);
        vdStatus1.setFont(customFont31);

        vdStartDate.setForeground(Color.decode("#4d4d4d"));
        vdEmail.setForeground(Color.decode("#4d4d4d"));
        vdPhoneNumber.setForeground(Color.decode("#4d4d4d"));
        vdAddress.setForeground(Color.decode("#4d4d4d"));
        vdClassfication.setForeground(Color.decode("#4d4d4d"));

        vdStartDate1.setForeground(Color.decode("#4d4d4d"));
        vdEmail1.setForeground(Color.decode("#4d4d4d"));
        vdPhoneNumber1.setForeground(Color.decode("#4d4d4d"));
        vdAddress1.setForeground(Color.decode("#4d4d4d"));
        vdClassfication1.setForeground(Color.decode("#4d4d4d"));

        vdFrequency.setForeground(Color.decode("#4d4d4d"));
        vdPeriod.setForeground(Color.decode("#4d4d4d"));
        vdLoan.setForeground(Color.decode("#4d4d4d"));
        vdInterestRate.setForeground(Color.decode("#4d4d4d"));
        vdStatus.setForeground(Color.decode("#4d4d4d"));
        
        vdFrequency1.setForeground(Color.decode("#4d4d4d"));
        vdPeriod1.setForeground(Color.decode("#4d4d4d"));
        vdLoan1.setForeground(Color.decode("#4d4d4d"));
        vdInterestRate1.setForeground(Color.decode("#4d4d4d"));
        vdStatus1.setForeground(Color.decode("#4d4d4d"));

        Font customFont32 = new Font("Century Gothic", Font.BOLD, 16);
        vdPaymentHistory.setFont(customFont32);
        vdPaymentHistory.setForeground(Color.decode("#4d4d4d"));


        loadTheDataForTable(bID);
       

        

        JScrollPane vdspDebtor = new JScrollPane(vdtb1Debtor);
        //end Table

        //End View Debtor Frame NEW DESIGN

//SETBOUNDS 
        //View Debtor Frame NEW DESIGN
        viewDebRight.setBounds(200, 0, 700, 550);//600
        viewDebRight.setBackground(Color.decode("#F2F3F5"));
        viewDebRight.setVisible(true);
        lineRight10.setBounds(0, 65, 700, 2);

        vdNameDebtor.setBounds(12,70,400,50);

        vdStartDate.setBounds(12,130,100,20);
        vdEmail.setBounds(12,160,100,20);
        vdPhoneNumber.setBounds(12,190,100,20);
        vdAddress.setBounds(12,220,100,20);
        vdClassfication.setBounds(12,250,100,20);

        vdStartDate1.setBounds(130,130,190,20);
        vdEmail1.setBounds(130,160,190,20);
        vdPhoneNumber1.setBounds(130,190,190,20);
        vdAddress1.setBounds(130,220,190,20);
        vdClassfication1.setBounds(130,250,190,20);

        vdFrequency.setBounds(350,130,100,20);
        vdPeriod.setBounds(350,160,100,20);
        vdLoan.setBounds(350,190,100,20);
        vdInterestRate.setBounds(350,220,100,20);
        vdStatus.setBounds(350,250,100,20);

        vdFrequency1.setBounds(465,130,190,20);
        vdPeriod1.setBounds(465,160,190,20);
        vdLoan1.setBounds(465,190,190,20);
        vdInterestRate1.setBounds(465,220,190,20);
        vdStatus1.setBounds(465,250,190,20);

        vdPaymentHistory.setBounds(270,320,150,20);
        vdspDebtor.setBounds(35,350,630,130);



        //End View Debtor Frame NEW DESIGN
//ADD TO FRAME
        //View Debtor Frame NEW DESIGN
        viewDebRight.add(dashword);
        viewDebRight.add(lineRight10);

        viewDebRight.add(vdNameDebtor);

        viewDebRight.add(vdStartDate);
        viewDebRight.add(vdEmail);
        viewDebRight.add(vdPhoneNumber);
        viewDebRight.add(vdAddress);
        viewDebRight.add(vdClassfication);
        viewDebRight.add(vdStartDate1);
        viewDebRight.add(vdEmail1);
        viewDebRight.add(vdPhoneNumber1);
        viewDebRight.add(vdAddress1);
        viewDebRight.add(vdClassfication1);

        viewDebRight.add(vdFrequency);
        viewDebRight.add(vdPeriod);
        viewDebRight.add(vdLoan);
        viewDebRight.add(vdInterestRate);
        viewDebRight.add(vdStatus);
        viewDebRight.add(vdFrequency1);
        viewDebRight.add(vdPeriod1);
        viewDebRight.add(vdLoan1);
        viewDebRight.add(vdInterestRate1);
        viewDebRight.add(vdStatus1);

        viewDebRight.add(vdPaymentHistory);
        viewDebRight.add(vdspDebtor);



        viewDebRight.add(paybtnDebtor);
        //frame2.add(viewDebRight);
        //End View Debtor Frame NEW DESIGN

    }
    public void loadTheDataForTable(int bID) {
        String sql = "SELECT LoanID,PaymentDate,AmountPaid FROM payments WHERE LoanID = ? ;";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, bID);

            resultSet = preparedStatement.executeQuery();

            // Clear existing data from table1
            dtmBorrowersLoans.setRowCount(0);
            dtmBorrowersLoans.setColumnCount(0);

            // Get the number of columns in the result set
            int columnCount = resultSet.getMetaData().getColumnCount();

            String [] colLoan = {"ID", "Date","Amount"};
            // Set the column names using the colLoan array
            dtmBorrowersLoans.setColumnIdentifiers(colLoan);

            // Add data rows to the table model
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                dtmBorrowersLoans.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public HashMap<String, String> loadTheData(int Borrowerid) {
        String sql = "SELECT a.*, b.* FROM borrowers a LEFT JOIN loans b ON a.BorrowerID = b.BorrowerID WHERE b.LoanID = ?;";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        HashMap<String, String> mixedMap = new HashMap<>();
    
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Borrowerid);
    
            resultSet = preparedStatement.executeQuery();
            // Get metadata about the result set
            ResultSetMetaData metaData = resultSet.getMetaData();
    
            // Get the number of columns
            int columnCount = metaData.getColumnCount();
    
            while (resultSet.next()) {
                // Iterate through columns dynamically
    
                for (int i = 1; i <= columnCount; i++) {
                    // Retrieve data from the result set using column name
                    String columnName = metaData.getColumnName(i);
                    Object valueObject = resultSet.getObject(columnName);
    
                    // Check if the value is null before converting it to string
                    String value = (valueObject != null) ? valueObject.toString() : null;
    
                    // Process the retrieved data
                    mixedMap.put(columnName, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the ResultSet and PreparedStatement in a finally block
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return mixedMap;
    }
}
