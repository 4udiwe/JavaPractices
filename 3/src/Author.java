public class Author {
    private String name;
    private String email;
    private char genger;

    Author(String name, String email, char genger){
        this.name = name;
        this.email = email;
        this.genger = genger;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGenger(){
        return genger;
    }
    //@Override
    public String toString(){
        return name + " " + genger + " at " + email;
    }
}
