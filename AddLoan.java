import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.sql.*;

public class AddLoan implements RootValue {

    JFrame addDebtorFrame = new JFrame("Add Debtor");

    public void ADDLOANER() {

        JPanel addDebtorTopbar = new JPanel(null);
        Border addDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));// ffffff or DBDCDE or 8CC7FC or
                                                                                      // #ecf6fe //TLBR
        addDebtorTopbar.setBorder(addDebTopBorder);

        JLabel addDebtorLogoTopbar = new JLabel();
        ImageIcon addDebtoricon = new ImageIcon(currentDirectory + "\\gplg.png");
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
        Border addDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode("#DBDCDE"));// ffffff or DBDCDE or 8CC7FC
                                                                                         // or #ecf6fe //TLBR
        addDebtorBottombar.setBorder(addDebBottomBorder);

        // Jlabel left
        JLabel adFirstNameLabel = new JLabel("First Name:");
        JLabel adMiddleNameLabel = new JLabel("Middle Name:");
        JLabel adLastNameLabel = new JLabel("Last Name:");
        JLabel adEmailLabel = new JLabel("Email:");
        JLabel adAddressLabel = new JLabel("Address:");
        JLabel adConNumLabel = new JLabel("Contact Number:");

        // Jtextfield left
        JTextField adFirstNametf = new JTextField();
        adFirstNametf.addKeyListener(new NoNumberKeyListener());
        JTextField adMiddleNametf = new JTextField();
        adMiddleNametf.addKeyListener(new NoNumberKeyListener());
        JTextField adLastNametf = new JTextField();
        adLastNametf.addKeyListener(new NoNumberKeyListener());
        JTextField adEmailtf = new JTextField();
        JTextField adAddresstf = new JTextField();
        JTextField adConNumtf = new JTextField();
        adConNumtf.addKeyListener(new NoLetter());

        // Jlabel right
        JLabel adClassificationLabel = new JLabel("Classification:");
        JLabel adFrequencyLabel = new JLabel("Frequency: ");
        JLabel adLoanAmountLabel = new JLabel("Loan Amount:");
        adLoanAmountLabel.addKeyListener(new NoLetter());

        // Jtextfield right
        // JTextField adClassificationtf = new JTextField();
        String select1[] = { "Student Loan", "Personal Loan", "Auto Loan" };
        JComboBox adClassification = new JComboBox(select1);

        String select2[] = { "Weekly", "Monthly", "Annually" };
        JComboBox adFrequency = new JComboBox(select2);
        JTextField adLoanAmounttf = new JTextField();
        //

        // left style
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
        adFirstNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adMiddleNametf.setFont(customFont17);
        adMiddleNametf.setForeground(Color.decode("#4d4d4d"));
        adMiddleNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adLastNametf.setFont(customFont17);
        adLastNametf.setForeground(Color.decode("#4d4d4d"));
        adLastNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adEmailtf.setFont(customFont17);
        adEmailtf.setForeground(Color.decode("#4d4d4d"));
        adEmailtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adAddresstf.setFont(customFont17);
        adAddresstf.setForeground(Color.decode("#4d4d4d"));
        adAddresstf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adConNumtf.setFont(customFont17);
        adConNumtf.setForeground(Color.decode("#4d4d4d"));
        adConNumtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE
        // end left style

        // right style

        adClassificationLabel.setFont(customFont16);
        adFrequencyLabel.setFont(customFont16);
        adLoanAmountLabel.setFont(customFont16);

        adClassificationLabel.setForeground(Color.decode("#4d4d4d"));
        adFrequencyLabel.setForeground(Color.decode("#4d4d4d"));
        adLoanAmountLabel.setForeground(Color.decode("#4d4d4d"));

        adClassification.setFont(customFont17);
        adClassification.setForeground(Color.decode("#4d4d4d"));
        adClassification.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        adFrequency.setFont(customFont17);
        adFrequency.setForeground(Color.decode("#4d4d4d"));
        adFrequency.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        /*
         * adFrequency.setFont(customFont17);
         * adFrequency.setForeground(Color.decode("#4d4d4d"));
         * adFrequency.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff
         * or #DBDCDE
         */

        adLoanAmounttf.setFont(customFont17);
        adLoanAmounttf.setForeground(Color.decode("#4d4d4d"));
        adLoanAmounttf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE
        // end right style

        JButton adSavebtn = new JButton("Save");
        JButton adCancelbtn = new JButton("Cancel");

        adSavebtn.setFont(customFont14);
        adCancelbtn.setFont(customFont14);

        adSavebtn.setForeground(Color.decode("#ffffff"));
        adCancelbtn.setForeground(Color.decode("#ffffff"));

        adSavebtn.setBackground(Color.decode("#57F287"));
        adCancelbtn.setBackground(Color.decode("#FF1A1A"));

        adSavebtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2));// #ffffff or #DBDCDE
        adCancelbtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); // #ffffff or #DBDCDE
        adSavebtn.setFocusPainted(false);
        adCancelbtn.setFocusPainted(false);

        // Mouse Icon Hover
        adSavebtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                adSavebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                adSavebtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                int period = 0;
                switch (adFrequency.getSelectedItem().toString()) {

                    case "Weekly":
                        period = 4;
                        break;
                    case "Monthly":
                        period = 12;
                        break;
                    case "Annually":
                        period = 3;
                        break;
                }

                updateTheData(
                        adFirstNametf.getText(),
                        adMiddleNametf.getText(),
                        adLastNametf.getText(),
                        adEmailtf.getText(),
                        adConNumtf.getText(),
                        adAddresstf.getText(),
                        adClassification.getSelectedItem().toString(),
                        adFrequency.getSelectedItem().toString(),
                        period,
                        Double.parseDouble(adLoanAmounttf.getText()));

            }
        });
        // Mouse Icon Hover
        adCancelbtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                adCancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                adCancelbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                addDebtorFrame.setVisible(false);
                addDebtorFrame.dispose();
            }
        });

        // SETBOUNDS
        addDebtorTopbar.setBounds(0, 0, 800, 70);
        addDebtorTopbar.setBackground(Color.decode("#007dfe")); // #007dfe

        addDebtorLogoTopbar.setBounds(20, 0, 150, 70);

        addDebtorWord.setBounds(25, 65, 200, 50);

        addDebtorTopbarLine.setBounds(0, 70, 800, 2);

        addDebtorBottombar.setBounds(0, 71, 800, 480);
        addDebtorBottombar.setBackground(Color.decode("#ffffff")); // #007dfe

        // Labels and TextField
        // left
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

        // right
        adClassificationLabel.setBounds(400, 130, 100, 50);
        adFrequencyLabel.setBounds(400, 180, 100, 50);
        adLoanAmountLabel.setBounds(400, 230, 140, 50);
        // adLoanAmountLabel.setBounds(400, 280, 100, 50);

        adClassification.setBounds(540, 136, 210, 35);
        adFrequency.setBounds(540, 186, 210, 35);
        adLoanAmounttf.setBounds(540, 236, 210, 35);
        // adLoanAmounttf.setBounds(540, 286, 210, 35);
        // adLoanAmounttf.setEditable(false);
        adLoanAmounttf.setBackground(Color.decode("#FBFBFC"));
        //

        // Buttons
        adSavebtn.setBounds(520, 460, 100, 40);
        adCancelbtn.setBounds(650, 460, 100, 40);

        // ADD TO FRAME
        addDebtorFrame.setLayout(null);
        addDebtorFrame.setUndecorated(true);
        addDebtorFrame.setBounds(0, 0, 800, 550); // 480 or 550
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
        addDebtorFrame.add(adLoanAmountLabel);

        addDebtorFrame.add(adClassification);
        addDebtorFrame.add(adFrequency);
        addDebtorFrame.add(adLoanAmounttf);

        addDebtorFrame.add(adSavebtn);
        addDebtorFrame.add(adCancelbtn);

        addDebtorFrame.add(addDebtorBottombar);

    }

    AdditionalFrames addons = new AdditionalFrames();

    public void updateTheData(String fname, String mname, String lname, String email, String phone, String address,
            String classification, String PayFrequency, int Period, double principal) {
        String sqlAddtoBorrower = "INSERT INTO `borrowers` (`FirstName`, `MiddleName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `Classification`, `PayFrequency`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
        String sqlAddtoLoan = "INSERT INTO `loans` (`BorrowerID`, `LoanAmount`, `InterestRate`, `Period`, `TotalCollection`, `StartDate`, `Status`) VALUES ( ?, ?, ?, ?, ?, CURRENT_DATE, ?);";
        String newUser = "INSERT INTO `usercredentials` (`Name`, `Username`, `Password`, `BorrowerID`) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(sqlAddtoBorrower, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, fname); // assuming text is your search text
            statement.setString(2, mname); // assuming text is your search text
            statement.setString(3, lname); // assuming text is your search text
            statement.setString(4, email); // assuming text is your search text
            statement.setString(5, phone); // assuming text is your search text
            statement.setString(6, address); // assuming text is your search text
            statement.setString(7, classification); // assuming text is your search text
            statement.setString(8, PayFrequency); // assuming text is your s

            // Execute the update
            int affectedRows = statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            int generatedId = 0;
            if (generatedKeys.next()) {
                // Get the generated ID
                generatedId = generatedKeys.getInt(1);
            } else {
                System.out.println("No ID obtained.");
            }

            statement = conn.prepareStatement(newUser);
            statement.setString(1, fname + " " + lname); // assuming text is your search text
            statement.setString(2, fname + lname); // assuming text is your search text
            statement.setString(3, email); // assuming text is your search text
            statement.setInt(4, generatedId); // assuming text is your search text

            statement.executeUpdate();

            String sqlSelectloan = "SELECT " + PayFrequency
                    + "InterestRate AS INTERESTRATE FROM loantypes WHERE TypeName = '" + classification + "';";
            statement = conn.prepareStatement(sqlSelectloan);

            ResultSet resultSet = statement.executeQuery();

            double INTERESTRATE = 0.00;
            if (resultSet.next()) {
                INTERESTRATE = resultSet.getDouble("INTERESTRATE");
            }
            double total_Repayment = principal + (principal * INTERESTRATE * Period);

            statement = conn.prepareStatement(sqlAddtoLoan);
            statement.setInt(1, generatedId); // assuming text is your search text
            statement.setDouble(2, principal); // assuming text is your search text
            statement.setDouble(3, INTERESTRATE); // assuming text is your search text
            statement.setInt(4, Period); // assuming text is your search text
            statement.setDouble(5, total_Repayment); // assuming text is your search text
            statement.setString(6, "Active"); // assuming text is your search text

            statement.executeUpdate();

            addons.messages("Success", "\\Check-65.png", "Added Successfully");
            addons.okLoginlc.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    addDebtorFrame.setVisible(false);
                    addDebtorFrame.dispose();

                    addons.FrameNotif.setVisible(false);
                    addons.FrameNotif.dispose();

                    Sidebar sideLine = Sidebar.getInstance();
                    sideLine.ReloadData();
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            addons.messages("Error", "\\Ekis-65.png", "Transaction Failed");
            addons.okLoginlc.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    addons.FrameNotif.setVisible(false);
                    addons.FrameNotif.dispose();

                }
            });
        }
    }

    private class NoNumberKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();

            // Check if the entered character is a digit
            if (Character.isDigit(c)) {
                // If it's a digit, consume the event (ignore the key press)
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Not used in this example
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Not used in this example
        }
    }

    private class NoLetter implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();

            // Check if the entered character is a digit
            if (Character.isLetter(c)) {
                // If it's a digit, consume the event (ignore the key press)
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Not used in this example
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Not used in this example
        }
    }
}
