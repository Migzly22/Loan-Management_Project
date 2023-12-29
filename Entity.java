public class Entity {
    private String AdminNAME;
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
    public String getAdminNAME() {
        return AdminNAME;
    }

    public void setAdminNAME(String adminNAME) {
        this.AdminNAME = adminNAME;
    }


}