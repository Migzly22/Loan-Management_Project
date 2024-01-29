import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loan implements RootValue {

    public JPanel leftSidebar = new JPanel(null);
    public JPanel debtorRight = new JPanel(null);

    DefaultTableModel dtmDebtor = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            // Make all cells non-editable
            return false;
        }
    };
    JTable tb1Debtor = new JTable(dtmDebtor);

    public void loanlist() {

        Border debNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));// ffffff or DBDCDE or 8CC7FC or
                                                                                       // #ecf6fe //TLBR
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
        searchtfDebtor.setBorder(new LineBorder(Color.decode("#4d4d4d"), 1)); // #ffffff or #DBDCDE

        JButton searchbtnDebtor = new JButton("Search");
        JButton addbtnDebtor = new JButton("Add");
        JButton resetbtnDebtor = new JButton("Reset");

        Font customFont13 = new Font("Century Gothic", Font.BOLD, 14);
        searchbtnDebtor.setFont(customFont13);
        addbtnDebtor.setFont(customFont13);
        resetbtnDebtor.setFont(customFont13);

        searchbtnDebtor.setForeground(Color.decode("#ffffff"));
        addbtnDebtor.setForeground(Color.decode("#ffffff"));
        resetbtnDebtor.setForeground(Color.decode("#ffffff"));

        searchbtnDebtor.setBackground(Color.decode("#70baf8"));
        addbtnDebtor.setBackground(Color.decode("#57F287"));
        resetbtnDebtor.setBackground(Color.decode("#70baf8"));

        searchbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
        addbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2)); //#ffffff or #DBDCDE
        resetbtnDebtor.setBorder(new LineBorder(Color.decode("#ffffff"), 2)); //#ffffff or #DBDCDE
        searchbtnDebtor.setFocusPainted(false);
        addbtnDebtor.setFocusPainted(false);
        resetbtnDebtor.setFocusPainted(false);
        JScrollPane spDebtor = new JScrollPane(tb1Debtor);
        // end Table


        Font customFont14 = new Font("Century Gothic", Font.BOLD, 16);
     

        // ACTION
        searchbtnDebtor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID "
                        +
                        "WHERE b.FirstName LIKE ? OR b.LastName LIKE ? OR b.Middlename LIKE ? OR b.Email LIKE ? OR a.LoanAmount LIKE ? OR a.Status LIKE ? "
                        +
                        "ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName";
                String text = searchtfDebtor.getText();

                try {
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, "%" + text + "%"); // assuming text is your search text
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
        // Mouse Icon Hover
        tb1Debtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                tb1Debtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                tb1Debtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(MouseEvent e) {
                tb1Debtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });

        tb1Debtor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tb1Debtor.getSelectedRow();
                    int selectedColumn = tb1Debtor.getSelectedColumn();

                    if (selectedColumn == 6) {
                        Sidebar sideLine = Sidebar.getInstance();

                        int id = Integer.parseInt(dtmDebtor.getValueAt(selectedRow, 0).toString());
                        sideLine.addLoanToFrame2(id);
                    }
                }
            }
        });

        //

        addbtnDebtor.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                addbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                addbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                AddLoan newloan = new AddLoan();
                newloan.ADDLOANER();

            }
        });
        resetbtnDebtor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID " +
                "ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName";
                
                searchtfDebtor.setText("");

                try {
                    PreparedStatement statement = conn.prepareStatement(sql);
                    loadTheData(statement);
                } catch (SQLException sqlexe) {
                    sqlexe.printStackTrace();
                }
            }
        });
        // SETBOUNDS
        debtorRight.setBounds(200, 0, 700, 550); // 600
        debtorRight.setBackground(Color.decode("#F2F3F5"));

        debtorword.setBounds(15, 7, 200, 50);
        lineRight2.setBounds(0, 65, 700, 2);

        searchtfDebtor.setBounds(110, 100, 230, 40);
        searchbtnDebtor.setBounds(350, 100, 90, 37);
        resetbtnDebtor.setBounds(450,100,90,37); 
        addbtnDebtor.setBounds(550, 100, 90, 37);


        spDebtor.setBounds(20, 170, 645, 348);


        // ADD TO FRAME

        debtorRight.add(debtorword);
        debtorRight.add(lineRight2);
        debtorRight.add(searchtfDebtor);
        debtorRight.add(searchbtnDebtor);
        debtorRight.add(addbtnDebtor);
        debtorRight.add(resetbtnDebtor);

        
        debtorRight.add(spDebtor);

        String sql = "SELECT a.LoanID, CONCAT(b.LastName, ', ', b.FirstName) AS `Borrower's Name`, b.Email, b.Classification, a.LoanAmount AS Amount, a.Status FROM loans a LEFT JOIN borrowers b ON a.BorrowerID = b.BorrowerID ORDER BY CASE WHEN a.Status = 'Active' THEN 1 WHEN a.Status = 'Closed' THEN 2 ELSE 3 END, b.LastName;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            loadTheData(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void loadTheData(PreparedStatement statement) {
        try {
            ResultSet resultSet = statement.executeQuery();

            // Clear existing data from table1
            dtmDebtor.setRowCount(0);
            dtmDebtor.setColumnCount(0);

            // Get the number of columns in the result set
            int columnCount = resultSet.getMetaData().getColumnCount();

            String[] colLoan = { "ID", " Name", "Email", "Classification", "Loan", "Status", "Action" };
            // Set the column names using the colLoan array
            dtmDebtor.setColumnIdentifiers(colLoan);

            // Add data rows to the table model
            while (resultSet.next()) {
                Object[] row = new Object[columnCount + 1];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                row[columnCount] = "View";
                dtmDebtor.addRow(row);
            }
            // Apply the custom renderer to the last column ("Action")
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            // Get the column model from the JTable
            TableColumnModel columnModel = tb1Debtor.getColumnModel();

            // Apply the custom renderer to the last column ("Action")
            columnModel.getColumn(columnCount).setCellRenderer(centerRenderer);
            columnModel.getColumn(0).setCellRenderer(centerRenderer);
            for (int i = 0; i < colLoan.length; i++) {
                TableColumn column = tb1Debtor.getColumnModel().getColumn(i);
                column.setCellEditor(null); // Disable cell editor
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
