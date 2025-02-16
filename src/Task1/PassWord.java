package Task1;

public class PassWord {
    private String password;

    PassWord(String password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[password=" + password + "]";
    }
    

}
