package cmp202;

public class LandAnimal extends Animal {
    @Override
    String move(){
        //
        return "swings on trees";
    }
    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        lion.name ="lion";
      String action =  monkey.move();
      System.out.println(action);
    }
}
