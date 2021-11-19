public abstract class User implements IMenu{
    private String username;
    private String password;
    private String email;
    private String mobileNumber;

    public User(){
        this.username = null;
        this.password = null;
        this.email = null;
        this.mobileNumber = null;
    }

    public User(String username,String password,String email,String mobileNumber){
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    ///////////////////////////////////// Getters and Setters /////////////////////////////////////

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
