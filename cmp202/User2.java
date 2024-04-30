package cmp202;

public class User2 {
    String name;
    String password;
    String login(){
        return "logged in";
    }
    String Register(){
        if (name.equals("")|| password.equals("")){
            return "cant be empty";
        }else{
            return " success";
        }
    }
}
