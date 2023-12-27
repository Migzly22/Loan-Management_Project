import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;


public class AdditionalFrames extends Entity implements RootValue{

    public JButton okLoginwuc = new JButton("OK"); //OK
    Dashboard dashboard = new Dashboard();
    


    public void Success(String title, String msg){
        AdditionalFrames entitycontainer = new AdditionalFrames();
        JFrame successFrameLogin = new JFrame(title);
        JPanel successPanelLogin = new JPanel(null);
        Border sucsBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        successPanelLogin.setBorder(sucsBorder);

        JLabel successLogoLogin = new JLabel();
        ImageIcon iconSuccessLogin = new ImageIcon(currentDirectory+"\\Check-65.png");
        successLogoLogin.setIcon(iconSuccessLogin);


        JLabel lc = new JLabel(msg); //Wrong User Credentials!
        
        lc.setFont(customFont0lbl);
        lc.setForeground(Color.decode(blackColor));

        JButton okLoginlc = new JButton("OK"); //OK

        okLoginlc.setFont(customFont19);

        okLoginlc.setForeground(Color.decode(whiteColor));
        okLoginlc.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okLoginlc.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okLoginlc.setFocusPainted(false);


         //Success Frame Login
        successPanelLogin.setBounds(0, 0, 350, 200);
        successPanelLogin.setBackground(Color.decode(whiteColor));
        successLogoLogin.setBounds(140, 15, 70, 70);

        lc.setBounds(105, 80, 200, 50);
        okLoginlc.setBounds(147, 130, 50, 40);

        okLoginlc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okLoginlc.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okLoginlc.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });


        okLoginlc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                successFrameLogin.setVisible(false);
                //entitycontainer.setPopUpValue(entitycontainer.isPopUpValue());
            }
        });


        successFrameLogin.setLayout(null);
        successFrameLogin.setUndecorated(true);
        successFrameLogin.setBounds(0, 0, 350, 200);
        successFrameLogin.setLocationRelativeTo(null);


		successPanelLogin.add(okLoginlc);
        successPanelLogin.add(successLogoLogin);
        successPanelLogin.add(lc);

        successFrameLogin.add(successPanelLogin);
        successFrameLogin.setVisible(true);//false
    }
    public void Error(){
        AdditionalFrames entitycontainer = new AdditionalFrames();
        //Error Frame Login
        JFrame errorFrameLogin = new JFrame("Wrong User Credentials!");
        JPanel errorPanelLogin = new JPanel(null);
        Border errBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        errorPanelLogin.setBorder(errBorder);

        JLabel errorLogoLogin = new JLabel();
        ImageIcon iconErrorLogin = new ImageIcon(currentDirectory+"\\Ekis-65.png");
        errorLogoLogin.setIcon(iconErrorLogin);


        JLabel wuc = new JLabel("Wrong User Credentials!"); //Wrong User Credentials!

        wuc.setFont(customFont0lbl);
        wuc.setForeground(Color.decode(blackColor));

        JButton okLoginwuc = new JButton("OK"); //OK
        okLoginwuc.setFont(customFont19);

        okLoginwuc.setForeground(Color.decode(whiteColor));
        okLoginwuc.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okLoginwuc.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okLoginwuc.setFocusPainted(false);

        //Mouse Icon Hover
        okLoginwuc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okLoginwuc.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okLoginwuc.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        okLoginwuc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                errorFrameLogin.setVisible(false);
                entitycontainer.setPopUpValue(entitycontainer.isPopUpValue());
            }
        });

        errorPanelLogin.setBounds(0, 0, 350, 200);
        errorPanelLogin.setBackground(Color.decode(whiteColor));
        errorLogoLogin.setBounds(140, 15, 70, 70);

        wuc.setBounds(85, 80, 200, 50);
        okLoginwuc.setBounds(147, 130, 50, 40);


        errorFrameLogin.setLayout(null);
        errorFrameLogin.setUndecorated(true);
        errorFrameLogin.setBounds(0, 0, 350, 200);
        errorFrameLogin.setLocationRelativeTo(null);
        errorFrameLogin.setVisible(true);//false

		errorPanelLogin.add(okLoginwuc);
        errorPanelLogin.add(errorLogoLogin);
        errorPanelLogin.add(wuc);

        errorFrameLogin.add(errorPanelLogin);
    }
    public void LoanSuccess(){

        JFrame savedsuccFrameAD = new JFrame("Saved Succesfully!");
        JPanel savedPanelAD = new JPanel(null);
        Border savedBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        savedPanelAD.setBorder(savedBorder);

        JLabel savedLogoAD = new JLabel();
        ImageIcon iconSavedAD = new ImageIcon(currentDirectory+"\\Check-65.png");
        savedLogoAD.setIcon(iconSavedAD);


        JLabel ss = new JLabel("Saved Succesfully!"); 
        ss.setFont(customFont0lbl);
        ss.setForeground(Color.decode(blackColor));

        JButton okAdss = new JButton("OK");
        okAdss.setFont(customFont19);

        okAdss.setForeground(Color.decode(whiteColor));
        okAdss.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okAdss.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdss.setFocusPainted(false);

        //Mouse Icon Hover
        okAdss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdss.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdss.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        okAdss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                savedsuccFrameAD.setVisible(false);
            }
        });

//SETBOUNDS
        savedPanelAD.setBounds(0, 0, 350, 200);
        savedPanelAD.setBackground(Color.decode(whiteColor));
        savedLogoAD.setBounds(140, 15, 70, 70);

        ss.setBounds(105, 80, 200, 50);
        okAdss.setBounds(147, 130, 50, 40);

//ADD TO FRAME
        savedsuccFrameAD.setLayout(null);
        savedsuccFrameAD.setUndecorated(true);
        savedsuccFrameAD.setBounds(0, 0, 350, 200);
        savedsuccFrameAD.setLocationRelativeTo(null);
        savedsuccFrameAD.setVisible(false);//false

		savedPanelAD.add(okAdss);
        savedPanelAD.add(savedLogoAD);
        savedPanelAD.add(ss);

        savedsuccFrameAD.add(savedPanelAD);
    }
    public void LoanError(){
        //Add Debtor Error Age Restriction Frame
        JFrame ageresFrameAD = new JFrame("Age Restriction!");
        JPanel ageresPanelAD = new JPanel(null);
        Border ageresBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        ageresPanelAD.setBorder(ageresBorder);

        JLabel ageresLogoAD = new JLabel();
        ImageIcon iconAgeresAD = new ImageIcon(currentDirectory+"\\Ekis-65.png");
        ageresLogoAD.setIcon(iconAgeresAD);


        JLabel ar = new JLabel("Age Restriction!"); //Age Restriction!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        ar.setFont(customFont0lbl);
        ar.setForeground(Color.decode(blackColor));

        JButton okAdar = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okAdar.setFont(customFont19);

        okAdar.setForeground(Color.decode(whiteColor));
        okAdar.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okAdar.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdar.setFocusPainted(false);

        //Mouse Icon Hover
        okAdar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdar.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        okAdar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ageresFrameAD.setVisible(false);
            }
        });

//SETBOUNDS
        ageresPanelAD.setBounds(0, 0, 350, 200);
        ageresPanelAD.setBackground(Color.decode(whiteColor));
        ageresLogoAD.setBounds(140, 15, 70, 70);

        ar.setBounds(110, 80, 200, 50);
        okAdar.setBounds(147, 130, 50, 40);

//ADD TO FRAME
        ageresFrameAD.setLayout(null);
        ageresFrameAD.setUndecorated(true);
        ageresFrameAD.setBounds(0, 0, 350, 200);
        ageresFrameAD.setLocationRelativeTo(null);
        ageresFrameAD.setVisible(true);//false

		ageresPanelAD.add(okAdar);
        ageresPanelAD.add(ageresLogoAD);
        ageresPanelAD.add(ar);

        ageresFrameAD.add(ageresPanelAD);
    }
    public void PaySuccess(){
        JFrame savesuccFramepay = new JFrame("Saved Succesfully!");
        JPanel savedPanelpay = new JPanel(null);
        Border savedBorderp = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));//ffffff or DBDCDE oe 8CC7FC or ecf6fe //TLBR
        savedPanelpay.setBorder(savedBorderp);

        JLabel savedLogopay = new JLabel();
        ImageIcon iconSavedpay = new ImageIcon(currentDirectory+"\\Check-65.png");
        savedLogopay.setIcon(iconSavedpay);


        JLabel ssp = new JLabel("Saved Succesfully!"); //Saved Succesfully!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        ssp.setFont(customFont0lbl);
        ssp.setForeground(Color.decode(blackColor));

        JButton okAdssp = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okAdssp.setFont(customFont19);

        okAdssp.setForeground(Color.decode(whiteColor));
        okAdssp.setBackground(Color.decode("#6fbafd")); //#6fbafd 007dfe
        okAdssp.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okAdssp.setFocusPainted(false);

        //Mouse Icon Hover
        okAdssp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okAdssp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okAdssp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        okAdssp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                savesuccFramepay.setVisible(false);
            }
        });
//SETBOUNDS
        savedPanelpay.setBounds(0, 0, 350, 200);
        savedPanelpay.setBackground(Color.decode(whiteColor));
        savedLogopay.setBounds(140, 15, 70, 70);

        ssp.setBounds(105, 80, 200, 50);
        okAdssp.setBounds(147, 130, 50, 40);   


//ADD TO FRAME     
        savesuccFramepay.setLayout(null);
        savesuccFramepay.setUndecorated(true);
        savesuccFramepay.setBounds(0, 0, 350, 200);
        savesuccFramepay.setLocationRelativeTo(null);
        savesuccFramepay.setVisible(true);//false

		savedPanelpay.add(okAdssp);
        savedPanelpay.add(savedLogopay);
        savedPanelpay.add(ssp);

        savesuccFramepay.add(savedPanelpay);


    }
    public void PayError(){
        JFrame wrongamFramepay = new JFrame("Wrong Amount!");
        JPanel wrongamPanelpay = new JPanel(null);
        Border wrongamBorderp = new MatteBorder(3, 3, 3, 3, Color.decode("#e5646e"));//e5646e or ff8086 //TLBR
        wrongamPanelpay.setBorder(wrongamBorderp);

        JLabel wrongamLogpay = new JLabel();
        ImageIcon iconWrongampay = new ImageIcon(currentDirectory+"\\Ekis-65.png");
        wrongamLogpay.setIcon(iconWrongampay);


        JLabel wa = new JLabel("Wrong Amount!"); //Age Restriction!
        //Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);
        wa.setFont(customFont0lbl);
        wa.setForeground(Color.decode(blackColor));

        JButton okPaywa = new JButton("OK"); //OK
        //Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
        okPaywa.setFont(customFont19);

        okPaywa.setForeground(Color.decode(whiteColor));
        okPaywa.setBackground(Color.decode("#6fbafd"));//#6fbafd 007dfe
        okPaywa.setBorder(new LineBorder(Color.decode(greycolor), 2)); //#ffffff or #073cb7 or #DBDCDE
        okPaywa.setFocusPainted(false);

        //Mouse Icon Hover
        okPaywa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                okPaywa.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                okPaywa.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        okPaywa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                wrongamFramepay.setVisible(false);
            }
        });
        
//SETBOUNDS
        wrongamPanelpay.setBounds(0, 0, 350, 200);
        wrongamPanelpay.setBackground(Color.decode(whiteColor));
        wrongamLogpay.setBounds(140, 15, 70, 70);

        wa.setBounds(110, 80, 200, 50);
        okPaywa.setBounds(147, 130, 50, 40);
 
//ADD TO FRAME
        wrongamFramepay.setLayout(null);
        wrongamFramepay.setUndecorated(true);
        wrongamFramepay.setBounds(0, 0, 350, 200);
        wrongamFramepay.setLocationRelativeTo(null);
        wrongamFramepay.setVisible(true);//false

		wrongamPanelpay.add(okPaywa);
        wrongamPanelpay.add(wrongamLogpay);
        wrongamPanelpay.add(wa);

        wrongamFramepay.add(wrongamPanelpay);
 
    }
}
