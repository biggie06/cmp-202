package cmp202;

public class StudentUser extends User2{
    String MatNO;
    String name;
    @Override
    String Register(){
        if (name.equals("")||MatNO.equals("")) {
            return"this field cannot be empty";
        }else{
            return "success";
        }
    }
    void registercourses(String course){
        System.out.println("course");
    }

    String checkResult() {
        return "cmp 202" + " " + 70;
    }
    public static void main(String[] args) {
        StudentUser newStudent = new StudentUser();
        newStudent.registercourses("cmp202");
        System.out.println(newStudent.checkResult());
    }
}

