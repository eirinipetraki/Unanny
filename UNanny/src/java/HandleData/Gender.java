package HandleData;

public enum Gender {
    MALE, FEMALE;
    
    public static Gender fromString(String text) {
        try{
            return Gender.valueOf(text);
        }
        catch(IllegalArgumentException e) {
            return null;
        }
    }
}
