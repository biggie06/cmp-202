package cmp202;
public class User {
    String username ="Bigjoe";
    String password = "bamdmanjoe";
    String login() {
    if(username.equals("Bigjoe") && password.equals("badmanjoe")){
        return "success";
    } else {
        return "failed";
    }
}
    public static void main (String[] args){
        User joe = new User();
        joe.login();
    }
}
