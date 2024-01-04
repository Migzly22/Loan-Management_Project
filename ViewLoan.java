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

public class ViewLoan implements RootValue {

    public JPanel viewDebRight = new JPanel(null);
    DefaultTableModel vddtmDebtor = new DefaultTableModel();
    
    public void viewLoanFrames() {
        //View Debtor Frame NEW DESIGN
        Border viewDebNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebRight.setBorder(viewDebNoLefttBorder);



        JLabel lineRight10 = new JLabel("User Details");
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

        //Table View Debtor
        String [] [] vdrowDebtor = {{"", "", "", "", "", "", ""},
                            {"", "", "", "", "", "", ""},
                            {"", "", "", "", "", "", ""},
                            {"", "", "", "", "", "", ""},
                            {"", "", "", "", "", "", ""}};

        String [] vdcolDebtor = {"ID", "Name", "Date", "Loan", "Interest", "Total", "Status"};


        JTable vdtb1Debtor = new JTable(vddtmDebtor);

        JScrollPane vdspDebtor = new JScrollPane(vdtb1Debtor);
        //end Table

        //End View Debtor Frame NEW DESIGN

//SETBOUNDS 
        //View Debtor Frame NEW DESIGN
        viewDebRight.setBounds(200, 0, 700, 550);//600
        viewDebRight.setBackground(Color.decode("#F2F3F5"));
        viewDebRight.setVisible(true);
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
//ADD TO FRAME
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

        //frame2.add(viewDebRight);
        //End View Debtor Frame NEW DESIGN

    }

    public void loadTheData(PreparedStatement statement){
        try {
            ResultSet resultSet = statement.executeQuery();

            // Add data rows to the table model
            while (resultSet.next()) {

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
