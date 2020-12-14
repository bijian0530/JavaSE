package Test11_12.Animals;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        Bird b = new Bird();
        Animal[] animals = {b,c};
        for(int i =0; i < animals.length; i++){
            if(animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                cat.zhualaoshu();
            }
           else  if(animals[i] instanceof Cat){
                Bird bird = (Bird)animals[i];
                bird.sing();
            }
        }

    }
}

class Animal {
    public void move(){
        System.out.println("animals are moving!");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat is moving");
    }
    public void zhualaoshu(){
        System.out.println("Cat is catching mouse");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("Bird is moving");
    }
    public void sing(){
        System.out.println("Bird is singing");
    }
}
