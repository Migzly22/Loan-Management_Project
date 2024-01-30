import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.sql.*;
import java.util.HashMap;

public class Payment implements RootValue {
    public void paymentFrame(int ID) {
        // Pay Debtor Frame

        JFrame payDebtorFrame = new JFrame("Pay");
        JPanel payDebtorTopbar = new JPanel(null);
        Border payDebTopBorder = new MatteBorder(2, 2, 0, 2, Color.decode("#DBDCDE"));// ffffff or DBDCDE or 8CC7FC or
                                                                                      // #ecf6fe //TLBR
        payDebtorTopbar.setBorder(payDebTopBorder);

        JLabel payDebtorLogoTopbar = new JLabel();
        ImageIcon payDebtoricon = new ImageIcon(currentDirectory + "\\pay-logo.png");
        payDebtorLogoTopbar.setIcon(payDebtoricon);

        System.out.println(ID);
        HashMap<String, String> userData = loadTheData(ID);

        String name = userData.get("LastName") + ", " + userData.get("FirstName");
        float lefttobecollected = Float.parseFloat(userData.get("totalleft"));
        float mintobepaid = Float.parseFloat(userData.get("Interests"));

        JLabel payDebtorWord = new JLabel("Payment");
        // Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
        payDebtorWord.setFont(customFont15);
        payDebtorWord.setForeground(Color.decode("#073cb7"));

        JLabel payDebtorTopbarLine = new JLabel();
        payDebtorTopbarLine.setOpaque(true);
        payDebtorTopbarLine.setBackground(Color.decode("#DBDCDE")); // Set the line color
        payDebtorTopbarLine.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        JPanel payDebtorBottombar = new JPanel(null);
        Border payDebBottomBorder = new MatteBorder(0, 2, 3, 2, Color.decode("#DBDCDE"));// ffffff or DBDCDE or 8CC7FC
                                                                                         // or #ecf6fe //TLBR
        payDebtorBottombar.setBorder(payDebBottomBorder);

        JLabel pdLoanerName = new JLabel("Name : " + name); // +.getText();
        Font customFont18 = new Font("Century Gothic", Font.BOLD, 15);
        pdLoanerName.setFont(customFont18);
        pdLoanerName.setForeground(Color.decode("#4d4d4d"));

        JLabel pdTLlabel = new JLabel("Balance :");
        JTextField pdTLtf = new JTextField(String.valueOf(lefttobecollected));

        JLabel pdMPlabel = new JLabel("Min Amount :");
        JTextField pdMPtf = new JTextField(String.valueOf(mintobepaid));

        JLabel pdGMlabel = new JLabel("Given  Amount :");
        JTextField pdGMtf = new JTextField();
        pdGMtf.addKeyListener(new NoLetter());

        // style
        pdTLlabel.setFont(customFont16);
        pdMPlabel.setFont(customFont16);
        pdGMlabel.setFont(customFont16);

        pdTLlabel.setForeground(Color.decode("#4d4d4d"));
        pdMPlabel.setForeground(Color.decode("#4d4d4d"));
        pdGMlabel.setForeground(Color.decode("#4d4d4d"));

        pdTLtf.setFont(customFont17);
        pdTLtf.setForeground(Color.decode("#4d4d4d"));
        pdTLtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        pdMPtf.setFont(customFont17);
        pdMPtf.setForeground(Color.decode("#4d4d4d"));
        pdMPtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        pdGMtf.setFont(customFont17);
        pdGMtf.setForeground(Color.decode("#4d4d4d"));
        pdGMtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); // #ffffff or #DBDCDE

        pdTLtf.setEditable(false);
        pdTLtf.setBackground(Color.decode("#FBFBFC"));

        pdMPtf.setEditable(false);
        pdMPtf.setBackground(Color.decode("#FBFBFC"));

        // end style

        JButton pdSaveBtn = new JButton("Save");
        JButton pdCancelBtn = new JButton("Cancel");

        pdSaveBtn.setFont(customFont14);
        pdCancelBtn.setFont(customFont14);

        pdSaveBtn.setForeground(Color.decode("#ffffff"));
        pdCancelBtn.setForeground(Color.decode("#ffffff"));

        pdSaveBtn.setBackground(Color.decode("#57F287"));
        pdCancelBtn.setBackground(Color.decode("#FF1A1A"));

        pdSaveBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); // #ffffff or #DBDCDE
        pdCancelBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); // #ffffff or #DBDCDE
        pdSaveBtn.setFocusPainted(false);
        pdCancelBtn.setFocusPainted(false);

        // Mouse Icon Hover
        pdSaveBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                pdSaveBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pdSaveBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                pdSaveBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                float amount = Float.parseFloat(pdGMtf.getText());
                if (amount > mintobepaid) {
                    float change = lefttobecollected - amount;
                    amount = (change <= 0) ? lefttobecollected : amount;
                    updateTheData(ID, amount);

                    AdditionalFrames addons = new AdditionalFrames();
                    addons.messages("Login", "\\Check-65.png", "Updated Successfully");
                    addons.okLoginlc.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            addons.FrameNotif.setVisible(false);

                            Sidebar dashB = Sidebar.getInstance();
                            dashB.sidebar();

                            addons.FrameNotif.setVisible(false);
                            addons.FrameNotif.dispose();
                        }
                    });
                } else {
                    AdditionalFrames addons = new AdditionalFrames();
                    addons.messages("Login", "\\Ekis-65.png", "Wrong Amount");
                    addons.okLoginlc.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            addons.FrameNotif.setVisible(false);
                            addons.FrameNotif.dispose();

                        }
                    });
                }

                payDebtorFrame.setVisible(false);
                payDebtorFrame.dispose();

            }
        });

        // Mouse Icon Hover
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

        // SETBOUNDS
        payDebtorTopbar.setBounds(0, 0, 400, 60);
        payDebtorTopbar.setBackground(Color.decode("#007dfe")); // #007dfe

        payDebtorLogoTopbar.setBounds(15, 5, 150, 50);

        payDebtorWord.setBounds(20, 55, 200, 50);

        payDebtorTopbarLine.setBounds(0, 60, 400, 2);

        payDebtorBottombar.setBounds(0, 61, 400, 385);
        payDebtorBottombar.setBackground(Color.decode("#ffffff")); // #007dfe

        pdLoanerName.setBounds(35, 100, 230, 50);

        pdTLlabel.setBounds(35, 150, 150, 50);
        pdMPlabel.setBounds(35, 200, 150, 50);
        pdGMlabel.setBounds(35, 250, 150, 50);

        pdTLtf.setBounds(165, 156, 210, 35);
        pdMPtf.setBounds(165, 206, 210, 35);
        pdGMtf.setBounds(165, 256, 210, 35);

        pdSaveBtn.setBounds(165, 370, 100, 40);
        pdCancelBtn.setBounds(275, 370, 100, 40);

        // ADD TO FRAME
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

        payDebtorFrame.add(pdSaveBtn);
        payDebtorFrame.add(pdCancelBtn);

        payDebtorFrame.add(payDebtorBottombar);

    }

    public static HashMap<String, String> loadTheData(int Borrowerid) {
        String sql = "SELECT c.*,b.*, b.TotalCollection - COALESCE(SUM(a.AmountPaid), 0) AS totalleft, ROUND((b.TotalCollection / b.Period), 2)  as Interests FROM loans b left JOIN payments a ON b.LoanID = a.LoanID LEFT JOIN borrowers c ON b.BorrowerID = c.BorrowerID WHERE b.LoanID = ? ;";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        HashMap<String, String> mixedMap = new HashMap<>();

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Borrowerid);

            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object valueObject = resultSet.getObject(columnName);

                    // Check if the value is null before converting it to string
                    String value = (valueObject != null) ? valueObject.toString() : null;

                    mixedMap.put(columnName, value);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // Close the ResultSet and PreparedStatement in a finally block
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return mixedMap;
    }

    public void updateTheData(int loanID, float amountPaid) {
        String sqlAddtoBorrower = "INSERT INTO `payments` (`LoanID`, `PaymentDate`, `AmountPaid`) VALUES (?, CURRENT_DATE, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(sqlAddtoBorrower);
            statement.setInt(1, loanID); // assuming text is your search text
            statement.setFloat(2, amountPaid); // assuming text is your search text

            // Execute the update
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
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
