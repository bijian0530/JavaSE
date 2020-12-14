package Test11_12;

public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals ={a1,a2};
        for(int i = 0; i < animals.length; i++){
            Animal a = animals[i];
            a.move();
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animal moves!");
    }
}
