import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.*;


public class Setting implements RootValue{


    JPanel settingsRight = new JPanel(null);

	Entity entity = Entity.getInstance();
    public int USERID = entity.getUSERID();


	JTextField settNicknametf = new JTextField();
	JTextField settUsernametf = new JTextField();


	public void callUser (){
		 String sqltable = "SELECT * FROM usercredentials WHERE UserID = ?;";
       
        try {
            PreparedStatement statement = conn.prepareStatement(sqltable);
			statement.setInt(1, USERID);  // assuming text is your search text
            ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
                do {
                    settNicknametf.setText(resultSet.getString("name"));
                    settUsernametf.setText(resultSet.getString("Username"));
                } while (resultSet.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

    public void settingspanel() {
		callUser();

        Border settNoLefttBorder = new MatteBorder(2, 0, 3, 2, Color.decode("#DBDCDE"));//ffffff or DBDCDE or 8CC7FC or #ecf6fe //TLBR
        settingsRight.setBorder(settNoLefttBorder);

        JLabel settingsword = new JLabel("Settings");
        settingsword.setFont(customFont8);
       	settingsword.setForeground(Color.decode("#073cb7"));

        JLabel lineRight3 = new JLabel();
        lineRight3.setOpaque(true);
        lineRight3.setBackground(Color.decode("#DBDCDE")); // Set the line color
        lineRight3.setPreferredSize(new Dimension(2, Integer.MAX_VALUE));

		JLabel settChangeUserInformation = new JLabel("Change User Information");

		JLabel settNicknameLabel = new JLabel("Nickname :");
		JLabel settUsernameLabel = new JLabel("Username :");
		JLabel settPasswordLabel = new JLabel("Password :");

		JTextField settPasswordtf = new JPasswordField("01234567890");

		settChangeUserInformation.setFont(customFont9);
		settNicknameLabel.setFont(customFont16);
		settUsernameLabel.setFont(customFont16);
		settPasswordLabel.setFont(customFont16);

		settChangeUserInformation.setForeground(Color.decode("#4d4d4d"));
		settNicknameLabel.setForeground(Color.decode("#4d4d4d"));
		settUsernameLabel.setForeground(Color.decode("#4d4d4d"));
		settPasswordLabel.setForeground(Color.decode("#4d4d4d"));

		settNicknametf.setFont(customFont17);
		settNicknametf.setForeground(Color.decode("#4d4d4d"));
		settNicknametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		settUsernametf.setFont(customFont17);
		settUsernametf.setForeground(Color.decode("#4d4d4d"));
		settUsernametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

		settPasswordtf.setFont(customFont17);
		settPasswordtf.setForeground(Color.decode("#4d4d4d"));
		settPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE



		//END JLABAEL AND TEXFIELD

		JButton changebtn1Settings = new JButton("Change");
		JButton changebtn2Settings = new JButton("Change");
		JButton changebtn3Settings = new JButton("Change");

		changebtn1Settings.setFont(customFont13);
		changebtn2Settings.setFont(customFont13);
		changebtn3Settings.setFont(customFont13);

		changebtn1Settings.setForeground(Color.decode("#ffffff"));
		changebtn2Settings.setForeground(Color.decode("#ffffff"));
		changebtn3Settings.setForeground(Color.decode("#ffffff"));

		changebtn1Settings.setBackground(Color.decode("#57F287"));
		changebtn2Settings.setBackground(Color.decode("#57F287"));
		changebtn3Settings.setBackground(Color.decode("#57F287"));

		changebtn1Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
		changebtn2Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE
		changebtn3Settings.setBorder(new LineBorder(Color.decode("#ffffff"), 2));//#ffffff or #DBDCDE

		changebtn1Settings.setFocusPainted(false);
		changebtn2Settings.setFocusPainted(false);
		changebtn3Settings.setFocusPainted(false);

//ADD ACTION
		//Mouse Icon Hover
        changebtn1Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn1Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn1Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Mouse Icon Hover
        changebtn2Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn2Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn2Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //

        //Mouse Icon Hover
        changebtn3Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changebtn3Settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                changebtn3Settings.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        //



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
		settingsRight.setBounds(200, 0, 700, 550);//600
        settingsRight.setBackground(Color.decode("#F2F3F5"));

        settingsword.setBounds(15, 7, 200, 50);
		lineRight3.setBounds(0, 65, 700, 2);
        //

        //Label and Textfield
        settChangeUserInformation.setBounds(12,70,250,50);

		settNicknameLabel.setBounds(55,130,100,30);
		settUsernameLabel.setBounds(55,180,100,30);
		settPasswordLabel.setBounds(55,230,100,30);

		settNicknametf.setBounds(180,130,270,35);
		settUsernametf.setBounds(180,180,270,35);
		settPasswordtf.setBounds(180,230,270,35);

		//Change Buttons
		changebtn1Settings.setBounds(500,130,90,37);
		changebtn2Settings.setBounds(500,180,90,37);
		changebtn3Settings.setBounds(500,230,90,37);
		//End Change Buttons

//ADD TO FRAME
		settingsRight.add(settingsword);
		settingsRight.add(lineRight3);

		settingsRight.add(settNicknameLabel);
		settingsRight.add(settUsernameLabel);
		settingsRight.add(settPasswordLabel);

		settingsRight.add(settChangeUserInformation);
		settingsRight.add(settNicknametf);
		settingsRight.add(settUsernametf);
		settingsRight.add(settPasswordtf);

		settNicknametf.setEditable(false);
		settNicknametf.setBackground(Color.decode("#FBFBFC"));

		settUsernametf.setEditable(false);
		settUsernametf.setBackground(Color.decode("#FBFBFC"));

		settPasswordtf.setEditable(false);
		settPasswordtf.setBackground(Color.decode("#FBFBFC"));

		settingsRight.add(changebtn1Settings);
		settingsRight.add(changebtn2Settings);
		settingsRight.add(changebtn3Settings);



    }
}
