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

public class Loan implements RootValue{

    public JPanel leftSidebar = new JPanel(null);
    JPanel debtorRight = new JPanel(null);

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

		//Table Debtor
		String [] [] rowDebtor = {{"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""},
							 {"", "", "", "", "", "", ""}};

		String [] colDebtor = {"ID", "Name", "Date", "Loan", "Interest", "Total", "Status"};

		DefaultTableModel dtmDebtor = new DefaultTableModel(rowDebtor,colDebtor);
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

        //Mouse Icon Hover
        viewbtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewbtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //
        //Mouse Icon Hover
        paybtnDebtor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                paybtnDebtor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        JFrame frame3 = new JFrame("Add Debtor");
        JPanel addDebTop = new JPanel(null);

        JLabel logoTopLeft = new JLabel();
        ImageIcon icon3 = new ImageIcon("C:\\Users\\TYLER JAKE\\Desktop\\JAVA CODES\\Loan-Management_Project\\GiPit_icons\\gplg.png");
        logoTopLeft.setIcon(icon3);

        //End Add Button Frame

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


    }
}
