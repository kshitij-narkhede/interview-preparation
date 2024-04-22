package OOPS;
interface Shape{
    void getLegs();
}
public class Heritance {
    static class Animal implements Shape{
        int name;
        int legs;
        Animal(){
            System.out.println("Animal is called");
        }
        public void walk(){
            System.out.println("Animal walk");
        }
        public Animal(Animal another) {
            System.out.println("Copy Constr animal");
        }
        public void getLegs(){
            System.out.println("I am Animal - may be 4 legs");
        }
    }
    static class Cat extends Animal{
        Cat(){
            System.out.println("Cat is called");}
            public void walk(){
                
                System.out.println("Cat Walk");
            }
            public Cat(Cat another) {
                System.out.println("Copy Constr Cat");
            }
    }
    static class Kittie extends Cat{
        Kittie(){
            System.out.println("kittie is called");
        }
        public void walk(){
            System.out.println("Kittie walk");
        }
    }
    public static void main(String[] args){
        Cat a1=new Kittie();
        a1.walk();
        System.out.println("---------------------");
        Animal a2=new Animal(a1);
        System.out.println("---------------------");
        Kittie kit=new Kittie();
        System.out.println("---------------------");

        Cat a3=new Cat(kit);
        System.out.println("---------------------");

        a2.walk();
        System.out.println("---------------------");

        a1.walk();
        System.out.println("---------------------");
        System.out.println("---------------------");
        Animal [] animals={new Cat(),new Kittie()};
        System.out.println("---------------------");

        for(Animal animal :animals){
            animal.getLegs();
        System.out.println("---------------------");

        }
        

    }
}
/*
 Animal ---> Cat ---> Kittie
 * 
 * 
 * 
 */