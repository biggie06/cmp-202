package cmp202;

public class AdminUser extends User2{
    String staffNO;
    void uploadResult(String course, float score){
        System.out.println(course + "" + score);
    }
    public static void main(String[] args) {
        AdminUser MrBarka = new AdminUser();
        MrBarka.uploadResult("cmp202", 072);
    }
}
