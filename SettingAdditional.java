import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.*;

public class SettingAdditional implements RootValue{

    Entity entity = Entity.getInstance();
    JButton cbtn1SubmitBtn = new JButton("Submit");
    JButton cbtn2SubmitBtn = new JButton("Submit");
    JButton cbtn3SubmitBtn = new JButton("Submit");
    Sidebar sideLine = Sidebar.getInstance();

    public void ChangeAdminname(){
        //Settings ChangeBtn1 Enter Admin Name: Frame
        JFrame cbtn1Framesett = new JFrame("Enter Admin Name");
        JPanel cbtn1Panelsett = new JPanel(null);
        Border cbtn1Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn1Panelsett.setBorder(cbtn1Bordersett);

        JLabel enterAdminNamelbl = new JLabel("Enter Admin Name :");
        JTextField enterAdminNametf = new JTextField("");

        enterAdminNamelbl.setFont(customFont3);
        enterAdminNamelbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterAdminNametf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterAdminNametf.setFont(customFont4);
        enterAdminNametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

 

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn1SubmitBtn.setFont(customFont6);

        cbtn1SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn1SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn1SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn1SubmitBtn.setFocusPainted(false);

//Mouse Icon Hover
        cbtn1SubmitBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cbtn1SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                cbtn1SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            public void mouseClicked(MouseEvent e) {
                String newAdminName = enterAdminNametf.getText();
                entity.setAdminNAME(newAdminName);
                String sql = "UPDATE usercredentials SET Name = ? WHERE UserID = ? ;";
                AdditionalFrames addons2 = new AdditionalFrames();
                if(newAdminName.length() > 0){
                    try {
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setString(1, newAdminName);  // assuming text is your search text
                        statement.setInt(2, entity.getUSERID());
                        updateTheData(statement);



                        sideLine.reloadSettings1(newAdminName);

                        addons2.messages("Success", "\\Check-65.png", "Updated Successfully");
                        addons2.okLoginlc.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                cbtn1Framesett.setVisible(false);
                                cbtn1Framesett.dispose();

                                addons2.FrameNotif.setVisible(false);
                                addons2.FrameNotif.dispose();
                            }
                        });

                    } catch (SQLException sqlexe) {
                        sqlexe.printStackTrace();
                    }
                    cbtn1Framesett.setVisible(false);
                }
            }
        });


//SETBOUNDS
        cbtn1Panelsett.setBounds(0, 0, 350, 200);
		cbtn1Panelsett.setBackground(Color.decode("#ffffff"));

		enterAdminNamelbl.setBounds(107, 30, 150, 30);
		enterAdminNametf.setBounds(65, 70, 220, 35);
		cbtn1SubmitBtn.setBounds(130, 130, 90, 37);       
//ADD TO FRAME
        cbtn1Framesett.setLayout(null);
        cbtn1Framesett.setUndecorated(false);
        cbtn1Framesett.setBounds(0, 0, 365, 239);
        cbtn1Framesett.setLocationRelativeTo(null);
        cbtn1Framesett.setVisible(true);//false

        cbtn1Panelsett.add(enterAdminNamelbl);
        cbtn1Panelsett.add(enterAdminNametf);
        cbtn1Panelsett.add(cbtn1SubmitBtn);

        cbtn1Framesett.add(cbtn1Panelsett);
    }
    public void ChangeUsername(){
        JFrame cbtn2Framesett = new JFrame("Enter new Username: ");
        JPanel cbtn2Panelsett = new JPanel(null);
        Border cbtn2Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn2Panelsett.setBorder(cbtn2Bordersett);

        JLabel enterNewUsernamelbl = new JLabel("Enter new Username :");
        JTextField enterNewUsernametf = new JTextField("");

        enterNewUsernamelbl.setFont(customFont3);
        enterNewUsernamelbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterNewUsernametf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterNewUsernametf.setFont(customFont4);
        enterNewUsernametf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

 

        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn2SubmitBtn.setFont(customFont6);

        cbtn2SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn2SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn2SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn2SubmitBtn.setFocusPainted(false);

        //Mouse Icon Hover
        cbtn2SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn2SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn2SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(MouseEvent e) {
                String newUsername = enterNewUsernametf.getText();
                String sql = "UPDATE usercredentials SET Username = ? WHERE UserID = ? ;";
                AdditionalFrames addons2 = new AdditionalFrames();
                if(newUsername.length() > 0){
                    try {
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setString(1, newUsername);  // assuming text is your search text
                        statement.setInt(2, entity.getUSERID());
                        updateTheData(statement);

                        sideLine.reloadSettings2(newUsername);

                        addons2.messages("Success", "\\Check-65.png", "Updated Successfully");
                        addons2.okLoginlc.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                cbtn2Framesett.setVisible(false);
                                cbtn2Framesett.dispose();

                                addons2.FrameNotif.setVisible(false);
                                addons2.FrameNotif.dispose();
                            }
                        });
                    } catch (SQLException sqlexe) {
                        sqlexe.printStackTrace();
                    }
                    cbtn2Framesett.setVisible(false);
                }
            }
        });
//SETBOUNDS
		cbtn2Panelsett.setBounds(0, 0, 350, 200);
		cbtn2Panelsett.setBackground(Color.decode("#ffffff"));

		enterNewUsernamelbl.setBounds(95, 30, 160, 30);
		enterNewUsernametf.setBounds(65, 70, 220, 35);
		cbtn2SubmitBtn.setBounds(130, 130, 90, 37);

//ADD TO FRAME
        cbtn2Framesett.setLayout(null);
        cbtn2Framesett.setUndecorated(false);
        cbtn2Framesett.setBounds(0, 0, 365, 239);
        cbtn2Framesett.setLocationRelativeTo(null);
        cbtn2Framesett.setVisible(true);//false

        cbtn2Panelsett.add(enterNewUsernamelbl);
        cbtn2Panelsett.add(enterNewUsernametf);
        cbtn2Panelsett.add(cbtn2SubmitBtn);

        cbtn2Framesett.add(cbtn2Panelsett);
    }
    public void ChangePassword(){
        JFrame cbtn3Framesett = new JFrame("Enter new Password: ");
        JPanel cbtn3Panelsett = new JPanel(null);
        Border cbtn3Bordersett = new MatteBorder(3, 3, 3, 3, Color.decode("#DBDCDE"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        cbtn3Panelsett.setBorder(cbtn3Bordersett);

        JLabel enterNewPasswordlbl = new JLabel("Enter new Password :");
        JPasswordField enterNewPasswordtf = new JPasswordField("");

        JLabel confirmNewPasswordlbl = new JLabel("Confirm new Password :");
        JPasswordField confirmNewPasswordtf = new JPasswordField("");

        enterNewPasswordlbl.setFont(customFont3);
        enterNewPasswordlbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        confirmNewPasswordlbl.setFont(customFont3);
        confirmNewPasswordlbl.setForeground(Color.decode("#4d4d4d")); //#4d4d4d or #808080

        enterNewPasswordtf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        enterNewPasswordtf.setFont(customFont4);
        enterNewPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        confirmNewPasswordtf.setForeground(Color.decode("#4d4d4d"));
        //Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
        confirmNewPasswordtf.setFont(customFont4);
        confirmNewPasswordtf.setBorder(new LineBorder(Color.decode("#919293"), 1)); //#ffffff or #DBDCDE

        JCheckBox showPassENP = new JCheckBox("Show Password");
        //Font customFont5 = new Font("Century Gothic", Font.PLAIN, 13);
        showPassENP.setFont(customFont5);
        showPassENP.setForeground(Color.decode("#4d4d4d"));
        showPassENP.setFocusPainted(false);


        //Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
        cbtn3SubmitBtn.setFont(customFont6);

        cbtn3SubmitBtn.setForeground(Color.decode("#ffffff"));
        cbtn3SubmitBtn.setBackground(Color.decode("#007dfe"));
        cbtn3SubmitBtn.setBorder(new LineBorder(Color.decode("#DBDCDE"), 2)); //#ffffff or #073cb7 or #DBDCDE
        cbtn3SubmitBtn.setFocusPainted(false);

         //Mouse Icon Hover
        showPassENP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showPassENP.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                showPassENP.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            
        });
         showPassENP.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    enterNewPasswordtf.setEchoChar((char) 0);
                    confirmNewPasswordtf.setEchoChar((char) 0);
                } else {
                    enterNewPasswordtf.setEchoChar('\u2022');
                    confirmNewPasswordtf.setEchoChar('\u2022');
                }
            }
        });

        //Mouse Icon Hover
        cbtn3SubmitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbtn3SubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cbtn3SubmitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            public void mouseClicked(MouseEvent e) {
                String newPassword = new String(enterNewPasswordtf.getPassword());
                String confirmPassword = new String(confirmNewPasswordtf.getPassword());//confirm password
                String sql = "UPDATE usercredentials SET Password = ? WHERE UserID = ? ;";
                AdditionalFrames addons2 = new AdditionalFrames();
                if(newPassword.length() > 0){
                    try {
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setString(1, newPassword);  // assuming text is your search text
                        statement.setInt(2, entity.getUSERID());
                        updateTheData(statement);

                        sideLine.reloadSettings3(newPassword);


                        addons2.messages("Success", "\\Check-65.png", "Updated Successfully");
                        addons2.okLoginlc.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                addons2.FrameNotif.setVisible(false);
                                addons2.FrameNotif.dispose();
                            }
                        });
                    } catch (SQLException sqlexe) {
                        sqlexe.printStackTrace();
                    }
                    cbtn3Framesett.setVisible(false);
                    cbtn3Framesett.dispose();
                }
            }
        });
        //

        //Mouse Icon Hover
        /*
        cbtn3SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                String newPassword = new String(enterNewPasswordtf.getPassword());
                String confirmPassword = new String(confirmNewPasswordtf.getPassword());//confirm password

                String sql = "UPDATE usercredentials SET Password = ? WHERE UserID = ? ;";

                if(newPassword.equals(confirmPassword)){
                    execution(sql,newPassword);
                    nofifs(true, "Updated Successfully");
                }else{
                    nofifs(false, "Password doesnt match");
                } 
            }
        });
        */
//SETBOUNDS
        cbtn3Panelsett.setBounds(0, 0, 430, 250);
        cbtn3Panelsett.setBackground(Color.decode("#ffffff"));

        enterNewPasswordlbl.setBounds(15, 50, 150, 30);
        enterNewPasswordtf.setBounds(200, 50, 210, 35);

        confirmNewPasswordlbl.setBounds(15,110,190,30);
        confirmNewPasswordtf.setBounds(200,110,210,35);

        showPassENP.setBounds(200, 150, 125, 20);

        cbtn3SubmitBtn.setBounds(160, 190, 90, 37);
//ADD TO FRAME        
       //Settings ChangeBtn3 Enter new Password: Frame
       cbtn3Framesett.setLayout(null);
       cbtn3Framesett.setUndecorated(false);
       cbtn3Framesett.setBounds(0, 0, 445, 287);
       cbtn3Framesett.setLocationRelativeTo(null);
       cbtn3Framesett.setVisible(true);//false

       cbtn3Panelsett.add(enterNewPasswordlbl);
       cbtn3Panelsett.add(enterNewPasswordtf);

       cbtn3Panelsett.add(confirmNewPasswordlbl);
       cbtn3Panelsett.add(confirmNewPasswordtf);

       cbtn3Panelsett.add(showPassENP);

       cbtn3Panelsett.add(cbtn3SubmitBtn);

       cbtn3Framesett.add(cbtn3Panelsett);
    }

    public void updateTheData(PreparedStatement statement){
        try {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public void execution(String sql, String newPassword){
    try {
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, newPassword);  // assuming text is your search text
        statement.setInt(2, entity.getUSERID());
        updateTheData(statement);
    } catch (SQLException sqlexe) {
        sqlexe.printStackTrace();
    }
}


}
