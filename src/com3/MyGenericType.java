package com3;

public class MyGenericType {

    public class GenericType<T>{

        private T item;

        public GenericType (T item){
            this.item = item;

        }

        public void printClass(){
            System.out.println(item.getClass());
        }




    }

}
