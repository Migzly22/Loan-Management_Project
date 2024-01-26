import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public interface RootValue {

    // START ---SQL connections
    Connector connector = new Connector();
    Connection conn = connector.connectdb();
    // END ---SQL connections
    DefaultTableModel table1 = new DefaultTableModel();

    // DESIGN RELATED
    public final String whiteColor = "#ffffff";// text related and bg
    public final String whiteColor2 = "#FBFBFC";

    public final String blueColor = "#007dfe"; // bg related

    public final String blueColor2 = "#073cb7";

    public final String blackColor = "#4d4d4d";
    public final String greycolor = "#DBDCDE";

    public final String greyColor2 = "#919293";

    public final String greenColor = "#57F287";
    public final String redColor = "#FF1A1A";

    public final String currentDirectory = System.getProperty("user.dir") + "\\GiPit_icons";

    public final Font customFont1 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 15.0f);
    public final Font customFont2 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 36.0f);
    public final Font customFont3 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 15.0f);
    public final Font customFont4 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 14.0f);
    public final Font customFont5 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 13.0f);
    public final Font customFont6 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 14.0f);
    public final Font customFont7 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 15.0f);
    public final Font customFont8 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 30.0f);
    public final Font customFont9 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 18.0f);
    public final Font customFont10 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 17.0f);
    public final Font customFont11 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 16.0f);
    public final Font customFont13 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 14.0f);
    public final Font customFont14 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 16.0f);
    public final Font customFont15 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 22.0f);
    public final Font customFont16 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 13.0f);
    public final Font customFont17 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Regular.ttf", 14.0f);

    public final Font customFontPS = new Font("Segoe UI", Font.PLAIN, 18);

    public final Font customFont19 = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 14.0f);
    public final Font customFont0lbl = loadFontFromFile(System.getProperty("user.dir") + "\\Fonts\\Montserrat-Bold.ttf", 16.0f);


    public static Font loadFontFromFile(String filePath, float size) {
        try {
            // Load font from file
            File fontFile = new File(filePath);
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(size);

            // Register the font with the graphics environment
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;
        } catch (IOException | java.awt.FontFormatException e) {
            e.printStackTrace();
            // Handle exception as needed
            return null;
        }
    }
}
