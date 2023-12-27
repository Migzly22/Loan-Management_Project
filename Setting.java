import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Setting implements RootValue{

    static Sidebar leftSidebar2 = new Sidebar();


    public static void main(String[] args) {
        leftSidebar2.sidebar();//run the sidebar code

        JFrame frame2 = new JFrame("Settings");
        //Settings
        JPanel settingsRight = new JPanel(null);
        Border settNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        settingsRight.setBorder(settNoLefttBorder);


        JLabel settingsword = new JLabel("Settings");
        settingsword.setFont(customFont8);
       	settingsword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight3 = new JLabel();
        lineRight3.setOpaque(true);
        lineRight3.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight3.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

        //Table Debtor
		String [] [] rowSettings = {{"Name", "Users Names"},
							 {"Username", "Users Usernames"},
							 {"Password", "Users Pasword"}};

		String [] colSettings = {"  ", "  "};

		DefaultTableModel dtmSettings = new DefaultTableModel(rowSettings,colSettings);
		JTable tb1Settings = new JTable(dtmSettings);

		JScrollPane spSettings = new JScrollPane(tb1Settings);

		//end Table

		JButton changebtn1Settings = new JButton("Change");
		JButton changebtn2Settings = new JButton("Change");
		JButton changebtn3Settings = new JButton("Change");

		changebtn1Settings.setFont(customFont13);
		changebtn2Settings.setFont(customFont13);
		changebtn3Settings.setFont(customFont13);

		changebtn1Settings.setForeground(Color.decode(whiteColor));
		changebtn2Settings.setForeground(Color.decode(whiteColor));
		changebtn3Settings.setForeground(Color.decode(whiteColor));

		changebtn1Settings.setBackground(Color.decode("#57F287"));
		changebtn2Settings.setBackground(Color.decode("#57F287"));
		changebtn3Settings.setBackground(Color.decode("#57F287"));

		changebtn1Settings.setBorder(new LineBorder(Color.decode(whiteColor), 2));//#ffffff or #DBDCDE
		changebtn2Settings.setBorder(new LineBorder(Color.decode(whiteColor), 2));//#ffffff or #DBDCDE
		changebtn3Settings.setBorder(new LineBorder(Color.decode(whiteColor), 2));//#ffffff or #DBDCDE

		changebtn1Settings.setFocusPainted(false);
		changebtn2Settings.setFocusPainted(false);
		changebtn3Settings.setFocusPainted(false);



        //Settings content
        settingsRight.setBounds(200, 0, 700, 550);//600
        settingsRight.setBackground(Color.decode("#F2F3F5"));

        settingsword.setBounds(15, 7, 200, 50);
        lineRight3.setBounds(0, 65, 700, 2);
        //

        //Table Settings
        spSettings.setBounds(20,100,450,100);
        //

        //Change Buttons
        changebtn1Settings.setBounds(500,100,90,37);
        changebtn2Settings.setBounds(500,140,90,37);
        changebtn3Settings.setBounds(500,180,90,37);
        //End Change Buttons



		settingsRight.add(settingsword);
		settingsRight.add(lineRight3);
		settingsRight.add(spSettings);
		settingsRight.add(changebtn1Settings);
		settingsRight.add(changebtn2Settings);
		settingsRight.add(changebtn3Settings);




        frame2.setLayout(null);
        frame2.setUndecorated(false);
        frame2.setBounds(0, 0, 900, 550); //600
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);//false
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.add(leftSidebar2.leftSidebar);//add sidebar
        frame2.add(settingsRight);

    }
}
