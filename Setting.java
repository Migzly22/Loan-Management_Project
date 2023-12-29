import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;


public class Setting implements RootValue{


    JPanel settingsRight = new JPanel(null);

    public void settingspanel() {


        Border settNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        settingsRight.setBorder(settNoLefttBorder);


        JLabel settingsword = new JLabel("Settings");
        settingsword.setFont(customFont8);
       	settingsword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight3 = new JLabel();
        lineRight3.setOpaque(true);
        lineRight3.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight3.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

		String [] [] rowSettings = {{"Name", "Users Names"},
							 {"Username", "Users Usernames"},
							 {"Password", "Users Pasword"}};

		String [] colSettings = {"  ", "  "};

		DefaultTableModel dtmSettings = new DefaultTableModel(rowSettings,colSettings);
		JTable tb1Settings = new JTable(dtmSettings);

		JScrollPane spSettings = new JScrollPane(tb1Settings);


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

//ADD ACTION
		SettingAdditional settingsFrame = new SettingAdditional();
		changebtn1Settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				settingsFrame.ChangeAdminname();
			}
		});
		changebtn2Settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				settingsFrame.ChangeUsername();
			}
		});
		changebtn3Settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				settingsFrame.ChangePassword();
			}
		});

//SETBOUNDS
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


//ADD TO FRAME
		settingsRight.add(settingsword);
		settingsRight.add(lineRight3);
		settingsRight.add(spSettings);
		settingsRight.add(changebtn1Settings);
		settingsRight.add(changebtn2Settings);
		settingsRight.add(changebtn3Settings);


    }
}
