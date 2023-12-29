import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public interface RootValue {

    //START ---SQL connections
    Connector connector = new Connector();
    Connection conn = connector.connectdb();
    //END   ---SQL connections
    DefaultTableModel table1 = new DefaultTableModel();

//DESIGN RELATED
    public final String whiteColor = "#ffffff";//text related and bg
    public final String whiteColor2 = "#FBFBFC";

    public final String blueColor = "#007dfe"; // bg related 

    public final String blueColor2 = "#073cb7";

    public final String blackColor = "#4d4d4d";
    public final String greycolor = "#DBDCDE";

    public final  String greyColor2 = "#919293";

    public final String greenColor = "#57F287";
    public final String redColor = "#FF1A1A";

    public final String currentDirectory = System.getProperty("user.dir") + "\\GiPit_icons";

    public final Font customFont1 = new Font("Century Gothic", Font.PLAIN, 15);
    public final Font customFont2 = new Font("Century Gothic", Font.BOLD, 36);
    public final Font customFont3 = new Font("Century Gothic", Font.BOLD, 15);
    public final Font customFont4 = new Font("Century Gothic", Font.PLAIN, 14);
    public final Font customFont5 = new Font("Century Gothic", Font.PLAIN, 13);
    public final Font customFont6 = new Font("Century Gothic", Font.PLAIN, 14);
    public final Font customFont7 = new Font("Century Gothic", Font.BOLD, 15);
    public final Font customFont8 = new Font("Century Gothic", Font.BOLD, 30);
    public final Font customFont9 = new Font("Century Gothic", Font.BOLD, 18);
    public final Font customFont10 = new Font("Century Gothic", Font.PLAIN, 17);
    public final Font customFont11 = new Font("Century Gothic", Font.BOLD, 16);
    public final Font customFont13 = new Font("Century Gothic", Font.BOLD, 14);
    public final Font customFont14 = new Font("Century Gothic", Font.BOLD, 16);
    public final Font customFont15 = new Font("Century Gothic", Font.BOLD, 22);
    public final Font customFont16 = new Font("Century Gothic", Font.BOLD, 13);
    public final Font customFont17 = new Font("Century Gothic", Font.PLAIN, 14);

    public final Font customFontPS = new Font("Segoe UI", Font.PLAIN, 18);

    public final Font customFont19 = new Font("Century Gothic", Font.BOLD, 14);
    public final Font customFont0lbl = new Font("Century Gothic", Font.BOLD, 16);



}
