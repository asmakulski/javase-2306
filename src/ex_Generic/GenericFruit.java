package ex_Generic;

public class GenericFruit<T> {

    public T fruit;

    public GenericFruit(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public static void main(String[] args) {
       // GenericFruit<Apple> appleBox = new GenericFruit<Apple>(new Apple());
       // GenericFruit<Orange> orangeBox = new GenericFruit<Orange>(new Orange());

       // Orange fruit = orangeBox.getFruit();
    }
}