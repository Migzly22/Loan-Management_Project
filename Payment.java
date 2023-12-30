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

public class Payment implements RootValue{
    public void paymentFrame(int ID) {
          //Pay Debtor Frame
        JFrame payDebtorFrame = new JFrame("Pay");
        JPanel payDebtorTopbar = new JPanel(null);
        Border payDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        payDebtorTopbar.setBorder(payDebTopBorder);

        JLabel payDebtorLogoTopbar = new JLabel();
        ImageIcon payDebtoricon = new ImageIcon(currentDirectory+"\\pay-logo.png");
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
 
            public void mouseEntered(MouseEvent e) {
                pdCancelBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }


            public void mouseExited(MouseEvent e) {
                pdCancelBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                payDebtorFrame.setVisible(false);
            }
        });

//SETBOUNDS
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

//ADD TO FRAME
        payDebtorFrame.setLayout(null);
        payDebtorFrame.setUndecorated(true);
        payDebtorFrame.setBounds(0, 0, 400, 445);
        payDebtorFrame.setLocationRelativeTo(null);
        payDebtorFrame.setVisible(true);
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

    }

     public void updateTheData(int loanID,String date, float amountPaid){
        String sqlAddtoBorrower = "INSERT INTO `payments` (`LoanID`, `PaymentDate`, `AmountPaid`) VALUES (?, ?, ?);";
      
        try {
            PreparedStatement statement = conn.prepareStatement(sqlAddtoBorrower);
            statement.setInt(1, loanID);  // assuming text is your search text
            statement.setString(2, date);  // assuming text is your search text
            statement.setFloat(3, amountPaid);  // assuming text is your search text

            // Execute the update
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
