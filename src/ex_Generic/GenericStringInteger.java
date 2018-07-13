package ex_Generic;

public class GenericStringInteger<T>{

    private T item;

    public GenericStringInteger(T item){
        this.item = item;
    }

    public void printClass(){
        System.out.println(item.getClass());
    }

    public void printItemClass(){
        System.out.println(item.getClass().getCanonicalName());
    }



    public static void main(String[] args){

        GenericStringInteger<String> stringObject = new GenericStringInteger<>("String");
        GenericStringInteger<Integer> integerObject = new GenericStringInteger<>(8);

        stringObject.printClass();
        integerObject.printClass();
        stringObject.printItemClass();
        stringObject.printItemClass();

    }

}
