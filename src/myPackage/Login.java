package myPackage;

public class Login {
    private String username;
    private String password;
    private String[][] database = {{"pablo","password"},{"benjamin","123456"}};


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

    public boolean tryconnect(String username, String password){
        for (int i = 0; i< database.length ; i++){
            if (database[i][0].equalsIgnoreCase(username) && database[i][0].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
