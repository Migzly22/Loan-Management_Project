import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;


public class AdditionalFrames implements RootValue{

    JFrame FrameNotif = null;
    JButton okLoginlc = new JButton("OK"); //OK

    public void messages(String title, String typeofimage, String msg) {
        FrameNotif = new JFrame();


        FrameNotif.setTitle(title);
        JPanel successPanelLogin = new JPanel(null);
        Border sucsBorder = new MatteBorder(3, 3, 3, 3, Color.decode("#cff6a4"));
        successPanelLogin.setBorder(sucsBorder);
    
        JLabel successLogoLogin = new JLabel();
        ImageIcon iconSuccessLogin = new ImageIcon(currentDirectory + typeofimage);
        successLogoLogin.setIcon(iconSuccessLogin);
    
        JLabel lc = new JLabel(msg);
        lc.setFont(customFont0lbl);
        lc.setForeground(Color.decode(blackColor));
    
        okLoginlc.setFont(customFont19);
        okLoginlc.setForeground(Color.decode(whiteColor));
        okLoginlc.setBackground(Color.decode("#6fbafd"));
        okLoginlc.setBorder(new LineBorder(Color.decode(greycolor), 2));
        okLoginlc.setFocusPainted(false);
    
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
    
        FrameNotif.setLayout(null);
        FrameNotif.setUndecorated(true);
        FrameNotif.setBounds(0, 0, 350, 200);
        FrameNotif.setLocationRelativeTo(null);
    
        successPanelLogin.add(okLoginlc);
        successPanelLogin.add(successLogoLogin);
        successPanelLogin.add(lc);
    
        FrameNotif.add(successPanelLogin);
        FrameNotif.setVisible(true);
    }

}
