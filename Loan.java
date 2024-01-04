import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loan implements RootValue{

    public JPanel leftSidebar = new JPanel(null);
    public JPanel debtorRight = new JPanel(null);

	DefaultTableModel dtmDebtor = new DefaultTableModel();

    public void loanlist() {
        
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

//ACTION
        searchbtnDebtor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID " +
                "WHERE b.FirstName LIKE ? OR b.LastName LIKE ? OR b.Middlename LIKE ? OR b.Email LIKE ? OR a.LoanAmount LIKE ? OR a.Status LIKE ? " +
                "ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName";
                String text = searchtfDebtor.getText();
                
                try {
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, "%" + text + "%");  // assuming text is your search text
                    statement.setString(2, "%" + text + "%");
                    statement.setString(3, "%" + text + "%");
                    statement.setString(4, "%" + text + "%");
                    statement.setString(5, "%" + text + "%");
                    statement.setString(6, "%" + text + "%");
                    loadTheData(statement);
                } catch (SQLException sqlexe) {
                    sqlexe.printStackTrace();
                }
            }
        });
        //Mouse Icon Hover
        viewbtnDebtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(MouseEvent e) {
                /* *
                ViewLoan viewLoan = new ViewLoan();
                int selectedRow = tb1Debtor.getSelectedRow();
                if (selectedRow!= -1){
                    int id = Integer.parseInt(dtmDebtor.getValueAt(selectedRow, 0).toString());
                    viewLoan.viewLoanFrames(id);
                }
                */
                Sidebar sideLine = Sidebar.getInstance();
                sideLine.addLoanToFrame2();
            }
        });
        //
        //Mouse Icon Hover
        paybtnDebtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {

                Payment viewFrame = new Payment();

                int selectedRow = tb1Debtor.getSelectedRow();
                if (selectedRow!= -1){
                    int id = Integer.parseInt(dtmDebtor.getValueAt(selectedRow, 0).toString());
                    viewFrame.paymentFrame(id);
                }
            }
        });

        addbtnDebtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                AddLoan newloan = new AddLoan();
                newloan.ADDLOANER();

            }
        });

//SETBOUNDS
        debtorRight.setBounds(200, 0, 700, 550); //600
        debtorRight.setBackground(Color.decode("#F2F3F5"));

        debtorword.setBounds(15, 7, 200, 50);
        lineRight2.setBounds(0, 65, 700, 2);

        searchtfDebtor.setBounds(200, 100, 230, 40);
        searchbtnDebtor.setBounds(440, 100, 90, 37);
        addbtnDebtor.setBounds(550, 100, 90, 37);

        spDebtor.setBounds(20,170,645,130);

        viewbtnDebtor.setBounds(200, 330, 100, 40);
        paybtnDebtor.setBounds(350, 330, 100, 40);


//ADD TO FRAME


        debtorRight.add(debtorword);
		debtorRight.add(lineRight2);
		debtorRight.add(searchtfDebtor);
		debtorRight.add(searchbtnDebtor);
		debtorRight.add(addbtnDebtor);
		debtorRight.add(spDebtor);
		debtorRight.add(viewbtnDebtor);
		debtorRight.add(paybtnDebtor);


        String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            loadTheData(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public void loadTheData(PreparedStatement statement){
        try {
            ResultSet resultSet = statement.executeQuery();

            // Clear existing data from table1
            dtmDebtor.setRowCount(0);
            dtmDebtor.setColumnCount(0);

            // Get the number of columns in the result set
            int columnCount = resultSet.getMetaData().getColumnCount();

            String [] colLoan = {"ID", " Name", "Email","Classification","Loan","Status"};
            // Set the column names using the colLoan array
            dtmDebtor.setColumnIdentifiers(colLoan);

            // Add data rows to the table model
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                dtmDebtor.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
