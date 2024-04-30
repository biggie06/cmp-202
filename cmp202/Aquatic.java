package cmp202;

public class Aquatic extends Animal {
    @Override
    String move(){
        return "moves by swimming";
    }
    public static void main(String[] args) {
        Aquatic fish = new Aquatic();
        fish.name = "shark";
        System.out.println(fish.move());
    }
}
