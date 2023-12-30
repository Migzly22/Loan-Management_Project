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

public class AddLoan implements RootValue{
    
    public static void main(String[] args) {
        //Add Debtor Frame
        JFrame addDebtorFrame = new JFrame("Add Debtor");
        JPanel addDebtorTopbar = new JPanel(null);
        Border addDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode(greycolor));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        addDebtorTopbar.setBorder(addDebTopBorder);

        JLabel addDebtorLogoTopbar = new JLabel();
        ImageIcon addDebtoricon = new ImageIcon(currentDirectory+"\\gplg.png");
        addDebtorLogoTopbar.setIcon(addDebtoricon);

        JLabel addDebtorWord = new JLabel("Add Debtor");
        Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
        addDebtorWord.setFont(customFont15);
        addDebtorWord.setForeground(Color.decode(blueColor2));


        JLabel addDebtorTopbarLine = new JLabel();
        addDebtorTopbarLine.setOpaque(true);
        addDebtorTopbarLine.setBackground(Color.decode(greycolor)); // Set the line color
        addDebtorTopbarLine.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JPanel addDebtorBottombar = new JPanel(null);
        Border addDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode(greycolor));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        addDebtorBottombar.setBorder(addDebBottomBorder);

		//Jlabel left
        JLabel adFirstNameLabel = new JLabel("First Name:");
        JLabel adMiddleNameLabel = new JLabel("Middle Name:");
        JLabel adLastNameLabel = new JLabel("Last Name:");
        JLabel adGenderLabel = new JLabel("Gender:");
        JLabel adDoBLabel = new JLabel("Date of Birth:");
        JLabel adJobLabel = new JLabel("Job:");

        //Jtextfield left
        JTextField adFirstNametf = new JTextField();
        JTextField adMiddleNametf = new JTextField();
        JTextField adLastNametf = new JTextField();
        JTextField adGendertf = new JTextField();
        JTextField adDoBtf = new JTextField();
        JTextField adJobtf = new JTextField();

        JLabel adAmountLoanLabel = new JLabel("Amount Loan");
        JLabel adInterestRateLabel = new JLabel("Interest Rate");
        JLabel adNoPLabel = new JLabel("Number of Payments");
        JLabel adMPLabel = new JLabel("Monthly Pay");
        JLabel adTLLabel = new JLabel("Total Loan");
        JLabel adPALabel = new JLabel("Paid Amount");

        JTextField adAmountLoantf = new JTextField();
        JTextField adInterestRatetf = new JTextField();
        JTextField adNoPtf = new JTextField();
        JTextField adMPtf = new JTextField();
        JTextField adTLtf = new JTextField();
        JTextField adPAtf = new JTextField();
  
        adFirstNameLabel.setFont(customFont16);
        adMiddleNameLabel.setFont(customFont16);
        adLastNameLabel.setFont(customFont16);
        adGenderLabel.setFont(customFont16);
        adDoBLabel.setFont(customFont16);
        adJobLabel.setFont(customFont16);

        adFirstNameLabel.setForeground(Color.decode(blackColor));
        adMiddleNameLabel.setForeground(Color.decode(blackColor));
        adLastNameLabel.setForeground(Color.decode(blackColor));
        adGenderLabel.setForeground(Color.decode(blackColor));
        adDoBLabel.setForeground(Color.decode(blackColor));
        adJobLabel.setForeground(Color.decode(blackColor));


        adFirstNametf.setFont(customFont17);
        adFirstNametf.setForeground(Color.decode(blackColor));
        adFirstNametf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adMiddleNametf.setFont(customFont17);
        adMiddleNametf.setForeground(Color.decode(blackColor));
        adMiddleNametf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adLastNametf.setFont(customFont17);
        adLastNametf.setForeground(Color.decode(blackColor));
        adLastNametf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adGendertf.setFont(customFont17);
        adGendertf.setForeground(Color.decode(blackColor));
        adGendertf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adDoBtf.setFont(customFont17);
        adDoBtf.setForeground(Color.decode(blackColor));
        adDoBtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE


		adJobtf.setFont(customFont17);
        adJobtf.setForeground(Color.decode(blackColor));
        adJobtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE
        //end left style

		//right style

		adAmountLoanLabel.setFont(customFont16);
        adInterestRateLabel.setFont(customFont16);
        adNoPLabel.setFont(customFont16);
        adMPLabel.setFont(customFont16);
        adTLLabel.setFont(customFont16);
        adPALabel.setFont(customFont16);

        adAmountLoanLabel.setForeground(Color.decode(blackColor));
        adInterestRateLabel.setForeground(Color.decode(blackColor));
        adNoPLabel.setForeground(Color.decode(blackColor));
        adMPLabel.setForeground(Color.decode(blackColor));
        adTLLabel.setForeground(Color.decode(blackColor));
        adPALabel.setForeground(Color.decode(blackColor));


        adAmountLoantf.setFont(customFont17);
        adAmountLoantf.setForeground(Color.decode(blackColor));
        adAmountLoantf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adInterestRatetf.setFont(customFont17);
        adInterestRatetf.setForeground(Color.decode(blackColor));
        adInterestRatetf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adNoPtf.setFont(customFont17);
        adNoPtf.setForeground(Color.decode(blackColor));
        adNoPtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adMPtf.setFont(customFont17);
        adMPtf.setForeground(Color.decode(blackColor));
        adMPtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE

        adTLtf.setFont(customFont17);
        adTLtf.setForeground(Color.decode(blackColor));
        adTLtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE


		adPAtf.setFont(customFont17);
        adPAtf.setForeground(Color.decode(blackColor));
        adPAtf.setBorder(new LineBorder(Color.decode(greyColor2), 1)); //#ffffff or #DBDCDE
		//end right style

		JButton adSavebtn = new JButton("Save");
		JButton adCancelbtn = new JButton("Cancel");

		adSavebtn.setFont(customFont14);
        adCancelbtn.setFont(customFont14);

        adSavebtn.setForeground(Color.decode(whiteColor));
        adCancelbtn.setForeground(Color.decode(whiteColor));

        adSavebtn.setBackground(Color.decode(greenColor));
        adCancelbtn.setBackground(Color.decode(redColor));

        adSavebtn.setBorder(new LineBorder(Color.decode(greycolor), 2));//#ffffff or #DBDCDE
        adCancelbtn.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #DBDCDE
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

//SETBOUNDS

        addDebtorTopbar.setBounds(0, 0, 800, 70);
        addDebtorTopbar.setBackground(Color.decode(blueColor)); //#007dfe

        addDebtorLogoTopbar.setBounds(20, 0, 150, 70);

        addDebtorWord.setBounds(25, 65, 200, 50);

        addDebtorTopbarLine.setBounds(0, 70, 800, 2);

        addDebtorBottombar.setBounds(0, 71, 800, 480);
        addDebtorBottombar.setBackground(Color.decode(whiteColor)); //#007dfe


        //left
        adFirstNameLabel.setBounds(25, 130, 100, 50);
        adMiddleNameLabel.setBounds(25, 180, 100, 50);
        adLastNameLabel.setBounds(25, 230, 100, 50);
        adGenderLabel.setBounds(25, 280, 100, 50);
        adDoBLabel.setBounds(25, 330, 100, 50);
        adJobLabel.setBounds(25, 380, 100, 50);

        adFirstNametf.setBounds(155, 136, 210, 35);
        adMiddleNametf.setBounds(155, 186, 210, 35);
        adLastNametf.setBounds(155, 236, 210, 35);
        adGendertf.setBounds(155, 286, 210, 35);
        adDoBtf.setBounds(155, 336, 210, 35);
        adJobtf.setBounds(155, 386, 210, 35);
        //

        //right
        adAmountLoanLabel.setBounds(400, 130, 100, 50);
        adInterestRateLabel.setBounds(400, 180, 100, 50);
        adNoPLabel.setBounds(400, 230, 140, 50);
        adMPLabel.setBounds(400, 280, 100, 50);
        adTLLabel.setBounds(400, 330, 100, 50);
        adPALabel.setBounds(400, 380, 100, 50);

        adAmountLoantf.setBounds(540, 136, 210, 35);
        adInterestRatetf.setBounds(540, 186, 210, 35);
        adNoPtf.setBounds(540, 236, 210, 35);
        adMPtf.setBounds(540, 286, 210, 35);
        adMPtf.setEditable(false);
        adMPtf.setBackground(Color.decode(whiteColor2));
        adTLtf.setBounds(540, 336, 210, 35);
        adTLtf.setEditable(false);
        adTLtf.setBackground(Color.decode(whiteColor2));
        adPAtf.setBounds(540, 386, 210, 35);
        adPAtf.setEditable(false);
        adPAtf.setBackground(Color.decode(whiteColor2));
        //

        //Buttons
        adSavebtn.setBounds(520, 460, 100, 40);
        adCancelbtn.setBounds(650, 460, 100, 40);
        //


//ADD TO FRAME
        addDebtorFrame.setLayout(null);
        addDebtorFrame.setUndecorated(true);
        addDebtorFrame.setBounds(0, 0, 800, 550); //480 or 550
        addDebtorFrame.setLocationRelativeTo(null);
        addDebtorFrame.setVisible(true);
        addDebtorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addDebtorFrame.add(addDebtorLogoTopbar);
		addDebtorFrame.add(addDebtorWord);
        addDebtorFrame.add(addDebtorTopbar);
        addDebtorFrame.add(addDebtorTopbarLine);

        addDebtorFrame.add(adFirstNameLabel);
        addDebtorFrame.add(adMiddleNameLabel);
        addDebtorFrame.add(adLastNameLabel);
        addDebtorFrame.add(adGenderLabel);
        addDebtorFrame.add(adDoBLabel);
        addDebtorFrame.add(adJobLabel);

        addDebtorFrame.add(adFirstNametf);
        addDebtorFrame.add(adMiddleNametf);
        addDebtorFrame.add(adLastNametf);
        addDebtorFrame.add(adGendertf);
        addDebtorFrame.add(adDoBtf);
        addDebtorFrame.add(adJobtf);

        addDebtorFrame.add(adAmountLoanLabel);
        addDebtorFrame.add(adInterestRateLabel);
        addDebtorFrame.add(adNoPLabel);
        addDebtorFrame.add(adMPLabel);
        addDebtorFrame.add(adTLLabel);
        addDebtorFrame.add(adPALabel);

		addDebtorFrame.add(adAmountLoantf);
		addDebtorFrame.add(adInterestRatetf);
		addDebtorFrame.add(adNoPtf);
		addDebtorFrame.add(adMPtf);
		addDebtorFrame.add(adTLtf);
		addDebtorFrame.add(adPAtf);

		addDebtorFrame.add(adSavebtn);
		addDebtorFrame.add(adCancelbtn);

        addDebtorFrame.add(addDebtorBottombar);



    }

      public void updateTheData(){
        String sqlAddtoBorrower = "INSERT INTO `borrowers` (`FirstName`, `MiddleName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `Classification`, `PayFrequency`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
        String sqlAddtoLoan = "INSERT INTO `loans` (`BorrowerID`, `LoanTypeID`, `LoanAmount`, `InterestRate`, `Period`, `TotalCollection`, `StartDate`, `Status`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
        String newUser = "INSERT INTO `usercredentials` (`Name`, `Username`, `Password`, `BorrowerID`) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement statement = conn.prepareStatement(sqlAddtoBorrower);
            statement.setString(1, "");  // assuming text is your search text
            statement.setString(2, "");  // assuming text is your search text
            statement.setString(3, "");  // assuming text is your search text
            statement.setString(4, "");  // assuming text is your search text
            statement.setString(5, "");  // assuming text is your search text
            statement.setString(6, "");  // assuming text is your search text
            statement.setString(7, "");  // assuming text is your search text
            statement.setString(8, "");  // assuming text is your s

            // Execute the update
            int affectedRows = statement.executeUpdate();

            // Check if any rows were affected
            if (affectedRows > 0) {
                // Retrieve the generated keys
                ResultSet generatedKeys = statement.getGeneratedKeys();

                if (generatedKeys.next()) {
                    // Get the generated ID
                    int generatedId = generatedKeys.getInt(1);
                    System.out.println("Generated ID: " + generatedId);
                } else {
                    System.out.println("No ID obtained.");
                }
            } else {
                System.out.println("No rows affected.");
            }

            statement = conn.prepareStatement(sqlAddtoLoan);
            statement.setString(1, "");  // assuming text is your search text
            statement.setString(2, "");  // assuming text is your search text
            statement.setString(3, "");  // assuming text is your search text
            statement.setString(4, "");  // assuming text is your search text
            statement.setString(5, "");  // assuming text is your search text
            statement.setString(6, "");  // assuming text is your search text
            statement.setString(7, "");  // assuming text is your search text
            statement.setString(8, "");  // assuming text is your s

            statement.executeUpdate();

            statement = conn.prepareStatement(newUser);
            statement.setString(1, "");  // assuming text is your search text
            statement.setString(2, "");  // assuming text is your search text
            statement.setString(3, "");  // assuming text is your search text
            statement.setString(4, "");  // assuming text is your search text
            statement.setString(5, "");  // assuming text is your search text
            statement.setString(6, "");  // assuming text is your search text
            statement.setString(7, "");  // assuming text is your search text
            statement.setString(8, "");  // assuming text is your s

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

