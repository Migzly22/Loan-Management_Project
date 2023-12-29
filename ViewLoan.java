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

    //Jtextfield left
    JTextField vdFirstNametf = new JTextField();
    JTextField vdMiddleNametf = new JTextField();
    JTextField vdLastNametf = new JTextField();
    JTextField vdGendertf = new JTextField();
    JTextField vdDoBtf = new JTextField();
    JTextField vdJobtf = new JTextField();

    //Jtextfield right
    JTextField vdAmountLoantf = new JTextField();
    JTextField vdInterestRatetf = new JTextField();
    JTextField vdNoPtf = new JTextField();
    JTextField vdMPtf = new JTextField();
    JTextField vdTLtf = new JTextField();
    JTextField vdPAtf = new JTextField();


    public void viewLoanFrames(int ID) {
        //View Debtor Frame
        JFrame viewDebtorFrame = new JFrame("View Debtor");
        JPanel viewDebtorTopbar = new JPanel(null);
        Border viewDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        viewDebtorTopbar.setBorder(viewDebTopBorder);

        JLabel viewDebtorLogoTopbar = new JLabel();
        ImageIcon viewDebtoricon = new ImageIcon(currentDirectory+"\\gplg.png");
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

        //Jlabel right
        JLabel vdAmountLoanLabel = new JLabel("Amount Loan");
        JLabel vdInterestRateLabel = new JLabel("Interest Rate");
        JLabel vdNoPLabel = new JLabel("Number of Payments");
        JLabel vdMPLabel = new JLabel("Monthly Pay");
        JLabel vdTLLabel = new JLabel("Total Loan");
        JLabel vdPALabel = new JLabel("Paid Amount");

        //left style

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

            public void mouseEntered(MouseEvent e) {
                vdCancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                vdCancelbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            
            public void mouseClicked(MouseEvent e) {
                viewDebtorFrame.setVisible(false);
            }
        });

//SETBOUNDS
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

//ADD TO FRAME  
        viewDebtorFrame.setLayout(null);
        viewDebtorFrame.setUndecorated(true);
        viewDebtorFrame.setBounds(0, 0, 800, 550);
        viewDebtorFrame.setLocationRelativeTo(null);
        viewDebtorFrame.setVisible(true);
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
