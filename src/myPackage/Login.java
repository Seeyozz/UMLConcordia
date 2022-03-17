package myPackage;

public class Login {
    private String[][] database = {{"pablo","password"},{"benjamin","123456"}};
    public static Login login;
    public String username;
    public String password;
    private Login(String username, String password){
        this.username=username;
        this.password=password;
    }

    public static Login getInstance(String username, String password) {
        if (login == null){ //Singleton
            login = new Login(username, password);
        }
        return login;
    }




    public boolean tryconnect(String username, String password){
        for (int i = 0; i< database.length ; i++){
            if (database[i][0].equalsIgnoreCase(username) && database[i][1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
