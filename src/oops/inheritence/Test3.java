package oops.inheritence;

class Animal2 {
    void m1(){
        System.out.println("animal");
    }

}
class Cat2 extends Animal2{
    void m2(){
        System.out.println("cat");
    }

}
class Dog2 extends Animal2{
    void m3(){
        System.out.println("dog");
    }

}
 public class Test3{
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.m3();
        dog2.m1();

    }
}