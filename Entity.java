import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Entity {
    private String AdminNAME;
    private String userName;
    private String ACCESS;
    private int USERID;
    private static Entity instance;


    private Entity() {
        // Private constructor to prevent instantiation
    }

    public static Entity getInstance() {
        if (instance == null) {
            instance = new Entity();
        }
        return instance;
    }

    
    // Getter and setter for AdminNAME
       public String getUserName() {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getAdminNAME() {
        return AdminNAME;
    }

    public void setAdminNAME(String adminNAME) {
        this.AdminNAME = adminNAME;
    }
    // Getter and setter for ACCESS
    public String getACCESS() {
        return ACCESS;
    }

    public void setACCESS(String ACCESS) {
        this.ACCESS = ACCESS;
    }
    // Getter and setter for USERID
    public int getUSERID() {
        return USERID;
    }

    public void setUSERID(int USERID) {
        this.USERID = USERID;
    }

    public String generateMD5(String input) {
        try {
            // Create MD5 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the digest with the input bytes
            md.update(input.getBytes());

            // Get the MD5 hash
            byte[] digest = md.digest();

            // Convert the byte array to a hex string
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}